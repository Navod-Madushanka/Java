/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.navod.webapp;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Navod Madusanka
 */
@WebServlet(name = "Login", urlPatterns = {"/login"})
public class Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        
        if (username.equals("admin") && password.equals("1234")) {
            HttpSession session = req.getSession();
            session.setAttribute("user", "admin");
            
            System.out.println(req.getRemoteAddr());
            
            resp.sendRedirect(resp.encodeRedirectURL("home.jsp"));
        }else{
            resp.sendRedirect(resp.encodeRedirectURL("index.jsp"));
        }
    }

}
