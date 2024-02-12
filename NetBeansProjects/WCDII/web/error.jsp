<%-- 
    Document   : error
    Created on : Oct 6, 2022, 2:47:46 AM
    Author     : Navod Madusanka
--%>

<%@page isErrorPage="true"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Page</title>
    </head>
    <body>
        <h1>Error!</h1>
        <p><%= exception.getMessage() %></p>
    </body>
</html>
