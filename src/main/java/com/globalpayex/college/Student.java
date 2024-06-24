package com.globalpayex.college;

import java.util.Objects;

public class Student extends NewUser{
 //object attributes or instance variable
//    String name;
//    private char gender;

    public int roll;
    public int marks;
    //class attributes
    static int count=0;

    public int getMarks() {
        return marks;
    }

    public Student(){
        this("NA",'m',-1,0);
    }

   public Student(String name, char gender, int roll, int marks) {
      //this---- current object
       super(name, gender);
       Student.count++;
       this.roll=roll;
       this.marks=marks;
   }

    public static Student createInstance(String name, char gender, int roll, int marks) {
       var s=new Student(name,gender,roll,marks);
       return s;

    }

    @Override
    public String getDetails() {
        String part1=super.getDetails();
        return String.format(
                "%s/nRoll no: %s/nMarks: %s",
                part1,
                this.roll,
                this.marks
        );
    }


    //     public String getDetails() {
////       //implicit parameter- this- s1,s2,s3,... current objject
//////      return "Name:"+this.name+"\n"+"Gender:"+this.gender+"\n"+"Roll no:"+this.roll+"\n"+
//////              "Marks:"+this.marks;
////
//        return String.format(
//                "Name: %s/nGender: %s/nRoll no: %s/nMarks: %s",
//                this.name,
//                this.gender,
//                this.roll,
//                this.marks
//
//        );
//    }

   public char check(){
       int n=marks;
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

    public void setGender(char gender) {
        if(gender=='m' || gender=='f'){
            this.gender = gender;
        }

    }

    public char getGender() {
       return this.gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return roll == student.roll;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(roll);
    }
}
