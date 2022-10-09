package set;
import java.util.*;

public class TreeSetMethods {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<String>();
        ts.add("gfg");
        ts.add("courses");
        ts.add("ide");

        System.out.println(ts);

        System.out.println(ts.contains("ide"));
        System.out.println(ts.size());
        System.out.println(ts.isEmpty());

        Iterator<String> it = ts.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();


        TreeSet<Integer> ts2 = new TreeSet<Integer>();
        ts2.add(10);
        ts2.add(5);
        ts2.add(2);
        ts2.add(15);
        ts2.add(6);

        ts2.remove(5);

        for(Integer i: ts2) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println(ts2.lower(6));                 // highest number lower than 6, if not present return null
        System.out.println(ts2.higher(6));                // lowest number higher than 6 ......
        System.out.println(ts2.floor(6));                 // highest number lower or equal to 6, if not present return null
        System.out.println(ts2.ceiling(6));               // lowest number higher or equal to 6 ......

        
    }
    
}
