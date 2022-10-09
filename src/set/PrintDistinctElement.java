package set;
import java.util.*;

public class PrintDistinctElement {

    public static void main(String[] args) {
        
        int arr[] = {10, 8, 10, 8, 7};
        printDist(arr);

    }



    public static void printDist(int arr[]) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0; i < arr.length; i++) {
            if(!hs.contains(arr[i])) {
                System.out.println(arr[i] + " ");
                hs.add(arr[i]);
            }
        }
    }
    
}
