/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipampa.dao;

import br.com.unipampa.model.ItemTombo;
import java.awt.ItemSelectable;
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

//    /**
//     * Test of salvar method, of class DAOItemTombo.
//     */
//    @org.junit.Test
//    public void testSalvar() {
//        ItemTombo item = new ItemTombo();
//        item.setCultura("afro");
//        item.setDataUtilizacaoFinal("10/1/1");
//        item.setDataUtilizacaoInicial("10/12/12");
//        item.setEstilo("nada");
//        item.setFuncaoEspecifica("nada");
//        item.setGrupoLinguistico("nada");
//        item.setImagemEnviada(true);
//        item.setMateriaPrima("nada");
//        item.setOutroCodigo(123879);
//        item.setPais("nada");
//        item.setProcedencia("nada");
//        item.setRegiao("nada");
//        item.setSitio("nada");
//        item.setTecnicaManufatura("nada");
//        item.setTipoObjeto("nada");
//        DAOItemTombo dao = new DAOItemTombo();
//        dao.salvar(item);
//        ItemTombo expResult = item;
//        ArrayList<Object> itemTombo = (ArrayList<Object>) dao.recuperarRegistros();
//        int codigo = itemTombo.size() - 1;
//        ItemTombo result = new ItemTombo();
//        result = (ItemTombo) itemTombo.get(codigo);
//        assertEquals(expResult.getCultura(), result.getCultura());
//    }
        
    /**
     * Test of alterar method, of class DAOItemTombo.
     */
    @org.junit.Test
    public void testAlterar() {
        ItemTombo item = new ItemTombo();
        item.setCultura("De outro Mundo");
        item.setDataUtilizacaoFinal("10/1/1");
        item.setDataUtilizacaoInicial("10/12/12");
        item.setEstilo("Bem Loco");
        item.setFuncaoEspecifica("Nao sei");
        item.setGrupoLinguistico("Nao sei");
        item.setImagemEnviada(true);
        item.setMateriaPrima("Qualquer uma");
        item.setOutroCodigo(99998);
        item.setPais("Brasil");
        item.setProcedencia("Itália");
        item.setRegiao("Europa");
        item.setSitio("Não sei");
        item.setTecnicaManufatura("nada");
        item.setTipoObjeto("nada");
        DAOItemTombo dao = new DAOItemTombo();
        assertTrue(dao.salvar(item));
        item.setMateriaPrima("ATUALIZOU");
        item.setSitio("ATUALIZOU!");
        assertTrue(dao.alterar(item));
        dao.deletar(item);
    }
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
//        DAOItemTombo instance = new DAOItemTombo();
//        ArrayList<Object> itemTombo = (ArrayList<Object>) instance.recuperarRegistros();
//        int codigo = itemTombo.size() - 1;
//        boolean result = instance.deletar(itemTombo.get(codigo));       
//        assertTrue(result);
//       
//    }

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
