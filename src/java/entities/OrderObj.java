/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Roderick Burkhardt
 */
@Entity
@Table(name = "order")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "OrderObj.findAll", query = "SELECT o FROM OrderObj o")
    , @NamedQuery(name = "OrderObj.findByOrderNum", query = "SELECT o FROM OrderObj o WHERE o.orderNum = :orderNum")
    , @NamedQuery(name = "OrderObj.findByOrderDate", query = "SELECT o FROM OrderObj o WHERE o.orderDate = :orderDate")
    , @NamedQuery(name = "OrderObj.findByOrderSubtotal", query = "SELECT o FROM OrderObj o WHERE o.orderSubtotal = :orderSubtotal")
})
public class OrderObj implements Serializable
{

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "order_num")
    private Integer orderNum;
    @Column(name = "order_date")
    private String orderDate;
    @Column(name = "order_subtotal")
    private Short orderSubtotal;
    @ManyToMany(mappedBy = "orderObjCollection")
    private Collection<Customer> customerCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orderObj")
    private Collection<OrderMovie> orderMovieCollection;

    public OrderObj()
    {
    }

    public OrderObj(Integer orderNum)
    {
        this.orderNum = orderNum;
    }

    public Integer getOrderNum()
    {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum)
    {
        this.orderNum = orderNum;
    }

    public String getOrderDate()
    {
        return orderDate;
    }

    public void setOrderDate(String orderDate)
    {
        this.orderDate = orderDate;
    }

    public Short getOrderSubtotal()
    {
        return orderSubtotal;
    }

    public void setOrderSubtotal(Short orderSubtotal)
    {
        this.orderSubtotal = orderSubtotal;
    }

    @XmlTransient
    public Collection<Customer> getCustomerCollection()
    {
        return customerCollection;
    }

    public void setCustomerCollection(Collection<Customer> customerCollection)
    {
        this.customerCollection = customerCollection;
    }

    @XmlTransient
    public Collection<OrderMovie> getOrderMovieCollection()
    {
        return orderMovieCollection;
    }

    public void setOrderMovieCollection(Collection<OrderMovie> orderMovieCollection)
    {
        this.orderMovieCollection = orderMovieCollection;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (orderNum != null ? orderNum.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderObj))
        {
            return false;
        }
        OrderObj other = (OrderObj) object;
        if ((this.orderNum == null && other.orderNum != null) || (this.orderNum != null && !this.orderNum.equals(other.orderNum)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "entities.OrderObj[ orderNum=" + orderNum + " ]";
    }
    
}
