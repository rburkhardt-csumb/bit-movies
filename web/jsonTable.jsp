<%-- 
    Document   : jsonTable
    Created on : Jun 27, 2017, 10:48:40 AM
    Author     : Huy
--%>

<%@page contentType="application/json; charset=UTF-8"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="data.ZipCodeDB"%>
<%@page import="entities.ZipCode"%>

<%
    

    Integer zip = Integer.parseInt(request.getParameter("zip"));

    JSONObject json = new JSONObject();
    ZipCodeDB zcdb = new ZipCodeDB();
    
    ZipCode zc = zcdb.getZipCodeData(zip);
    
    json.put("zip", zc.getZip());
    json.put("city", zc.getCity() );
    json.put("state", zc.getState());
    json.put("county", zc.getCounty());
    out.print(json);
    out.flush();
%>


