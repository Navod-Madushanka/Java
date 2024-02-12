<%-- 
    Document   : Function_Tags
    Created on : Oct 29, 2022, 10:53:10 PM
    Author     : Navod Madusanka
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Function Tag Page</title>
    </head>
    <body>
        <h1>Function Tag</h1>

        <!-- contains -->
        <!--<c:set var = "theString" value = "I am a test String"/>
        <c:if test = "${fn:contains(theString, 'test')}">
            <p>Found test string<p>
        </c:if>

        <c:if test = "${fn:contains(theString, 'TEST')}">
        <p>Found TEST string<p>
        </c:if>-->
        <!-- contains -->

        <!-- contains ignore case -->
        <!--<c:set var = "theString" value = "I am a TEST String"/>
        <c:if test = "${fn:containsIgnoreCase(theString, 'test')}">
        <p>Found test string<p>
        </c:if>-->
        <!-- contains ignore case -->

        <!-- start With -->
        <c:set var="text" value="My name navod"/>  
        <!--<c:if test="${fn:startsWith(text, 'My')}">  
            <p>Text start with 'My'<p>  
        </c:if>-->
        <!-- start With -->

        <!-- ends With -->
        <!--<c:set var="text" value="My name navod"/>  
        <c:if test="${fn:endsWith(text, 'navod')}">  
            <p>Text ends with navod<p>  
        </c:if>--> 
        <!-- ends With -->

        <!-- escape XML -->
        <!--<c:set var="name" value="<name>
               <fname>Navod</fname>
               <lname>Madushanka</lname>
               </name>"/>
        <p>with escape XML: - ${fn:escapeXml(name)}</p>
        <p>without escape XML: - ${name}</p>-->
        <!-- escape XML -->

        <!-- index of -->
        <!--<c:set var="string" value="Welcome to JSP Tag Library"/>
        <p>index of JSP is : - ${fn:indexOf(string, 'Tag')}</p>-->
        <!-- index of -->

        <!-- length -->
        <!--<c:set value="Welcome to JSP Tag Libraries" var="string"/>
        <p>Length of the string is: - ${fn:length(string)}</p>-->
        <!-- length --> 

        <!-- trim -->
        <!--<c:set var="str1" value="Welcome to   JSP Tag      Libraries     "/>  
        <p>String-1 Length is : ${fn:length(str1)}</p>  

        <c:set var="str2" value="${fn:trim(str1)}" />  
        <p>String-2 Length is : ${fn:length(str2)}</p>  
        <p>Final value of string is : ${str2}</p> --> 
        <!-- trim -->

        <!-- split -->
        <!--<c:set value="Welcome-to-JSP-Tag-Libraries" var="string"/>
        <c:set var="string2" value="${fn:split(string, '-')}"/>
        <c:out value="${string2[1]}"/>-->
        <!-- split -->

        <!-- to lower case -->
        <!--<c:set var="string" value="NAVOD"/>
        <c:out value="${fn:toLowerCase(string)}"/>-->
        <!-- to lower case -->

        <!-- to upper case -->
        <!--<c:set var="string" value="navod"/>
        <c:out value="${fn:toUpperCase(string)}"/>-->
        <!-- to upper case -->

        <!-- sub string -->
        <!--<c:set var="string" value="This is the first string."/>  
        ${fn:substring(string, 5, 17)} --> 
        <!-- sub string -->
        
        <!-- sub string after -->
        <!--<c:set var="string" value="This is the first string."/>  
        ${fn:substringAfter(string, 'the')}-->
        <!-- sub string after -->
        
        <!-- sub string before -->
        <!--<c:set var="string" value="This is the first string."/>  
        ${fn:substringBefore(string, 'the')}-->
        <!-- sub string before -->
        
        <!-- replace -->
        <c:set var="string" value="My name is Navod"/>
        <c:out value="${fn:replace(string, 'Navod', 'Hasitha')}"/>
        <!-- replace -->

    </body>
</html>
