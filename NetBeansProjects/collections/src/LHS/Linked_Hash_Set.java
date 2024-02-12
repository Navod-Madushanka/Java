/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LHS;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author Navod Madusanka
 */
public class Linked_Hash_Set {
    public static void main(String[]args){
        int i = 0;
        Set s = new LinkedHashSet();
        s.add("a");
        s.add("b");
        s.add("c");
        s.add("d");
        s.add("a");
        s.add("A");
        s.add("1");
        s.add("3");
        s.add("5");
        s.add("2");
        s.add("4");
        
        System.out.println(s.size());
        System.out.println(s);
        s.clear();
        System.out.println(s);
        System.out.println(s.isEmpty());
    }
}
