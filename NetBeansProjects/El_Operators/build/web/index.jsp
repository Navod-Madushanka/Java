<%-- 
    Document   : index
    Created on : Oct 9, 2022, 8:41:32 AM
    Author     : Navod Madusanka
--%>

<%@page import="com.navod.webapp.User"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            User user = new User();
            user.setName("Navod");
            user.setEmail("navod@gmail.com");
            pageContext.setAttribute("user", user);

            ArrayList list = new ArrayList();
            list.add("A");
            list.add("B");
            list.add("C");
            list.add("D");
            list.add("E");
            pageContext.setAttribute("list", list);

            int[] ar = {10, 20, 30, 40};
            pageContext.setAttribute("ar", ar);

            HashMap map = new HashMap();
            map.put("name", "Admin");
            map.put("email", "admin@gmail.com");
            pageContext.setAttribute("map", map);
        %>
        ${ar["1"]}
    </body>
</html>
