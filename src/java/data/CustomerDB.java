/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import entities.Customer;
import entities.ZipCode;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author Roderick Burkhardt
 * @author Lawrence Dizon
 */
public class CustomerDB
{
     public static boolean insertCustomer(Customer customer)
    {
        if (!CustomerDB.customerExists(customer.getCustFname(),customer.getCustLname(),customer.getCustAddress1()))
        {
            EntityManager em = DBUtil.getEmFactory().createEntityManager();
            EntityTransaction trans = em.getTransaction();
            trans.begin();
            try
            {
                em.persist(customer);
                trans.commit();
                return true;
            }
            catch (Exception e)
            {
                System.err.println(e);
                trans.rollback();
                return false;
            }
            finally
            {
                em.close();
            }
        }
        return false;
    }
     
      public static boolean updateCustomer(Customer customer)
    {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try
        {
            em.merge(customer);
            trans.commit();
            return true;
        }
        catch (Exception e)
        {
            System.err.println(e);
            trans.rollback();
            return false;
        }
        finally
        {
            em.close();
        }
    }
      
    public static boolean deleteCustomer(Customer customer)
    {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try
        {
            em.remove(em.merge(customer));
            trans.commit();
            return true;
        } 
        catch (Exception e)
        {
            System.err.println(e);
            trans.rollback();
            return false;
        }
        finally
        {
            em.close();
        }
    }
    
    public static Customer selectCustomerByID(Integer custId)
    {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        Query q = em.createNamedQuery("Customer.findByCustId", Customer.class);
        q.setParameter("custId", custId);
        try
        {
            Customer customerData = (Customer)q.getSingleResult();
            return customerData;
        }
        catch (NoResultException e)
        {
            return null;
        }
        finally
        {
            em.close();
        }
    }
    
    
   
    
        public static String getCustomerPhone(Integer custId)
    {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        Query q = em.createNamedQuery("Customer.findByCustId", Customer.class);
        q.setParameter("custId", custId);
        try
        {
            Customer customerData = (Customer)q.getSingleResult();
            return customerData.getCustPhone();
        }
        catch (NoResultException e)
        {
            return null;
        }
        finally
        {
            em.close();
        }
    }
        
    
   
    
    
    
    
     public static List<Customer> selectCustomerByLname(String lname)
    {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        Query q = em.createNamedQuery("Customer.findByCustLname", Customer.class);
        q.setParameter("custLname", lname);
        List<Customer> customers;
        try
        {
            customers = q.getResultList();
            if (customers.isEmpty())
            {
                customers = null;
            }
        }
        catch (NoResultException e)
        {
            System.err.println(e);
            customers = null;
        }
        finally
        {
            em.close();
        }
        return customers;
    }
    
    
    public static Customer  selectCustomerByEmail(String email)
    {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        Query q = em.createNamedQuery("Customer.findByCustEmail", Customer.class);
        q.setParameter("custEmail", email);
        try
        {
            Customer customerData = (Customer)q.getSingleResult();
            return customerData;
        }
        catch (NoResultException e)
        {
            return null;
        }
        finally
        {
            em.close();
        }
    }
     
     public static List<Customer> selectCustomerByPhone(String phone)
    {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        Query q = em.createNamedQuery("Customer.findByCustPhone", Customer.class);
        q.setParameter("custPhone", phone);
        List<Customer> customers;
        try
        {
            customers = q.getResultList();
            if (customers.isEmpty())
            {
                customers = null;
            }
        }
        catch (NoResultException e)
        {
            System.err.println(e);
            customers = null;
        }
        finally
        {
            em.close();
        }
        return customers;
    }
   
 
    
    public static Customer selectByFullNameAndAddress(String fname, String lname, String email)
    {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        Query q = em.createNamedQuery("Customer.findByFullNameAndAddress", Customer.class);
        q.setParameter("custFname", fname);
        q.setParameter("custLname", lname);
        q.setParameter("custEmail", email);
        try
        {
            Customer customerData = (Customer)q.getSingleResult();
            return customerData;
        }
        catch (NoResultException e)
        {
            return null;
        }
        finally
        {
            em.close();
        }
    }
      
      
    public static boolean  customerExists(String fname, String lname, String email)
    {
        Customer customer = selectByFullNameAndAddress(fname, lname, email);
        return customer != null;
    }
}
