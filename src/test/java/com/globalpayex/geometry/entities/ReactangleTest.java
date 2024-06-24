package com.globalpayex.geometry.entities;

import com.abc.geometry.ShapStatstics;
import com.abc.geometry.Shape;
import com.globalpayex.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReactangleTest {

    @Test
    void testPerimeter() {

        var r1=new Reactangle(4,2);
        var expected=12;
        //test assertions
        var actual=r1.perimeter();
        assertEquals(expected,actual);
    }

    @Test
    void testArea() {
        var r1=new Reactangle(4,2);
        var expected=8;

        var actual=r1.area();
        assertEquals(expected,actual);
    }

    @Test
    void testShapeStatstics(){
        var r1=new Reactangle(4,2);
        String expected="***\nArea is 8\nPerimeter is 12\n***";
        String actual=ShapStatstics.calculate(r1);

        assertEquals(expected,actual);
    }

    @Test
    void testShapeStatsticsSquare(){
        var s1=new Square(4);
        String expected="***\nArea is 16\nPerimeter is 16\n***";
        String actual=ShapStatstics.calculate(s1);

        assertEquals(expected,actual);

//        var s=new Shape(); //cannot create object of abstract class
    }





}