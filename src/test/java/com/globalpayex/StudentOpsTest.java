package com.globalpayex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentOpsTest {
    @Test
    void details(){
        var name="pranjal";
        var gender='f';
        var roll=10;
        var marks=70;

        var expected=
                "Name:pranjal\nGender:f\nRoll no:10\nMarks:70";

        var actual=StudentOps.details(name,gender,roll,marks);
        assertEquals(expected,actual);

    }


}