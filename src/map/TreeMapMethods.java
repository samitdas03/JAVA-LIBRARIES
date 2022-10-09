package map;
import java.util.*;

public class TreeMapMethods {

    public static void main(String[] args) {
        
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(10, "GfG");
        tm.put(15, "IDE");
        tm.put(5, "Courses");

        System.out.println(tm);
        System.out.println(tm.containsKey(10));
        System.out.println(tm.firstEntry());
        System.out.println(tm.lastEntry());

        for(Map.Entry<Integer, String> e: tm.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        System.out.println(tm.higherKey(10));
        System.out.println(tm.lowerKey(10));
        System.out.println(tm.floorKey(10));
        System.out.println(tm.ceilingKey(10));

        System.out.println(tm.higherEntry(10).getValue());
        System.out.println(tm.lowerEntry(10).getValue());
        System.out.println(tm.floorEntry(10).getValue());
        System.out.println(tm.ceilingEntry(10).getValue());

        System.out.println(tm.remove(10));
        System.out.println(tm.remove(100));
        System.out.println(tm.size());
    }
    
}
