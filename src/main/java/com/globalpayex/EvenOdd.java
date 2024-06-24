package com.globalpayex;

public class EvenOdd {

    public static String method1(int num) {
        if(num%2==0){
            return "even";
        }
        else{
            return "odd";
        }

    }


    public static boolean method2(int n) {
        return n%2==0;
    }
}
