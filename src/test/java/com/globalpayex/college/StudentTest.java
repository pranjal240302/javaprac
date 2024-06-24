package com.globalpayex.college;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @BeforeEach
    void init(){
        Student.count=0;
    }

    @Test
    void testObjectCreation() {
        assertEquals(0,Student.count);
        var s1 = new Student();
        var s2 = new Student();

        assertTrue(s1 != s2);

        assertNotNull(s1.name);
        assertNotNull(s2.name);
        assertEquals(-1, s1.roll);
        assertEquals(-1, s2.roll);

        assertEquals(2,Student.count);
    }

    @Test
    void testGetDetails() {
          var s1=new Student("pranjal",  'f',10,70);
//        s1.name="pranjal";
//        s1.roll=10;
//        s1.gender='f';
//        s1.marks=70;

        String expected="Name: pranjal/nGender: f/nRoll no: 10/nMarks: 70";

        String actual=s1.getDetails();
        assertEquals(expected,actual);

        System.out.println(s1);
    }

       @Test
       void checkgrade(){
        var s1=new Student();
        s1.marks=70;
        var expected='A';
        var actual=s1.check();
        assertEquals(expected,actual);

       }

       @Test
       void testNewWayOfStudentCreation(){
        var s1=Student.createInstance("pranjal",  'f',10,70);
           String expected="Name: pranjal/nGender: f/nRoll no: 10/nMarks: 70";
           String actual=s1.getDetails();
        assertEquals(expected,actual);
       }


       @Test
       void testValidGender(){
        var s=new Student();
//        s.gender='x';  //it is private
//           assertNotEquals('x',s.gender);
           s.setGender('x');
           assertNotEquals('x',s.getGender());

           s.setGender('f');
           assertEquals('f',s.getGender());

           var s1=new Student("pranjal",  'x',10,70);
           assertNotEquals('x',s1.getGender());


       }
    }


