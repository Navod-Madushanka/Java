/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.navod.webapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
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
@WebServlet(name = "A", urlPatterns = {"/A"})
public class A extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        
        String name = "Navod";
        String email = "navod@gmail.com";
        
        ServletContext context = getServletContext();
        
        User u =  new User(name, email);
        
        context.setAttribute("user", u);
        
//        Enumeration<String> attributeNames = context.getAttributeNames();
//        while(attributeNames.hasMoreElements()){
//            String nextelement  = attributeNames.nextElement();
//            System.out.println(nextelement);
//        }
        
    }

}
