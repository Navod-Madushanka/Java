package Example_1;

public class Paypal_Payment implements Strategy{
    @Override
    public void doPayment() {
        System.out.println("Paypal Payment Done");
    }
}
