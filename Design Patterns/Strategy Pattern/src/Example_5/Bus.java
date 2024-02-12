package Example_5;

public class Bus implements Transpotation{
    @Override
    public void duration() {
        System.out.println("Bus can reduce Duration 30%");
    }

    @Override
    public void cost() {
        System.out.println("Price is Rs. 1000.00");
    }
}
