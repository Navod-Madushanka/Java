/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.Navod.config;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Navod Madusanka
 */
@WebServlet(name = "X", urlPatterns = {"/X"},
        initParams = {
            @WebInitParam(name = "name", value = "abc"),
            @WebInitParam(name = "age", value = "22")
        })
public class A extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.getWriter().write("A Servlet");
        resp.getWriter().write("<br>");

        String name = getInitParameter("name");
        resp.getWriter().write("Hello " + name);

        resp.getWriter().write("<br>");

        ServletConfig config = getServletConfig();
        String s = config.getInitParameter("name");
        resp.getWriter().write("Hello " + s);

        resp.getWriter().write("<br>");

        Enumeration<String> e = getInitParameterNames();
        while (e.hasMoreElements()) {
            String n = e.nextElement();
            System.out.println(n);
        }

    }

}
