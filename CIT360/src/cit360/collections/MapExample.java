package cit360.collections;

import java.util.*;

public class MapExample {

    public static void main(String[]args) {
        HashMap m1 = new HashMap();
        m1.put("Justin", "37");
        m1.put("Sharece", "32");
        m1.put("Emma", "10");
        m1.put("Connor", "9");
        
        System.out.println();
        System.out.println("Map Elements: ");
        System.out.println("\t" + m1);
        
        System.out.println("How old is Sharece?");
        System.out.println(m1.get("Sharece"));
        
    }
    
}
