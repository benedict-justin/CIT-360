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
public class MathTest {
    
    public MathTest() {
    }

    /**
     * Test of result method, of class Math.
     */
    @Test
    public void testResult() {
        System.out.println("result");
        int input = 19;
        boolean expResult = true;
        boolean result = Math.result(input);
        assertEquals(expResult, result);
    }
    
}
