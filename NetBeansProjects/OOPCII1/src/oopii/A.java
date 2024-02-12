/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopii;

/**
 *
 * @author Navod Madusanka
 */
public class A {
    int x = 10;
    class X{
        int j = 10;
        void j(){}
    }
    public static void main(String[] args) {
//        X x = new X();
          A a = new A();
//          A.X x = new a.x();
          A.X x = a.new X();
          A.X s = new A().new X();
    }
}
