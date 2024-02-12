/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package util;

/**
 *
 * @author Navod Madusanka
 */
public enum Toppings {
    PEPPERONI(250.00),
    MUSHROOMS(50.00),
    BELL_PEPPERS(100.00),
    ONIONS(50.00),
    BLACK_OLIVES(150.00),
    ITALIAN_SAUSAGE(200.00),
    FRESH_BASIL(50.00),
    CHERRY_TOMATOES(100.00),
    SPINACH(100.00),
    FETA_CHEESE(150.00),
    LETTUCE(50.00),
    TOMATO_SLICES(20.00),
    PICKLES(30.00),
    BACON_STRIPS(100.00),
    AVOCADO_SLICES(70.00),
    FRIED_EGG(80.00),
    JALAPENOS(90.00),
    BLUE_CHEESE_CRUMBLES(300.00),
    SAUTEED_MUSHROOMS(40.00);
    
    private final double price;

    private Toppings(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    
}
