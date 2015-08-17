package br.unipampa.model;

import br.unipampa.service.CriptografiaMD5;
import br.unipampa.view.FrameLogin;
import br.unipampa.view.FramePrincipal;
import br.unipampa.view.GeradorDeMensagem;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
*<b>Responsabilidade: Define Atributos e Métodos de um usuário genérico</b>
*Instruções de uso: Usada para estanciar novos objetos do tipo usuário
*
*/

@Entity
public class Usuario implements OperacoesBasicas {

    @Id
    private Long cpf;
    private String senha;
    private String nome;
    private Date dataNAsc;
    private String endereco;
    private String telefone;
    private boolean souUsuarioAdministrador;
    private boolean status;

    public void fazerLogin(FrameLogin frameLogin, Long cpf, String senha) {
        if (cpf != null) {
            Usuario usuarioTemp = (Usuario) recuperarPeloID(cpf);
            if (usuarioTemp != null) {
                String senhaCriptografada = CriptografiaMD5.codificar(senha);
                boolean teste = usuarioTemp.getSenha().equalsIgnoreCase(senhaCriptografada);
                if (teste) {
                    GeradorDeMensagem.exibirMensagemDeInformacao("Acesso permitido!", "Alerta ao Usuário");
                    new FramePrincipal(usuarioTemp);
                    frameLogin.dispose();
                } else {
                    GeradorDeMensagem.exibirMensagemDeInformacao("Não foi possível acessar o sistema, por favor verifique as suas credenciais!", "Alerta ao Usuário");
                }
            } else {
                GeradorDeMensagem.exibirMensagemDeInformacao("Não foi possível acessar o sistema, por favor verifique as suas credenciais!", "Alerta ao Usuário");
            }
        } else {
            GeradorDeMensagem.exibirMensagemDeInformacao("Não foi possível acessar o sistema, por favor verifique as suas credenciais!", "Alerta ao Usuário");
        }
    }

    @Override
    public boolean salvar(Object objeto) {
        if (objeto instanceof Usuario) {
            Usuario usuario = (Usuario) objeto;
            try {
                Session sessao = HibernateUtil.openSession();
                sessao.saveOrUpdate(usuario);
                Transaction transacao = sessao.beginTransaction();
                transacao.commit();
                sessao.clear();
                return true;
            } catch (Exception erro) {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public boolean alterar(Long ID, Object objetoNovo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean alterar(Object objetoNovo) {
        if (objetoNovo instanceof Usuario) {
            Usuario usuario = (Usuario) objetoNovo;
            try {
                Session sessao = HibernateUtil.openSession();
                sessao.saveOrUpdate(usuario);
                Transaction transacao = sessao.beginTransaction();
                transacao.commit();
                sessao.clear();
                return true;
            } catch (Exception erro) {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public List recuperarTodos() {
        Query query = null;
        query = HibernateUtil.openSession().createQuery("from Usuario");
        List<Object> resultado = query.list();
        if (!resultado.isEmpty()) {
            return resultado;
        } else {
            return null;
        }
    }

    @Override
    public Long recuperarID(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object recuperarPeloID(Long id) {
        Query query = null;
        query = HibernateUtil.openSession().createQuery("from Usuario i where "
                + "i.cpf=" + id);
        List<Object> resultado = query.list();
        if (!resultado.isEmpty()) {
            return (Usuario) resultado.get(0);
        } else {
            return null;
        }
    }

    @Override
    public boolean deletar(Object objeto) {
        try {
            Session sessao = HibernateUtil.openSession();
            sessao.delete(objeto);
            Transaction transacao = sessao.beginTransaction();
            transacao.commit();
            sessao.clear();
            return true;
        } catch (Exception erro) {
            return false;
        }
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNAsc() {
        return dataNAsc;
    }

    public void setDataNAsc(Date dataNAsc) {
        this.dataNAsc = dataNAsc;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isSouUsuarioAdministrador() {
        return souUsuarioAdministrador;
    }

    public void setSouUsuarioAdministrador(boolean souUsuarioAdministrador) {
        this.souUsuarioAdministrador = souUsuarioAdministrador;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
