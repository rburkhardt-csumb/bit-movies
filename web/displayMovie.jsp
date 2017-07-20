<%-- 
    Document   : displayMovie
    Created on : Jul 12, 2017, 3:32:30 PM
    Author     : BigMac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="data.MovieDB"%>
<%@page import="entities.Movie"%>
<% String title = (String) request.getAttribute("title"); %>
<% String desc = (String) request.getAttribute("desc"); %>
<% String genre = (String) request.getAttribute("genre"); %>
<% String rating = (String) request.getAttribute("rating"); %>
<% String length = (String) request.getAttribute("length"); %>
<% String startDate = (String) request.getAttribute("startDate"); %>
<% String endDate = (String) request.getAttribute("endDate"); %>
<% String image = (String) request.getAttribute("image"); %>
<% String trailer = (String) request.getAttribute("trailer");%>

<%@include file="includes/header.jsp" %>


<!--                        <html>
                        <header>
                          <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                          <meta name="viewport" content="width=device-width; initial-scale=.4">
                          <title>JSP Page</title>
                           Bootstrap 
                          <link href="styles/bootstrap-3-3-7/css/bootstrap.min.css" rel="stylesheet">

                           HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries 
                           WARNING: Respond.js doesn't work if you view the page via file:// 
                          [if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        
        <![endif]

                          <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
                          <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

                          <link href="styles/display-movie.css" rel="stylesheet">
                          <style>
                            .shadow {
                              -webkit-box-shadow: 0px 0px 10px dimgrey;
                              box-shadow: 0px 0px 10px dimgrey;
                              text-align: center;
                              color: black;
                              font-family: Verdana;
                              padding: 2%;
                              margin: 1% 10%;
                              overflow: auto;
                            }
                            
                            img {
                              width: 50%;
                              height: auto;
                              border: 1px grey solid;
                            }
                            
                            .box {
                              border: 1px grey solid;
                            }
                            
                            body{
                              background-color:lightgray;
                            }

                          </style>

                        </header>

                        <body>
                          <nav class="navbar navbar-default">
                            <div class="container-fluid">
                               Brand and toggle get grouped for better mobile display 
                              <div class="navbar-header">
                                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                                  <span class="sr-only">Toggle navigation</span>
                                  <span class="icon-bar"></span>
                                  <span class="icon-bar"></span>
                                  <span class="icon-bar"></span>
                                </button>
                                <a class="navbar-brand" href="#">Brand</a>
                              </div>

                               Collect the nav links, forms, and other content for toggling 
                              <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                                <ul class="nav navbar-nav">
                                  <li class="active"><a href="#">Link <span class="sr-only">(current)</span></a></li>
                                  <li><a href="#">Link</a></li>
                                  <li class="dropdown">
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
                                    <ul class="dropdown-menu">
                                      <li><a href="#">Action</a></li>
                                      <li><a href="#">Another action</a></li>
                                      <li><a href="#">Something else here</a></li>
                                      <li role="separator" class="divider"></li>
                                      <li><a href="#">Separated link</a></li>
                                      <li role="separator" class="divider"></li>
                                      <li><a href="#">One more separated link</a></li>
                                    </ul>
                                  </li>
                                </ul>
                                      <form class="navbar-form navbar-left">
                            <div class="form-group">
                              <input type="text" class="form-control" placeholder="Search">
                            </div>
                            <button type="submit" class="btn btn-default">Submit</button>
                          </form>
                                <ul class="nav navbar-nav navbar-right">
                                  <li><a href="#">Link</a></li>
                                  <li class="dropdown">
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
                                    <ul class="dropdown-menu">
                                      <li><a href="#">Action</a></li>
                                      <li><a href="#">Another action</a></li>
                                      <li><a href="#">Something else here</a></li>
                                      <li role="separator" class="divider"></li>
                                      <li><a href="#">Separated link</a></li>
                                    </ul>
                                  </li>
                                </ul>
                              </div>
                               /.navbar-collapse 
                            </div>
                             /.container-fluid 
                          </nav>-->

<link href="styles/display-movie.css" rel="stylesheet">
<div class="shadow" style="background:snow;">


    <div class="image col-xs-6 entry">
        <img src="<%=image%>">

    </div>


    <div class="row">
        <div class="col-xs-5" style="text-align:left;">
            <h3><%=title%></h3>
            <h5>Rated <%=rating%></h5>
            <h5>Genre: <%=genre%></h5>
            <h5>Length: <%=length%> minutes</h5>
            <h5>Premiered: <%=startDate%></h5>
            <h5>Ending: <%=endDate%></h5>
            <p><i><%=desc%></i></p>
        </div>
    </div>

</div>

<div class="shadow" style="background:snow;">

    <iframe width="854" height="480" src="<%=trailer%>" style="border: 1px solid black;">

    </iframe>

</div>

<%@include file="includes/footer.jsp" %>
