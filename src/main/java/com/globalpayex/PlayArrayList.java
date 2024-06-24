package com.globalpayex;

import java.util.Arrays;

public class PlayArrayList {

    public static void main(String[] args) {
        var nos= Arrays.asList(10,4,1,9,8,7);
//        for(int num:nos){
//            if(num%2==0 && num>4){
//                System.out.println(num);
//            }
//        }


//          nos.forEach(element->{
//              if(element%2==0 && element>4){
//                System.out.println(element);
//            }
//          });

        var str= Arrays.asList("pranjal","nisha","vidhi","rahul","nishigandha");
        str.forEach(element->{
            if(element.length()>5)
                System.out.println(element.toUpperCase());
            else
                System.out.println(element.toLowerCase());

        });
    }
    }
