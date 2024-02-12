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
@WebServlet(name = "User_Registration", urlPatterns = {"/user_registration"})
public class User_Registration extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String mobile = req.getParameter("mobile");
        String email = req.getParameter("email");
        String address = req.getParameter("address");
        String birthday = req.getParameter("birthday");
        String password = req.getParameter("password");

        if (name.isEmpty()) {
            resp.sendRedirect("users.jsp");
        } else if (mobile.isEmpty()) {
            resp.sendRedirect("users.jsp");
        } else if (email.isEmpty()) {
            resp.sendRedirect("users.jsp");
        } else if (address.isEmpty()) {
            resp.sendRedirect("users.jsp");
        } else if (birthday.isEmpty()) {
            resp.sendRedirect("users.jsp");
        }else if (password.isEmpty()) {
            resp.sendRedirect("users.jsp");
        } else {
            
            String account_no = String.valueOf(System.currentTimeMillis());
            
            ServletContext context = getServletContext();
            
            User u = new User(name, mobile, email, address, birthday, account_no, password);
            
            context.setAttribute("user", u);
            
            resp.sendRedirect("user_account.jsp");

        }

    }

}
