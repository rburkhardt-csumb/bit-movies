/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordering;

import java.util.Date;
import java.text.SimpleDateFormat;
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
    public ShoppingCart cart;
    public static SimpleDateFormat sqlDateFormater = new SimpleDateFormat("yyyy-MM-dd");
    String dateString;
    Date dateOfMovie;
    MovieTicketOrder ticket;
    
    public ShoppingCartTest()
    {
        cart = new ShoppingCart();
        
        dateString = "2017-06-23";
        dateOfMovie = makeDate(dateString);
        ticket = new MovieTicketOrder(5, dateOfMovie, 2, 2);
        cart.addMovieToCart(ticket);
        
        dateString = "2017-06-25";
        dateOfMovie = makeDate(dateString);
        ticket = new MovieTicketOrder(4, dateOfMovie, 4, 0);
        cart.addMovieToCart(ticket);
        
        dateString = "2017-06-27";
        dateOfMovie = makeDate(dateString);
        ticket = new MovieTicketOrder(2, dateOfMovie, 1, 5);
        cart.addMovieToCart(ticket);
        
        System.out.println(cart);
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
        dateString = "2017-06-27";
        dateOfMovie = makeDate(dateString);
        MovieTicketOrder movieTicketOrder = new MovieTicketOrder(2, dateOfMovie, 1, 5);
        ShoppingCart instance = new ShoppingCart();
        boolean expResult = true;
        boolean result = instance.addMovieToCart(movieTicketOrder);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of removeMovieFromCart method, of class ShoppingCart.
     */
    @Test
    public void testRemoveMovieFromCart()
    {
        System.out.println("removeMovieFromCart");
        boolean expResult = true;
        boolean result = cart.removeMovieFromCart(2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        // Testing of remove failure
        System.out.println("removeMovieFromCart");
        expResult = false;
        result = cart.removeMovieFromCart(500);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of emptyCart method, of class ShoppingCart.
     */
    @Test
    public void testEmptyCart()
    {
        System.out.println("emptyCart");
        ShoppingCart instance = new ShoppingCart();
        boolean expResult = true;
        boolean result = instance.emptyCart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        expResult = false;
        result = cart.emptyCart();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class ShoppingCart.
     */
    @Test
    public void testToString()
    {
        System.out.println("toString");
        ShoppingCart instance = new ShoppingCart();
        String expResult = "Shopping Cart is Empty";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public Date makeDate(String dateString) // Test helper
    {
        Date date;
        try
        {
            date = sqlDateFormater.parse(dateString);
        } catch (Exception e)
        {
            date = null;
        }
        return date;
    }
    
}
