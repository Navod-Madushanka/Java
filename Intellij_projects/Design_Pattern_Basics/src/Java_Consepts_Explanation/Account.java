package Java_Consepts_Explanation;

public class Account {
    private float balance;

    public void deposit(float amount){
        if (amount>0){
            balance = balance + amount;
        }
    }

    public void withdrow(float amout){
        if (amout>0){
            balance = balance-amout;
        }
    }
    public void setBalance(float balance){
        if (balance>0){
            this.balance = balance;
        }
    }

    public float getBalance(){
        return balance;
    }
}
