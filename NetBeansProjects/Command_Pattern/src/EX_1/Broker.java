/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX_1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Navod Madusanka
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();
    public void takeOrder(Order order){
        orderList.add(order);
    }
    public void placeOrder(){
        for(Order order : orderList){
            order.execute();
        }
        
        orderList.clear();
    }
}
