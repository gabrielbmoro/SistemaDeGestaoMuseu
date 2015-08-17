
package br.unipampa.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
* <b>Responsabilidade: Define Atributos e Métodos de Item Consignado </b>
* Instruções de uso: Usada para estanciar novos objetos do tipo ItemConsignado
* @author Gabriel B Moro
* @since 06/08/2015
* 
*/

@Entity
public class ItemConsignado extends ItemTombo implements Serializable {

    private Date dataDoEmprestimo;
    private Date dataDeDevolucao;
    private String responsavelDaFamilia;

    @Override
    public boolean salvar(Object objeto) {
        if (objeto instanceof ItemConsignado) {
            ItemConsignado item = (ItemConsignado) objeto;
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
 public boolean alterar(Object objetoNovo) {
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
    public Long recuperarID(Object objeto) {
        if (objeto instanceof ItemConsignado) {
            ItemConsignado item = (ItemConsignado) objeto;
            Query query = null;
            query = HibernateUtil.openSession().createQuery("from ItemConsignado i where "
                    + "i.outroCodigo=" + item.getOutroCodigo() + " and i.materiaPrima=\'" + item.getMateriaPrima() + "\'"
                   +" and i.responsavelDaFamilia=\'" + item.getResponsavelDaFamilia() + "\' and "
                    + "i.tipoObjeto=\'" + item.getTipoObjeto() + "\'");
            List<Object> resultado = query.list();
            if (!resultado.isEmpty()) {
                ItemConsignado itemRecuperado = (ItemConsignado) resultado.get(0);
                return itemRecuperado.getID();
            } else {
                return null;
            }
        }
        return null;
    }
    public List recuperarTodos() {
         Query query = null;
            query = HibernateUtil.openSession().createQuery("from ItemConsignado ");
            List<Object> resultado = query.list();
            if (!resultado.isEmpty()) {
                return resultado;
            } else {
                return null;
            }
    }
    @Override
        public Object recuperarPeloID(Long id) {
            Query query = null;
            query = HibernateUtil.openSession().createQuery("from ItemConsignado i where "
                    + "i.ID=" + id);
            List<Object> resultado = query.list();
            if (!resultado.isEmpty()) {
                return (ItemConsignado) resultado.get(0);
            } else {
                return null;
            }
        }
    @Override
     public boolean deletar(Object objeto) {
         try{
             Session sessao = HibernateUtil.openSession();
                sessao.delete(objeto);
                Transaction transacao = sessao.beginTransaction();
                transacao.commit();
                sessao.clear();
             return true;
         }catch(Exception erro){
             return false;
         }
         
     }
    
    public Date getDataDoEmprestimo() {
        return dataDoEmprestimo;
    }

    public void setDataDoEmprestimo(Date dataDoEmprestimo) {
        this.dataDoEmprestimo = dataDoEmprestimo;
    }

    public Date getDataDeDevolucao() {
        return dataDeDevolucao;
    }

    public void setDataDeDevolucao(Date dataDeDevolucao) {
        this.dataDeDevolucao = dataDeDevolucao;
    }

    public String getResponsavelDaFamilia() {
        return responsavelDaFamilia;
    }

    public void setResponsavelDaFamilia(String responsavelDaFamilia) {
        this.responsavelDaFamilia = responsavelDaFamilia;
    }
}
