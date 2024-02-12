/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.navod.print;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Navod Madusanka
 */
public class Printer {
    public void printLine(String filepath){
        try {
            BufferedReader br = new BufferedReader(new FileReader(filepath));
            String line = br.readLine();
            while(line != null){
                System.out.println("line");
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found");
        }catch(IOException e){
            System.out.println("Con't read File");
        }
    }
}
