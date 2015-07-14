/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipampa.model;

import br.com.unipampa.dao.HibernateUtil;
import java.io.Serializable;
import javax.persistence.Entity;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Gabriel B Moro
 */
@Entity
public class ItemConsignado extends ItemTombo implements Serializable {

    private String dataDoEmprestimo;
    private String dataDeDevolucao;
    private String responsavelDaFamilia;

    boolean cadastrarItem(ItemConsignado item) {
            try{
        Session sessao = HibernateUtil.openSession();
                sessao.saveOrUpdate(item);
                Transaction transacao = sessao.beginTransaction();
                transacao.commit();
                sessao.clear();
                return true;
            }
            catch(Exception erro){
                return false;
            }
    }

}
