<%-- 
    Document   : cart
    Created on : Jul 11, 2017, 7:54:19 PM
    Author     : Roderick Burkhardt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- Header file include --%>
<%@include file="includes/header.jsp" %>

<div class="container">

    <h2 class="text-center">Movie Cart</h2>

    <div class="row cart-head">
        <div class="col-md-5 col-sm-5 col-sx-5">Movie</div>
        <div class="col-md-2 col-sm-2 col-sx-2">Quantity</div>
        <div class="col-md-3 col-sm-3 col-sx-3">Quantity</div>
        <div class="col-md-2 col-sm-2 col-sx-2">Price</div>
    </div>

    <c:choose>
        <c:when test="${emptyCart}">
            <div class="row cart-row">
                <div class="col-md-12 col-sm-12 col-sx-12 text-center">Your Cart is Empty.</div>
            </div>
        </c:when>
        <c:otherwise>
            <c:forEach items="${cart}" var="movie">
                <div class="row cart-row">
                    <div class="col-md-5 col-sm-5 col-sx-5">${movie.title}</div>
                    <div class="col-md-2 col-sm-2 col-sx-2">${movie.date}</div>
                    <div class="col-md-3 col-sm-3 col-sx-3">
                        <span class="ticket-count">Adult</span> <span class="">${movie.numOfAdult}</span><br />
                        <span class="ticket-count">Children</span> <span class="">${movie.numOfChildren}</span>
                    </div>
                    <div class="col-md-2 col-sm-2 col-sx-2">CALCULATE</div>
                </div>
            </c:forEach>

            <div class="row cart-summary">
                <div class="col-md-10 col-sm-10 col-sx-10 text-right">Sub-Total</div>
                <div class="col-md-2 col-sm-2 col-sx-2">${cart.cartSubtotal}</div>
            </div>
            <div class="row cart-summary">
                <div class="col-md-10 col-sm-10 col-sx-10 text-right">Tax</div>
                <div class="col-md-2 col-sm-2 col-sx-2">${cart.cartTax}</div>
            </div>
            <div class="row cart-summary">
                <div class="col-md-10 col-sm-10 col-sx-10 text-right">Total</div>
                <div class="col-md-2 col-sm-2 col-sx-2">${cart.cartTotal}</div>
            </div>
        </c:otherwise>
    </c:choose>

</div>

<%-- Footer file include --%>
<%@include file="includes/footer.jsp" %>
