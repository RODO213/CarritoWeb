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
public class CarritoTest {
    
    public CarritoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    int item;
     int idProducto;
     String nombres;
     String descripcion;
     double precioCompra;
     int cantidad;
     double subTotal;
     
    @Before
    public void setUp() {
         }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getItem method, of class Carrito.
     */
    @Test
    public void testGetItem() {
        System.out.println("getItem");
        Carrito carrito = new Carrito(1,1,"Ejemplo CARRITO", "Este es un objeto para hacer test unitarios",9990,1,5000);
   
        int esperado = 1;
        
        int resultado = carrito.getItem();
        
        assertEquals(esperado, resultado);
    }

    /**
     * Test of setItem method, of class Carrito.
     */
    @Test
    public void testSetItem() {
        System.out.println("setItem");
        int item = 0;
        int esperado = 0;
        Carrito instance = new Carrito();
        instance.setItem(item);
        
        int resultado = instance.getItem();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(esperado, resultado);

        //fail("The test case is a prototype.");
    }

    /**
     * Test of getIdProducto method, of class Carrito.
     */
    @Test
    public void testGetIdProducto() {
        System.out.println("getIdProducto");
        Carrito instance = new Carrito(2,2,"Cualquier cosa","Lo mismo", 2000,1,2000);
        int expResult = 2;
        int result = instance.getIdProducto();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdProducto method, of class Carrito.
     */
    @Test
    public void testSetIdProducto() {
        System.out.println("setIdProducto");
        int idProducto = 1;
        int resultadoesperado = 1;
        Carrito instance = new Carrito();
        instance.setIdProducto(idProducto);
        
        assertEquals(resultadoesperado, instance.getIdProducto());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNombres method, of class Carrito.
     */
    @Test
    public void testGetNombres() {
        System.out.println("getNombres");
        Carrito instance = new Carrito(3,3,"Nombre","Nombres", 3000,3,3000);
        String expResult = "Nombre";//revisar
        String result = instance.getNombres();
        //assertTrue(true);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        /*
        if (!result.equals(expResult)){//revisar
            fail("The test case is a prototype.");
        }    */
    }

    /**
     * Test of setNombres method, of class Carrito.
     */
    @Test
    public void testSetNombres() {
        System.out.println("setNombres");
        String nombres = "Nombre";
        String resultadoesperado = "Nombre";
        Carrito instance = new Carrito();
        instance.setNombres(nombres);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        //assertTrue(true);
        assertEquals(resultadoesperado, instance.getNombres());
    }

    /**
     * Test of getDescripcion method, of class Carrito.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Carrito instance = new Carrito(4,4,"Alfa","Alfa romeo", 4000,4,4000);
        String expResult = "Alfa romeo";
        String result = instance.getDescripcion();
        //assertEquals(expResult, result);
        //assertTrue(true);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        assertEquals(expResult, result);
    }

    /**
     * Test of setDescripcion method, of class Carrito.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "Alfa romeo";
        String resultadoesperado = "Alfa romeo";
        Carrito instance = new Carrito();
        instance.setDescripcion(descripcion);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        //assertTrue(true);
        assertEquals(resultadoesperado, instance.getDescripcion());
    }

    /**
     * Test of getPrecioCompra method, of class Carrito.
     */
    @Test
    public void testGetPrecioCompra() {
        System.out.println("getPrecioCompra");
        Carrito instance = new Carrito(5,5,"Japon","Toyota", 5000,4,5000);
        double expResult = 5000.0;
        double result = instance.getPrecioCompra();
        //assertEquals(expResult, result, 0.0);
        //assertTrue(true);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertEquals(expResult, result,0.001);        
    }

    /**
     * Test of setPrecioCompra method, of class Carrito.
     */
    @Test
    public void testSetPrecioCompra() {
        System.out.println("setPrecioCompra");
        double precioCompra = 5000.0;
        double resultadoesperado = 5000.0;
        Carrito instance = new Carrito();
        instance.setPrecioCompra(precioCompra);
        //assertTrue(true);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertEquals(resultadoesperado, instance.getPrecioCompra(),0.001);
    }

    /**
     * Test of getCantidad method, of class Carrito.
     */
    @Test
    public void testGetCantidad() {
        System.out.println("getCantidad");
        Carrito instance = new Carrito(6,6,"China","Changan", 6000,6,6000);
        int expResult = 6;
        int result = instance.getCantidad();
        //assertTrue(true);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertEquals(expResult, result); 
    }

    /**
     * Test of setCantidad method, of class Carrito.
     */
    @Test
    public void testSetCantidad() {
        System.out.println("setCantidad");
        int cantidad = 6;
        int resultadoesperado = 6;
        Carrito instance = new Carrito();
        instance.setCantidad(cantidad);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        //assertTrue(true);
        assertEquals(resultadoesperado, instance.getCantidad());
    }

    /**
     * Test of getSubTotal method, of class Carrito.
     */
    @Test
    public void testGetSubTotal() {
        System.out.println("getSubTotal");
        Carrito instance = new Carrito(7,7,"Peru","Soap", 7000,7,7000);
        double expResult = 7000.0;
        double result = instance.getSubTotal();
        //assertEquals(expResult, result, 0.0);
        //assertTrue(true);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertEquals(expResult, result,0.001);
    }

    /**
     * Test of setSubTotal method, of class Carrito.
     */
    @Test
    public void testSetSubTotal() {
        System.out.println("setSubTotal");
        double subTotal = 7000.0;
        double resultadoesperado = 7000.0;
        Carrito instance = new Carrito();
        instance.setSubTotal(subTotal);
        
        //assertTrue(true);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertEquals(resultadoesperado, instance.getSubTotal(),0.001);
    }
    
}
