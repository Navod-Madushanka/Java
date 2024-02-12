<%-- 
    Document   : index
    Created on : Sep 9, 2022, 8:46:35 AM
    Author     : Navod Madusanka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Login Page</title>
    </head>
    <body>
        <h1>Admin Login</h1>
        <form action="admin_login" method="POST">
            <table border="0">
                <tbody>
                    <tr>
                        <th>UserName</th>
                        <td><input type="text" name="username"/></td>
                    </tr>
                    <tr>
                        <th>Password</th>
                        <td><input type="password" name="password"/></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Log In"/></td>
                    </tr>
                </tbody>
            </table>
        </form>
        <h1>User Login</h1>
        <form action="user_login" method="POST">
            <table border="0">
                <tbody>
                    <tr>
                        <th>Username</th>
                        <td><input type="text" name="name" /></td>
                    </tr>
                    <tr>
                        <th>Password</th>
                        <td><input type="password" name="password" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Log In"/></td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
