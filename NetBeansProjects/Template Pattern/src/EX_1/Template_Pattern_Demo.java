/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX_1;

/**
 *
 * @author Navod Madusanka
 */
abstract class Template{
    public void p(){
        System.out.println("P"); 
    }
    
    abstract void p3();
    abstract void p2();
    
    public final void templatemethod(){
        p2();
        if (skip()){
            p();
        }
        p3();
    }
    
    public boolean skip(){
        return false;
    }
}

class X extends Template{

    @Override
    void p3() {
        System.out.println("X.P3");
    }

    @Override
    void p2() {
        System.out.println("X.P2");
    }
    
}

class Y extends Template{

    @Override
    void p3() {
        System.out.println("Y.P3");
    }

    @Override
    void p2() {
        System.out.println("Y.P2"); 
    }

    @Override
    public boolean skip() {
        return true;
    }
    
    
    
}

public class Template_Pattern_Demo {
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        
        x.templatemethod();
        y.templatemethod();
    }
}
