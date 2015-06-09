/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipampa.dao;
import br.com.unipampa.model.LivroDaBiblioteca;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Rodrigo
 */
public class DAOLivroDaBiblioteca extends DAO {
    
  

    @Override
    public boolean salvar(Object objeto) {
        try {
            Session sessao = HibernateUtil.openSession();

            if (objeto instanceof LivroDaBiblioteca) {
                LivroDaBiblioteca livroDaBiblioteca = (LivroDaBiblioteca) objeto;
                sessao.saveOrUpdate(livroDaBiblioteca);
                Transaction transacao = sessao.beginTransaction();
                transacao.commit();
            }
            return true;
        } catch (Exception erro) {
           System.err.println(erro.getMessage());
            return false;
        }
    }

    public boolean alterar(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public List<Object> recuperarRegistros() {
        Query query = null;
        query = HibernateUtil.openSession().createQuery("from LivroDaBiblioteca");
        List<Object> itensDoMuseu = query.list();
        return itensDoMuseu;
    }

    public Object recuperarPorID(Long ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean deletar(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> recuperarRegistros(Object parametro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

    

