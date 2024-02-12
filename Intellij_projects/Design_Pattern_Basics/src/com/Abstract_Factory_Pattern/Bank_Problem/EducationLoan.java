package com.Abstract_Factory_Pattern.Bank_Problem;

public class EducationLoan extends Loan{
    @Override
    void getInterestRate(double r) {
        rate = r;
    }
}
