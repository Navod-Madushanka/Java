package Example_5;

public class Car implements Transpotation{
    @Override
    public void duration() {
        System.out.println("Car can reduce Duration 90%");
    }

    @Override
    public void cost() {
        System.out.println("Price is Rs. 5000.00");
    }
}
