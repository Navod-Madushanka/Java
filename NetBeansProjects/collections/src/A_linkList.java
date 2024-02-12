
import java.util.LinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Navod Madusanka
 */
public class A_linkList {
    public static void main(String[] args) {
        LinkedList<String> linklist = new LinkedList<>();
        linklist.add("Hasitha");
        linklist.add("Navod");
        linklist.add("Madushanka");
        linklist.add("Maithripala");
        linklist.add("pasbara");
        
        System.out.println(linklist);
        
        linklist.remove(4);
        
        System.out.println(linklist);
    }
}
