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
import java.text.SimpleDateFormat;
import java.util.Date;

public class AddMovie extends HttpServlet
{
        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        MovieDB mdb = new MovieDB();
        SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = new Date();
        Date endDate = new Date();
        
        String title = request.getParameter("movie_title");
        String descr = request.getParameter("movie_descr");
        String rating = request.getParameter("movie_rating");
        String genre = request.getParameter("movie_genr");
        int length = Integer.parseInt(request.getParameter("movie_length"));
        
        try {
            startDate = parser.parse(request.getParameter("movie_start_date"));
            endDate = parser.parse(request.getParameter("movie_end_date"));
        } catch (Exception e)
        {
            System.err.println(e);
        }
        String trailer = request.getParameter("movie_trailer");
        String image = request.getParameter("movie_image");

        Movie movie = new Movie(20);
        
        movie.setMovieTitle(title);
        movie.setMovieDescr(descr);
        movie.setMovieRating(rating);
        movie.setMovieGenre(genre);
        movie.setMovieLength(length);
        movie.setMovieStartDate(startDate);
        movie.setMovieEndDate(endDate);
        movie.setMovieTrailer(trailer);
        movie.setMovieImage(image);
        
        mdb.insertMovie(movie);
        
    }
}
