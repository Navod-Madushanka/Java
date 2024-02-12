package Package1;

abstract class IceCream{
    public abstract double getPrice();
}
class VanillaIceCream extends IceCream{
    @Override
    public double getPrice() {
        return 100;
    }
}
abstract class IceCreamDecorator extends IceCream{
    public IceCream iceCream;
    public IceCreamDecorator(IceCream iceCream){
        this.iceCream = iceCream;
    }
}
class StrawberrySource extends IceCreamDecorator{
    public StrawberrySource(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double getPrice() {
        return iceCream.getPrice()+25;
    }
}

public class Test {
    public static void main(String[] args) {
        IceCream iceCream1 = new VanillaIceCream();
        System.out.println(iceCream1.getPrice());

        IceCream iceCream2 = new VanillaIceCream();
        iceCream2 = new StrawberrySource(iceCream2);
        iceCream2 = new StrawberrySource(iceCream2);
        System.out.println(iceCream2.getPrice());
    }
}
