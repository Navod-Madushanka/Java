/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX_1;

/**
 *
 * @author Navod Madusanka
 */
public class BuyStock implements Order{
    private Stock iPhoneStock;
    
    public BuyStock(Stock iPhoneStock){
        this.iPhoneStock = iPhoneStock;
    }

    @Override
    public void execute() {
        iPhoneStock.buy();
    }
    
}
