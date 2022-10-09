package linked_list;
import java.util.*;

public class JosephusProblem {

    public static void main(String[] args) {
        
        int result = josephusProblem(7, 3);
        System.out.println(result);

    }

    public static int josephusProblem(int n, int k) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i = 0; i < n; i++) {
            list.add(i);
        }
        int ind = 0;
        while(list.size() > 1) {
            for(int i = 0; i < k-1; i++) {
                if(ind == list.size()-1) {
                    ind = 0;
                    continue;
                }
                ind++;
            }
            list.remove(ind);
            if(ind == list.size()) {
                ind = 0;
            }
        } 
        return list.peek();
    }

    public static int josephusProblem2(int n, int k) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i = 0; i < n; i++) {
            list.add(i);
        }
        Iterator<Integer> it = list.iterator();
        while(list.size() > 1) {
            int count = 0;
            while(count < k) {
                while(it.hasNext() && count < k) {
                    it.next();
                    count++;
                }
                if(count < k) {
                    it = list.iterator();
                    it.next();
                    count++;
                }
            }
            it.remove();
        }
        return list.peek();
    }
    
}
