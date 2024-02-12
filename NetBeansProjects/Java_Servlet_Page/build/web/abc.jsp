<%-- 
    Document   : abc
    Created on : Sep 16, 2022, 10:05:16 AM
    Author     : Navod Madusanka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ABC Page</title>
    </head>
    <body>
        <h1>ABC Page</h1>
        <%=pageContext.getAttribute("name")%>
                
    </body>
</html>
