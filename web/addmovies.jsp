<%-- 
    Document   : addmovies
    Created on : Jun 24, 2017, 12:12:49 PM
    Author     : Wis
--%>


<!-- begin middle column -->

<section>

<h1>Add Movie</h1>
<p>To add the movie to the database, enter information of the movie below.</p>
        
        <form action="addMovie" method="post">
        <input type="hidden" name="action" value="add"> 
        <label class="">Movie Title:</label>
        <input type="text" maxlength="35" name="movie_title"><br>
        <label class="">Movie Description:</label>
        <textarea rows="4" maxlength="60" width="50" name="movie_descr"></textarea><br>
        <label class="">Movie Rating:</label>
        <select name="movie_rating">
            <option value="G">General Audiences</option>
            <option value="PG">Parental Guidance Suggested</option>
            <option value="PG-13,">Parents Strongly Cautioned</option>
            <option value="R">Restricted</option>
            <option value="NC-17">Adults Only</option>
        </select><br>
        <label class="">Movie Genre:</label>
        <select name="movie_genr">
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
        </select><br>
        <label class="">Movie Length:</label>
        <input type="number" min="60" max="240" name="movie_length" ><br>
        <label class="">Movie Start Date:</label>
        <input type="date" name="movie_start_date"><br>
        <label class="">Movie End Date:</label>
        <input type="date" name="movie_end_date"><br> 
        <label>&nbsp;</label>
        <input type="submit" value="Add Movie" class="margin_left">
    </form>   


</section>

<!-- end middle column -->
