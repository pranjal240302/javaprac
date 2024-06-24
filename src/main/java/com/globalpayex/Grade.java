package com.globalpayex;

public class Grade {
    public static char check(int n){
      if(n>=70 && n<=100){
          return 'A';
      }
      else if(n>=60 && n<70){
          return 'B';

      }
      else if(n>=40 && n<60){
          return 'C';
      }
      else if(n<40 && n>0){
          return 'F';
      }
      else{
          return 'I';
      }
    }
}
