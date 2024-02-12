/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Navod Madusanka
 */
public class FoodOrder {
    private final String mainDish;
    private final String sideDish;
    private final String beverage;

    private FoodOrder(FoodOrderBuilder builder) {
        this.mainDish = builder.mainDish;
        this.sideDish = builder.sideDish;
        this.beverage = builder.beverage;
    }

    public String getMainDish() {
        return mainDish;
    }

    public String getSideDish() {
        return sideDish;
    }

    public String getBeverage() {
        return beverage;
    }

    @Override
    public String toString() {
        return "FoodOrder{" +
                "mainDish='" + mainDish + '\'' +
                ", sideDish='" + sideDish + '\'' +
                ", beverage='" + beverage + '\'' +
                '}';
    }
    public static class FoodOrderBuilder{
        private String mainDish;
        private String sideDish;
        private String beverage;

        public FoodOrderBuilder setMainDish(String mainDish) {
            this.mainDish = mainDish;
            return this;
        }

        public FoodOrderBuilder setSideDish(String sideDish) {
            this.sideDish = sideDish;
            return this;
        }

        public FoodOrderBuilder setBeverage(String beverage) {
            this.beverage = beverage;
            return this;
        }
        public FoodOrder build(){
            return new FoodOrder(this);
        }
    }
}
