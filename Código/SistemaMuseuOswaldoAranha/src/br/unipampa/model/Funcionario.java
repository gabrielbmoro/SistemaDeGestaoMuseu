package br.unipampa.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Neto
 */
@Entity
public class Funcionario extends Usuario implements Serializable {

    @Override
    public boolean salvar(Object objeto) {
        if (objeto instanceof Funcionario) {
            Funcionario func = (Funcionario) objeto;
            try {
                Session sessao = HibernateUtil.openSession();
                sessao.saveOrUpdate(func);
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
        if (objetoNovo instanceof Funcionario) {
            Funcionario func = (Funcionario) objetoNovo;
            try {
                Session sessao = HibernateUtil.openSession();
                sessao.saveOrUpdate(func);
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
//    @Override
//    public Long recuperarID(Object objeto) {
//        if (objeto instanceof ItemConsignado) {
//            ItemConsignado item = (ItemConsignado) objeto;
//            Query query = null;
//            query = HibernateUtil.openSession().createQuery("from ItemConsignado i where "
//                    + "i.outroCodigo=" + item.getOutroCodigo() + " and i.materiaPrima=\'" + item.getMateriaPrima() + "\'"
//                   +" and i.responsavelDaFamilia=\'" + item.getResponsavelDaFamilia() + "\' and "
//                    + "i.tipoObjeto=\'" + item.getTipoObjeto() + "\'");
//            List<Object> resultado = query.list();
//            if (!resultado.isEmpty()) {
//                ItemConsignado itemRecuperado = (ItemConsignado) resultado.get(0);
//                return itemRecuperado.getID();
//            } else {
//                return null;
//            }
//        }
//        return null;
//    }

    public List recuperarTodos() {
        Query query = null;
        query = HibernateUtil.openSession().createQuery("from Pessoa ");
        List<Object> resultado = query.list();
        if (!resultado.isEmpty()) {
            return resultado;
        } else {
            return null;
        }
    }
//    @Override
//        public Object recuperarPeloID(Long id) {
//            Query query = null;
//            query = HibernateUtil.openSession().createQuery("from ItemConsignado i where "
//                    + "i.ID=" + id);
//            List<Object> resultado = query.list();
//            if (!resultado.isEmpty()) {
//                return (ItemConsignado) resultado.get(0);
//            } else {
//                return null;
//            }
//        }

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
}
