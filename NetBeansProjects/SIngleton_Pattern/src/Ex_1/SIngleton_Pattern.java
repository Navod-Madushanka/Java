/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex_1;

/**
 *
 * @author Navod Madusanka
 */

//Singleton pattern using Lazy Method

class A{
    private static A a;
    
    public static synchronized A getA(){
        if(a == null){
            a = new A();
        }
        return a;
    }
}

public class SIngleton_Pattern {
    public static void main(String[] args) {
        A a = A.getA();
        
    }
}
