package stack;
import java.util.*;

public class StackMethods {

    public static void main(String[] args) {
        
        Stack<Integer> stk = new Stack<Integer>();
        stk.push(10);
        stk.push(20);
        stk.push(30);

        System.out.println(stk.peek());
        System.out.println(stk.isEmpty());
        System.out.println(stk.pop());
        System.out.println(stk.size());

    }
    

}
