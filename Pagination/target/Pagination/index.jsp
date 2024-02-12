<%@ page import="com.navod.webapp.util.HibernateUtil" %>
<%@ page import="org.hibernate.Session" %>
<%@ page import="java.util.List" %>
<%@ page import="com.navod.webapp.model.Student" %><%--
  Created by IntelliJ IDEA.
  User: Navod Madusanka
  Date: 5/10/2023
  Time: 10:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Student</h1>
<%
    Session hs = HibernateUtil.getSessionFactory().openSession();
    List<Student> students = hs.createQuery("SELECT s FROM Student s", Student.class).getResultList();
    pageContext.setAttribute("students", students);
%>
<table>
<tr>
    <th>Name</th>
    <th>Email</th>
    <th>Address</th>
</tr>
    <c:forEach var="student" items="${students}">
        <tr>
            <td>${student.name}</td>
            <td>${student.email}</td>
            <td>${student.address}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
