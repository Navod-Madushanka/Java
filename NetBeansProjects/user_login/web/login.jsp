<%-- 
    Document   : login
    Created on : Sep 2, 2022, 8:39:17 AM
    Author     : Navod Madusanka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    
    String username = "", password = "";
    boolean check = false;
    
    for (Cookie c : request.getCookies()) {
        if (c.getName().equals("username")) {
            username = c.getValue();
            check = true;
        }
        if (c.getName().equals("password")) {
            
        }
    }

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <table>
            <tbody>
                <tr>
                    <td>User Name</td>
                    <td><input type="text" name="username" value="<%=username%>"></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name = "password" value="<%=password%>"></td>
                </tr>
                <tr>
                    <td><input type="checkbox" name = "remember" value=""></td>
                    <td>Remember</td>
                </tr>
                <tr>
                    <td><input type="submit" value="Login" /></td>
                </tr>
            </tbody>
        </table>

    </body>
</html>
