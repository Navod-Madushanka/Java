package Example_1;

public class Master_Payment implements Strategy{
    @Override
    public void doPayment() {
        System.out.println("Master Payment Done");
    }
}
