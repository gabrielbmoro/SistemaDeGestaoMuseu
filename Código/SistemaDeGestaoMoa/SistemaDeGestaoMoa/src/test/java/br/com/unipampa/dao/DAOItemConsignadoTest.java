
package br.com.unipampa.dao;

import br.com.unipampa.model.ItemConsignado;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Wolle // Neto
 */
public class DAOItemConsignadoTest {
    
    public DAOItemConsignadoTest() {
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
     * Test of salvar method, of class DAOItemConsignado.
     */
    @Test
    public void testSalvar() {
        ItemConsignado item = new ItemConsignado();
        item.setCultura("afro");
        item.setDataUtilizacaoFinal("10/1/14");
        item.setDataUtilizacaoInicial("10/12/12");
        item.setEstilo("nada");
        item.setFuncaoEspecifica("nada");
        item.setGrupoLinguistico("nada");
        item.setImagemEnviada(true);
        item.setMateriaPrima("nada");
        item.setOutroCodigo(123879);
        item.setPais("nada");
        item.setProcedencia("nada");
        item.setRegiao("nada");
        item.setSitio("nada");
        item.setTecnicaManufatura("nada");
        item.setTipoObjeto("nada");
        DAOItemConsignado dao = new DAOItemConsignado();
        assertTrue(dao.salvar(item));
        dao.deletar(item);
    }

    /**
     * Test of alterar method, of class DAOItemConsignado.
     */
    @Test
    public void testAlterar() {
        ItemConsignado item = new ItemConsignado();
        item.setCultura("Não sei");
        item.setDataUtilizacaoFinal("10/1/14");
        item.setDataUtilizacaoInicial("10/12/12");
        item.setEstilo("1");
        item.setFuncaoEspecifica("1");
        item.setGrupoLinguistico("1");
        item.setImagemEnviada(true);
        item.setMateriaPrima("1");
        item.setOutroCodigo(123879);
        item.setPais("1");
        item.setProcedencia("1");
        item.setRegiao("1");
        item.setSitio("1");
        item.setTecnicaManufatura("1");
        item.setTipoObjeto("1");
        DAOItemConsignado dao = new DAOItemConsignado();
        assertTrue(dao.salvar(item));
        item.setCultura("ATUALIZOU!");
        item.setFuncaoEspecifica("ATUALIZOU");
        assertTrue(dao.alterar(item));
        dao.deletar(item);
        
    }
//
//    /**
//     * Test of recuperarRegistros method, of class DAOItemConsignado.
//     */
//    @Test
//    public void testRecuperarRegistros_0args() {
//        System.out.println("recuperarRegistros");
//        DAOItemConsignado instance = new DAOItemConsignado();
//        List<Object> expResult = null;
//        List<Object> result = instance.recuperarRegistros();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of recuperarPorID method, of class DAOItemConsignado.
//     */
//    @Test
//    public void testRecuperarPorID() {
//        System.out.println("recuperarPorID");
//        Long ID = null;
//        DAOItemConsignado instance = new DAOItemConsignado();
//        Object expResult = null;
//        Object result = instance.recuperarPorID(ID);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of deletar method, of class DAOItemConsignado.
     * Metodo de deletar temConsignado não foi feito
     */
    
//    @Test
//    public void testDeletar() {
//        System.out.println("deletar");
//        ItemConsignado item = new ItemConsignado();
//        item.setCultura("afro");
//        item.setDataUtilizacaoFinal("10/1/14");
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
//        DAOItemConsignado instance = new DAOItemConsignado();
//        instance.salvar(item);
//        ArrayList<Object> itemTombo = (ArrayList<Object>) instance.recuperarRegistros();
//        int codigo = itemTombo.size() - 1;
//        System.out.println("asasas" + itemTombo.get(codigo));
//        boolean result = instance.deletar(itemTombo.get(codigo));
//        assertFalse(result); 
//    }

    /**
     * Test of recuperarRegistros method, of class DAOItemConsignado.
     */
//    @Test
//    public void testRecuperarRegistros_Object() {
//        System.out.println("recuperarRegistros");
//        Object parametro = null;
//        DAOItemConsignado instance = new DAOItemConsignado();
//        List<Object> expResult = null;
//        List<Object> result = instance.recuperarRegistros(parametro);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
