/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Navod Madusanka
 */
public class A extends HttpServlet{
    
    public void doGet(HttpServletRequest request,HttpServletResponse response){
        try {
            response.getWriter().write("Hello, WCD2");
        } catch (IOException e) {
        }
    }
    
}
