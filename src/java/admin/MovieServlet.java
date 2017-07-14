/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.util.*;
import java.text.SimpleDateFormat;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import data.MovieDB;
import entities.Movie;

/**
 *
 * @author BigMac
 */

public class MovieServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        Long movieID = Long.parseLong(request.getParameter("movieID"));

        MovieDB mdb = new MovieDB();

        Movie movie = mdb.SelectMovieById(movieID);

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

        String title = movie.getMovieTitle();
        String desc = movie.getMovieDescr();
        String rating = movie.getMovieRating();
        String genre = movie.getMovieGenre();
        String length = Integer.toString(movie.getMovieLength());
        String startDate = sdf.format(movie.getMovieStartDate());
        String endDate = sdf.format(movie.getMovieEndDate());
        String image = movie.getMovieImage();
        String trailer = movie.getMovieTrailer();

        request.setAttribute("title", title);
        request.setAttribute("desc", desc);
        request.setAttribute("genre", genre);
        request.setAttribute("rating", rating);
        request.setAttribute("length", length);
        request.setAttribute("startDate", startDate);
        request.setAttribute("endDate", endDate);
        request.setAttribute("image", image);
        request.setAttribute("trailer", trailer);
       
        request.getRequestDispatcher("/displayMovie.jsp").forward(request, response);
    }

}
