package com.globalpayex;

import com.globalpayex.college.Student;
import java.util.ArrayList;

public class AverageStudent {

    public static double calculateAverage(ArrayList<Student> students){
         int sum=0;
         for(Student student:students){
             sum += student.getMarks();
         }
         return sum/students.size();
    }
}
