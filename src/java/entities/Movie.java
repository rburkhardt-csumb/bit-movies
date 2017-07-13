/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Roderick Burkhardt
 */
@Entity
@Table(name = "movie")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Movie.findAll", query = "SELECT m FROM Movie m"),
    @NamedQuery(name = "Movie.findByMovieId", query = "SELECT m FROM Movie m WHERE m.movieId = :movieId"),
    @NamedQuery(name = "Movie.findByMovieTitle", query = "SELECT m FROM Movie m WHERE m.movieTitle = :movieTitle"),
    @NamedQuery(name = "Movie.findByMovieRating", query = "SELECT m FROM Movie m WHERE m.movieRating = :movieRating"),
    @NamedQuery(name = "Movie.findByMovieGenre", query = "SELECT m FROM Movie m WHERE m.movieGenre = :movieGenre"),
    @NamedQuery(name = "Movie.findByMovieLength", query = "SELECT m FROM Movie m WHERE m.movieLength = :movieLength"),
    @NamedQuery(name = "Movie.findByMovieStartDate", query = "SELECT m FROM Movie m WHERE m.movieStartDate = :movieStartDate"),
    @NamedQuery(name = "Movie.findByMovieEndDate", query = "SELECT m FROM Movie m WHERE m.movieEndDate = :movieEndDate"),
    @NamedQuery(name = "Movie.findMoviesByDate", query = "SELECT m FROM Movie m WHERE m.movieStartDate < :date AND m.movieEndDate > :date")
})
public class Movie implements Serializable
{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "movie_id")
    private Integer movieId;
    @Column(name = "movie_title")
    private String movieTitle;
    @Lob
    @Column(name = "movie_descr")
    private String movieDescr;
    @Column(name = "movie_rating")
    private String movieRating;
    @Column(name = "movie_genre")
    private String movieGenre;
    @Column(name = "movie_length")
    private Integer movieLength;
    @Column(name = "movie_start_date")
    @Temporal(TemporalType.DATE)
    private Date movieStartDate;
    @Column(name = "movie_end_date")
    @Temporal(TemporalType.DATE)
    private Date movieEndDate;
    @Column(name = "movie_trailer")
    private String movieTrailer;
    @Column(name = "movie_image")
    private String movieImage;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "movieId")
    private Collection<OrderMovie> orderMovieCollection;

    public Movie()
    {
    }

    public Movie(Integer movieId)
    {
        this.movieId = movieId;
    }

    public Integer getMovieId()
    {
        return movieId;
    }

    public void setMovieId(Integer movieId)
    {
        this.movieId = movieId;
    }

    public String getMovieTitle()
    {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle)
    {
        this.movieTitle = movieTitle;
    }

    public String getMovieDescr()
    {
        return movieDescr;
    }

    public void setMovieDescr(String movieDescr)
    {
        this.movieDescr = movieDescr;
    }

    public String getMovieRating()
    {
        return movieRating;
    }

    public void setMovieRating(String movieRating)
    {
        this.movieRating = movieRating;
    }

    public String getMovieGenre()
    {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre)
    {
        this.movieGenre = movieGenre;
    }

    public Integer getMovieLength()
    {
        return movieLength;
    }

    public void setMovieLength(Integer movieLength)
    {
        this.movieLength = movieLength;
    }

    public Date getMovieStartDate()
    {
        return movieStartDate;
    }

    public void setMovieStartDate(Date movieStartDate)
    {
        this.movieStartDate = movieStartDate;
    }

    public Date getMovieEndDate()
    {
        return movieEndDate;
    }

    public void setMovieEndDate(Date movieEndDate)
    {
        this.movieEndDate = movieEndDate;
    }

    public String getMovieTrailer()
    {
        return movieTrailer;
    }

    public void setMovieTrailer(String movieTrailer)
    {
        this.movieTrailer = movieTrailer;
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
        hash += (movieId != null ? movieId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movie))
        {
            return false;
        }
        Movie other = (Movie) object;
        if ((this.movieId == null && other.movieId != null) || (this.movieId != null && !this.movieId.equals(other.movieId)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "entities.Movie[ movieId=" + movieId + " ]";
    }

    public String getMovieImage()
    {
        return movieImage;
    }

    public void setMovieImage(String movieImage)
    {
        this.movieImage = movieImage;
    }
    
}
