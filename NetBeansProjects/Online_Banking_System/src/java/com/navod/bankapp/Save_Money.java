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

/**
 *
 * @author Navod Madusanka
 */
@WebServlet(name = "Save_Money", urlPatterns = {"/save_money"})
public class Save_Money extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String save = req.getParameter("save");
        if (save.isEmpty()) {
            resp.sendRedirect("my_account.jsp");
        }else{
            ServletContext context = getServletContext();
            context.setInitParameter("save", save);
            resp.sendRedirect("my_account");
        }
    }

}
