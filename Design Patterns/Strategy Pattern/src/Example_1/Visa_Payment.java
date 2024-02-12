package Example_1;

public class Visa_Payment implements Strategy{
    @Override
    public void doPayment() {
        System.out.println("Visa Payment Done");
    }
}
