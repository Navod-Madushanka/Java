/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strategy_pattern.Calculator;

/**
 *
 * @author Navod Madusanka
 */
public class Strategy_Pattern {

    public static void main(String[] args) {
        Context context = new Context(new AddOperation());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
        
        context = new Context(new SubtractionOperation());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
    }
    
}
