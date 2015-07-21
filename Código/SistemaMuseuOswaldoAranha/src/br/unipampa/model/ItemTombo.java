package br.unipampa.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "ItemDeAcervo")
public class ItemTombo implements Serializable, OperacoesBasicas {

    @Id
    @GeneratedValue
    protected Long ID;
    protected int outroCodigo;
    protected String materiaPrima;
    protected Date dataUtilizacaoInicial;
    protected Date dataUtilizacaoFinal;
    protected String tipoObjeto;
    protected String funcaoEspecifica;
    protected String cultura;
    protected String estilo;
    protected String grupoLinguistico;
    protected String tecnicaManufatura;
    protected String procedencia;
    protected String regiao;
    protected String sitio;
    protected String pais;
    protected boolean imagemEnviada;

    @Override
    public boolean salvar(Object objeto) {
        if (objeto instanceof ItemTombo) {
            ItemTombo item = (ItemTombo) objeto;
            try {
                Session sessao = HibernateUtil.openSession();
                sessao.saveOrUpdate(item);
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
        if (objetoNovo instanceof ItemConsignado) {
            ItemConsignado item = (ItemConsignado) objetoNovo;
            try {
                Session sessao = HibernateUtil.openSession();
                sessao.saveOrUpdate(item);
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
        query = HibernateUtil.openSession().createQuery("from ItemTombo where DTYPE=\'ItemTombo\'");
        List<Object> resultado = query.list();
        if (!resultado.isEmpty()) {
            return resultado;
        } else {
            return null;
        }
    }

    @Override
    public Long recuperarID(Object objeto) {
        if (objeto instanceof ItemConsignado) {
            ItemTombo item = (ItemTombo) objeto;
            Query query = null;
            query = HibernateUtil.openSession().createQuery("from ItemTombo i where "
                    + "i.outroCodigo=" + item.getOutroCodigo() + " and i.materiaPrima=\'" + item.getMateriaPrima() + "\'"
                    + " and i.DTYPE=\'ItemTombo\' and "
                    + "i.tipoObjeto=\'" + item.getTipoObjeto() + "\'");
            List<Object> resultado = query.list();
            if (!resultado.isEmpty()) {
                ItemTombo itemRecuperado = (ItemTombo) resultado.get(0);
                return itemRecuperado.getID();
            } else {
                return null;
            }
        }
        return null;
    }

    @Override
    public boolean deletar(Object valor) {
        try {
            Session sessao = HibernateUtil.openSession();
            sessao.delete(valor);
            Transaction transacao = sessao.beginTransaction();
            transacao.commit();
            sessao.clear();
            return true;
        } catch (Exception erro) {
            return false;
        }
    }

    @Override
    public Object recuperarPeloID(Long id) {
        Query query = null;
        query = HibernateUtil.openSession().createQuery("from ItemTombo i where "
                + "i.ID=" + id);
        List<Object> resultado = query.list();
        if (!resultado.isEmpty()) {
            return (ItemTombo) resultado.get(0);
        } else {
            return null;
        }
    }

    @Override
    public boolean alterar(Object objetoNovo) {
        if (objetoNovo instanceof ItemTombo) {
            ItemTombo item = (ItemTombo) objetoNovo;
            try {
                Session sessao = HibernateUtil.openSession();
                sessao.saveOrUpdate(item);
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

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public int getOutroCodigo() {
        return outroCodigo;
    }

    public void setOutroCodigo(int outroCodigo) {
        this.outroCodigo = outroCodigo;
    }

    public String getMateriaPrima() {
        return materiaPrima;
    }

    public void setMateriaPrima(String materiaPrima) {
        this.materiaPrima = materiaPrima;
    }

    public Date getDataUtilizacaoInicial() {
        return dataUtilizacaoInicial;
    }

    public void setDataUtilizacaoInicial(Date dataUtilizacaoInicial) {
        this.dataUtilizacaoInicial = dataUtilizacaoInicial;
    }

    public Date getDataUtilizacaoFinal() {
        return dataUtilizacaoFinal;
    }

    public void setDataUtilizacaoFinal(Date dataUtilizacaoFinal) {
        this.dataUtilizacaoFinal = dataUtilizacaoFinal;
    }

    public String getTipoObjeto() {
        return tipoObjeto;
    }

    public void setTipoObjeto(String tipoObjeto) {
        this.tipoObjeto = tipoObjeto;
    }

    public String getFuncaoEspecifica() {
        return funcaoEspecifica;
    }

    public void setFuncaoEspecifica(String funcaoEspecifica) {
        this.funcaoEspecifica = funcaoEspecifica;
    }

    public String getCultura() {
        return cultura;
    }

    public void setCultura(String cultura) {
        this.cultura = cultura;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getGrupoLinguistico() {
        return grupoLinguistico;
    }

    public void setGrupoLinguistico(String grupoLinguistico) {
        this.grupoLinguistico = grupoLinguistico;
    }

    public String getTecnicaManufatura() {
        return tecnicaManufatura;
    }

    public void setTecnicaManufatura(String tecnicaManufatura) {
        this.tecnicaManufatura = tecnicaManufatura;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getSitio() {
        return sitio;
    }

    public void setSitio(String sitio) {
        this.sitio = sitio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean getImagemEnviada() {
        return imagemEnviada;
    }

    public void setImage(boolean imagemEnviada) {
        this.imagemEnviada = imagemEnviada;
    }

}
