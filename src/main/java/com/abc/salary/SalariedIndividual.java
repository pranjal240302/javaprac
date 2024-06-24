package com.abc.salary;
// java 8 and above it also can have non abstract classes its is called default methods


public interface  SalariedIndividual {
     int getDaysWorkedInMonth() ;

     int getCommercialPerDay() ;

     //default method
     default double calculate(){
          int noOfDaysWorked=this.getDaysWorkedInMonth();
          int costPerDay=this.getCommercialPerDay();

          int totalCost=noOfDaysWorked*costPerDay;
          int totalCostAfterPt=totalCost-200;

          double tds=0.1*totalCostAfterPt;

          return totalCostAfterPt-tds;

     }
}
