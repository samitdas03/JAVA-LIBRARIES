package stack;
import java.util.*;

public class BalancedParenthesis {

    public static void main(String[] args) {

        boolean boo = balancedParenthesis("[[{({})}]]]");
        System.out.println(boo);
        
    }

    public static boolean balancedParenthesis(String s) {
        Deque<Character> arrdq = new ArrayDeque<Character>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[') {
                arrdq.push(c);
            } else if(arrdq.isEmpty() == false && isMatching(arrdq.peek(), c)) {
                arrdq.pop();
            } else {
                return false;
            }
        }
        return(arrdq.isEmpty());
    }

    public static boolean isMatching(char a, char b) {
        return ((a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']'));
    }
    
}
