package map;
import java.util.*;
import java.util.Map.Entry;

public class HashMapMethods {

    public static void main(String[] args) {
        HashMap<String, Integer> m = new HashMap<>();
        m.put("gfg", 10);
        m.put("ide", 15);
        m.put("courses", 20);

        System.out.println(m);
        System.out.println(m.size());

        for(Entry<String, Integer> e: m.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        System.out.println(m.containsKey("ide"));
        System.out.println(m.containsValue(15));
        System.out.println(m.get("gfg"));
        System.out.println(m.get("practice"));
        m.remove("ide");
        System.out.println(m.size());

    }
    
}
