package com.Abstract_Factory_Pattern.Bank_Problem;

public class FactoryCreater {
    public static AdstractFactory getFactory(String choise){
        if(choise.equalsIgnoreCase("Bank")){
            return new BankFactory();
        } else if (choise.equalsIgnoreCase("Loan")) {
            return new LoanFactory();
        }
        return null;
    }
}
