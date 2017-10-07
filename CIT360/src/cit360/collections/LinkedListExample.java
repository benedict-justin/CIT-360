package cit360.collections;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
	        
        String[] coinCurrency = {"penny", "nickel", "dime", "quarter"};
        List<String> list1 = new java.util.LinkedList<String>();
        for(String x : coinCurrency)
            list1.add(x);
        
        String[] billCurrency = {"one", "five", "ten", "twenty", "one-hundred"};
        List<String> list2 = new java.util.LinkedList<String>();
        for (String y : billCurrency)
            list2.add(y);
	        
        list1.addAll(list2);
        list2 = null;
	        
       System.out.println(list1);
	       
       removeItems(list1, 2, 5);
       System.out.println(list1);
    }
	    
    private static void removeItems(List<String> list, int from, int to){
        list.subList(from, to).clear();
    }
	    
}