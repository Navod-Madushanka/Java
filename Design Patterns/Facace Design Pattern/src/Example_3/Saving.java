package Example_3;

public class Saving implements Account{
    @Override
    public void transferring() {
        System.out.println("Transferred Money Added to the account");
    }

    @Override
    public void payBill() {
        System.out.println("Bill Payment added to the account");
    }

    @Override
    public void checkBalance() {
        System.out.println("your Balance has been checked");
    }
}
