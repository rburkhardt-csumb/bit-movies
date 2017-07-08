/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.io.IOException;
import java.io.PrintWriter;
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
            // store data in movie object
            Movie movie = new Movie();
            movie.setMovieTitle(movie_title);
            movie.setMovieDescr(movie_descr);
            movie.setMovieRating(movie_rating);
            movie.setMovieGenre(movie_genre);
            movie.setMovieLength(movie_length);
            movie.setMovieStartDate(movieStartDate);
            movie.setMovieEndDate(movieEndDate);
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
}