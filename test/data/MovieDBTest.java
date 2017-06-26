/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import entities.Movie;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
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
public class MovieDBTest
{
    public static SimpleDateFormat sqlDateFormater = new SimpleDateFormat("yyyy-MM-dd");
    public static int rtrnMovieId = 4;
    public static Movie testMovie = new Movie();
    
    
    public MovieDBTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
        testMovie.setMovieTitle("Baywatch");
        testMovie.setMovieDescr("Devoted lifeguard Mitch Buchannon butts heads with a brash new recruit, as they uncover a criminal plot that threatens the future of the bay.");
        testMovie.setMovieRating("R");
        testMovie.setMovieGenre("Action");
        testMovie.setMovieLength(126);
        String startDateString = "2017-06-23";
        Date startDate;
        try
        {
            startDate = sqlDateFormater.parse(startDateString);
        } catch (Exception e)
        {
            startDate = null;
        }
        testMovie.setMovieStartDate(startDate);
        String endDateString = "2017-07-13";
        Date endDate;
        try
        {
            endDate = sqlDateFormater.parse(endDateString);
        } catch (Exception e)
        {
            endDate = null;
        }
        testMovie.setMovieEndDate(endDate);
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
     * Test of insertMovie method, of class MovieDB.
     */
    /*@Test
    public void testInsertMovie()
    {
        System.out.println("insertMovie");
        boolean expResult = true;
        boolean result = MovieDB.insertMovie(testMovie);
        rtrnMovieId++;
        assertEquals(expResult, result);
    }

    /**
     * Test of updateMovie method, of class MovieDB.
     */
    /*@Test
    public void testUpdateMovie()
    {
        System.out.println("updateMovie");
        testMovie.setMovieId(rtrnMovieId);
        testMovie.setMovieGenre("Comedy");
        boolean expResult = true;
        boolean result = MovieDB.updateMovie(testMovie);
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteMovie method, of class MovieDB.
     */
    /*@Test
    public void testDeleteMovie()
    {
        System.out.println("deleteMovie");
        testMovie.setMovieId(rtrnMovieId);
        boolean expResult = true;
        boolean result = MovieDB.deleteMovie(testMovie);
        assertEquals(expResult, result);
    }

    /**
     * Test of selectMovieByDate method, of class MovieDB.
     */
    @Test
    public void testSelectMoviesByDate()
    {
        System.out.println("selectMovieByDate");
        String dateString = "2017-06-29";
        Date date;
        try
        {
            date = sqlDateFormater.parse(dateString);
        } catch (Exception e)
        {
            date = null;
        }
        List<Movie> expResult;// = new ArrayList<Movie>();
        //expResult.add(testMovie);
        List<Movie> result = MovieDB.selectMoviesByDate(date);
        //assertEquals(expResult, result);
    }

    /**
     * Test of selectMovieByTitle method, of class MovieDB.
     */
    @Test
    public void testSelectMovieByTitle()
    {
        System.out.println("selectMovieByTitle");
        String title = "Baywatch";
        Movie expResult = null;
        Movie result = MovieDB.selectMovieByTitle(title);
        //assertEquals(expResult, result);
    }

    /**
     * Test of SelectMovieById method, of class MovieDB.
     */
    @Test
    public void testSelectMovieById()
    {
        System.out.println("SelectMovieById");
        Long id = null;
        Movie expResult = null;
        Movie result = MovieDB.SelectMovieById(id);
        //assertEquals(expResult, result);
    }

    /**
     * Test of movieExists method, of class MovieDB.
     */
    @Test
    public void testMovieExists()
    {
        System.out.println("movieExists");
        String title = "Baywatch";
        boolean expResult = true;
        boolean result = MovieDB.movieExists(title);
        //(expResult, result);
    }
    
    /*private int getTestMovieId(String title)
    {
        int rtrnMovieId = 0;
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        Query q = em.createNamedQuery("Movie.findByMovieTitle", Movie.class);
        q.setParameter("movieTitle", title);
        try
        {
            Movie movie = (Movie)q.getSingleResult();
            rtrnMovieId = movie.getMovieId();
        }
        catch (NoResultException e)
        {
            System.err.println(e);
        }
        finally
        {
            em.close();
        }
        return rtrnMovieId;
    }*/
    
}
