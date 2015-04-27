/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipampa.dao;

import br.com.unipampa.model.ItemTombo;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Gabriel B Moro
 */
public class DAOItemTombo implements DAO {

    @Override
    public boolean salvar(Object objeto) {
       try{
        Session sessao = HibernateUtil.getSession();
        Transaction transacao = sessao.beginTransaction();
        transacao.begin();
        if (objeto instanceof ItemTombo) {
            ItemTombo itemTombo = (ItemTombo) objeto;
            sessao.saveOrUpdate(itemTombo);
            transacao.commit();
        }
        return true;
       }catch(Exception erro){
           erro.printStackTrace();
           return false;
       }
    }

    @Override
    public boolean alterar(Object objeto, Long ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> recuperarRegistros(Object parametro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object recuperarPorID(Long ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deletar(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
