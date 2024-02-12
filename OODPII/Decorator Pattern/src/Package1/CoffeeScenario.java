package Package1;
interface Coffee{
    double price();
}
class BlackCoffee implements Coffee{
    @Override
    public double price() {
        return 100;
    }
}
abstract class CoffeeDecorator implements Coffee{
    private Coffee coffee;
    public CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }
    public Coffee getCoffee() {
        return coffee;
    }
}
class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }
    @Override
    public double price() {
        return getCoffee().price()+25;
    }
}
class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }
    @Override
    public double price() {
        return getCoffee().price()+50;
    }
}
public class CoffeeScenario {
    public static void main(String[] args) {
        Coffee blackCoffee = new BlackCoffee();
        System.out.println("Normal Black Coffee Price: "+blackCoffee.price());

        blackCoffee = new SugarDecorator(blackCoffee);
        System.out.println("Black Coffee with Sugar: "+blackCoffee.price());

        blackCoffee = new MilkDecorator(blackCoffee);
        System.out.println("Black Coffee with Milk: "+blackCoffee.price());
    }
}
