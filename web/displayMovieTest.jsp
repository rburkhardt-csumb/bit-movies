<%-- 
    Document   : displayMovieTest
    Created on : Jul 12, 2017, 3:40:27 PM
    Author     : BigMac
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <span>Search Movie ID</span>
        <form action="movie" method="post"> 
        <input type="number" name="movieID"/>
        <input type="submit" value="Submit" id="submit" />
        </form>

    </body>
</html>
