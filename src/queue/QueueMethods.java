package queue;
import java.util.*;

public class QueueMethods {

    public static void main(String[] args) {
        
        Queue<Integer> q = new LinkedList<Integer>();
        Queue<Integer> q2 = new ArrayDeque<Integer>();

        q.offer(10);
        q.offer(20);
        q.offer(30);

        q2.add(20);

        System.out.println(q.size());
        System.out.println(q.isEmpty());

        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());


        /**
         * Does not throw     throws exception
         * exception
         * 
         * peek()                element()
         * 
         * offer()                add()
         * 
         * poll()                remove()
         * 
         * 
         */
    }
    
}
