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

        String title = movie.getMovieTitle();
        String desc = movie.getMovieDescr();
        String rating = movie.getMovieRating();
        String genre = movie.getMovieGenre();
        int length = movie.getMovieLength();

        

        request.setAttribute("title", title);
        request.setAttribute("desc", desc);
        request.setAttribute("genre", genre);
        request.setAttribute("rating", rating);
        request.setAttribute("length", length);


        
        request.getRequestDispatcher("/displayMovie.jsp").forward(request, response);
    }

}
