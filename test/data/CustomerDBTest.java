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
import java.util.List;
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
    
     /**
     * Test of selectCustomerByLname method, of class CustomerDB. 
     */
    @Test
    public void testSelectCustomerByLname()
    {

        System.out.println("selectCustomerByLname");
        String lname = "Ford";
        Integer id = 01;
        Customer expResult = CustomerDB.selectCustomerByID(id);
        List<Customer> grab = CustomerDB.selectCustomerByLname(lname);
        Customer result = grab.get(0);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of selectCustomerByLname method, of class CustomerDB. 
     */
    @Test
    public void selectCustomerByEmail()
    {

        System.out.println("selectCustomerByEmail");
        Integer id = 01;
        String email = "robforb123@gmail.com";
        Customer expResult = CustomerDB.selectCustomerByID(id);
        Customer result = CustomerDB.selectCustomerByEmail(email);
        assertEquals(expResult, result);
    }
    
     /**
     * Test of selectCustomerByPhone method, of class CustomerDB. 
     */
    @Test
    public void testSelectCustomerByPhone()
    {

        System.out.println("selectCustomerByPhone");
        String phone = "408-111-2222";
        Integer id = 01;
        Customer expResult = CustomerDB.selectCustomerByID(id);
        List<Customer> grab = CustomerDB.selectCustomerByPhone(phone);
        Customer result = grab.get(0);
        assertEquals(expResult, result);
    }
    
     /**
     * Test of selectCustomerByPhone method, of class CustomerDB. 
     */
    @Test
    public void testSelectByFullNameEmail()
    {

        System.out.println("selectByFullNameAndAddress");
        String fname = "Rob";
        String lname = "Ford";
        String email = "robforb123@gmail.com";
        Integer id = 01;
        Customer expResult = CustomerDB.selectCustomerByID(id);
        Customer result= CustomerDB.selectByFullNameEmail(fname, lname, email);   
        assertEquals(expResult, result);
    }

    /**
     * Test of insertCustomer method, of class CustomerDB.
     */
    @Test
    public void testInsertCustomer()
    {
        System.out.println("insertCustomer");
        Customer customer = null;
        boolean expResult = false;
        boolean result = CustomerDB.insertCustomer(customer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCustomer method, of class CustomerDB.
     */
    @Test
    public void testUpdateCustomer()
    {
        System.out.println("updateCustomer");
        Customer customer = null;
        boolean expResult = false;
        boolean result = CustomerDB.updateCustomer(customer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCustomer method, of class CustomerDB.
     */
    @Test
    public void testDeleteCustomer()
    {
        System.out.println("deleteCustomer");
        Customer customer = null;
        boolean expResult = false;
        boolean result = CustomerDB.deleteCustomer(customer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectCustomerByID method, of class CustomerDB.
     */
    @Test
    public void testSelectCustomerByID()
    {
        System.out.println("selectCustomerByID");
        Integer custId = null;
        Customer expResult = null;
        Customer result = CustomerDB.selectCustomerByID(custId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectCustomerByEmail method, of class CustomerDB.
     */
    @Test
    public void testSelectCustomerByEmail()
    {
        System.out.println("selectCustomerByEmail");
        String email = "";
        Customer expResult = null;
        Customer result = CustomerDB.selectCustomerByEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of customerExists method, of class CustomerDB.
     */
    @Test
    public void testCustomerExists_3args()
    {
        System.out.println("customerExists");
        String fname = "";
        String lname = "";
        String email = "";
        boolean expResult = false;
        boolean result = CustomerDB.customerExists(fname, lname, email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of customerExists method, of class CustomerDB.
     */
    @Test
    public void testCustomerExists_String_String()
    {
        System.out.println("customerExists");
        String email = "";
        String password = "";
        boolean expResult = false;
        boolean result = CustomerDB.customerExists(email, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    

}
