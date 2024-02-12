package conrtoller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "NewServlet", urlPatterns = {"/NewServlet"})
public class A extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        System.out.println("Servlet A doGet");
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().write("<h1>Setvlet A doGet</h1>");
    }
}
