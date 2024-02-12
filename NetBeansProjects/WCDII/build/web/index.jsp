<%-- 
    Document   : index
    Created on : Oct 6, 2022, 11:39:57 PM
    Author     : Navod Madusanka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <jsp:useBean id="user" class="com.navod.webapp.User" />
        
        <jsp:setProperty name="user" property="name" value="Navod" />
        <jsp:setProperty name="user" property="email" value="navod@gmail.com" />
        <jsp:setProperty name="user" property="address" value="kandy" />
        
        ${user.name}<br/>
        ${user.email}<br/>
        ${user.address}
    </body>
</html>
