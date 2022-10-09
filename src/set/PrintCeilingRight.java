package set;
import java.util.*;

public class PrintCeilingRight {

    public static void main(String[] args) {

        int arr[] = {100, 50, 30, 60, 55, 32};
        printCeilingRight(arr);
        
    }


    public static void printCeilingRight(int arr[]) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        int res[] = new int[arr.length];

        for(int i = arr.length-1; i >= 0; i--) {
            Integer ceil = ts.ceiling(arr[i]);
            if(ceil == null) {
                ceil = -1;
            }
            res[i] = ceil;
            ts.add(arr[i]);
        }
        for(int i: res) {
            System.out.print(i + " ");
        }
    }
    
}
