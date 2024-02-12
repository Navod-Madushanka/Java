/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.navod.bankapp;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
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
@WebServlet(name = "User_Login", urlPatterns = {"/user_login"})
public class User_Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        
        if (name.isEmpty()) {
            resp.sendRedirect("index.jsp");
        }else if (password.isEmpty()) {
            resp.sendRedirect("index.jsp");
        }else{
            ServletContext context = getServletContext();
            
            if (name.equals(context.getInitParameter("name")) && password.equals(context.getInitParameter("password")) ) {
                HttpSession session = req.getSession();
                session.setAttribute("account_no", context.getInitParameter("account_no"));
                resp.sendRedirect("my_account.jsp");
            }
        }
    }

}
