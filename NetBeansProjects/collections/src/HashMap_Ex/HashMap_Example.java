/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashMap_Ex;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Navod Madusanka
 */
public class HashMap_Example {
    public static void main(String[] args) {
        Map m = new LinkedHashMap();
        m.put("2", "B");
        m.put("3", "C");
        m.put("3", "D");
        m.put("4", "E");
        m.put("4", "A");
        m.put("1", "A");
        System.out.println(m);
        System.out.println(m.size());
    }
}
