package stack;
import java.util.*;

public class NextGreater {

    public static void main(String[] args) {
        
        int arr[] = {5, 15, 10, 8, 6, 12, 7};
        nextGreater(arr);

    }



    public static void nextGreater(int arr[]) {
        Deque<Integer> dq = new ArrayDeque<Integer>();
        int res[] = new int[arr.length];
        for(int i = arr.length-1; i >= 0; i--) {
            while(dq.isEmpty() == false) {
                if(arr[i] >= dq.peek()) {
                    dq.pop();
                } else {
                    res[i] = dq.peek();
                    dq.push(arr[i]);
                    break;
                }
            }
            if(dq.isEmpty()) {
                res[i] = -1;
                dq.push(arr[i]);
            }
        }
        for(int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
    
}
