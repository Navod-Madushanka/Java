package com.Abstract_Factory_Pattern.Bank_Problem;

abstract class AdstractFactory {
    public abstract Bank getBack(String bank);
    public abstract Loan getLoan(String loan);
}
