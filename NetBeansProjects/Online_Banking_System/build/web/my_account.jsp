<%-- 
    Document   : my_account
    Created on : Sep 9, 2022, 10:40:32 AM
    Author     : Navod Madusanka
--%>

<%

    if (session.getAttribute("account_no") == null) {
        response.sendRedirect("index.jsp");
    }

%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Account Page</title>
    </head>
    <body>

        <h1>My Account</h1>

        <form action="save_money" method="POST">

            <table border="0">

                <tbody>
                    <tr>
                        <td><input type="number" name="save" placeholder="Save"/></td>
                        <td><input type="submit" value="Save"/></td>
                    </tr>

                </tbody>
            </table>

        </form>
        
        <form action="Reseave_money" method="POST">

            <table border="0">

                <tbody>
                    <tr>
                        <td><input type="number" name="reseave" placeholder="Reseave"/></td>
                        <td><input type="submit" value="Reseave"/></td>
                    </tr>

                </tbody>
            </table>

        </form>

        <%            ServletContext context = getServletContext();
        %><span><%
            if (context.getInitParameter("seve") == null) {
            %>0<%
            } else {
                String save = context.getInitParameter("save");
            %><%=save%><%
                }


            %></span>
        

    </body>
</html>
