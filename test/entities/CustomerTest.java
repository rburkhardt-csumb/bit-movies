/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Collection;
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
public class CustomerTest
{
    
    public CustomerTest()
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
     * Test of getCustId method, of class Customer.
     */
    @Test
    public void testGetCustId()
    {
        System.out.println("getCustId");
        Customer instance = new Customer();
        Integer expResult = null;
        Integer result = instance.getCustId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustId method, of class Customer.
     */
    @Test
    public void testSetCustId()
    {
        System.out.println("setCustId");
        Integer custId = null;
        Customer instance = new Customer();
        instance.setCustId(custId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustFname method, of class Customer.
     */
    @Test
    public void testGetCustFname()
    {
        System.out.println("getCustFname");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.getCustFname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustFname method, of class Customer.
     */
    @Test
    public void testSetCustFname()
    {
        System.out.println("setCustFname");
        String custFname = "";
        Customer instance = new Customer();
        instance.setCustFname(custFname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustLname method, of class Customer.
     */
    @Test
    public void testGetCustLname()
    {
        System.out.println("getCustLname");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.getCustLname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustLname method, of class Customer.
     */
    @Test
    public void testSetCustLname()
    {
        System.out.println("setCustLname");
        String custLname = "";
        Customer instance = new Customer();
        instance.setCustLname(custLname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustEmail method, of class Customer.
     */
    @Test
    public void testGetCustEmail()
    {
        System.out.println("getCustEmail");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.getCustEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustEmail method, of class Customer.
     */
    @Test
    public void testSetCustEmail()
    {
        System.out.println("setCustEmail");
        String custEmail = "";
        Customer instance = new Customer();
        instance.setCustEmail(custEmail);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustPhone method, of class Customer.
     */
    @Test
    public void testGetCustPhone()
    {
        System.out.println("getCustPhone");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.getCustPhone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustPhone method, of class Customer.
     */
    @Test
    public void testSetCustPhone()
    {
        System.out.println("setCustPhone");
        String custPhone = "";
        Customer instance = new Customer();
        instance.setCustPhone(custPhone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustAddress1 method, of class Customer.
     */
    @Test
    public void testGetCustAddress1()
    {
        System.out.println("getCustAddress1");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.getCustAddress1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustAddress1 method, of class Customer.
     */
    @Test
    public void testSetCustAddress1()
    {
        System.out.println("setCustAddress1");
        String custAddress1 = "";
        Customer instance = new Customer();
        instance.setCustAddress1(custAddress1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustAddress2 method, of class Customer.
     */
    @Test
    public void testGetCustAddress2()
    {
        System.out.println("getCustAddress2");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.getCustAddress2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustAddress2 method, of class Customer.
     */
    @Test
    public void testSetCustAddress2()
    {
        System.out.println("setCustAddress2");
        String custAddress2 = "";
        Customer instance = new Customer();
        instance.setCustAddress2(custAddress2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrderObjCollection method, of class Customer.
     */
    @Test
    public void testGetOrderObjCollection()
    {
        System.out.println("getOrderObjCollection");
        Customer instance = new Customer();
        Collection<OrderObj> expResult = null;
        Collection<OrderObj> result = instance.getOrderObjCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrderObjCollection method, of class Customer.
     */
    @Test
    public void testSetOrderObjCollection()
    {
        System.out.println("setOrderObjCollection");
        Collection<OrderObj> orderObjCollection = null;
        Customer instance = new Customer();
        instance.setOrderObjCollection(orderObjCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getZip method, of class Customer.
     */
    @Test
    public void testGetZip()
    {
        System.out.println("getZip");
        Customer instance = new Customer();
        ZipCode expResult = null;
        ZipCode result = instance.getZip();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setZip method, of class Customer.
     */
    @Test
    public void testSetZip()
    {
        System.out.println("setZip");
        ZipCode zip = null;
        Customer instance = new Customer();
        instance.setZip(zip);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustPassword method, of class Customer.
     */
    @Test
    public void testGetCustPassword()
    {
        System.out.println("getCustPassword");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.getCustPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustPassword method, of class Customer.
     */
    @Test
    public void testSetCustPassword()
    {
        System.out.println("setCustPassword");
        String custPassword = "";
        Customer instance = new Customer();
        instance.setCustPassword(custPassword);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Customer.
     */
    @Test
    public void testHashCode()
    {
        System.out.println("hashCode");
        Customer instance = new Customer();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Customer.
     */
    @Test
    public void testEquals()
    {
        System.out.println("equals");
        Object object = null;
        Customer instance = new Customer();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Customer.
     */
    @Test
    public void testToString()
    {
        System.out.println("toString");
        Customer instance = new Customer();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
