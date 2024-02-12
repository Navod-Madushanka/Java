/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Concat_test;

/**
 *
 * @author Navod Madusanka
 */
public class Concat_test {
    public static String concatwithString(){
        String t = "Java";
        for (int i = 0; i < 10000; i++) {
            t = t+"Institute";
        }
        return t;
    }
    public static String concatwithStringBuffer(){
        StringBuffer sb = new StringBuffer("Java");
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
        concatwithStringBuffer();
        System.out.println("Time taken by concat with StringBuffer :"+(System.currentTimeMillis()-startTime)+"ms");
    }
}
