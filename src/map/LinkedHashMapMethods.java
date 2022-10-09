package map;
import java.util.*;

public class LinkedHashMapMethods {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> m = new LinkedHashMap<>();
        m.put(10, "GfG");
        m.put(20, "IDE");
        m.put(15, "COURSES");
        System.out.println(m);
        m.put(20, "Practice");
        System.out.println(m);

        m.remove(20);
        m.put(20, "JAVA");

        System.out.println(m);



        // CONSTRUCTORS
        // new LinkedHashMap<>(initial capacity, load factor, access order);

        
        
    }
    
}
