/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipampa.dao;

import br.com.unipampa.model.ItemTombo;
import java.awt.ItemSelectable;
import java.util.List;
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
public class DAOItemTomboTest {
    
    public DAOItemTomboTest() {
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
     * Test of salvar method, of class DAOItemTombo.
     */
    @org.junit.Test
    public void testSalvar() {
       ItemTombo item = new ItemTombo();
       item.setCultura("Nenhuma");
       item.setDataUtilizacaoFinal("9999");
       item.setDataUtilizacaoInicial("9999");
       item.setEstilo("dajosijs");
       item.setFuncaoEspecifica("dasjoijdsa");
       item.setGrupoLinguistico("dasjoaisod");
       item.setImagemEnviada(true);
       item.setMateriaPrima("daskijougdyfsaug");
       item.setOutroCodigo(123879);
       item.setPais("dsakoijasdj");
       item.setProcedencia("oidjsao");
       item.setRegiao("jdiaus");
       item.setSitio("kdsaipsa");
       item.setTecnicaManufatura("daskoijads");
       item.setTipoObjeto("kdsasdaok");
       DAOItemTombo dao = new DAOItemTombo();
       dao.salvar(item);
       assertEquals("Nenhuma", dao.recuperarRegistros().get(dao.recuperarRegistros().size()-1));
       
    }

//    /**
//     * Test of alterar method, of class DAOItemTombo.
//     */
//    @org.junit.Test
//    public void testAlterar() {
//        System.out.println("alterar");
//        Object objeto = null;
//        DAOItemTombo instance = new DAOItemTombo();
//        boolean expResult = false;
//        boolean result = instance.alterar(objeto);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of recuperarRegistros method, of class DAOItemTombo.
//     */
//    @org.junit.Test
//    public void testRecuperarRegistros_0args() {
//        System.out.println("recuperarRegistros");
//        DAOItemTombo instance = new DAOItemTombo();
//        List<Object> expResult = null;
//        List<Object> result = instance.recuperarRegistros();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of recuperarPorID method, of class DAOItemTombo.
//     */
//    @org.junit.Test
//    public void testRecuperarPorID() {
//        System.out.println("recuperarPorID");
//        Long ID = null;
//        DAOItemTombo instance = new DAOItemTombo();
//        Object expResult = null;
//        Object result = instance.recuperarPorID(ID);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of deletar method, of class DAOItemTombo.
//     */
//    @org.junit.Test
//    public void testDeletar() {
//        System.out.println("deletar");
//        Object objeto = null;
//        DAOItemTombo instance = new DAOItemTombo();
//        boolean expResult = false;
//        boolean result = instance.deletar(objeto);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of recuperarRegistros method, of class DAOItemTombo.
//     */
//    @org.junit.Test
//    public void testRecuperarRegistros_Object() {
//        System.out.println("recuperarRegistros");
//        Object parametro = null;
//        DAOItemTombo instance = new DAOItemTombo();
//        List<Object> expResult = null;
//        List<Object> result = instance.recuperarRegistros(parametro);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
