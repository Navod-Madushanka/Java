/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Payment_Manager;

/**
 *
 * @author Navod Madusanka
 */
public class Context {
    private Strategy strategy;
    
    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    
    public String executeStratergy(String method){
        return strategy.doPayment(method);
    }
}
