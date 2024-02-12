/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patterns;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Navod Madusanka
 */
public class Singleton {
    public static Connection c;
    public static final String D = "oodpiiseapplication";
    public static final String U = "root";
    public static final String P = "HasithaNavod1380!";
    
    public static Statement createConnection() throws Exception{
        if(c==null){
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+D,U,P);
        }
        return c.createStatement();
    }
    
    public static void iud(String query){
        try {
            createConnection().executeUpdate(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static ResultSet s(String query) throws Exception{
        return createConnection().executeQuery(query);
    }
}
