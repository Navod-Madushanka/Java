/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Payment_Manager;

/**
 *
 * @author Navod Madusanka
 */
public class Master_payment implements Strategy{

    @Override
    public String doPayment(String method) {
        return "Master Payment Done "+ method;
    }
    
}
