/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import entities.ZipCode;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author Roderick Burkhardt
 */
public class ZipCodeDB
{
    public static ZipCode getZipCodeData(Integer zip)
    {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        Query q = em.createNamedQuery("ZipCode.findByZip", ZipCode.class);
        q.setParameter("zip", zip);
        try
        {
            ZipCode zipCode = (ZipCode)q.getSingleResult();
            return zipCode;
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
    
    public static String getCityName(Integer zip)
    {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        Query q = em.createNamedQuery("ZipCode.findByZip", ZipCode.class);
        q.setParameter("zip", zip);
        try
        {
            ZipCode zipCode = (ZipCode)q.getSingleResult();
            return zipCode.getCity();
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
    
    public static String getStateAbrev(Integer zip)
    {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        Query q = em.createNamedQuery("ZipCode.findByZip", ZipCode.class);
        q.setParameter("zip", zip);
        try
        {
            ZipCode zipCode = (ZipCode)q.getSingleResult();
            return zipCode.getState();
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
    
    public static String getCountyName(Integer zip)
    {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        Query q = em.createNamedQuery("ZipCode.findByZip", ZipCode.class);
        q.setParameter("zip", zip);
        try
        {
            ZipCode zipCode = (ZipCode)q.getSingleResult();
            return zipCode.getCounty();
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
}
