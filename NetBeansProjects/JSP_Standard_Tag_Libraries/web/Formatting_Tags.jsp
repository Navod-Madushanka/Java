<%-- 
    Document   : Fomatting_Tags
    Created on : Oct 30, 2022, 9:56:11 AM
    Author     : Navod Madusanka
--%>

<%@page import="com.sun.xml.rpc.processor.modeler.j2ee.xml.javaIdentifierType"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formatting Tags Page</title>
    </head>
    <body>
        <h1>Formatting Tags</h1>
        
        <!-- parse Number -->
        <!--<c:set var="amount" value="9999.99"/>
        <fmt:parseNumber var="i" type="number" integerOnly="false" value="${amount}"/>
        <c:out value="${i}"/>-->
        <!-- parse Number -->
        
        <!-- time zone -->
        <!--<c:set var="now" value="<%=new java.util.Date()%>"/>
        <table>
        <c:forEach var="zone" items="<%=java.util.TimeZone.getAvailableIDs()%>">
            <tr>
                <td>
                    <c:out value="${zone}"/>
                </td>
                <td>
                    <fmt:timeZone value="${zone}">
                        <fmt:formatDate value="${now}" type="both"/>
                    </fmt:timeZone>
                </td>
            </tr> 
        </c:forEach>
        </table>-->
        <!-- time zone -->
        
        <!-- format Number -->
        <!--<c:set var="amount" value="78423.12345"/>
        <fmt:formatNumber value="${amount}" type="currency"/>
        <br/>
        <fmt:formatNumber value="${amount}" type="number" groupingUsed="true"/>
        <br/>
        <fmt:formatNumber value="${amount}" type="number" maxIntegerDigits="3"/>
        <br/>
        <fmt:formatNumber value="${amount}" type="number" maxFractionDigits="1"/>
        <br/>
        <fmt:formatNumber value="${amount}" type="percent" maxIntegerDigits="4"/>
        <br/>
        <fmt:formatNumber value="${amount}" type="number" pattern="##.###$"/>-->
        <!-- format Number -->
        
        <!-- parse date -->
        <c:set var="now" value="<%=new java.util.Date()%>"/>
        <fmt:parseDate value="${now}" var="parseddate" pattern="yyyy-MM-dd"/>
        <c:out value="${parseddate}"/>
        <!-- parse date -->
        
    </body>
</html>
