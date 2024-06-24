package com.abc.salary;

@Deprecated
public class SalaryCalculator {
    public static double calculate(SalariedIndividual s1){
        int noOfDaysWorked=s1.getDaysWorkedInMonth();
        int costPerDay=s1.getCommercialPerDay();

        int totalCost=noOfDaysWorked*costPerDay;
        int totalCostAfterPt=totalCost-200;

        double tds=0.1*totalCostAfterPt;

        return totalCostAfterPt-tds;

    }

}
