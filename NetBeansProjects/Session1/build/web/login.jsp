<%-- 
    Document   : login
    Created on : Sep 2, 2022, 10:41:37 AM
    Author     : Navod Madusanka
--%>

<%

//    if (session.getAttribute("login") != null) {
//        response.sendRedirect("home.jsp");
//        return;
//    }

%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login Page</title>
    </head>
    <body>

        <h1>Login!</h1>

        <form action="login" method="post">
            <table >

                <tbody>
                    <tr>
                        <td>email</td>
                        <td><input type="email" name="email"/></td>
                    </tr>
                    <tr>
                        <td>password</td>
                        <td><input type="password" name="password"/></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Login"/></td>
                    </tr>
                </tbody>
            </table>

        </form>

    </body>
</html>
