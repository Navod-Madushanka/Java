package p1;

public class Account {
    private String accountNumber;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance>0){

        }
        this.balance = balance;
    }

    public void withdraw(double amount)throws Exception{
        if(amount<balance){
            this.balance -= amount;
        }else {
            throw new InsufficientFund("Insufficient fund");
        }
    }

    @Override
    public String toString() {
        return "A/C No: "+this.accountNumber+" Balance: "+this.balance;
    }
}
