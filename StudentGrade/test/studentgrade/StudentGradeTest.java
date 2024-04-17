/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package studentgrade;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Windows.10
 */
public class StudentGradeTest {
    
    public StudentGradeTest() {
    }
    
    
    /**
     this code is to write test cases for the different marks and their correspond result
     **/
       @Test
        public void test100() {
            //test for mark==100
            //A => will pass
            //B => will fail
            //F => will fail
        System.out.println("getGrade 100 A");
        int mark = 100;
        String expResult = "A";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
        System.out.println("getGrade 100 B");
        mark = 100;
        expResult = "B";
        result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
        System.out.println("getGrade 100 F");
        mark = 100;
        expResult = "F";
        result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }
        //test for mark==90
            //A => will pass
            
    @Test
    public void test90A() {
        
        System.out.println("getGrade 90 A");
        int mark = 90;
        String expResult = "A";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
        
        System.out.println("getGrade 90 B");
        expResult = "B";
        result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
        
        System.out.println("getGrade 90 F");
        expResult = "F";
        result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }
    //B => will fail
    @Test
    public void test90B() {
        
        System.out.println("getGrade 90 B");
        int mark = 90;
        String expResult = "B";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
        
    }
    //F => will fail    
    @Test
    public void test90F() {
        
        System.out.println("getGrade 90 F");
        int mark = 90;
        String expResult = "F";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
        
    }
            //test for mark==80
            //A => will fail
    @Test
    public void test80A() {
        
        System.out.println("getGrade 80 A");
        int mark = 80;
        String expResult = "A";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);           
    }
             //B => will pass
    @Test
    public void test80B() {
        
        System.out.println("getGrade 80 B");
        int mark = 80;
        String expResult = "B";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);           
    }
            //F => will fail
    @Test
    public void test80F() {
        
        System.out.println("getGrade 80 F");
        int mark = 80;
        String expResult = "F";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);           
    }
    //test for mark<80 
            //A => will fail
    @Test
    public void test70A() {        
        System.out.println("getGrade 70 A");
        int mark = 70;
        String expResult = "A";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }
             //B => will fail
    @Test
    public void test70B() {        
        System.out.println("getGrade 70 B");
        int mark = 70;
        String expResult = "B";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }
            //F => will pass
    @Test
    public void test70F() {        
        System.out.println("getGrade 70 F");
        int mark = 70;
        String expResult = "F";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }
            //test for mark  > 100
            //A => will fail
            
    @Test
    public void test120A() {

        System.out.println("getGrade 120 A");
        int mark = 120;
        String expResult = "A";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
               
    }
    //B => will fail
    @Test
    public void test120B() {

        System.out.println("getGrade 120 B");
        int mark = 120;
        String expResult = "B";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
               
    }
    //F => will pass
    @Test
    public void test120F() {
        System.out.println("getGrade 120 F");
        int mark = 120;
        String expResult = "F";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
               
    }

}

