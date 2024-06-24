package com.globalpayex;

import com.globalpayex.college.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class myArrayTest {

    @Test
    void  testMyArray () {
        Integer[] elements={3,4,5,6};
        var ma=new myArray<Integer> (elements);

        assertEquals(3,ma.get(1));
        ma.set(3,4);
        assertEquals(4,ma.get(3));

    }

    @Test
    void testMyArrayStudent(){
        Student[] students={
                new Student("pranjal",'f',10,90),
                new Student("vidhi",'f',11,90),
                new Student("Aarti",'f',12,90),
                new Student("Tanvi",'f',13,90)
        };

        // var ma=new MyArray<Student>(students);  //it can also use
        myArray<Student> ma=new myArray<>(students);

        assertEquals("pranjal",ma.get(1).getName());
        ma.set(2,new Student("Rekha",'f',10,90));
        assertEquals("Rekha",ma.get(2).getName());

    }


}