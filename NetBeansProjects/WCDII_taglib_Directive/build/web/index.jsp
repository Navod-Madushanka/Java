<%-- 
    Document   : index
    Created on : Oct 4, 2022, 9:03:11 AM
    Author     : Navod Madusanka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <jsp:useBean id="user" class="com.navod.webapp.User"/>
        <jsp:setProperty name="user" property="name" param="name"/>
        <jsp:getProperty name="user" property="name"/>
        <jsp:expression>OK</jsp:expression>
    </body>
</html>
