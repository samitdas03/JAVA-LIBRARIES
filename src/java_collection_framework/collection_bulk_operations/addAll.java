package java_collection_framework.collection_bulk_operations;

import java.util.*;

public class addAll {

    /**
     * boolean addAll(Collection<? extends E> c)
     * 
     * This method add all the items of collection c, in the collection on which the method is being called
     * 
     * and if the method calling collection is modified, it returns true, otherwise returns false
     * 
     * here E is the type of method calling collection, and type of parameter collection c should extend E, because we can assign child/deccendent
     * class object to its parent/base class object
    */




    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(10);
        list1.add(10);
        list1.add(20);
        list1.add(30);

        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(10);
        list2.add(20);
        list2.add(20);
        list2.add(50);
        list2.add(70);
        list2.add(70);

        System.out.println(list1.addAll(list2));
        System.out.println(list1);
    }
    
}
