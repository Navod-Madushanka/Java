package com.Abstract_Factory_Pattern.Bank_Problem;

public class LoanFactory extends AdstractFactory{
    @Override
    public Bank getBack(String bank) {
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        if (loan == null){
            return null;
        }
        if (loan.equalsIgnoreCase("Home")){
            return new HomeLoan();
        } else if (loan.equalsIgnoreCase("Business")) {
            return new BusinessLoan();
        } else if (loan.equalsIgnoreCase("Education")) {
            return new EducationLoan();
        }
        return null;
    }
}
