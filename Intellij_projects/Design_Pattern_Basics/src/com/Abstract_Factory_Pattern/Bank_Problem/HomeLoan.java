package com.Abstract_Factory_Pattern.Bank_Problem;

public class HomeLoan extends Loan{
    @Override
    public void getInterestRate(double r) {
        rate = r;
    }
}
