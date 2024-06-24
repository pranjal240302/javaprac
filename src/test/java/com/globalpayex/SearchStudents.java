package com.globalpayex;

import com.globalpayex.college.Student;

import java.util.*;
import java.util.stream.Collectors;

public class SearchStudents {
    public static void main(String[] args) {
//        var students= Arrays.asList(
//                new Student("pranjal",'f',10,90),
//                new Student("vidhi",'f',11,60),
//                new Student("Nikhil",'m',12,70),
//                new Student("Tanvi",'f',13,50)
//        );

        //take roll no
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter roll no: ");
//        int r=sc.nextInt();

//        boolean isFound=false;
//        for(Student student:students) {
//            if(student.roll==r){
//                isFound=true;
//                System.out.println(student);
//                break;
//            }
//        }
//        if(!isFound){
//            System.out.println("not found");
//        }

//        if(students.contains(new Student("",'m',r,0))){
//            System.out.println("found");
//        }
//        else{
//            System.out.println("no found");
//        }

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter roll no: ");
        int r=sc.nextInt();

        HashMap<Integer,Student> map=new HashMap<>();
        map.put(10,new Student("pranjal",'f',10,90));
        map.put(11,new Student("vidhi",'f',11,60));
        map.put(12,new Student("vidhi",'f',11,60));

//        if(map.containsKey(10)){
//            System.out.println("student found");
//        }
//        else{
//            System.out.println("not found");
//        }

        Student student=map.get(r);
        if(student != null){
            System.out.println(student);
        }
        else{
            System.out.println("not found");
        }
    }


}
