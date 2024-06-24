package com.globalpayex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOddTest {

  @Test
    void  testMethod(){
      var num=9;
      var expected="odd";

      var actual=EvenOdd.method1(num);
      assertEquals(expected,actual);

  }

  @Test
  void testBoolean(){
//    var num=4;
    assertEquals(true,EvenOdd.method2(4));
  }

    private Object method(int num) {
        return null;
    }


}