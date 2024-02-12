<%-- 
    Document   : user_account
    Created on : Sep 9, 2022, 9:43:34 AM
    Author     : Navod Madusanka
--%>

<%
    
    if (session.getAttribute("name") == null) {
        
        response.sendRedirect("index.jsp");
        
    }
    

%>


<%@page import="com.navod.bankapp.User"%>
<%@page import="java.util.Enumeration"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Account Page</title>
    </head>
    <body>
        <h1>User Accounts</h1>
        <table border="1" style="width: 100%">
            <thead>
                <tr>
                    <th>Account No</th>
                    <th>Name</th>
                    <th>Mobile</th>
                    <th>Email</th>
                    <th>Address</th>
                    <th>Birthday</th>
                </tr>
            </thead>
            <tbody>
                <%ServletContext context = getServletContext();
                    User u = (User) context.getAttribute("user");
                    
                %>
                <tr>
                    <td><%=u.getAccount_no()%></td>
                    <td><%=u.getName()%></td>
                    <td><%=u.getMobile()%></td>
                    <td><%=u.getEmail()%></td>
                    <td><%=u.getAddress()%></td>
                    <td><%=u.getBirthday()%></td>
                </tr>

                %>

            </tbody>
        </table>

    </body>
</html>
