package map;
import java.util.*;
// import java.util.Map.Entry;

public class ArrayFrequencie {

    public static void main(String[] args) {

        int arr[] = {10, 20, 10, 10, 20};
        printFrequencies1(arr);

        printFrequencies2(arr);
        
    }


    public static void printFrequencies1(int arr[]) {
        HashMap<Integer, Integer> m = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
        }
        for(int i = 0; i < arr.length; i++) {
            int freq = m.get(arr[i]);
            if(freq != -1) {
                System.out.println(arr[i] + " " + freq);
                m.put(arr[i], -1);
            }
        }
    }

    public static void printFrequencies2(int arr[]) {
        LinkedHashMap<Integer, Integer> m = new LinkedHashMap<>();
        for(int i = 0; i < arr.length; i++) {
            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> e: m.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
    
}
