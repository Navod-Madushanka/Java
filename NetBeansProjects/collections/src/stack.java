
import java.util.Stack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Navod Madusanka
 */
public class stack {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.add(1);
        st.add(2);
        st.push(3);
        st.push(4);
        
        System.out.println(st);
        
        st.pop();
        
        System.out.println(st);
        
        Object rr = st.get(1);
        System.out.println(rr);
        System.out.println(st);
        
        Object emp = st.isEmpty();
        System.out.println(emp);
        
        st.clear();
        
        Object emp2 = st.isEmpty();
        System.out.println(emp2);
    }
}
