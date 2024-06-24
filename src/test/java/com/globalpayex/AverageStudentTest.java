package com.globalpayex;

import com.globalpayex.college.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AverageStudentTest {

    @Test
    void testcalculateAverage() {

        ArrayList<Student> students=new ArrayList<>();

        students.add(new Student("Rekha",'f',10,90));
        students.add(new Student("pranjal",'f',10,70));
        students.add(new Student("nikita",'f',10,60));
        students.add(new Student("nisha",'f',10,50));



        var expected=67.5;
        var actual=AverageStudent.calculateAverage(students);
    }
}