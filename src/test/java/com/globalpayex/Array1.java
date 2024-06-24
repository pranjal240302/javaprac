package com.globalpayex;

import  java.util.*;

public class Array1 {


    public static double average(int[] arr) {
        double sum=0;
        for(int i:arr){
            sum=sum+i;
        }
        double res=sum/arr.length;
        return res;

    }

    public static int maxFind(int[] arr) {
        int max=arr[0];
        for(int i:arr){
            max=Math.max(max,i);
        }
        return max;

    }

    public static int nextGenSum(int... elements) {
        int sum=0;
        for(int i:elements){
            sum+=i;
        }
        return sum;

    }
}
