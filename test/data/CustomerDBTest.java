/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import entities.ZipCode;
import entities.Customer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lawrence Dizon
 */
public class CustomerDBTest
{
    
    public CustomerDBTest()
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
     * Test of getCustomerData method, of class CustomerDB.
     */
    @Test
    public void testGetCustomerData()
    {
        ZipCode testZipCode = new ZipCode(68873, "Saint Paul", "NE", "Howard");
        Customer testCustomer = new Customer(01,"Rob", "Ford","robforb123@gmail.com","408-111-2222", "123 Sesame Street","",testZipCode);
        CustomerDB.insertCustomer(testCustomer);
        System.out.println("getCustomerData");
        Integer id = 01;
        Customer expResult = testCustomer;
        Customer result = CustomerDB.selectCustomerByID(id);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getCustomerPhone method, of class CustomerDB.
     */
    @Test
    public void testGetCustomerPhone()
    {

        System.out.println("getCustomerPhone");
        Integer id = 01;
        String expResult = "408-111-2222";
        String result = CustomerDB.getCustomerPhone(id);
        assertEquals(expResult, result);
    }
    
 
    
}
