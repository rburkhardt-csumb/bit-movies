/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordering;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
public class CartServletTest
{
    
    public CartServletTest()
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
     * Test of doGet method, of class CartServlet.
     */
    @Test
    public void testDoGet() throws Exception
    {
        System.out.println("doGet");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        CartServlet instance = new CartServlet();
        instance.doGet(request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doPost method, of class CartServlet.
     */
    @Test
    public void testDoPost() throws Exception
    {
        System.out.println("doPost");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        CartServlet instance = new CartServlet();
        instance.doPost(request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getServletInfo method, of class CartServlet.
     */
    @Test
    public void testGetServletInfo()
    {
        System.out.println("getServletInfo");
        CartServlet instance = new CartServlet();
        String expResult = "";
        String result = instance.getServletInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
