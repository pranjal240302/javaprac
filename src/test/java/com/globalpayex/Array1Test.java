package com.globalpayex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array1Test {

    @Test
    void testAverage(){
        int[] arr={2,3,4,5};
        var expected=3.5;
        var actual=Array1.average(arr);
        assertEquals(expected,actual);

    }

    @Test
    void testmax(){
        int[] arr={2,3,4,5};
        var expected=5;
        var actual=Array1.maxFind(arr);
        assertEquals(expected,actual);

    }

    @Test
    void testnextGenSum(){
        var actual=Array1.nextGenSum(5,2,3,4);
        assertEquals(14,actual);

        actual=Array1.nextGenSum(5,2);
        assertEquals(7,actual);

        actual=Array1.nextGenSum(5,2,2);
        assertEquals(9,actual);

    }


}