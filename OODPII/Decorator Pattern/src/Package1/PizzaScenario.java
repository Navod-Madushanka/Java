package Package1;
abstract class Pizza{
    public abstract double price();
    public abstract String description();
}
class ChickenPizza extends Pizza{
    @Override
    public double price() {
        return 850;
    }

    @Override
    public String description() {
        return "This is a Chicken Pizza ";
    }
}
class VeggiePizza extends Pizza{
    @Override
    public double price() {
        return 650;
    }

    @Override
    public String description() {
        return "This is a Veggie Pizza ";
    }
}
class FishPizza extends Pizza{
    @Override
    public double price() {
        return 720;
    }

    @Override
    public String description() {
        return "This is a Fish Pizza ";
    }
}
abstract class Decorator extends Pizza{
    Pizza pizza;
    public Decorator(Pizza pizza){
        this.pizza = pizza;
    }
}
class BBQ_Source extends Decorator{
    public BBQ_Source(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double price() {
        return pizza.price()+50;
    }

    @Override
    public String description() {
        return pizza.description()+"with BBQ Source ";
    }
}class Swiss_Cheese extends Decorator{
    public Swiss_Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double price() {
        return pizza.price()+80;
    }

    @Override
    public String description() {
        return pizza.description()+"with Swiss_Cheese ";
    }
}
class Fried_Onions extends Decorator{
    public Fried_Onions(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double price() {
        return pizza.price()+20;
    }

    @Override
    public String description() {
        return pizza.description()+"with Fried_Onions ";
    }
}class Mayonnaise extends Decorator{
    public Mayonnaise(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double price() {
        return pizza.price()+35;
    }

    @Override
    public String description() {
        return pizza.description()+"with Mayonnaise ";
    }
}

public class PizzaScenario {
    public static void main(String[] args) {
        Pizza fishPizza = new FishPizza();
        fishPizza = new BBQ_Source(fishPizza);
        fishPizza = new Swiss_Cheese(fishPizza);
        System.out.println(fishPizza.price());
        System.out.println(fishPizza.description());

        Pizza chickenPizza = new ChickenPizza();
        chickenPizza = new BBQ_Source(chickenPizza);
        chickenPizza = new Fried_Onions(chickenPizza);
        chickenPizza = new Mayonnaise(chickenPizza);
        System.out.println(chickenPizza.price());
        System.out.println(chickenPizza.description());

        Pizza VeggiePizza = new VeggiePizza();
        VeggiePizza = new Swiss_Cheese(VeggiePizza);
        VeggiePizza = new Fried_Onions(VeggiePizza);
        System.out.println(VeggiePizza.price());
        System.out.println(VeggiePizza.description());
    }
}
