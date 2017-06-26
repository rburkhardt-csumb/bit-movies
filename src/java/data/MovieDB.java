/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import entities.Movie;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author Roderick Burkhardt
 */
public class MovieDB
{
    public static boolean insertMovie(Movie movie)
    {
        if (!MovieDB.movieExists(movie.getMovieTitle()))
        {
            EntityManager em = DBUtil.getEmFactory().createEntityManager();
            EntityTransaction trans = em.getTransaction();
            trans.begin();
            try
            {
                em.persist(movie);
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
    
    public static boolean updateMovie(Movie movie)
    {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try
        {
            em.merge(movie);
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
    
    public static boolean deleteMovie(Movie movie)
    {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try
        {
            em.remove(em.merge(movie));
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
    
    public static List<Movie> selectMoviesByDate(Date date)
    {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        Query q = em.createNamedQuery("Movie.findMoviesByDate", Movie.class);
        q.setParameter("date", date);
        List<Movie> movies;
        try
        {
            movies = q.getResultList();
            if (movies.isEmpty())
            {
                movies = null;
            }
        }
        catch (NoResultException e)
        {
            System.err.println(e);
            movies = null;
        }
        finally
        {
            em.close();
        }
        return movies;
    }
    
    public static Movie selectMovieByTitle(String title)
    {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        Query q = em.createNamedQuery("Movie.findByMovieTitle", Movie.class);
        q.setParameter("movieTitle", title);
        try
        {
            Movie movie = (Movie)q.getSingleResult();
            return movie;
        }
        catch (NoResultException e)
        {
            System.err.println(e);
            return null;
        }
        finally
        {
            em.close();
        }
    }
    
    public static Movie SelectMovieById(Long id)
    {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        Query q = em.createNamedQuery("Movie.findByMovieId", Movie.class);
        q.setParameter("movieId", id);
        try
        {
            Movie movie = (Movie)q.getSingleResult();
            return movie;
        }
        catch (NoResultException e)
        {
            System.err.println(e);
            return null;
        }
        finally
        {
            em.close();
        }
    }
    
    public static boolean  movieExists(String title)
    {
        Movie m = selectMovieByTitle(title);
        return m != null;
    }
            
}
