package map;
import java.util.*;

public class MapMethods {

    public static void main(String[] args) {
        
        Map<Integer, String> m = new HashMap<>();
        m.put(100, "GFG");
        m.put(200, "COURSES");
        m.put(150, "IDE");

        System.out.println(m);

        /**
         * public interface Map<K, V> {
         *     V put(K key, V value);                // adds the given association
         *                                           // returns the old value or null
         *     
         *     V get(Object key);                    // returns the associated value or null
         * 
         *     boolean isEmpty();                    // return true if map is empty
         * 
         *     V remove(Object key);                 // remove the mapping and return value or null
         * 
         *     boolean containsKey(Object key);      // returns true if key is present
         * 
         *     boolean containsValue(Object val);    // returns true if value is present
         * 
         *     V replace(K key, V value);            // add new association only if key is present already and returns the old value
         * 
         *     int size();                           // return size of map
         * 
         *     Set<K> keySet();                      // returns a set view of the keys
         * 
         *     Collection<V> values();               // returns a collection view of the values
         * 
         *     Set<Map.Entry<K, V>> entrySet();      // returns a set view of the mappings
         * 
         *     V getOrDefault(Object key, V default);        // returns existing value or default
         * 
         *     void clear();                         // removes all mappings
         * }
        */



    }
    
}
