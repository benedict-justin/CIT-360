/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.junit;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Justin
 */
public class GradesTest {
    
    public GradesTest() {
    }

    /**
     * Test of print method, of class Grades.
     */
    @Test
    public void testPrint() {
        System.out.println("Grades");
        
        /************************
        * Test Case #1
        ***********************/
        System.out.println("\tTest Case #1");
        
        //Input Values
        int grade = 89;
        
        //Create instatnce of Grades class
        Grades instance = new Grades();
        
        //Expected output return value
        String expResult = "Your grade = A";
        
        //Call function to run test
        String result = instance.print(grade);
        
        //Actual return - compare to expected return
        assertEquals(expResult, result);
    }    
    
    static {
        /************************
        * Test Case #2
        ***********************/
        System.out.println("\tTest Case #2");
    
        
       //Input Values
        int grade = 85;
        
        //Create instatnce of Grades class
        Grades instance = new Grades();
        
        //Expected output return value
        String expResult = "Your grade = B";
        
        //Call function to run test
        String result = instance.print(grade);
        
        //Actual return - compare to expected return
        assertEquals(expResult, result);
    }
        
    static {
        /************************
        * Test Case #3
        ***********************/
        System.out.println("\tTest Case #3");
        
        //Input Values
        int grade = 75;
        
        //Create instatnce of Grades class
        Grades instance = new Grades();
        
        //Expected output return value
        String expResult = "Your grade = C";
        
        //Call function to run test
        String result = instance.print(grade);
        
        //Actual return - compare to expected return
        assertEquals(expResult, result);
    }
    
}
