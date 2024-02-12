/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HS;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Navod Madusanka
 */
public class HashSet_Ex {

    public static void main(String[] args) {
        int i = 0;
        Set s = new HashSet();
        s.add("a");
        s.add("b");
        s.add("c");
        s.add("d");
        s.add("a");
        
        System.out.println(s.size());
        System.out.println(s);
        s.clear();
        System.out.println(s);
    }
}
