
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Navod Madusanka
 */
public class Main {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        long beforeTime = System.currentTimeMillis();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("E");
        al.add("F");
        al.add("G");
        al.add("H");
        al.add("I");
        al.add("J");
        al.add("K");
        long afterAddingTime = System.currentTimeMillis();
        long spendTime = afterAddingTime - beforeTime;
        System.out.println(spendTime);
    }
}
