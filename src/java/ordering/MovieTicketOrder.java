/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordering;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Roderick Burkhardt
 */
public class MovieTicketOrder
{

    private Integer movieId;
    private Date movieDate;
    private Integer numOfAdult;
    private Integer numOfChild;

    public SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd");

    public MovieTicketOrder()
    {
        this.movieId = 0;
        this.movieDate = new Date();
        this.numOfAdult = 0;
        this.numOfChild = 0;
    }

    public MovieTicketOrder(Integer movieId, Date movieDate, Integer numOfAdult, Integer numOfChild)
    {
        this.movieId = movieId;
        this.movieDate = movieDate;
        this.numOfAdult = numOfAdult;
        this.numOfChild = numOfChild;
    }

    public void setMovieId(Integer movieId)
    {
        this.movieId = movieId;
    }

    public Integer getMovieId()
    {
        return movieId;
    }

    public void setMovieDate(Date movieDate)
    {
        this.movieDate = movieDate;
    }

    public Date getMovieDate()
    {
        return movieDate;
    }

    public void setNumOfAdult(Integer numOfAdult)
    {
        this.numOfAdult = numOfAdult;
    }

    public Integer getNumOfAdult()
    {
        return numOfAdult;
    }

    public void setNumOfChild(Integer numOfChild)
    {
        this.numOfChild = numOfChild;
    }

    public Integer getNumOfChild()
    {
        return numOfChild;
    }

    @Override
    public String toString()
    {
        String rtrnString;

        if (movieId == null || movieDate == null || numOfAdult < 0 || numOfChild < 0)
        {
            rtrnString = "MovieTicketOrder Error, Object exists but has errors!";
        }

        else if (numOfAdult > 20 || numOfChild > 20)
        {
            rtrnString = "Number of Addult or Children tickets is over the 20 ticket maximum!";
        }

        else
        {
            rtrnString = "Movie ID: " + movieId.toString()
                    + "  Movie Date: " + movieDate.toString()
                    + "  # of Adults: " + numOfAdult.toString()
                    + "  # of Children: " + numOfChild.toString();
        }

        return rtrnString;
    }

}
