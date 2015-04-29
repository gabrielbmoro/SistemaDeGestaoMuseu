package br.com.unipampa.dao;

import br.com.unipampa.model.Usuario;

/**
 *
 * @author Neto
 */
public class main {

    public static void main(String[] args) {
//        Usuario usuario = new Usuario();
//        usuario.setCpf(1234567);
//        usuario.setDataNAsc(null);
//        usuario.setEndereco("kdjosaihadsoj");
//        usuario.setLogin("126289");
//        usuario.setNome("Neto");//        dao.salvar(usuario);

//        usuario.setSenha("jidhsausjd");
          DAOUsuario dao = new DAOUsuario();
//        dao.excluir(1234567, Usuario.class);
//        dao.alterar(dao.buscarObjetos(Usuario.class).get(0));
//        System.exit(1);
//        
//        for (int i = 0; i < dao.buscarObjetos(Usuario.class).size(); i++) {
//            
//            System.out.println(dao.buscarTodos().get(i).getNome());
//            
//        }
        System.out.println(dao.buscarObjeto(888888).getNome());

    }
}
