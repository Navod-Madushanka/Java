
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Navod Madusanka
 */
public class SetTest {
    public static void before(){
        Set s = new TreeSet();
        s.add(new Integer(12));
        s.add(new Integer(13));
        s.add(new Integer(14));
        
        Iterator it = s.iterator();
        while(it.hasNext()){
            System.out.println(it.next() + " ");
        }
    }
    public static void main(String[] args) {
        before();
    }
}
