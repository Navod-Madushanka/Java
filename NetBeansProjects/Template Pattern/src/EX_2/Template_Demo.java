/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX_2;

import java.util.Scanner;

/**
 *
 * @author Navod Madusanka
 */
abstract class CaffeinBeverages{
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }
    }
    
    abstract void brew();
    abstract void addCondiments();
    
    public void boilWater(){
        System.out.println("Boiling");
    }
    
    public void pourInCup(){
        System.out.println("Poured");
    }
    
    public boolean customerWantsCondiments(){
        return true;
    }
}

class Coffee extends CaffeinBeverages{

    @Override
    void brew() {
        System.out.println("Dripping Brew Filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Add Suger and Milk");
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        
        if(answer.toLowerCase().startsWith("y")){
            return true;
        }
        return false;
    }
    
    public String getUserInput(){
        Scanner s = new Scanner(System.in);
        System.out.println("Would You Like To Have Some Condiments With Your Tea? (Y or N)");
        
        String ss = s.next();
        if(ss.toLowerCase().startsWith("n")){
            return "No";
        }
        return "Yes";
    }
    
}

class Tea extends CaffeinBeverages{

    @Override
    void brew() {
        System.out.println("Sink Tea Bag");
    }

    @Override
    void addCondiments() {
        System.out.println("Add Lemon and Suger");
    }
    
}

public class Template_Demo {
    public static void main(String[] args) {
        Tea t = new Tea();
        Coffee c = new Coffee();
        t.prepareRecipe();
        c.prepareRecipe();
    }
}
