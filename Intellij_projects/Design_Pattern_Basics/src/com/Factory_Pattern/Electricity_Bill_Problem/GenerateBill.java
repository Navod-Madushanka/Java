package com.Factory_Pattern.Electricity_Bill_Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {
    public static void main(String[] args) throws IOException {
        GetPlanFactory getPlanFactory = new GetPlanFactory();

        System.out.println("Enter the Name of the plan for which the bill will be generated: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String planeName = br.readLine();
        System.out.println("Enter the Number of units for bill will be calculated: ");
        int unit = Integer.parseInt(br.readLine());

        Plan p = getPlanFactory.getPlan(planeName);

        System.out.println("Bill Amount for "+planeName+" of "+unit+" unit is");
        p.getRate();
        p.calculateBill(unit);
    }
}
