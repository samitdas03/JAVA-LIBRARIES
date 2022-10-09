package priority_queue;
import java.util.*;



public class KLargestElements {

    public static void main(String[] args) {
        
        int arr[] = {1, 23, 12, 9, 30, 2, 50};

        KLargestElements1(arr, 3);
        KLargestElement2(arr, 3);
        KLargestElements3(arr, 3);
        
    }



    public static void KLargestElements1(int arr[], int k) {
        Arrays.sort(arr);
        for(int i = arr.length-k; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void KLargestElement2(int arr[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i: arr) {
            pq.offer(i);
        }
        for(int i = 0; i < k; i++) {
            System.out.print(pq.poll() + " ");
        }
        System.out.println();
    }

    public static void KLargestElements3(int arr[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
        for(int i = k; i < arr.length; i++) {
            if(arr[i] > pq.peek()) {
                pq.poll();
                pq.add(arr[i]);
            }
        }
        for(int i = 0; i < k; i++) {
            System.out.print(pq.poll() + " ");
        }
        System.out.println();
    }
    
}
