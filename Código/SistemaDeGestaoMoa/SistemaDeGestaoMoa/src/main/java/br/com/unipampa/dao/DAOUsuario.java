
package br.com.unipampa.dao;

import br.com.unipampa.model.Usuario;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Neto
 */
public class DAOUsuario extends DAO {
    
    @Override
    public boolean salvar(Object objeto) {
  try {
      if(objeto instanceof Usuario){
            Session sessao = HibernateUtil.openSession();
                sessao.saveOrUpdate((Usuario) objeto);
                Transaction transacao = sessao.beginTransaction();
                transacao.commit();
            return true;
        } 
  }catch (Exception erro) {
            erro.printStackTrace();
            return false;
        }
  return false;
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
    public List<Object> recuperarRegistros() {
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
