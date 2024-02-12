package Package2;
interface Coffee{
    String getDescription();
    double price();
}
class SimpleCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double price() {
        return 2.0;
    }
}
abstract class CoffeeDecorator implements Coffee{
    protected Coffee decoratedCoffee;
    public CoffeeDecorator(Coffee coffee){
        this.decoratedCoffee = coffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public double price() {
        return decoratedCoffee.price();
    }
}
class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", with Milk";
    }

    @Override
    public double price() {
        return super.price()+0.5;
    }
}
class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", with Sugar";
    }

    @Override
    public double price() {
        return super.price()+0.2;
    }
}

public class CoffeeScenario {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        simpleCoffee = new MilkDecorator(simpleCoffee);
        simpleCoffee = new SugarDecorator(simpleCoffee);
        System.out.println("Description: "+simpleCoffee.getDescription()+" Full Cost: "+simpleCoffee.price());
    }
}
