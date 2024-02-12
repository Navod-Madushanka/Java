/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day2;

/**
 *
 * @author Navod Madusanka
 */
public class A2 {
    public static void main(String[] args) {
        String s1 = "spring";
        String s2 = s1 + "summer";
        s1.concat("JAVA");
        s2.concat(s1);
        s1 += "winter";
        System.out.println(s1+" "+s2);
    }
}
