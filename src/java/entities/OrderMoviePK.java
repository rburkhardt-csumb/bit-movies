/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Roderick Burkhardt
 */
@Embeddable
public class OrderMoviePK implements Serializable
{

    @Basic(optional = false)
    @Column(name = "order_num")
    private int orderNum;
    @Basic(optional = false)
    @Column(name = "movie_id")
    private int movieId;

    public OrderMoviePK()
    {
    }

    public OrderMoviePK(int orderNum, int movieId)
    {
        this.orderNum = orderNum;
        this.movieId = movieId;
    }

    public int getOrderNum()
    {
        return orderNum;
    }

    public void setOrderNum(int orderNum)
    {
        this.orderNum = orderNum;
    }

    public int getMovieId()
    {
        return movieId;
    }

    public void setMovieId(int movieId)
    {
        this.movieId = movieId;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (int) orderNum;
        hash += (int) movieId;
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderMoviePK))
        {
            return false;
        }
        OrderMoviePK other = (OrderMoviePK) object;
        if (this.orderNum != other.orderNum)
        {
            return false;
        }
        if (this.movieId != other.movieId)
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "entities.OrderMoviePK[ orderNum=" + orderNum + ", movieId=" + movieId + " ]";
    }
    
}
