package java_collection_framework.collection_iterating;
import java.util.*;

public class ForEachMethod {

    /**
     * void forEach(Consumer<? super T> action)
     * 
     * Consumer is a functional interface (i.e only one abstract method and zero or more default method)
     * 
     * The type of consumer object action should be parent or same type of method calling collection
     * as every collection element will be assign to action. And only child class object can be assign 
     * to parent class object.
     * 
     * 
    */




    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(10, 20, 40, 5);
        al.forEach(x -> System.out.println(x));
    }
    
}
