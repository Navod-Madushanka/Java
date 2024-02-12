<%-- 
    Document   : users
    Created on : Sep 9, 2022, 8:56:46 AM
    Author     : Navod Madusanka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Users Page</title>
    </head>
    <body>
        <h1>Users</h1>
        <form action="user_registration" method="POST">
            <table border="0">
                <tbody>
                    <tr>
                        <th>Name</th>
                        <td><input type="text" name="name" /></td>
                    </tr>
                    <tr>
                        <th>Mobile</th>
                        <td><input type="text" name="mobile" /></td>
                    </tr>
                    <tr>
                        <th>email</th>
                        <td><input type="email" name="email" /></td>
                    </tr>
                    <tr>
                        <th>Address</th>
                        <td><input type="text" name="address" /></td>
                    </tr>
                    <tr>
                        <th>Birthday</th>
                        <td><input type="text" name="birthday" /></td>
                    </tr>
                    <tr>
                        <th>Password</th>
                        <td><input type="password" name="password" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Register" /></td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
