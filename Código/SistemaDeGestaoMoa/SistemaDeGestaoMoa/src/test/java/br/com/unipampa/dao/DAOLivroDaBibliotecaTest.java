/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipampa.dao;

import br.com.unipampa.model.LivroDaBiblioteca;
import java.util.ArrayList;
import java.util.List;
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
public class DAOLivroDaBibliotecaTest {
    
    public DAOLivroDaBibliotecaTest() {
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
     * Test of salvar method, of class DAOLivroDaBiblioteca.
     */
//    @Test
//    public void testSalvar() {
//        System.out.println("salvar");
//        Object objeto = null;
//        DAOLivroDaBiblioteca instance = new DAOLivroDaBiblioteca();
//        boolean expResult = false;
//        boolean result = instance.salvar(objeto);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of alterar method, of class DAOLivroDaBiblioteca.
//     */
//    @Test
//    public void testAlterar() {
//        System.out.println("alterar");
//        Object objeto = null;
//        DAOLivroDaBiblioteca instance = new DAOLivroDaBiblioteca();
//        boolean expResult = false;
//        boolean result = instance.alterar(objeto);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of recuperarRegistros method, of class DAOLivroDaBiblioteca.
//     */
//    @Test
//    public void testRecuperarRegistros_0args() {
//        System.out.println("recuperarRegistros");
//        DAOLivroDaBiblioteca instance = new DAOLivroDaBiblioteca();
//        List<Object> expResult = null;
//        List<Object> result = instance.recuperarRegistros();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of recuperarPorID method, of class DAOLivroDaBiblioteca.
//     */
//    @Test
//    public void testRecuperarPorID() {
//        System.out.println("recuperarPorID");
//        Long ID = null;
//        DAOLivroDaBiblioteca instance = new DAOLivroDaBiblioteca();
//        Object expResult = null;
//        Object result = instance.recuperarPorID(ID);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of deletar method, of class DAOLivroDaBiblioteca.
     */
    @Test
    public void testDeletar() {
        System.out.println("deletar");
        LivroDaBiblioteca livro= new LivroDaBiblioteca();
        livro.setAnoLacamento("1212");
        livro.setNomeAutor("Kelm Wolleson");
        livro.setNomeLivro("como comer vc");
        livro.setPais("Alemanha");
        livro.setRegiao("Sul");
        livro.setGrafica("KF");
        livro.setOutroCodigo(12);
        DAOLivroDaBiblioteca instance = new DAOLivroDaBiblioteca();
        instance.salvar(livro);
         ArrayList<Object> livros = (ArrayList<Object>) instance.recuperarRegistros();
        int codigo = livros.size() - 1;
        boolean result = instance.deletar(livros.get(codigo));
        assertTrue(result);
    }

    /**
     * Test of recuperarRegistros method, of class DAOLivroDaBiblioteca.
     */
//    @Test
//    public void testRecuperarRegistros_Object() {
//        System.out.println("recuperarRegistros");
//        Object parametro = null;
//        DAOLivroDaBiblioteca instance = new DAOLivroDaBiblioteca();
//        List<Object> expResult = null;
//        List<Object> result = instance.recuperarRegistros(parametro);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
