package java_collection_framework.collection_bulk_operations;

import java.util.*;

public class retainAll {

    /** 
     * boolean retainAll(Collection<?> c)
     * 
     * This method retains all the items of method calling collection which are present on the argument collection c
     * 
     * and if the method calling collection is modified, it returns true, otherwise returns false
     * 
     * here wildcard has no condition as it uses equals() method to find if two items are equal
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
        list2.add(40);

        System.out.println(list1.retainAll(list2));
        System.out.println(list1);
    }
    
}
