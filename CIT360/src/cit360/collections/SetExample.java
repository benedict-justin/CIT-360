/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Justin
 */
public class SetExample {
    public static void main(String[] args) {

        int count[] = {32, 7, 10, 9, 37};
        Set<Integer> set = new HashSet<Integer>();
        try{
            for(int i = 0; i < 5; i++){
                set.add(count[i]);
            }
            System.out.println(set);

            TreeSet sortedSet = new TreeSet<Integer>(set);
            System.out.println("Sorted list:");
            System.out.println(sortedSet);

            System.out.println("The first integer is: "+ (Integer)sortedSet.first());

            System.out.println("The last integer is: "+ (Integer)sortedSet.last());
            
        }
        catch(Exception e){}
    }

}