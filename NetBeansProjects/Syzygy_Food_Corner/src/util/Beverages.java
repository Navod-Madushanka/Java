/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package util;

/**
 *
 * @author Navod Madusanka
 */
public enum Beverages {
    FRESH_ORANGE_JUICE(250.00),
    ICED_TEA(250.00),
    LEMONADE(150.00),
    BERRY_SMOOTHIE(400.00),
    MINT_LEMON_INFUSION(450.00),
    CAPPUCCINO(600.00),
    MANGO_LASSI(600.00),
    CRANBERRY_SPRITZER(700.00),
    CLASSIC_MOJITO(1900.00),
    SPARKLING_WATER_WITH_LEMON(200.00);
    
    private final double price;

    private Beverages(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
