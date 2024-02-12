package com.Abstract_Factory_Pattern.Bank_Problem;

public class BankFactory extends AdstractFactory{
    @Override
    public Bank getBack(String bank) {
        if (bank == null){
            return null;
        }
        if (bank.equalsIgnoreCase("HDFC")){
            return new HDFC();
        } else if (bank.equalsIgnoreCase("ICICI")) {
            return new ICICI();
        } else if (bank.equalsIgnoreCase("SBI")) {
            return new SBI();
        }
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        return null;
    }
}
