package com.Factory_Pattern.Electricity_Bill_Problem;

public class GetPlanFactory {
    public Plan getPlan(String plantype){
        if (plantype == null){
            return null;
        }

        if (plantype.equalsIgnoreCase("DOMESTICPLAN")){
            return new DomesticPlan();
        } else if (plantype.equalsIgnoreCase("COMMERCIALPLAN")) {
            return new CommercialPlan();
        } else if (plantype.equalsIgnoreCase("INSTITUTIONALPLAN")) {
            return new InstitutionalPlan();
        }
        return null;
    }
}
