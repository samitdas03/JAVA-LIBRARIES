package map;
import java.util.*;

public class CountGreaterElements {

    public static void countGreaterElements(int arr[]) {
        TreeMap<Integer, Integer> m = new TreeMap<>(Collections.reverseOrder());
        for(int i = 0; i < arr.length; i++) {
            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
        }
        int cumFreq = 0;
        for(Map.Entry<Integer, Integer> e: m.entrySet()) {
            Integer temp = e.getValue();
            m.put(e.getKey(), cumFreq);
            cumFreq += temp;
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(m.get(arr[i]) + " ");
        }
    }




    public static void main(String[] args) {
        int arr[] = { 2, 8, 10, 5, 8 };
        countGreaterElements(arr);
    }
    
}
