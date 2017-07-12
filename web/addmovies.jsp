<%-- 
    Document   : addmovies
    Created on : Jun 24, 2017, 12:12:49 PM
    Author     : Wis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html >
    <head>
        <title>add movie</title>
        <link href=" styles/bootstrap-3-3-7/css/bootstrap.min.css" rel="stylesheet" type="text/css" />

        <!--style>
            div.form-group {
                margin: .5em;
                vertical-align: top;
            }
            
            div.form-group label {
                display: block;
                width: 15em;
            }
        </style-->

    </head>
</html>

<!-- begin middle column -->

<div class="container-fluid">
    <div class="row">

        <h1>Add Movie</h1>
        <p>To add the movie to the database, enter information of the movie below.</p>



        <form action="addMovie" method="post">
            <input type="hidden" name="action" value="add">
            <div class="form-group row">
                <label for="movie_title">Movie Title:</label>
                <input class="form-control" type="text" maxlength="35" name="movie_title">
            </div>

            <div class="form-group row">
                <label for="movie_descr">Movie Description:</label>
                <textarea class="form-control" name="movie_descr" rows="6" cols="60"></textarea>
            </div>

            <div class="form-group row">
                <label class="form-control" for="movie_rating">Movie Rating:</label>
                <select name="movie_rating">
                    <option value="G">General Audiences</option>
                    <option value="PG">Parental Guidance Suggested</option>
                    <option value="PG-13,">Parents Strongly Cautioned</option>
                    <option value="R">Restricted</option>
                    <option value="NC-17">Adults Only</option>
                    <option value="UR">Unrated</option>
                </select>
            </div>

            <div class="form-group row">
                <label for="movie_genr">Movie Genre:</label>
                <select class="form-control" name="movie_genr">
                    <option value="Absurdist/surreal/whimsical">Absurdist/surreal/whimsical</option>
                    <option value="Action">Action</option>
                    <option value="Adventure">Adventure</option>
                    <option value="Animation">Animation</option>
                    <option value="Biography">Biography</option>
                    <option value="Comedy">Comedy</option>
                    <option value="Crime">Crime</option>
                    <option value="Documentary">Documentary</option>
                    <option value="Drama">Drama</option>
                    <option value="Family">Family</option>
                    <option value="Fantasy">Fantasy</option>
                    <option value="Game-Show">Game-Show</option>
                    <option value="Historical">Historical</option>
                    <option value="Historical fiction">Historical fiction</option>
                    <option value="Horror">Horror</option>
                    <option value="Magical realism">Magical realism</option>
                    <option value="Music">Music</option>
                    <option value="Musical">Musical</option>
                    <option value="Mystery">Mystery</option>
                    <option value="News">News</option>
                    <option value="Paranoid">Paranoid</option>
                    <option value="Philosophical">Philosophical</option>
                    <option value="Political">Political</option>
                    <option value="Reality-TV">Reality-TV</option>
                    <option value="Romance">Romance</option>
                    <option value="Saga">Saga</option>
                    <option value="Satire">Satire</option>
                    <option value="Science fiction">Science fiction</option>
                    <option value="Sitcom">Sitcom</option>
                    <option value="Slice of Life">Slice of Life</option>
                    <option value="Speculative">Speculative</option>
                    <option value="Sport">Sport</option>
                    <option value="Talk-Show">Talk-Show</option>
                    <option value="Thriller">Thriller</option>
                    <option value="Urban">Urban</option>
                    <option value="War">War</option>
                    <option value="Western">Western/option>
                </select>
            </div>

            <div class="form-group row">
                <label for="movie_length">Movie Length:</label>
                <input class="form-control" type="number" min="60" max="240" name="movie_length" >
            </div>

            <div class="form-group row">
                <label for="movie_start_date">Movie Start Date:</label>
                <input class="form-control" type="date" name="movie_start_date">
            </div>

            <div class="form-group row">
                <label for="movie_end_date">Movie End Date:</label>
                <input class="form-control" type="date" name="movie_end_date">
            </div>

            <div class="form-group row">
                <label for="movie_trailer">Link to trailer</label>
                <input class="form-control" type="text" name="movie_trailer">
            </div>

            <div class="form-group row">
                <label for="movie_image">Link to image</label>
                <input class="form-control" type="text" name="movie_image">
            </div>
            <p>&nbsp;</p>
            <button class="btn btn-primary" type="submit">Add Movie</button>
        </form>   

    </div>
</div>

<!-- end middle column -->
