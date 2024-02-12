package Example_5;

public class Train implements Transpotation{
    @Override
    public void duration() {
        System.out.println("Train can reduce Duration 60%");
    }

    @Override
    public void cost() {
        System.out.println("Price is Rs. 1500.00");
    }
}
