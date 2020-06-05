/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rodolfo
 */
public class EmpleadoTest {
    
    public EmpleadoTest() {
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
     * Test of getId method, of class Empleado.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Empleado instance = new Empleado();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Empleado.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Empleado instance = new Empleado();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRut method, of class Empleado.
     */
    @Test
    public void testGetRut() {
        System.out.println("getRut");
        Empleado instance = new Empleado();
        String expResult = "";
        String result = instance.getRut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRut method, of class Empleado.
     */
    @Test
    public void testSetRut() {
        System.out.println("setRut");
        String rut = "";
        Empleado instance = new Empleado();
        instance.setRut(rut);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNom method, of class Empleado.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Empleado instance = new Empleado();
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNom method, of class Empleado.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "";
        Empleado instance = new Empleado();
        instance.setNom(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTel method, of class Empleado.
     */
    @Test
    public void testGetTel() {
        System.out.println("getTel");
        Empleado instance = new Empleado();
        String expResult = "";
        String result = instance.getTel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTel method, of class Empleado.
     */
    @Test
    public void testSetTel() {
        System.out.println("setTel");
        String tel = "";
        Empleado instance = new Empleado();
        instance.setTel(tel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class Empleado.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Empleado instance = new Empleado();
        String expResult = "";
        String result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Empleado.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        String estado = "";
        Empleado instance = new Empleado();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class Empleado.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        Empleado instance = new Empleado();
        String expResult = "";
        String result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUser method, of class Empleado.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        String user = "";
        Empleado instance = new Empleado();
        instance.setUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
