package br.com.unipampa.dao;

import br.com.unipampa.model.Usuario;

/**
 *
 * @author Neto
 */
public class main {

    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setCpf(999999);
        usuario.setDataNAsc(null);
        usuario.setEndereco("Rua Peru");
        usuario.setLogin("777777");
        usuario.setNome("JAIRO");       

        usuario.setSenha("1234567");
        DAOUsuario dao = new DAOUsuario();
                dao.salvar(usuario);
//        dao.excluir(dao.buscarTodos().get(dao.buscarTodos().size()-1).getCpf());
//        usuario.setNome("@@@@@@@@@@@@");
//        dao.alterar(dao.buscarObjeto(999999));
//        System.exit(1);
        
        for (int i = 0; i < dao.buscarObjetos(Usuario.class).size(); i++) {
            
            System.out.println(dao.buscarTodos().get(i).getNome());
            
        }
                
               

                  Usuario usuario2 = new Usuario();
        usuario2.setCpf(111111);
        usuario2.setDataNAsc(null);
        usuario2.setEndereco("Rdddddddddddddddddddd");
        usuario2.setLogin("444444444");
        usuario2.setNome("rrrrrrrrrrrrrrrrrrr");       

        usuario2.setSenha("1111111111111111");
        DAOUsuario dao2 = new DAOUsuario();
                dao2.salvar(usuario2);
    }
}
