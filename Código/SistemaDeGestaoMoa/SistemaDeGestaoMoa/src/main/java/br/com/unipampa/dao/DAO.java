package br.com.unipampa.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Neto
 */
public abstract class DAO {

    private Transaction tx = null;

    private Session session = null;

    public DAO() {
        session = HibernateUtil.openSession();
    }

    // <editor-fold defaultstate="collapsed" desc="SALVAR E ALTERAR"> 
    /**
     * Salva um objeto mapeado no banco de dados
     *
     * @param obj
     * @return boolean se salvou ou não
     */
    public boolean salvar(Object obj) {
        boolean salvou = false;
        try {

            tx = session.getTransaction();
            tx.begin();
            session.saveOrUpdate(obj);
            salvou = true;
            tx.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            salvou = false;
        }
        return salvou;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="ALTERAR COM MERGE"> 
    /**
     *
     * @param obj
     * @return
     */
    public boolean alterar(Object obj) {
        boolean salvou = false;
        try {
            tx = session.getTransaction();
            tx.begin();
            session.merge(obj);
            salvou = true;
            tx.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            salvou = false;
        }
        return salvou;
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="DELETE"> 
    public boolean excluir(int codigo, Class type) {
        try {
            tx = session.getTransaction();
            tx.begin();
            Object object = session.get(type, codigo);
            session.delete(object);
            tx.commit();

        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return false;
        }
        return true;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="SEARCH OBJECT"> 
    public Object buscarObjeto(int codigo, Class<?> classe) {
        Object objeto = null;
        Criteria criteria = getCriteria(classe);
        criteria.add(Restrictions.idEq(codigo));
        return getObject(criteria);
    }

    public Object buscarObjeto(String codigo, Class<?> classe) {
        Criteria criteria = getCriteria(classe);
        criteria.add(Restrictions.idEq(codigo));
        return getObject(criteria);
    }

    public Object buscarObjeto(HashMap<String, Object> filtros, Class<?> classe) {
        Criteria criteria = getCriteria(classe);
        for (Map.Entry<String, Object> entry : filtros.entrySet()) {
            String campo = entry.getKey();
            Object valor = entry.getValue();
            criteria.add(Restrictions.eq(campo, valor));
        }
        criteria.setMaxResults(1);//no maximo 1 resultado
        return getObject(criteria);
    }
        // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="SEARCH OBJECTS"> 
    public Object buscarObjetos(HashMap<String, Object> filtros, Class<?> classe) {
        Object objeto = null;
        Criteria criteria = getCriteria(classe);
        for (Map.Entry<String, Object> entry : filtros.entrySet()) {
            String campo = entry.getKey();
            Object valor = entry.getValue();
            criteria.add(Restrictions.eq(campo, valor));
        }
        return getObjects(criteria);
    }

    public ArrayList<?> buscarObjetos(Class<?> classe) {
        Criteria criteria = getCriteria(classe);
        return getObjects(criteria);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="PRIVATE METHODS"> 
    private Object getObject(Criteria criteria) {
        Object object = criteria.uniqueResult();
        tx.commit();
        return object;
    }

    private ArrayList<?> getObjects(Criteria criteria) {
        List list = criteria.list();
        ArrayList<?> lista = (ArrayList<?>) list;
        tx.commit();
        return lista;
    }

    private Criteria getCriteria(Class<?> classe) {
        Criteria criteria = null;
        try {
            tx = session.beginTransaction();//cria uma transação para o hibernate conectar no banco
            criteria = session.createCriteria(classe);
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
        return criteria;
    }

    public Object buscarPKD(Object cod, Class<?> classe) {
        Object objeto = null;
        Criteria criteria = getCriteria(classe);
        criteria.add(Restrictions.idEq(cod));

        return getObject(criteria);
    }
//</editor-fold>

//    public abstract boolean salvar(Object objeto);
//    public abstract boolean alterar(Object objeto, Long ID);
//    public abstract List<Object> recuperarRegistros(Object parametro);
//    public abstract Object recuperarPorID(Long ID);
//    public abstract boolean deletar(Object objeto);
}
