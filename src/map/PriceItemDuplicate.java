package map;
import java.util.*;

class PriceList {
    TreeMap<Integer, List<String>> m;

    public PriceList() {
        m = new TreeMap<Integer, List<String>>();
    }

    public void arr(int price, String item) {
        if(m.get(price) == null) {
            m.put(price, new ArrayList<>());
        }
        m.get(price).add(item);
    }

    public List<String> find(int price) {
        return m.get(price);
    }

    public void printSorted(int price) {
        for(Map.Entry<Integer, List<String>> e: m.entrySet()) {
            int key = e.getKey();
            for(String s: e.getValue()) {
                System.out.println(s + " " + key);
            }
        }
    }

    public void printGreaterSorted(int price) {
        SortedMap<Integer, List<String>> g = m.tailMap(price);
        for(Map.Entry<Integer, List<String>> e: g.entrySet()) {
            int key = e.getKey();
            for(String s: e.getValue()) {
                System.out.println(s + " " + key);
            }
        }
    }

    public void printSmallerSorted(int price) {
        SortedMap<Integer, List<String>> sm = m.headMap(price);
        for(Map.Entry<Integer, List<String>> e: sm.entrySet()) {
            int key = e.getKey();
            for(String s: e.getValue()) {
                System.out.println(s + " " + key);
            }
        }
    }
}







public class PriceItemDuplicate {

    public static void main(String[] args) {
        
    }
    
}
