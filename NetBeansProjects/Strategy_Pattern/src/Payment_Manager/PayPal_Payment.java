/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Payment_Manager;

/**
 *
 * @author Navod Madusanka
 */
public class PayPal_Payment implements Strategy{

    @Override
    public String doPayment(String method) {
        return "Paypal Payment Done "+ method;
    }
    
}
