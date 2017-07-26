<%-- 
    Document   : registration
    Created on : Jul 25, 2017, 7:54:43 PM
    Author     : Ali Asrani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="includes/header.jsp" %>

<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>

<div class="container">
    <div class="row">
        <form class="col-md-6" action="customer" method="POST">
            <legend class="col-form-legend">Registration</legend>

            <div class="form-group">

                <div class="col-sm-12">
                    <label class="col-6 col-form-label">First name:</label>
                    <input class="form-control" type="text" name="firstname" placeholder="First Name" value="" required>
                </div>

                <div class="col-sm-12">
                    <label class="col-6 col-form-label">Last name:</label>
                    <input class="form-control" type="text" name="lastname" placeholder="Last Name" required>
                </div>

                <div class="col-sm-12">
                    <label class="col-6 col-form-label">Address:</label>
                    <input class="form-control" type="text" name="address1" placeholder="Address 1">
                </div>

                <div class="col-sm-12">
                    <label class="col-6 col-form-label">Address:</label>
                    <input class="form-control" type="text" name="address2" placeholder="Address 2">
                </div>

                <div class="col-sm-12">
                    <label class="col-6 col-form-label">Zip:</label>
                    <input class="form-control" type="text" name="zip" placeholder="Zip Code">
                </div>            

                <div class="col-sm-12">
                    <label class="col-6 col-form-label">E-mail:</label>
                    <input class="form-control" type="email" name="email" placeholder="Email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" required>
                </div>

                <div class="col-sm-12">
                    <label class="col-6 col-form-label">Telephone:</label>
                    <input class="form-control" type="tel" name="usrtel" placeholder="Phone#">
                </div>

                <div class="col-sm-12">
                    <label class="col-6 col-form-label">Password:</label>
                    <input class="form-control" type="password" name="pw" placeholder="Password" pattern=".{6,}" title="Six or more characters" required>
                </div>

                <div class="col-sm-12">
                    <label class="col-6 col-form-label">Confirm Password:</label>
                    <input class="form-control" type="password" placeholder="Confirm Password" id="confirm_password" required>
                </div>

                <div class="col-12">
                    <p>&nbsp;</p>
                    <input class="btn btn-primary" type="submit" value="Submit">
                </div>


            </div>
        </form>
    </div>
</div>

<%@include file="includes/footer.jsp" %>
