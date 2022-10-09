package priority_queue;
import java.util.*;

public class Methods {

    public static void main(String[] args) {
        
        // Min Heap
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.offer(10);
        pq.offer(20);
        pq.offer(15);

        //        10
        //       /  \
        //      20  15

        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.peek());



        // Max Heap
        PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(Collections.reverseOrder());
        pq2.offer(10);
        pq2.offer(20);
        pq2.offer(5);

        //          20
        //         /  \
        //        10  15

        System.out.println(pq2.peek());
        System.out.println(pq2.poll());
        System.out.println(pq2.peek());
    }
    
}
