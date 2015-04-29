
package br.com.unipampa.dao;

import br.com.unipampa.model.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Neto
 */
public class DAOUsuario extends DAO {


      //<editor-fold defaultstate="collapsed" desc="SALVAR">
    public void salvar(Usuario usuario) {
        super.salvar(usuario);

    }
//</editor-fold>
    
      // <editor-fold defaultstate="collapsed" desc="ALTERAR"> 
    /**
     * 
     * @param usuario 
     */
    public void alterar(Usuario usuario ) {
        super.alterar(usuario);
    }
// </editor-fold>

      // <editor-fold defaultstate="collapsed" desc="BUSCAR TODOS"> 
    /**
     *
     * @return
     */
    public ArrayList<Usuario> buscarTodos() {
        return (ArrayList<Usuario>) super.buscarObjetos(Usuario.class);

    }
// </editor-fold>
    
      // <editor-fold defaultstate="collapsed" desc="BUSCA OBJETO"> 
    public Usuario buscarObjeto(int codigo) {
        return (Usuario) super.buscarObjeto(codigo, Usuario.class);

    }
// </editor-fold>

    public Object recuperarPorID(Long ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

      // <editor-fold defaultstate="collapsed" desc="EXCLUIR"> 
    /**
     * 
     * @param cod
     * @return 
     */
    public boolean excluir(int cod) {
        super.excluir(cod, Usuario.class);
        return true;
    }
// </editor-fold>

}
