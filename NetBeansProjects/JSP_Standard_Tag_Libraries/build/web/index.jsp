<%-- 
    Document   : index
    Created on : Oct 29, 2022, 8:35:15 PM
    Author     : Navod Madusanka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>index Page</title>
    </head>
    <body>
        <h1>Index</h1>

        <!-- out -->
        <!-- <c:out value="Navod"/> -->
        <!-- out -->
        
        <!-- set -->
        <!--<c:set var="name" value="Hasitha" scope="session"/>
        <c:out value="${sessionScope.name}"/>-->
        <!-- set -->
        
        <!-- remove -->
        <!--<c:set var="city" value="Kandy"/>
        <c:out value="${city}"/>
        <c:remove var="city" scope="page"/>
        <c:out value="${city}"/>-->
        <!-- remove -->
        
        <!-- if -->
        <!--<c:set var="first_city" value="Kandy" scope="session"/>
        <c:set var="second_city" value="Kandy"/>
        <c:if test="${sessionScope.first_city eq pageScope.second_city}">
            <p>First city name equals to second city</p>
        </c:if>-->
        <!-- if -->
        
        <!-- catch -->
        <!--<c:catch var="exception_found">
            <% int i = 10/0; %>
        </c:catch>
        
        <c:if test="${exception_found != null}">
            Exception type is: - ${exception_found}
            <br/>
            There is an exception : ${exception_found.message}
        </c:if>-->
        <!-- catch -->
        
        <!-- choose, when, otherwise -->
        <!--<c:set var="num" value="100"/>
        <c:choose>
            <c:when test="${num < 100}">
                The Number is less than 100
            </c:when>
            <c:when test="${num > 100}">
                The Number is Grater than 100
            </c:when>
            <c:otherwise>
                The Number is 100
            </c:otherwise>
        </c:choose>-->
        <!-- choose, when, otherwise -->
        
        <!-- import -->
        <!--<c:import var="google" url="https://www.google.com"/>
        <c:out value="${google}" escapeXml="false"/>-->
        <!-- import -->
        
        <!-- for Each -->
        <!--<c:forEach var="i" begin="1" end="10">
            Item ( ${i} )
            <br/>
        </c:forEach>-->
        <!-- for Each -->
        
        <!-- for Tokens -->
        <!--<c:forTokens items="Kandy,Colombo,Gampaha" delims="," var="city">
            <c:out value="${city}"/>
            <br/>
        </c:forTokens>-->
        <!-- for Tokens -->
        
        <!-- URL -->
        <!--<c:url value="http://www.google.com" var="google"/>
        <c:import url="${google}"/>-->
        <!-- URL -->
        
        <!-- param -->
        <!--<c:url value="Login.jsp" var="login">
            <c:param name="username" value="Navod"/>
            <c:param name="password" value="123"/>
        </c:url>
        <c:import url="${login}"/>-->
        <!-- param -->

    </body>
</html>
