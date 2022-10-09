package java_collection_framework.collection_iterating;
import java.util.*;

public class ForEachLoop {

    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(10, 20, 5, 30, 40);
        for(Integer x: al) {
            System.out.println(x);
        }
    }
    
}
