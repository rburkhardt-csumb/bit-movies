<%-- 
    Document   : zipcodeTest
    Created on : Jun 27, 2017, 2:33:51 PM
    Author     : Huy
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
        <span>Search Zipcode</span>
        <input type="text" id="zip"/>
        <input type="submit" value="Submit" id="submit" />
    </body>
    
    <script>
        
     $("#submit").click(function() {
     	var zip = document.getElementById("zip").value;
     	searchZip(zip);
     });
     
     var searchZip = function(zip) {
     	$.ajax({
     		type: "post",
     		url: "jsonTable.jsp",
     		data: {
     			"data": zip
     		}, // Insert zipcode to search here
     		success: function(data) {
     			alert(data.city + ", " + data.state + ", " + data.county + ", " + data.zip);
     		}
     	});
     }
     
    </script>
        
</html>
