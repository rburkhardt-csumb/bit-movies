<%-- 
    Document   : zipcodeTest
    Created on : Jun 27, 2017, 2:33:51 PM
    Author     : BigMac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js" ></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Zipcode Search</title>
    </head>
    <body>
        <form action="jsonTable.jsp" method="POST">
        <input type="text" id="zip" name="zip" />
        <input type="submit" value="Submit" />
        </form>
    </body>
</html>
