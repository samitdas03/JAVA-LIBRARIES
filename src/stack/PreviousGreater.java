package stack;
import java.util.*;

public class PreviousGreater {

    public static void main(String[] args) {

        int arr[] = {15, 10, 18, 12, 4, 6, 2, 8};
        previousGreater(arr);
        
    }



    public static void previousGreater(int arr[]) {
        Deque<Integer> dq = new ArrayDeque<Integer>();
        dq.push(arr[0]);
        int pg = -1;
        System.out.print(pg + " ");
        for(int i = 0; i < arr.length; i++) {
            while(dq.isEmpty() == false && arr[i] >= dq.peek()) {
                dq.pop();
            }
            pg = (dq.isEmpty()) ? -1 : dq.peek();
            System.out.print(pg + " ");
            dq.push(arr[i]);
        }
    }
    
}
