package java_collection_framework.collection_bulk_operations;

import java.util.*;

public class containsAll {

    /* boolean containsAll(Collection<?> c)
     * 
     * it checks if all the items of collection c is present on the collection on which the method is called.
     * if present it returns true otherwise it returns false.
     * 
     * if there is multiple occurence of same item in collection c and only one occurence in method calling collection, 
     * or visevarsa it will return true 
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

        boolean result = list1.containsAll(list2);
        System.out.println(result);
    }

     
    
}
