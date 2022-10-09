package priority_queue;
import java.util.*;

public class PurchasingMaximumItems {

    public static void main(String[] args) {

        Integer arr[] = {1, 12, 5, 111, 200};
        List<Integer> al = Arrays.asList(arr);
        int result = purchasingMaximumItem(al, 10);

        System.out.println(result);
        
    }



    public static int purchasingMaximumItem(List<Integer> list, int sum) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(list);
        int res = 0;
        while(sum > 0 && !pq.isEmpty() && pq.peek() <= sum) {
            sum -= pq.poll();
            res++;
        }
        return res;
    }
    
}
