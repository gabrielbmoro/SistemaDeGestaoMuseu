
package br.com.unipampa.dao;

import br.com.unipampa.model.Usuario;
import java.util.ArrayList;


/**
 *
 * @author Neto
 */
public class DAOUsuario extends DAO2 {
    
   
         //<editor-fold defaultstate="collapsed" desc="Salvar">
    public boolean salvar(Usuario usuario) {
        return super.salvar(usuario);
    }
//</editor-fold>

         //<editor-fold defaultstate="collapsed" desc="Buscar">
    public ArrayList<Usuario> buscar() {
        return (ArrayList<Usuario>) buscarObjetos(Usuario.class);
    }

    public Usuario buscar(int codigo) {
        return (Usuario) buscarObjeto(codigo, Usuario.class);
    }
//</editor-fold>

         //<editor-fold defaultstate="collapsed" desc="Deletar">
    public boolean deletar(int codigo) {
        return excluir(codigo, Usuario.class);
    }
//</editor-fold>

}
