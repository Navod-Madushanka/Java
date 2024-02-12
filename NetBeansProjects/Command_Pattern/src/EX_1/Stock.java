/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX_1;

/**
 *
 * @author Navod Madusanka
 */
public class Stock {
    private String productName = "Apple iPhone 12";
    private int productQty = 20;
    
    public void buy(){
        System.out.println("Product : "+productName+", QTY : "+productQty+", Bought");
    }
    
    public void sell(){
        System.out.println("Product : "+productName+", QTY : "+productQty+", Sold");
    }
}
