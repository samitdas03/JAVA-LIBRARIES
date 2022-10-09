package set;
import java.util.*;

public class HashSetMethods {

    public static void main(String[] args) {
        
        HashSet<String> h = new HashSet<String>();
        h.add("gfg");
        h.add("courses");
        h.add("ide");

        System.out.println(h);
        System.out.println(h.contains("ide"));

        Iterator<String> it = h.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        System.out.println(h.size());
        h.remove("ide");
        System.out.println(h.size());

        for(String s: h) {
            System.out.print(s + " ");
        }

        System.out.println(h.isEmpty());

    }
    
}
