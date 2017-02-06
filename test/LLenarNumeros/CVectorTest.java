/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LLenarNumeros;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class CVectorTest {
    
    public CVectorTest() {
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
     * Test of insertar method, of class CVector.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        int n = 0;
        CVector instance = new CVector();
        instance.insertar(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sumar method, of class CVector.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        CVector instance = new CVector();
        int expResult = 0;
        int result = instance.sumar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrar_vector method, of class CVector.
     */
    @Test
    public void testMostrar_vector() {
        System.out.println("mostrar_vector");
        CVector instance = new CVector();
        instance.mostrar_vector();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ordenar_vector method, of class CVector.
     */
    @Test
    public void testOrdenar_vector() {
        System.out.println("ordenar_vector");
        CVector instance = new CVector();
        instance.ordenar_vector();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getnElementos method, of class CVector.
     */
    @Test
    public void testGetnElementos() {
        System.out.println("getnElementos");
        CVector instance = new CVector();
        int expResult = 0;
        int result = instance.getnElementos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of posicion method, of class CVector.
     */
    @Test
    public void testPosicion() {
        System.out.println("posicion");
        int n = 0;
        CVector instance = new CVector();
        int expResult = 0;
        int result = instance.posicion(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
