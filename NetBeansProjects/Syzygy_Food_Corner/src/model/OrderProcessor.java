/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Navod Madusanka
 */
interface Ingredient{
    void serve(FoodOrder Order);
}
class IngredientImpl implements Ingredient{
    private final String name;
    public IngredientImpl(String name){
        this.name = name;
    }
    @Override
    public void serve(FoodOrder order) {
        System.out.println("Serving " + name + " in " + order);
    }
}
class IngredientFactory{
    private final Map<String, Ingredient> ingredients = new HashMap<>();
    public Ingredient getIngredient(String name){
        if(!ingredients.containsKey(name)){
            ingredients.put(name, new IngredientImpl(name));
        }
        return ingredients.get(name);
    }
}
public class OrderProcessor {
    private final IngredientFactory ingredientFactory;
    public OrderProcessor(){
        this.ingredientFactory = new IngredientFactory();
    }
    public void processOrder(FoodOrder order, String ingredientName){
        System.out.println("Processing Order: "+ order);
        Ingredient ingredient = ingredientFactory.getIngredient(ingredientName);
        ingredient.serve(order);
        System.out.println("Order processed successfully.");
    }
}
