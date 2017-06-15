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
@Table(name = "zip_code")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "ZipCode.findAll", query = "SELECT z FROM ZipCode z")
    , @NamedQuery(name = "ZipCode.findByZip", query = "SELECT z FROM ZipCode z WHERE z.zip = :zip")
    , @NamedQuery(name = "ZipCode.findByCity", query = "SELECT z FROM ZipCode z WHERE z.city = :city")
    , @NamedQuery(name = "ZipCode.findByState", query = "SELECT z FROM ZipCode z WHERE z.state = :state")
    , @NamedQuery(name = "ZipCode.findByCounty", query = "SELECT z FROM ZipCode z WHERE z.county = :county")
})
public class ZipCode implements Serializable
{

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "zip")
    private Integer zip;
    @Basic(optional = false)
    @Column(name = "city")
    private String city;
    @Basic(optional = false)
    @Column(name = "state")
    private String state;
    @Basic(optional = false)
    @Column(name = "county")
    private String county;
    @OneToMany(mappedBy = "zip")
    private Collection<Customer> customerCollection;

    public ZipCode()
    {
    }

    public ZipCode(Integer zip)
    {
        this.zip = zip;
    }

    public ZipCode(Integer zip, String city, String state, String county)
    {
        this.zip = zip;
        this.city = city;
        this.state = state;
        this.county = county;
    }

    public Integer getZip()
    {
        return zip;
    }

    public void setZip(Integer zip)
    {
        this.zip = zip;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public String getCounty()
    {
        return county;
    }

    public void setCounty(String county)
    {
        this.county = county;
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

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (zip != null ? zip.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ZipCode))
        {
            return false;
        }
        ZipCode other = (ZipCode) object;
        if ((this.zip == null && other.zip != null) || (this.zip != null && !this.zip.equals(other.zip)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "entities.ZipCode[ zip=" + zip + " ]";
    }
    
}
