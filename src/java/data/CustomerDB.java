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
        if (!CustomerDB.customerExists(customer.getCustFname(), customer.getCustLname(), customer.getCustAddress1()))
        {
            EntityManager em = DBUtil.getEmFactory().createEntityManager();
            EntityTransaction trans = em.getTransaction();
            trans.begin();
            try
            {
                em.persist(customer);
                trans.commit();
                return true;
            } catch (Exception e)
            {
                System.err.println(e);
                trans.rollback();
                return false;
            } finally
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
        } catch (Exception e)
        {
            System.err.println(e);
            trans.rollback();
            return false;
        } finally
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
        } catch (Exception e)
        {
            System.err.println(e);
            trans.rollback();
            return false;
        } finally
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
            Customer customerData = (Customer) q.getSingleResult();
            return customerData;
        } catch (NoResultException e)
        {
            return null;
        } finally
        {
            em.close();
        }
    }
    
    // not needed
    public static String getCustomerFname(Integer custId)
    {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        Query q = em.createNamedQuery("Customer.findByCustId", Customer.class);
        q.setParameter("custId", custId);
        try
        {
            Customer customerData = (Customer) q.getSingleResult();
            return customerData.getCustFname();
        } catch (NoResultException e)
        {
            return null;
        } finally
        {
            em.close();
        }
    }

    // not needed
    public static String getCustomerLname(Integer custId)
    {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        Query q = em.createNamedQuery("Customer.findByCustId", Customer.class);
        q.setParameter("custId", custId);
        try
        {
            Customer customerData = (Customer) q.getSingleResult();
            return customerData.getCustLname();
        } catch (NoResultException e)
        {
            return null;
        } finally
        {
            em.close();
        }
    }

    // not needed
    public static String getCustomerEmail(Integer custId)
    {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        Query q = em.createNamedQuery("Customer.findByCustId", Customer.class);
        q.setParameter("custId", custId);
        try
        {
            Customer customerData = (Customer) q.getSingleResult();
            return customerData.getCustEmail();
        } catch (NoResultException e)
        {
            return null;
        } finally
        {
            em.close();
        }
    }
    
    //should be search bu phone number
    public static String getCustomerPhone(Integer custId)
    {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        Query q = em.createNamedQuery("Customer.findByCustId", Customer.class);
        q.setParameter("custId", custId);
        try
        {
            Customer customerData = (Customer) q.getSingleResult();
            return customerData.getCustPhone();
        } catch (NoResultException e)
        {
            return null;
        } finally
        {
            em.close();
        }
    }

    // not needed.....
    public static String getCustomerAddress1(Integer custId)
    {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        Query q = em.createNamedQuery("Customer.findByCustId", Customer.class);
        q.setParameter("custId", custId);
        try
        {
            Customer customerData = (Customer) q.getSingleResult();
            return customerData.getCustAddress1();
        } catch (NoResultException e)
        {
            return null;
        } finally
        {
            em.close();
        }
    }

    // not needed.....
    public static String getCustomerAddress2(Integer custId)
    {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        Query q = em.createNamedQuery("Customer.findByCustId", Customer.class);
        q.setParameter("custId", custId);
        try
        {
            Customer customerData = (Customer) q.getSingleResult();
            return customerData.getCustAddress2();
        } catch (NoResultException e)
        {
            return null;
        } finally
        {
            em.close();
        }
    }
    
    // this is unneeded, search by zipcode should return a list of customers.
    public static ZipCode getCustomerZip(Integer custId)
    {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        Query q = em.createNamedQuery("Customer.findByCustId", Customer.class);
        q.setParameter("custId", custId);
        try
        {
            Customer customerData = (Customer) q.getSingleResult();
            return customerData.getZip();
        } catch (NoResultException e)
        {
            return null;
        } finally
        {
            em.close();
        }
    }

    // not needed.....
    public static List<Customer> selectCustomerByFname(String fname)
    {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        Query q = em.createNamedQuery("Customer.findByCustFname", Customer.class);
        q.setParameter("custFname", fname);
        List<Customer> customers;
        try
        {
            customers = q.getResultList();
            if (customers.isEmpty())
            {
                customers = null;
            }
        } catch (NoResultException e)
        {
            System.err.println(e);
            customers = null;
        } finally
        {
            em.close();
        }
        return customers;
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
        } catch (NoResultException e)
        {
            System.err.println(e);
            customers = null;
        } finally
        {
            em.close();
        }
        return customers;
    }

    // >>>> email can only be associated with one account so this is un needed
    // for list return
    //Convert Later to just get one ????????
    public static List<Customer> selectCustomerByEmail(String email)
    {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        Query q = em.createNamedQuery("Customer.findByCustEmail", Customer.class);
        q.setParameter("custEmail", email);
        List<Customer> customers;
        try
        {
            customers = q.getResultList();
            if (customers.isEmpty())
            {
                customers = null;
            }
        } catch (NoResultException e)
        {
            System.err.println(e);
            customers = null;
        } finally
        {
            em.close();
        }
        return customers;
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
        } catch (NoResultException e)
        {
            System.err.println(e);
            customers = null;
        } finally
        {
            em.close();
        }
        return customers;
    }
    
    // not needed
    public static List<Customer> selectCustomerByAddress1(String address)
    {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        Query q = em.createNamedQuery("Customer.findByCustAddress1", Customer.class);
        q.setParameter("custAddress1", address);
        List<Customer> customers;
        try
        {
            customers = q.getResultList();
            if (customers.isEmpty())
            {
                customers = null;
            }
        } catch (NoResultException e)
        {
            System.err.println(e);
            customers = null;
        } finally
        {
            em.close();
        }
        return customers;
    }
    
    // not needed......
    public static List<Customer> selectCustomerByAddress2(String address)
    {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        Query q = em.createNamedQuery("Customer.findByCustAddress1", Customer.class);
        q.setParameter("custAddress2", address);
        List<Customer> customers;
        try
        {
            customers = q.getResultList();
            if (customers.isEmpty())
            {
                customers = null;
            }
        } catch (NoResultException e)
        {
            System.err.println(e);
            customers = null;
        } finally
        {
            em.close();
        }
        return customers;
    }
    
    // not needed.....
    public static Customer selectByFullNameAndAddress(String fname, String lname, String address)
    {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        Query q = em.createNamedQuery("Customer.findByFullNameAndAddress", Customer.class);
        q.setParameter("custFname", fname);
        q.setParameter("custLname", lname);
        q.setParameter("custAddress1", address);
        try
        {
            Customer customerData = (Customer) q.getSingleResult();
            return customerData;
        } catch (NoResultException e)
        {
            return null;
        } finally
        {
            em.close();
        }
    }

    public static boolean customerExists(String fname, String lname, String address)
    {
        Customer customer = selectByFullNameAndAddress(fname, lname, address);
        return customer != null;
    }
}
