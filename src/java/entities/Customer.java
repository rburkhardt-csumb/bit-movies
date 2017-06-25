/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Roderick Burkhardt
 */
@Entity
@Table(name = "customer")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c")
    , @NamedQuery(name = "Customer.findByCustId", query = "SELECT c FROM Customer c WHERE c.custId = :custId")
    , @NamedQuery(name = "Customer.findByCustFname", query = "SELECT c FROM Customer c WHERE c.custFname = :custFname")
    , @NamedQuery(name = "Customer.findByCustLname", query = "SELECT c FROM Customer c WHERE c.custLname = :custLname")
    , @NamedQuery(name = "Customer.findByCustEmail", query = "SELECT c FROM Customer c WHERE c.custEmail = :custEmail")
    , @NamedQuery(name = "Customer.findByCustPhone", query = "SELECT c FROM Customer c WHERE c.custPhone = :custPhone")
    , @NamedQuery(name = "Customer.findByCustAddress1", query = "SELECT c FROM Customer c WHERE c.custAddress1 = :custAddress1")
    , @NamedQuery(name = "Customer.findByCustAddress2", query = "SELECT c FROM Customer c WHERE c.custAddress2 = :custAddress2")
})
public class Customer implements Serializable
{

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cust_id")
    private Integer custId;
    @Column(name = "cust_fname")
    private String custFname;
    @Column(name = "cust_lname")
    private String custLname;
    @Column(name = "cust_email")
    private String custEmail;
    @Column(name = "cust_phone")
    private String custPhone;
    @Column(name = "cust_address1")
    private String custAddress1;
    @Column(name = "cust_address2")
    private String custAddress2;
    @JoinTable(name = "customer_order", joinColumns =
    {
        @JoinColumn(name = "cust_id", referencedColumnName = "cust_id")
    }, inverseJoinColumns =
    {
        @JoinColumn(name = "order_num", referencedColumnName = "order_num")
    })
    @ManyToMany
    private Collection<OrderObj> orderObjCollection;
    @JoinColumn(name = "zip", referencedColumnName = "zip")
    @ManyToOne
    private ZipCode zip;

    public Customer()
    {
    }

    public Customer(Integer custId)
    {
        this.custId = custId;
    }

    public Integer getCustId()
    {
        return custId;
    }

    public void setCustId(Integer custId)
    {
        this.custId = custId;
    }

    public String getCustFname()
    {
        return custFname;
    }

    public void setCustFname(String custFname)
    {
        this.custFname = custFname;
    }

    public String getCustLname()
    {
        return custLname;
    }

    public void setCustLname(String custLname)
    {
        this.custLname = custLname;
    }

    public String getCustEmail()
    {
        return custEmail;
    }

    public void setCustEmail(String custEmail)
    {
        this.custEmail = custEmail;
    }

    public String getCustPhone()
    {
        return custPhone;
    }

    public void setCustPhone(String custPhone)
    {
        this.custPhone = custPhone;
    }

    public String getCustAddress1()
    {
        return custAddress1;
    }

    public void setCustAddress1(String custAddress1)
    {
        this.custAddress1 = custAddress1;
    }

    public String getCustAddress2()
    {
        return custAddress2;
    }

    public void setCustAddress2(String custAddress2)
    {
        this.custAddress2 = custAddress2;
    }

    @XmlTransient
    public Collection<OrderObj> getOrderObjCollection()
    {
        return orderObjCollection;
    }

    public void setOrderObjCollection(Collection<OrderObj> orderObjCollection)
    {
        this.orderObjCollection = orderObjCollection;
    }

    public ZipCode getZip()
    {
        return zip;
    }

    public void setZip(ZipCode zip)
    {
        this.zip = zip;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (custId != null ? custId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer))
        {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "entities.Customer[ custId=" + custId + " ]";
    }
    
}
