/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordering;

import static data.MovieDBTest.sqlDateFormater;
import java.text.SimpleDateFormat;
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
    public MovieTicketOrder ticket;
    public static SimpleDateFormat sqlDateFormater = new SimpleDateFormat("yyyy-MM-dd");
    Date dateOfMovie;
    
    public MovieTicketOrderTest()
    {
        String dateString = "2017-06-23";
        try
        {
            dateOfMovie = sqlDateFormater.parse(dateString);
        } catch (Exception e)
        {
            dateOfMovie = null;
        }
        
        ticket = new MovieTicketOrder(5, dateOfMovie, 2, 2);
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
        Integer movieId = 5;
        MovieTicketOrder instance = new MovieTicketOrder();
        instance.setMovieId(movieId);
        //assertEquals(ticket.getMovieId(), this);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMovieId method, of class MovieTicketOrder.
     */
    @Test
    public void testGetMovieId()
    {
        System.out.println("getMovieId");
        Integer expResult = 5;
        Integer result = ticket.getMovieId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMovieDate method, of class MovieTicketOrder.
     */
    @Test
    public void testSetMovieDate()
    {
        System.out.println("setMovieDate");
        Date movieDate = dateOfMovie;
        MovieTicketOrder instance = new MovieTicketOrder();
        instance.setMovieDate(movieDate);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMovieDate method, of class MovieTicketOrder.
     */
    @Test
    public void testGetMovieDate()
    {
        System.out.println("getMovieDate");
        Date expResult = dateOfMovie;
        Date result = ticket.getMovieDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNumOfAdult method, of class MovieTicketOrder.
     */
    @Test
    public void testSetNumOfAdult()
    {
        System.out.println("setNumOfAdult");
        Integer numOfAdult = 2;
        MovieTicketOrder instance = new MovieTicketOrder();
        instance.setNumOfAdult(numOfAdult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNumOfAdult method, of class MovieTicketOrder.
     */
    @Test
    public void testGetNumOfAdult()
    {
        System.out.println("getNumOfAdult");
        Integer expResult = 2;
        Integer result = ticket.getNumOfAdult();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
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
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNumOfChild method, of class MovieTicketOrder.
     */
    @Test
    public void testGetNumOfChild()
    {
        System.out.println("getNumOfChild");
        Integer expResult = 2;
        Integer result = ticket.getNumOfChild();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class MovieTicketOrder.
     */
    @Test
    public void testToString()
    {
        String expResult = "Movie ID: 5  Movie Date: Fri Jun 23 00:00:00 PDT 2017  # of Adults: 2  # of Children: 2";
        System.out.println("ticket.toString()");
        String result = ticket.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
