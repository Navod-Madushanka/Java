import java.util.HashMap;
import java.util.Map;

interface Ingredient{
    void serve(String Order);
}
class IngredientImpl implements Ingredient{
    private final String name;
    public IngredientImpl(String name){
        this.name = name;
    }
    @Override
    public void serve(String order) {
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
    public OrderProcessor(IngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    public void processOrder(String order, String... ingredientNames){
        System.out.println("Processing Order: "+ order);
        for(String ingredientName : ingredientNames){
            Ingredient ingredient = ingredientFactory.getIngredient(ingredientName);
            ingredient.serve(order);
        }
        System.out.println("Order processed successfully.");
    }
}
