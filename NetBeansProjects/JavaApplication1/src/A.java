
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Navod Madusanka
 */
public class A {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher("1 a12 234b");
        
        while(m.find()){
            System.out.print(m.start()+" ");
        }
        
    }
}
