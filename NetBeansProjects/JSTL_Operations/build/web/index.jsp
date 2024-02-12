<%-- 
    Document   : index
    Created on : Oct 9, 2022, 4:18:03 PM
    Author     : Navod Madusanka
--%>

<%@page import="java.util.Date"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:import url="Users.xml" var="users"/>
        <c:import url="MyStyle.xsl" var="myStyle"/>
        <x:parse xml="${users}" var="output"/>
        <x:transform xml="${users}" xslt="${myStyle}"/>
</body>
</html>
