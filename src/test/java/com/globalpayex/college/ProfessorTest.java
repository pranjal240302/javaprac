package com.globalpayex.college;
import com.abc.salary.SalariedIndividual;
import com.abc.salary.SalaryCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {
   @Test
    void testCount(){
       assertEquals(0,Professor.count);
       String[] subjects={"maths"};
       var p1 = new Professor("pranjal",'f',subjects,15,5000);
       var p2 = new Professor("nisha",'f',subjects,17,5000);
       assertEquals(2,Professor.count);
   }


   @Test
   void testProfessorDetails(){
      String[] subjects={"maths"};
      var p1 = new Professor("pranjal",'f',subjects,15,5000);
      String expected="Name: pranjal/nGender: f";

      String actual=p1.getDetails();
      assertEquals(expected,actual);

   }

   @Test
   void testSalary(){
      String[] subjects={"maths"};
      var p1 = new Professor("pranjal",'f',subjects,15,5000);

      var expected=67320;
      var actual= SalaryCalculator.calculate(p1);
      assertEquals(expected,actual);


   }

   @Test
   void checkDefaultMethod(){
      String[] subjects={"maths"};
      var p1 = new Professor("pranjal",'f',subjects,15,5000);
      var expected=67320;
      var actual= p1.calculate();
      assertEquals(expected,actual);

   }


}