/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package util;

/**
 *
 * @author Navod Madusanka
 */
public enum MainDishes {
    GRILLED_CHICKEN_LEMON_HERB(600.00),
    SPAGHETTI_BOLOGNESE(500.00),
    VEGETARIAN_STIR_FRY(400.00),
    MARGHERITA_PIZZA(1500.00),
    BEEF_BURRITOS(990.00),
    SALMON_TERIYAKI(1200.00),
    CHICKEN_ALFREDO_PASTA(500.00),
    VEGGIE_BURGER(450.00),
    SHRIMP_SCAMPI_LINGUINE(1000.00),
    BBQ_PULLED_PORK_SANDWICH(1200.00);
    
    private final double price;
    
    MainDishes(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
}

