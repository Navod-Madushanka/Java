<%-- 
    Document   : home
    Created on : Sep 2, 2022, 10:17:51 AM
    Author     : Navod Madusanka
--%>

<%

    if (session.getAttribute("login") == null || !(boolean) session.getAttribute("login")) {
        response.sendRedirect("login.jsp");
        return;
    }

%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <h1>Home!</h1>
    </body>
</html>
