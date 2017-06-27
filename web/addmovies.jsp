<%-- 
    Document   : addmovies
    Created on : Jun 24, 2017, 12:12:49 PM
    Author     : Wis
--%>

<jsp:include page="/includes/header.jsp" />



<!-- begin middle column -->

<section>

<h1>Add Movie</h1>
<p>To add the movie to the database, enter information of the movie below.</p>
        
        <form action="addMovie" method="post">
        <input type="hidden" name="action" value="add"> 
        <label class="">Movie Title:</label>
        <input type="text" name="movie_title" ><br>
        <label class="">Movie Description:</label>
        <input type="textarea" name="movie_descr" ><br>
        <label class="">Movie Rating:</label>
        <select name="movie_rating">
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
        </select><br>
        <label class="">Movie Genre:</label>
        <input type="text" name="movie_genre" ><br>
        <label class="">Movie Length:</label>
        <input type="text" name="Movie_length" ><br>
        <label class="">Movie Start Date:</label>
        <input type="text" name="Movie_start_date" ><br>
        <label class="">Movie End Date:</label>
        <input type="text" name="Movie_end_date" ><br> 
        <label>&nbsp;</label>
        <input type="submit" value="Add Movie" class="margin_left">
    </form>   


</section>

<!-- end middle column -->

<jsp:include page="/includes/footer.jsp" />