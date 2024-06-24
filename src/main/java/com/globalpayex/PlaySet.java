package com.globalpayex;

import java.util.Arrays;
import java.util.HashSet;

public class PlaySet {
    public static void main(String[] args) {
        HashSet<String> uniqueNames=new HashSet<>();
        uniqueNames.add("pranjal");
        uniqueNames.add("nisha");
        uniqueNames.add("pranjal");
        System.out.println(uniqueNames);

        var list= Arrays.asList(10,5,6,3,4,4,5,3,2);
        HashSet<Integer> uniquelist=new HashSet<>(list);
        System.out.println(uniquelist);

        var divA=Arrays.asList(1,2,3);
        var divB=Arrays.asList(2,3,4);

        HashSet<Integer> s1=new HashSet<>(divA);
        HashSet<Integer> s2=new HashSet<>(divB);

        s1.retainAll(s2);
//        System.out.println(a);
        System.out.println(s1);

        HashSet<Integer> s3=new HashSet<>(divA);
        HashSet<Integer> s4=new HashSet<>(divB);

        s3.addAll(s4);
        System.out.println(s3);



    }
}
