package com.Abstract_Factory_Pattern.Bank_Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbstractFactoryPatternExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Bank from where you want to take loan amount: ");
        String bankName = br.readLine();
        System.out.println("\n");
        System.out.println("Enter the type of the loan e.g. home loan or business loan or education loan: ");
        String loanName = br.readLine();

        AdstractFactory bankFactory = FactoryCreater.getFactory("Bank");
        Bank b = bankFactory.getBack(bankName);
        System.out.println("\n");
        System.out.println("Enter the interest rate for "+b.getBankName()+": ");

        double rate =Double.parseDouble(br.readLine());
        System.out.println("\n");
        System.out.println("Enter the loan amount you want to take: ");

        double loanAmount = Double.parseDouble(br.readLine());
        System.out.println("\n");
        System.out.println("Enter the number of years to pay your entire loan amount: ");
        int years = Integer.parseInt(br.readLine());
        System.out.println("\n");
        System.out.println("you are taking the loan from " + b.getBankName());

        AdstractFactory loanFactory = FactoryCreater.getFactory("Loan");
        Loan l = loanFactory.getLoan(loanName);
        l.getInterestRate(rate);
        l.calculateLoanPayment(loanAmount,years);


    }
}
