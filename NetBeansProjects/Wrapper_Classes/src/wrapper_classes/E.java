/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wrapper_classes;

/**
 *
 * @author Navod Madusanka
 */
public class E {
    public static void main(String[] args) {
        Integer y = new Integer(567);
        int x = y.intValue();
        x++;
        y = new Integer(x);
        System.out.println("y="+x);
        
    }
}
