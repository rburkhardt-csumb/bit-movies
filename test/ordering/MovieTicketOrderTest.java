/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordering;

import java.util.Date;
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
public class MovieTicketOrderTest
{
    
    public MovieTicketOrderTest()
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
     * Test of setMovieId method, of class MovieTicketOrder.
     */
    @Test
    public void testSetMovieId()
    {
        System.out.println("setMovieId");
        Integer movieId = null;
        MovieTicketOrder instance = new MovieTicketOrder();
        instance.setMovieId(movieId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMovieId method, of class MovieTicketOrder.
     */
    @Test
    public void testGetMovieId()
    {
        System.out.println("getMovieId");
        MovieTicketOrder instance = new MovieTicketOrder();
        Integer expResult = null;
        Integer result = instance.getMovieId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMovieDate method, of class MovieTicketOrder.
     */
    @Test
    public void testSetMovieDate()
    {
        System.out.println("setMovieDate");
        Date movieDate = null;
        MovieTicketOrder instance = new MovieTicketOrder();
        instance.setMovieDate(movieDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMovieDate method, of class MovieTicketOrder.
     */
    @Test
    public void testGetMovieDate()
    {
        System.out.println("getMovieDate");
        MovieTicketOrder instance = new MovieTicketOrder();
        Date expResult = null;
        Date result = instance.getMovieDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumOfAdult method, of class MovieTicketOrder.
     */
    @Test
    public void testSetNumOfAdult()
    {
        System.out.println("setNumOfAdult");
        Integer numOfAdult = null;
        MovieTicketOrder instance = new MovieTicketOrder();
        instance.setNumOfAdult(numOfAdult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumOfAdult method, of class MovieTicketOrder.
     */
    @Test
    public void testGetNumOfAdult()
    {
        System.out.println("getNumOfAdult");
        MovieTicketOrder instance = new MovieTicketOrder();
        Integer expResult = null;
        Integer result = instance.getNumOfAdult();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumOfChild method, of class MovieTicketOrder.
     */
    @Test
    public void testSetNumOfChild()
    {
        System.out.println("setNumOfChild");
        Integer numOfChild = null;
        MovieTicketOrder instance = new MovieTicketOrder();
        instance.setNumOfChild(numOfChild);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumOfChild method, of class MovieTicketOrder.
     */
    @Test
    public void testGetNumOfChild()
    {
        System.out.println("getNumOfChild");
        MovieTicketOrder instance = new MovieTicketOrder();
        Integer expResult = null;
        Integer result = instance.getNumOfChild();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class MovieTicketOrder.
     */
    @Test
    public void testToString()
    {
        System.out.println("toString");
        MovieTicketOrder instance = new MovieTicketOrder();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
