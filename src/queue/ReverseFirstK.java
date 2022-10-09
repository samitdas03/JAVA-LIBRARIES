package queue;
import java.util.*;

public class ReverseFirstK {

    public static void main(String[] args) {
        
        Queue<Integer> q = new ArrayDeque<Integer>();
        for(int i = 0; i < 10; i++) {
            q.offer(i);
        }
        System.out.println(q);
        reverseFirstK(q, 4);
        System.out.println(q);
    }



    public static void reverseFirstK(Queue<Integer> q, int k) {
        Deque<Integer> dq = new ArrayDeque<Integer>();
        int size = q.size();
        for(int i = 0; i < k; i++) {
            dq.push(q.poll());
        }
        while(dq.isEmpty() == false) {
            q.offer(dq.pop());
        }
        int remain = size - k;
        for(int i = 0; i < remain; i++) {
            q.offer(q.poll());
        }
    }
    
}
