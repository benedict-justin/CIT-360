package cit360.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


public class ArrayListExample {
    public static void main(String[] args){
        String[] myfamily = {"Justin", "Connor", "Sharece", "Emma", "Morgan"};
        List<String> list1 = new ArrayList<String>();
        
        for(String x: myfamily)
            list1.add(x);
        
        String[] parents = {"Justin", "Sharece"};
        List<String> list2 = new ArrayList<String>();
        
        for(String y: parents)
            list2.add(y);
        
           System.out.println("Family Members - Boys/Girls:");
       for(int i = 0; i<list1.size(); i++) {
           System.out.printf("%s ", list1.get(i));
       }
       
           System.out.println("\nParents:");
       for(int i = 0; i<list2.size(); i++) {
           System.out.printf("%s ", list2.get(i));
       }
      
       editList (list1,list2);
       System.out.println("\nKids:");
       
       for(int i = 0; i<list1.size(); i++) {
           System.out.printf("%s ", list1.get(i));
       }
       
    }
    
    public static void editList(Collection<String> l1, Collection<String> l2){
        Iterator<String> it = l1.iterator();
        while(it.hasNext()) {
            if(l2.contains(it.next()))
                it.remove();
            
        }
    }
}