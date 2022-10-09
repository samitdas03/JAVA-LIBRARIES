package stack;
import java.util.*;

public class ReverseCollection {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        reverseCollection(list);
        System.out.println(list);
    }

    public static void reverseCollection(List<Integer> list) {
        Stack<Integer> stk = new Stack<Integer>();
        for(Integer i: list) {
            stk.push(i);
        }
        for(int i = 0; i < list.size(); i++) {
            list.set(i, stk.pop());
        }
    }
    
}
