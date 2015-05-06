
package br.com.unipampa.dao;

import br.com.unipampa.model.Usuario;
import java.util.List;

/**
 *
 * @author Neto
 */
public class DAOUsuario extends DAO {

    public void salvar(Usuario usuario) {
        super.salvar(usuario);

    }

    public boolean alterar(Object objeto, Long ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Object> recuperarRegistros(Object parametro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object recuperarPorID(Long ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean deletar(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

<<<<<<< HEAD
=======
    @Override
    public List<Object> recuperarRegistros() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
>>>>>>> feature/livroTombo_cadastro
}
