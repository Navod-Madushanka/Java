/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy_pattern.Calculator;

/**
 *
 * @author Navod Madusanka
 */
public class AddOperation implements Strategy{

    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
    
}
