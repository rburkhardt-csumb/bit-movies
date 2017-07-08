<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>

<html>
<head>
    <meta charset="utf-8">
    <title>Otter Theater</title>
    <link rel="shortcut icon" href="<c:url value='/images/favicon.ico'/>">
    <link rel="stylesheet" href="<c:url value='/styles/main.css'/> ">
    <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
</head>

<body>

    <header>
        <img src="<c:url value='/images/logo.jpeg'/>" 
             alt="Bit - Movie" width="125">
        <h1>Bit - Movie</h1>
        <h2>The number one cinema in town!</h2>
    </header>
    <nav id="nav_bar">
        <ul>
            <li><a href="<c:url value='#'/>">
                    Log In</a></li>
            <li><a href="<c:url value='/order/showCart'/>">
                    Ticketing</a></li>
        </ul>
    </nav>