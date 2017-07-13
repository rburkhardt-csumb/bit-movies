/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordering;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Roderick Burkhardt
 */
public class ShoppingCartTest
{
    
    public ShoppingCartTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of addMovieToCart method, of class ShoppingCart.
     */
    @Test
    public void testAddMovieToCart()
    {
        System.out.println("addMovieToCart");
        MovieTicketOrder movieTicketOrder = null;
        ShoppingCart instance = new ShoppingCart();
        boolean expResult = false;
        boolean result = instance.addMovieToCart(movieTicketOrder);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeMovieFromCart method, of class ShoppingCart.
     */
    @Test
    public void testRemoveMovieFromCart()
    {
        System.out.println("removeMovieFromCart");
        ShoppingCart instance = new ShoppingCart();
        MovieTicketOrder expResult = null;
        MovieTicketOrder result = instance.removeMovieFromCart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of emptyCart method, of class ShoppingCart.
     */
    @Test
    public void testEmptyCart()
    {
        System.out.println("emptyCart");
        ShoppingCart instance = new ShoppingCart();
        boolean expResult = false;
        boolean result = instance.emptyCart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ShoppingCart.
     */
    @Test
    public void testToString()
    {
        System.out.println("toString");
        ShoppingCart instance = new ShoppingCart();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
