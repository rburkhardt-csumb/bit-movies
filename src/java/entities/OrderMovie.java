/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Roderick Burkhardt
 */
@Entity
@Table(name = "order_movie", catalog = "movie_tickets", schema = "")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "OrderMovie.findAll", query = "SELECT o FROM OrderMovie o")
    , @NamedQuery(name = "OrderMovie.findByOrderNum", query = "SELECT o FROM OrderMovie o WHERE o.orderMoviePK.orderNum = :orderNum")
    , @NamedQuery(name = "OrderMovie.findByMovieId", query = "SELECT o FROM OrderMovie o WHERE o.orderMoviePK.movieId = :movieId")
    , @NamedQuery(name = "OrderMovie.findByOmNumAdult", query = "SELECT o FROM OrderMovie o WHERE o.omNumAdult = :omNumAdult")
    , @NamedQuery(name = "OrderMovie.findByOmNumChild", query = "SELECT o FROM OrderMovie o WHERE o.omNumChild = :omNumChild")
    , @NamedQuery(name = "OrderMovie.findByOmDate", query = "SELECT o FROM OrderMovie o WHERE o.omDate = :omDate")
    , @NamedQuery(name = "OrderMovie.findByOmTime", query = "SELECT o FROM OrderMovie o WHERE o.omTime = :omTime")
})
public class OrderMovie implements Serializable
{

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OrderMoviePK orderMoviePK;
    @Column(name = "om_num_adult")
    private Integer omNumAdult;
    @Column(name = "om_num_child")
    private Integer omNumChild;
    @Column(name = "om_date")
    private String omDate;
    @Column(name = "om_time")
    private String omTime;
    @JoinColumn(name = "order_num", referencedColumnName = "order_num", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Order1 order1;
    @JoinColumn(name = "movie_id", referencedColumnName = "movie_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Movie movie;

    public OrderMovie()
    {
    }

    public OrderMovie(OrderMoviePK orderMoviePK)
    {
        this.orderMoviePK = orderMoviePK;
    }

    public OrderMovie(int orderNum, int movieId)
    {
        this.orderMoviePK = new OrderMoviePK(orderNum, movieId);
    }

    public OrderMoviePK getOrderMoviePK()
    {
        return orderMoviePK;
    }

    public void setOrderMoviePK(OrderMoviePK orderMoviePK)
    {
        this.orderMoviePK = orderMoviePK;
    }

    public Integer getOmNumAdult()
    {
        return omNumAdult;
    }

    public void setOmNumAdult(Integer omNumAdult)
    {
        this.omNumAdult = omNumAdult;
    }

    public Integer getOmNumChild()
    {
        return omNumChild;
    }

    public void setOmNumChild(Integer omNumChild)
    {
        this.omNumChild = omNumChild;
    }

    public String getOmDate()
    {
        return omDate;
    }

    public void setOmDate(String omDate)
    {
        this.omDate = omDate;
    }

    public String getOmTime()
    {
        return omTime;
    }

    public void setOmTime(String omTime)
    {
        this.omTime = omTime;
    }

    public Order1 getOrder1()
    {
        return order1;
    }

    public void setOrder1(Order1 order1)
    {
        this.order1 = order1;
    }

    public Movie getMovie()
    {
        return movie;
    }

    public void setMovie(Movie movie)
    {
        this.movie = movie;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (orderMoviePK != null ? orderMoviePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderMovie))
        {
            return false;
        }
        OrderMovie other = (OrderMovie) object;
        if ((this.orderMoviePK == null && other.orderMoviePK != null) || (this.orderMoviePK != null && !this.orderMoviePK.equals(other.orderMoviePK)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "entities.OrderMovie[ orderMoviePK=" + orderMoviePK + " ]";
    }
    
}
