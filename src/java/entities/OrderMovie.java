/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Roderick Burkhardt
 */
@Entity
@Table(name = "order_movie")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "OrderMovie.findAll", query = "SELECT o FROM OrderMovie o")
    , @NamedQuery(name = "OrderMovie.findByOmId", query = "SELECT o FROM OrderMovie o WHERE o.omId = :omId")
    , @NamedQuery(name = "OrderMovie.findByOmNumAdult", query = "SELECT o FROM OrderMovie o WHERE o.omNumAdult = :omNumAdult")
    , @NamedQuery(name = "OrderMovie.findByOmNumChild", query = "SELECT o FROM OrderMovie o WHERE o.omNumChild = :omNumChild")
    , @NamedQuery(name = "OrderMovie.findByOmDate", query = "SELECT o FROM OrderMovie o WHERE o.omDate = :omDate")
    , @NamedQuery(name = "OrderMovie.findByOmTime", query = "SELECT o FROM OrderMovie o WHERE o.omTime = :omTime")
})
public class OrderMovie implements Serializable
{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "om_id")
    private Integer omId;
    @Column(name = "om_num_adult")
    private Integer omNumAdult;
    @Column(name = "om_num_child")
    private Integer omNumChild;
    @Column(name = "om_date")
    @Temporal(TemporalType.DATE)
    private Date omDate;
    @Column(name = "om_time")
    private String omTime;
    @JoinColumn(name = "order_num", referencedColumnName = "order_num")
    @ManyToOne(optional = false)
    private OrderObj orderNum;
    @JoinColumn(name = "movie_id", referencedColumnName = "movie_id")
    @ManyToOne(optional = false)
    private Movie movieId;

    public OrderMovie()
    {
    }

    public OrderMovie(Integer omId)
    {
        this.omId = omId;
    }

    public Integer getOmId()
    {
        return omId;
    }

    public void setOmId(Integer omId)
    {
        this.omId = omId;
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

    public Date getOmDate()
    {
        return omDate;
    }

    public void setOmDate(Date omDate)
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

    public OrderObj getOrderNum()
    {
        return orderNum;
    }

    public void setOrderNum(OrderObj orderNum)
    {
        this.orderNum = orderNum;
    }

    public Movie getMovieId()
    {
        return movieId;
    }

    public void setMovieId(Movie movieId)
    {
        this.movieId = movieId;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (omId != null ? omId.hashCode() : 0);
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
        if ((this.omId == null && other.omId != null) || (this.omId != null && !this.omId.equals(other.omId)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "entities.OrderMovie[ omId=" + omId + " ]";
    }
    
}
