/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import data.MovieDB;
import entities.Movie;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Wissawakon Sriwarom
 */

public class AddMovie extends HttpServlet
{
    private Date movieStartDate;
    private Date movieEndDate;
    private static SimpleDateFormat sqlDateFormater = new SimpleDateFormat("yyyy-MM-dd");
    
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/addmovies.jsp";
        
        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "add";  // default action
        }

        // perform action and set URL to appropriate page
        if (action.equals("add")) {
            url = "/addmovies.jsp";    // the "join" page
        } 
        else if (action.equals("add")) {
            // get parameters from the request
            String movie_title = request.getParameter("movie_title");
            String movie_descr = request.getParameter("movie_descr");
            String movie_rating = request.getParameter(request.getParameter("movie_rating"));
            String movie_genre = request.getParameter("movie_genre");
            Integer movie_length = Integer.parseInt(request.getParameter("movie_length"));
            Date movieStartDate = new Date();
            try {
                String startDate = request.getParameter("movie_start_date");
                movieStartDate = sqlDateFormater.parse(startDate);
            } catch (ParseException ex) {
                Logger.getLogger(AddMovie.class.getName()).log(Level.SEVERE, null, ex);
            }
            Date movieEndDate = new Date();
            try {
                movieEndDate = sqlDateFormater.parse(request.getParameter("movie_end_date"));
            } catch (ParseException ex) {
                Logger.getLogger(AddMovie.class.getName()).log(Level.SEVERE, null, ex);
            }
            String movie_trailer = request.getParameter("movie_trailer");
            String movie_image = request.getParameter("movie_image");
            // store data in movie object
            Movie movie = new Movie();
            movie.setMovieTitle(movie_title);
            movie.setMovieDescr(movie_descr);
            movie.setMovieRating(movie_rating);
            movie.setMovieGenre(movie_genre);
            movie.setMovieLength(movie_length);
            movie.setMovieStartDate(movieStartDate);
            movie.setMovieEndDate(movieEndDate);
            movie.setMovieTrailer(movie_trailer);
            movie.setMovieImage(movie_image);
            //movie_title,movie_descr,movie_rating,movie_genre,movie_length,movie_start_date,movie_end_date);

            // validate the parameters
            String message;
            if (movie_title == null || movie_descr == null || 
            movieStartDate == null || movieEndDate == null ||
                movie_title.isEmpty() || movie_descr.isEmpty() || movieStartDate == null || movieEndDate == null){
                message = "Please fill all the movie information.";
                url = "/addmovies.jsp";
            } 
            else
                
            MovieDB.insertMovie(movie);
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
    
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
    
    private boolean validateDate(String date)
    {
        String year, month, day;
        year = date.substring(0, 3);
        month = date.substring(5, 6);
        day = date.substring(8, 9);
        
        for ( int i = 0; i < date.length(); i++ )
        {
            if ( i != 4 && i != 7 )
            {
                if ( !Character.isDigit(date.charAt(i)) )
                    return false;
            }
            else
            {
                if ( date.charAt(i) != '-' )
                    return false;
            }    
        }
        
        if ( Integer.getInteger( year ) < 2017 || Integer.getInteger( year ) > 2018 )
            return false;
        
        if ( Integer.getInteger( month ) < 1 || Integer.getInteger( month ) > 12 )
            return false;
        
        if ( Integer.getInteger( day ) < 1 || Integer.getInteger( day ) > 31 )
            return false;
        
        return true;
    }
}
