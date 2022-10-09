package java_collection_framework.collection_bulk_operations;
import java.util.*;

public class removeIf {

    /** 
     * boolean removeIf(Predicate<? super E> filter)
     * 
     * This method removes all the items of method calling collection which satisfies the given predicate
     * 
     * Predicate is a functional interface (i.e has only one abstract method and zero or more default methods)
    */



    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(15);
        list.add(30);
        list.add(19);

        boolean result = list.removeIf((n) -> (n%2 == 0));
        System.out.println(result);
        System.out.println(list);
    }
    
}
