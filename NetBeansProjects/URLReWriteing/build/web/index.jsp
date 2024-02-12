<%-- 
    Document   : index
    Created on : Sep 6, 2022, 11:24:07 AM
    Author     : Navod Madusanka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="<%=response.encodeURL("login")%>" method="post">
            <table>
                <tbody>
                    <tr>
                        <td>Username:</td>
                        <td><input type="text" name="username"/></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="password"/></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="login"/></td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
