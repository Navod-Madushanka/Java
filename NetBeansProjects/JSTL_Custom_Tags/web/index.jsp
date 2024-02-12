<%-- 
    Document   : index
    Created on : Oct 13, 2022, 9:41:41 AM
    Author     : Navod Madusanka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib uri="http://navod.com/mytag" prefix="mt" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <mt:loop count="5">
            <h1>OK</h1>
        </mt:loop>
    </body>
</html>
