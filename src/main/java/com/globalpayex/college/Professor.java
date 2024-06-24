package com.globalpayex.college;

import com.abc.salary.SalariedIndividual;

public class Professor extends NewUser implements SalariedIndividual {

    private String[] subjects;
    private int noOfDaysWorked;
    private int costPerDay;
    static int count=0;

    public Professor(String name, char gender, String[] subjects,int noOfDaysWorked,int costPerDay) {
        super(name, gender);
        Professor.count++;
        this.subjects = subjects;
        this.noOfDaysWorked=noOfDaysWorked;
        this.costPerDay=costPerDay;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    @Override
    public int getDaysWorkedInMonth() {
        return this.noOfDaysWorked;
    }

    @Override
    public int getCommercialPerDay() {
        return this.costPerDay;
    }
}
