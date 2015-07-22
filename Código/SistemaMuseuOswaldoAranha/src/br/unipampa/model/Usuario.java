package br.unipampa.model;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.Session;
import org.hibernate.Transaction;

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List recuperarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Long recuperarID(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object recuperarPeloID(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deletar(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
}
