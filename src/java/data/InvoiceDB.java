/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import static data.CustomerDB.selectByFullNameAndAddress;
import entities.Customer;
import entities.Movie;
import entities.OrderMovie;
import entities.OrderObj;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
/**
 * @author Lawrence Dizon
 * @author Roderick Burkhardt
 */
public class InvoiceDB
{
    public static boolean insertOrder(OrderObj order)
    {
        if (!InvoiceDB.orderExists(order.getOrderNum(),order.getCustId()))
        {
            EntityManager em = DBUtil.getEmFactory().createEntityManager();
            EntityTransaction trans = em.getTransaction();
            trans.begin();
            try
            {
                em.persist(order);
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
    
    public static OrderObj selectByOrderNumAndCustId(int orderNum, Customer custId)
    {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        Query q = em.createNamedQuery("Customer.findByCustIDAndOrderNum", OrderObj.class);
        q.setParameter("orderNum", orderNum);
        q.setParameter("orderNum", custId);

        try
        {
            OrderObj order = (OrderObj)q.getSingleResult();
            return order;
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
    
    public static boolean orderExists(int orderNum, Customer custId)
    {
        OrderObj order = selectByOrderNumAndCustId(orderNum, custId);
        return order != null;
    }
    
    public static List<OrderObj> selectCustomerByID(int custId) 
    {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        Query q = em.createNamedQuery("OrderObj.findByCustId", OrderObj.class);
        q.setParameter("custId", custId);
        List<OrderObj> orders;
        try
        {
            orders = q.getResultList();
            if (orders.isEmpty())
            {
                orders = null;
            }
        }
        catch (NoResultException e)
        {
            System.err.println(e);
            orders = null;
        }
        finally
        {
            em.close();
        }
        return orders;
    }
    
    public static List<OrderObj> selectMoviesByDate(Date date)
    {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        Query q = em.createNamedQuery("OrderObj.findByOrderDate", OrderObj.class);
        q.setParameter("date", date);
        List<OrderObj> orders;
        try
        {
            orders = q.getResultList();
            if (orders.isEmpty())
            {
                orders = null;
            }
        }
        catch (NoResultException e)
        {
            System.err.println(e);
            orders = null;
        }
        finally
        {
            em.close();
        }
        return orders;
    }
    
}
