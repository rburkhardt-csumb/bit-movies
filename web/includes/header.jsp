<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <header>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>San Dunes Cinema</title>
        <!-- Bootstrap -->
        <link href="styles/bootstrap-3-3-7/css/bootstrap.min.css" rel="stylesheet">

        <link href="styles/customstyles.css" rel="stylesheet">

        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!-- Font Awesome -->
        <link href="styles/font-awesome/css/font-awesome.min.css" rel="stylesheet">

    </header>
    <body>					
        <nav class="navbar navbar-default navbar-fixed-top">
            <div class="container">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="./">SDC</a>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li><!-- class="active">-->
                            <a href="displayMovieTest.jsp">
                                Display Movie
                                <!--<span class="sr-only">(current)</span>-->
                            </a>
                        </li>
                        <li><a href="#">Link</a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle"
                               data-toggle="dropdown"
                               role="button"
                               aria-haspopup="true"
                               aria-expanded="false">
                                Dropdown<span class="caret"></span>
                            </a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Action</a></li>
                                <li><a href="#">Another action</a></li>
                                <li><a href="#">Something else here</a></li>
                                <!--<li role="separator" class="divider"></li>-->
                                <!--<li><a href="#">Separated link</a></li>-->
                                <!--<li role="separator" class="divider"></li>-->
                                <!--<li><a href="#">One more separated link</a></li>-->
                            </ul>
                        </li>
                    </ul>
                    <!-- <form class="navbar-form navbar-left">
                      <div class="form-group">
                        <input type="text" class="form-control" placeholder="Search">
                      </div>
                      <button type="submit" class="btn btn-default">Submit</button>
                    </form> -->
                    <ul class="nav navbar-nav navbar-right">
                        <!--<li><a>Login</a></li>-->
                        <li>
                            <a href="cart">
                                <i class="fa fa-shopping-cart" aria-hidden="true"></i>
                                <c:choose>
                                    <c:when test="${cart.cartTotal == null}"> (&#36;0.00)</c:when>
                                    <c:otherwise> (&#36;${cart.cartTotal})</c:otherwise>
                                </c:choose>
                            </a>
                        </li>
                        <c:choose>
                            <c:when test="customer != null">
                                <li class="dropdown">
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Login<span class="caret"></span></a>
                                    <ul class="dropdown-menu">
                                        <li><a href="#">My Account</a></li>
                                        <li><a href="#">Account History</a></li>
                                        <!--<li><a href="#">Something else here</a></li>-->
                                        <!--<li role="separator" class="divider"></li>-->
                                        <li><a href="#">Logout</a></li>
                                    </ul>
                                </li> 
                            </c:when>
                            <c:otherwise>
                                <!--<li><a href="#">Login</a></li>-->
                                <li class="dropdown">
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Login<span class="caret"></span></a>
                                    <ul class="dropdown-menu">
                                        <li>
                                            <form class="form-group-sm" style="padding: 3px;">
                                                    <input type="text" class="input-sm" placeholder="Email"><br />
                                                    <input type="password" class="input-sm" placeholder="Password"><br />
                                                    <input type="submit" class="btn btn-sm btn-primary" value="Login">
                                                    <a class="btn btn-sm btn-info" href="registration.jsp">Register</a>
                                                </form>                                            
                                        </li>
                                        <!--<li></li>-->
                                    </ul>
                                </li> 
                                </c:otherwise>
                            </c:choose>

                    </ul>
                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>
        <div class="jumbotron page-header page-header-image">
            <div class="container">
                <h1 style="color: rgba(255,255,255,1.0);">Sand Dunes Cinema</h1>
            </div>
        </div>