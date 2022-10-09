package set;
import java.util.*;

public class PrintRepetingElements {

    public static void main(String[] args) {
        
        int arr[] = {10, 8, 10, 7, 7, 6};
        printRepetingElements(arr);

    }
    

    public static void printRepetingElements(int arr[]) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0; i < arr.length; i++) {
            if(hs.contains(arr[i]) == true) {
                System.out.print(arr[i] + " ");
            } else {
                hs.add(arr[i]);
            }
        }
    }
}
