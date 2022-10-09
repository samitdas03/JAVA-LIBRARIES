package java_collection_framework.collection_iterating;
import java.util.*;

public class Stream {

    /** 
     * 
    */
    




    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(10, 15, 7, 20, 40);
        
        al.stream()
        .forEach(x -> System.out.print(x + " "));
        
        System.out.println();

        al.stream()
        .filter(x -> x > 10)
        .filter(x -> x % 2 == 0)
        .forEach(x -> System.out.print(x + " "));


    }

}
