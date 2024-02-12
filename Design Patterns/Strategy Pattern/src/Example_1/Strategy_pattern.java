package Example_1;

public class Strategy_pattern {
    public static void main(String[] args) {
        Context context = new Context(new Paypal_Payment());
        context.executeStrategy();
        context = new Context(new Master_Payment());
        context.executeStrategy();
        context = new Context(new Visa_Payment());
        context.executeStrategy();
    }
}
