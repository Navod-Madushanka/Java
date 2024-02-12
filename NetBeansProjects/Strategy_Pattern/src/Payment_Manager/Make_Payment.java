/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Payment_Manager;

/**
 *
 * @author Navod Madusanka
 */
public class Make_Payment {
    public static void main(String[] args) {
        Context context = new Context(new PayPal_Payment());
        System.out.println(context.executeStratergy("100"));
        
        context = new Context(new Visa_Payment());
        System.out.println(context.executeStratergy("100"));
    }
}
