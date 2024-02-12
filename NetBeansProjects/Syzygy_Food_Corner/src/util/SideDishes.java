/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package util;

/**
 *
 * @author Navod Madusanka
 */
public enum SideDishes {
    GARLIC_PARMESAN_KNOTS(200.00),
    CAESAR_SALAD(300.00),
    ONION_RINGS(150.00),
    MASHED_POTATOES(300.00),
    COLESLAW(200.00),
    GRILLED_VEGETABLES(500.00),
    FRENCH_FRIES(400.00),
    CAPRESE_SALAD(300.00),
    SWEET_POTATO_WEDGES(400.00),
    QUINOA_SALAD(400.00);
    
    private final double price;

    SideDishes(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    
}
