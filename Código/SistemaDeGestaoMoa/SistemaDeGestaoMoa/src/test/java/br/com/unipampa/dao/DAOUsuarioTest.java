/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipampa.dao;

import br.com.unipampa.model.Usuario;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Neto
 */
public class DAOUsuarioTest {

    public DAOUsuarioTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of salvar method, of class DAOUsuario.
     */
    @Test
    public void testSalvar() {
        Usuario usuario = new Usuario();
        usuario.setCpf(999999);
        usuario.setDataNAsc(null);
        usuario.setEndereco("Peru, 458");
        usuario.setLogin("netoiung");
        usuario.setNome("Aníbal Neto");
        usuario.setSenha("112223344");
        DAOUsuario dao = new DAOUsuario();
        dao.salvar(usuario);
        assertEquals("Aníbal Neto", dao.buscarTodos().get(dao.buscarTodos().size() - 1).getNome());
        dao.excluir(999999);
    }

    /**
     * Test of alterar method, of class DAOUsuario.
     */
    @Test
    public void testAlterar() {
        Usuario usuario = new Usuario();
        usuario.setCpf(999999);
        usuario.setDataNAsc(null);
        usuario.setEndereco("Peru, 458");
        usuario.setLogin("netoiung");
        usuario.setNome("Aníbal Neto");
        usuario.setSenha("112223344");
        DAOUsuario dao = new DAOUsuario();
        dao.salvar(usuario);
        assertEquals("Aníbal Neto", dao.buscarTodos().get(dao.buscarTodos().size() - 1).getNome());
        usuario.setNome("Jairo");
        usuario.setEndereco("Estados Unidos");
        DAOUsuario dao2 = new DAOUsuario();
        dao2.alterar(usuario);
        assertEquals("Jairo", dao2.buscarTodos().get(dao2.buscarTodos().size() - 1).getNome());
        dao2.excluir(999999);
    }

    /**
     * Test of buscarTodos method, of class DAOUsuario.
     */
    @Test
    public void testBuscarTodos() {
        Usuario usuario = new Usuario();
        usuario.setCpf(999999);
        usuario.setDataNAsc(null);
        usuario.setEndereco("Rua Peru");
        usuario.setLogin("netoiung");
        usuario.setNome("Neto");
        usuario.setSenha("1234567");
        DAOUsuario dao = new DAOUsuario();
        dao.salvar(usuario);

        Usuario usuario2 = new Usuario();
        usuario2.setCpf(111111);
        usuario2.setDataNAsc(null);
        usuario2.setEndereco("MEU ENDEREÇO");
        usuario2.setLogin("MEU LOGIN");
        usuario2.setNome("MEU NOME");
        usuario2.setSenha("MINHA SENHA");
        DAOUsuario dao2 = new DAOUsuario();
        dao2.salvar(usuario2);

        assertEquals(2, dao.buscarTodos().size());
        dao2.excluir(999999);
        dao2.excluir(111111);
    }

    /**
     * Test of buscarObjeto method, of class DAOUsuario.
     */
    @Test
    public void testBuscarObjeto() {
        Usuario usuario = new Usuario();
        usuario.setCpf(999999);
        usuario.setDataNAsc(null);
        usuario.setEndereco("Rua Peru");
        usuario.setLogin("netoiung");
        usuario.setNome("Neto");
        usuario.setSenha("1234567");
        DAOUsuario dao = new DAOUsuario();
        dao.salvar(usuario);

        Usuario usuario2 = new Usuario();
        usuario2.setCpf(111111);
        usuario2.setDataNAsc(null);
        usuario2.setEndereco("MEU ENDEREÇO");
        usuario2.setLogin("MEU LOGIN");
        usuario2.setNome("MEU NOME");
        usuario2.setSenha("MINHA SENHA");
        DAOUsuario dao2 = new DAOUsuario();
        dao2.salvar(usuario2);

        assertEquals("MEU NOME", dao.buscarObjeto(111111).getNome());
        dao2.excluir(999999);
        dao2.excluir(111111);

    }

    /**
     * Test of excluir method, of class DAOUsuario.
     */
    @Test
    public void testExcluir() {
        Usuario usuario = new Usuario();
        usuario.setCpf(999999);
        usuario.setDataNAsc(null);
        usuario.setEndereco("Rua Peru");
        usuario.setLogin("netoiung");
        usuario.setNome("Neto");
        usuario.setSenha("1234567");
        DAOUsuario dao = new DAOUsuario();
        dao.salvar(usuario);
        assertNotNull(dao.buscarObjeto(999999).getNome());
        dao.excluir(999999);
        assertNull(dao.buscarObjeto(999999));
    }

}
