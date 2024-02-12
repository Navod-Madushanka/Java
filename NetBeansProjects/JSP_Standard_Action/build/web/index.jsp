<%-- 
    Document   : index
    Created on : Oct 29, 2022, 9:45:39 AM
    Author     : Navod Madusanka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>index</title>
    </head>
    <body>
        <h1>Index page</h1>
        <jsp:forward page="Login.jsp">
            <jsp:param name="city" value="Kandy"/>
        </jsp:forward>
    </body>
</html>
