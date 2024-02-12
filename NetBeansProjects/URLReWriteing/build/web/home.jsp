<%-- 
    Document   : home
    Created on : Sep 7, 2022, 10:26:43 AM
    Author     : Navod Madusanka
--%>
<%
    
    if (session.getAttribute("user") == null || !session.getAttribute("user").equals("admin")) {
        response.sendRedirect(response.encodeRedirectURL("index.jsp"));
    }
    
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
