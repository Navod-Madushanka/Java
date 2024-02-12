package Example_3;

public class Checking implements Account{
    @Override
    public void transferring() {
        System.out.println("Transferred Money Checked ");
    }

    @Override
    public void payBill() {
        System.out.println("Bills were Checked ");
    }

    @Override
    public void checkBalance() {
        System.out.println("Money Balance Checked ");
    }
}
