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
 * @author Wolle
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
       Usuario usuario= new Usuario();
       usuario.setCpf(99999999);
       usuario.setDataNAsc("1212");
       usuario.setEndereco("dada");
       usuario.setLogin("sasas");
       usuario.setNome("Neto");
       usuario.setSenha("180");
       DAOUsuario dao = new DAOUsuario();
       assertTrue(dao.salvar(usuario));
       dao.deletar(99999999);
    }

    /**
     * Test of buscar method, of class DAOUsuario.
     */
//    @Test
//    public void testBuscar_0args() {
//        System.out.println("buscar");
//        DAOUsuario instance = new DAOUsuario();
//        ArrayList<Usuario> expResult = null;
//        ArrayList<Usuario> result = instance.buscar();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of buscar method, of class DAOUsuario.
//     */
//    @Test
//    public void testBuscar_int() {
//        System.out.println("buscar");
//        int codigo = 0;
//        DAOUsuario instance = new DAOUsuario();
//        Usuario expResult = null;
//        Usuario result = instance.buscar(codigo);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of deletar method, of class DAOUsuario.
     */
    @Test
    public void testDeletar() {
       Usuario usuario= new Usuario();
       usuario.setCpf(12121212);
       usuario.setDataNAsc("1212");
       usuario.setEndereco("dada");
       usuario.setLogin("sasas");
       usuario.setNome("wolleson");
       usuario.setSenha("212"); 
        DAOUsuario instance = new DAOUsuario();
        instance.salvar(usuario);
        boolean result = instance.deletar(usuario.getCpf());
        assertTrue(result); 
    }
    
}
