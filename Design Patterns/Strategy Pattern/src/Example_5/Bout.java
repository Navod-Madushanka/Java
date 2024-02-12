package Example_5;

public class Bout implements Transpotation{
    @Override
    public void duration() {
        System.out.println("Bout can reduce Duration 10%");
    }

    @Override
    public void cost() {
        System.out.println("Price is Rs. 6000.00");
    }
}
