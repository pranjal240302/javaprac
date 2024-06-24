package com.globalpayex;

public class StudentOps {


    public static String details(String name, char gender, int roll, int n) {
        var Grade='U';
        if(n>=70 && n<=100){
            Grade='A';
        }
        else if(n>=60 && n<70){
            Grade= 'B';

        }
        else if(n>=40 && n<60){
            Grade= 'C';
        }
        else if(n<40 && n>0){
            Grade= 'F';
        }
        else{
            Grade= 'I';
        }
        return "Name:"+name+"\n"+"Gender:"+gender+"\n"+"Roll no:"+roll+"\n"+"Marks:"+n;



    }
}
