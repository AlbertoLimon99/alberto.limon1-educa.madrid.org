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
public class ContarCaracteresTotalTest {
    
    public ContarCaracteresTotalTest() {
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
     * Test of contarCaracteresTotal method, of class ContarCaracteresTotal.
     */
    @Test
    public void testContarCaracteresTotal() {
        System.out.println("contarCaracteresTotal");
        String cadena = "";
        ContarCaracteresTotal instance = new ContarCaracteresTotal();
        int expResult = 0;
        int result = instance.contarCaracteresTotal(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
