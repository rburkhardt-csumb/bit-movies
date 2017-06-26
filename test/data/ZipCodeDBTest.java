/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import entities.ZipCode;
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
public class ZipCodeDBTest
{
    
    public ZipCodeDBTest()
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
     * Test of getZipCodeData method, of class ZipCodeDB.
     */
    @Test
    public void testGetZipCodeData()
    {
        ZipCode testZipCode = new ZipCode(68873, "Saint Paul", "NE", "Howard");
        System.out.println("getZipCodeData");
        Integer zip = 68873;
        ZipCode expResult = testZipCode;
        ZipCode result = ZipCodeDB.getZipCodeData(zip);
        assertEquals(expResult, result);
    }

    /**
     * Test of getCityName method, of class ZipCodeDB.
     */
    @Test
    public void testGetCityName()
    {
        System.out.println("getCityName");
        Integer zip = 68873;
        String expResult = "Saint Paul";
        String result = ZipCodeDB.getCityName(zip);
        assertEquals(expResult, result);
    }

    /**
     * Test of getStateAbrev method, of class ZipCodeDB.
     */
    @Test
    public void testGetStateAbrev()
    {
        System.out.println("getStateAbrev");
        Integer zip = 68873;
        String expResult = "NE";
        String result = ZipCodeDB.getStateAbrev(zip);
        assertEquals(expResult, result);
    }

    /**
     * Test of getCountyName method, of class ZipCodeDB.
     */
    @Test
    public void testGetCountyName()
    {
        System.out.println("getCountyName");
        Integer zip = 68873;
        String expResult = "Howard County";
        String result = ZipCodeDB.getCountyName(zip);
        assertEquals(expResult, result);
    }
    
}
