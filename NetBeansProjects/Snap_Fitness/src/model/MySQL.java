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
 * @author Navod Madusanka
 */
public class MySQL {

    private static Connection c;
    private static final String DATABASE = "snap_fitness";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "HasithaNavod1380!";

    private static Statement createConnection() throws Exception {
        if (c == null) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + DATABASE, USERNAME, PASSWORD);
        }

        return c.createStatement();

    }
    
    public static void iud(String quary){
        try {
            createConnection().executeUpdate(quary);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static ResultSet search(String quary) throws Exception {
        return createConnection().executeQuery(quary);
    }

}
