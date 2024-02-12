/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.navod;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author Navod Madusanka
 */
@WebServlet(name = "A", urlPatterns = {"/A"})
public class A implements Servlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init.....");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        
    }

    @Override
    public String getServletInfo() {
        return "A";
    }

    @Override
    public void destroy() {
        System.out.println("destroy...");
    }

}
