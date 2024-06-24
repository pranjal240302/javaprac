package com.globalpayex;

import com.globalpayex.college.Student;

import java.util.Random;

public class UniversalSelection {

    public static <T> T surpriseMe(T[] elements){
        Random random=new Random();
        int  n=random.nextInt(elements.length);
        return elements[n];
    }

    public static void main(String[] args) {
        String[] movies={"DDLJ","Pk","3 idiots"};
        String movie=surpriseMe(movies);
        System.out.println(movie);

        Student[] students={
                new Student("pranjal",'f',10,90),
                new Student("vidhi",'f',11,90),
                new Student("Aarti",'f',12,90),
                new Student("Tanvi",'f',13,90)
        };
        Student monitor=surpriseMe(students);
        System.out.println(monitor);


    }
}
