<%-- 
    Document   : displayMovie
    Created on : Jul 12, 2017, 3:32:30 PM
    Author     : BigMac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="data.MovieDB"%>
<%@page import="entities.Movie"%>
<% String title=(String)request.getAttribute("title"); %>
<% String desc=(String)request.getAttribute("desc"); %>
<% String genre=(String)request.getAttribute("genre"); %>
<% String rating=(String)request.getAttribute("rating"); %>
<% String length=(String)request.getAttribute("length"); %>
<% String startDate=(String)request.getAttribute("startDate"); %>
<% String endDate=(String)request.getAttribute("endDate"); %>


<%=title%>
<%=desc%>
<%=genre%>
<%=rating%>
<%=length%>
<%=startDate%>
<%=endDate%>



