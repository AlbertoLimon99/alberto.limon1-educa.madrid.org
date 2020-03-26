/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicioappmodificado;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alberto
 */
public class ContarTodosCaracteresTest {
    
    public ContarTodosCaracteresTest() {
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
     * Test of contarTodosCaracteres method, of class ContarTodosCaracteres.
     */
    @Test
    public void testContarTodosCaracteres() {
        System.out.println("contarTodosCaracteres");
        String cadena = "";
        ContarTodosCaracteres instance = new ContarTodosCaracteres();
        int[] expResult = null;
        int[] result = instance.contarTodosCaracteres(cadena);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
