/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.junit;

/**
 *
 * @author Justin
 */
public class Grades {
    public String print(int grade)
    {
        if(grade > 89.9)
            return "Your grade = A";
        else if(grade > 79.9)
            return "Your grade = B";
        else if(grade >69.9)
            return "Your grade = C";
        else
            return "To low to pass this course";
    }
    
}    

