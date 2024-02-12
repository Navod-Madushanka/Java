/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eager_Method;

/**
 *
 * @author Navod Madusanka
 */
class A{
    private static A a;
    public static int x = 10;
    
    private A(){}
    public static A getA(){
        if(a == null){
            a = new A();
        }
        return a;
    }
}

public class Singleton_Pattern {
    public static void main(String[] args) {
        System.out.println(A.x); // if we call like this, The every instence of the A object load to the ram, to solve this problem we can use getter method.
    }
}

