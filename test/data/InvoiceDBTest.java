/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import entities.OrderObj;
import entities.ZipCode;
import entities.Customer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.List;
import java.util.Date;
import static org.junit.Assert.*;

/**
 *
 * @author Lawrence Dizon
 */
public class InvoiceDBTest
{
    
    public InvoiceDBTest()
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
     * Test of selectCustomerByID method, of class InvoiceDB.
     */
    @Test
    public void testSelectCustomerByID()
    {
        ZipCode testZipCode = new ZipCode(68873, "Saint Paul", "NE", "Howard");
        Customer testCustomer = new Customer(01,"Rob", "Ford","robforb123@gmail.com","408-111-2222", "123 Sesame Street","",testZipCode);
        CustomerDB.insertCustomer(testCustomer);
        OrderObj testOrder = new OrderObj();
        testOrder.setCustId(testCustomer);
        testOrder.setOrderDate("2017-07-25");
        testOrder.setOrderNum(01);
        testOrder.setOrderSubtotal((short) 9.99);
        InvoiceDB.insertOrder(testOrder);
        System.out.println("getInvoiceData");
        Integer id = 01;
        OrderObj expResult = testOrder;  
        List<OrderObj> grab = InvoiceDB.selectCustomerByID(01);
        OrderObj result = grab.get(0);
        assertEquals(expResult, result);
    }
            //OrderObj result = InvoiceDB.selectCustomerByID(01);
        //assertEquals(expResult, result);
    /**
     * Test of orderExists method, of class InvoiceDB. 
     */
    @Test
    public void testOrderExists()
    {

        System.out.println("orderExists");
        Integer id = 01;
        Customer testCustomer = CustomerDB.selectCustomerByID(id);
        
        boolean expResult = true;
        boolean result = InvoiceDB.orderExists(id, testCustomer);
        assertEquals(expResult, result);
    }
    
     /**
     * Test of selectByOrderNumAndCustId method, of class InvoiceDB. 
     */
    @Test
    public void testSelectByOrderNumAndCustId()
    {

        System.out.println("selectByOrderNumAndCustId");
        Integer id = 01;    
        Customer testCustomer = CustomerDB.selectCustomerByID(id);
        OrderObj testOrder = new OrderObj();
        testOrder.setCustId(testCustomer);
        testOrder.setOrderDate("2017-07-25");
        testOrder.setOrderNum(01);
        testOrder.setOrderSubtotal((short) 9.99);
        OrderObj expResult = testOrder;
        OrderObj result = InvoiceDB.selectByOrderNumAndCustId(id, testCustomer);
        assertEquals(expResult, result);
    }
    
     /**
     * Test of selectMoviesByDate method, of class InvoiceDB. 
     */
    @Test
    public void testSelectMoviesByDate()
    {

        System.out.println("selectMoviesByDate");
        Integer id = 01;    
        Customer testCustomer = CustomerDB.selectCustomerByID(id);
        OrderObj testOrder = new OrderObj();
        testOrder.setCustId(testCustomer);
        testOrder.setOrderDate("2017-07-25");
        testOrder.setOrderNum(01);
        testOrder.setOrderSubtotal((short) 9.99);
        OrderObj expResult = testOrder;
        Date movieDate = new Date(2017,07,25);
        List<OrderObj> grab = InvoiceDB.selectMoviesByDate(movieDate);
        OrderObj result = grab.get(0);
        assertEquals(expResult, result);
    }
    
  
    

}
