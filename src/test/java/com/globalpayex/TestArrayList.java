package com.globalpayex;

import com.globalpayex.college.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class TestArrayList {
    @Test
    void  testArrayList(){
        ArrayList<String> cars=new ArrayList<>();

        assertEquals(0,cars.size());

        cars.add("i10");
        cars.add("i20");
        assertEquals("i20",cars.get(1));
        cars.add(1,"i30");
        assertEquals("i20",cars.get(2));

        //update
        cars.set(0,"audi");
        assertEquals("audi",cars.get(0));

        //remove
        cars.remove(0);
    }

    @Test
    void testSorting(){
        var nos= Arrays.asList(10,4,5,3,4);
        Collections.sort(nos);
        assertEquals(3,nos.get(0));
        assertEquals(10,nos.get(nos.size()-1));
        System.out.println(nos.getClass());
        System.out.println(nos);
    }

    @Test
    void testSortingDesecnding(){
         // we can crete this
//        class MyComparator implements Comparator<Integer> {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2.compareTo(o1);
//            }
//        }


        //anonymous inner class
        var nos= Arrays.asList(10,4,5,3,4);  //3,4,4,5,10
        Collections.sort(nos,new MyComparator(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });


        //Lambda expression - java 8
        // functional programming
        Collections.sort(nos,(o1,o2) -> o2.compareTo(o1));

        assertEquals(10,nos.get(0));
        assertEquals(3,nos.get(nos.size()-1));
        System.out.println(nos.getClass());
        System.out.println(nos);
    }

    @Test
    void testEvenNosMoreThan2(){
        var nos= Arrays.asList(10,4,1,9,8,7);
//        ArrayList<Integer> newArr=new ArrayList<>();
//        nos.forEach(element->{
//              if(element%2==0 && element>2){
//               newArr.add(element);
//            }
//        });
//
//        System.out.println(newArr);
//        expected=Arrays.asList(10,4,8);
//        assertEquals(expected,newArr);


        //**********stram use************
        var expected=Arrays.asList(10,4,8);
        var n1=nos.stream()
                .filter(element -> element%2==0 && element>2)
                .collect(Collectors.toList());
        assertEquals(expected,n1);
    }

    @Test
    void testDeductingBy1(){
        var nos= Arrays.asList(10,4,1,9,8,7);
        var expected=Arrays.asList(9,3,0,8,7,6);

        var n1=nos.stream()
                .map(element->element-1)
                .collect(Collectors.toList());
        assertEquals(expected,n1);
    }

    @Test
    void filterPlusMap(){
        var nos= Arrays.asList(10,4,1,9,8,7);
        var expected=Arrays.asList(81,49);
        var n1=nos.stream()
                .filter(element -> element%2!=0 && element>1)
                .map(element->element*element)
                .collect(Collectors.toList());


//        var n2=n1.stream()
//                .map(element->element*element)
//                .collect(Collectors.toList());

        assertEquals(expected,n1);
    }

    @Test
    void testStudents1(){
        var students=Arrays.asList(

                new Student("pranjal",'f',10,90),
                new Student("vidhi",'f',11,90),
                new Student("Aarti",'m',12,90),
                new Student("Tanvi",'f',13,90)
        );
        var expected="pranjal,vidhi,Tanvi";
        var n1=students.stream()
                .filter(element -> element.getGender()=='f')
                .map(element->element.getName())
                .collect(Collectors.joining(","));

        assertEquals(expected,n1);

       }

    @Test
    void testStudents2(){
        var students=Arrays.asList(
                new Student("pranjal",'f',10,90),
                new Student("vidhi",'f',11,60),
                new Student("Aarti",'m',12,70),
                new Student("Tanvi",'f',13,50)
        );
        var expected=Arrays.asList(
                new Student("pranjal",'f',10,90),
                new Student("vidhi",'f',11,60),
                new Student("Tanvi",'f',13,50)
        );

        var actual=students.stream()
                .filter(element -> element.getGender()=='f')
                .sorted(Comparator.comparingInt(Student::getMarks).reversed())
                .collect(Collectors.toList());

        assertEquals(expected.get(0).getMarks(),actual.get(0).marks);
    }



}
