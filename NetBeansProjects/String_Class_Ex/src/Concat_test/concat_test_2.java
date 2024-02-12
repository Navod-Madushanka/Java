/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Concat_test;

/**
 *
 * @author Navod Madusanka
 */
public class concat_test_2 {
    public static String concatwithString(){
        String t = "Java";
        for (int i = 0; i < 10000; i++) {
            t = t+"Institute";
        }
        return t;
    }
    public static String concatwithStringBuilder(){
        StringBuilder sb = new StringBuilder("Java");
        for (int i = 0; i < 10000; i++) {
            sb = sb.append("Institiute");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        concatwithString();
        System.out.println("Time taken by concat with String :"+(System.currentTimeMillis()-startTime)+"ms");
        startTime = System.currentTimeMillis();
        concatwithStringBuilder();
        System.out.println("Time taken by concat with StringBuffer :"+(System.currentTimeMillis()-startTime)+"ms");
    }
}
