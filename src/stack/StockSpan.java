package stack;

import java.util.ArrayDeque;
import java.util.*;

public class StockSpan {

    public static void main(String[] args) {

        int arr[] = {30, 20, 25, 28, 27, 29};
        stockSpan(arr);
        stockSpan2(arr);
        
    }

    

    public static void stockSpan(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            int span = 1;
            for(int j = i-1; j >= 0 && arr[j] <= arr[i]; j--) {
                span++;
            }
            System.out.print(span + " ");
        }
        System.out.println();
    }

    public static void stockSpan2(int arr[]) {
        Deque<Integer> dq = new ArrayDeque<Integer>();
        for(int i = 0; i < arr.length; i++) {
            int span = 0;
            while(dq.isEmpty() == false) {
                if(arr[i] < arr[dq.peek()]) {
                    span = i - dq.peek();
                    dq.push(i);
                    break;
                } else {
                    dq.pop();
                }
            }
            if(dq.isEmpty()) {
                span = i+1;
                dq.push(i);
            }
            System.out.print(span + " ");
        }
        System.out.println();
    }
    
}
