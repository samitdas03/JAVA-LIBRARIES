package map;
import java.util.*;

class MyDs {
    TreeMap<Integer, String> m;

    public MyDs() {
        m = new TreeMap<Integer, String>();
    }

    public void add(int price, String item) {
        m.put(price, item);
    }

    public String find(int price) {
        String res = m.get(price);
        return (res == null) ? null : res;
    }

    public void printGreaterSorted(int price) {
        SortedMap<Integer, String> s = m.tailMap(price);
        for(Map.Entry<Integer, String> e: s.entrySet()) {
            System.out.println(e.getValue() + " " + e.getKey());
        }
    }

    public void printSmallerSorted(int price) {
        SortedMap<Integer, String> s = m.headMap(price);
        for(Map.Entry<Integer, String> e: s.entrySet()) {
            System.out.println(e.getValue() + " " + e.getKey());
        }
    }
}







public class PriceItem {

    public static void main(String[] args) {
        
    }
    
}
