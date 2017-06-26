/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "customer_order")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "CustomerOrder.findAll", query = "SELECT c FROM CustomerOrder c")
    , @NamedQuery(name = "CustomerOrder.findByCoId", query = "SELECT c FROM CustomerOrder c WHERE c.coId = :coId")
})
public class CustomerOrder implements Serializable
{

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "co_id")
    private Integer coId;
    @JoinColumn(name = "cust_id", referencedColumnName = "cust_id")
    @ManyToOne(optional = false)
    private Customer custId;
    @JoinColumn(name = "order_num", referencedColumnName = "order_num")
    @ManyToOne(optional = false)
    private OrderObj orderNum;

    public CustomerOrder()
    {
    }

    public CustomerOrder(Integer coId)
    {
        this.coId = coId;
    }

    public Integer getCoId()
    {
        return coId;
    }

    public void setCoId(Integer coId)
    {
        this.coId = coId;
    }

    public Customer getCustId()
    {
        return custId;
    }

    public void setCustId(Customer custId)
    {
        this.custId = custId;
    }

    public OrderObj getOrderNum()
    {
        return orderNum;
    }

    public void setOrderNum(OrderObj orderNum)
    {
        this.orderNum = orderNum;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (coId != null ? coId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomerOrder))
        {
            return false;
        }
        CustomerOrder other = (CustomerOrder) object;
        if ((this.coId == null && other.coId != null) || (this.coId != null && !this.coId.equals(other.coId)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "entities.CustomerOrder[ coId=" + coId + " ]";
    }
    
}
