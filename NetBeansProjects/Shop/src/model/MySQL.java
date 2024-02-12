/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ASUS
 */
public class MySQL {
    
    private static Connection c;
    private static final String DATABASE = "shop";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "HasithaNavod1380!";
    
    private static Statement createConnection() throws Exception {
        if(c == null){
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+DATABASE,USERNAME,PASSWORD);
        }
        Statement s = c.createStatement();
        
        return s;
    }
    
    public static void iud(String quary){
        try {
            createConnection().executeUpdate(quary);
        } catch (Exception e) {
            System.out.println("Connection Error");
        }
    }
    
    public static ResultSet search(String query) throws Exception {
        ResultSet r = createConnection().executeQuery(query);
        return r;
    }
    
}
