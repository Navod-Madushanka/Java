/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopii2;

/**
 *
 * @author Navod Madusanka
 */
public class A {
    public static void p(){
        X x1 = new X(){
            @Override
            public void m() {
                System.out.println("Anonymous m");
            }    
        };
        X x2 = () -> {
            System.out.println("Lambda Expressions m");
        };
        x1.m();
        x2.m();
    }
}

interface X{
    public void m();
}
