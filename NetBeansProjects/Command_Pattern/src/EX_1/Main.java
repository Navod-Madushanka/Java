/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX_1;

/**
 *
 * @author Navod Madusanka
 */
public class Main {
    public static void main(String[] args) {
        Stock iPhoneStock = new Stock();
        BuyStock buyOrder = new BuyStock(iPhoneStock);
        Broker b1 = new Broker();
        b1.takeOrder(buyOrder);
        b1.placeOrder();
    }
}
