/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TSE;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Navod Madusanka
 */
public class TreeSet_EX {
    public static void main(String[] args) {
        Set s = new TreeSet();
        s.add("a");
        s.add("A");
        s.add("D");
        s.add("B");
        s.add("d");
        s.add("c");
        s.add("1");
        s.add("4");
        s.add("3");
        s.add("$");
        s.add("2");
        s.add("b");
        s.add("e");
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.isEmpty());
        s.clear();
        System.out.println(s.size());
        System.out.println(s.isEmpty());
    }
 
}
