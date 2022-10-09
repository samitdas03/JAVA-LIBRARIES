package lambda_expression;
import java.util.*;
import java.util.function.Predicate;

public class UsingLambdaExpression {

    // 1. Defining printCond method
    public static void printCond(Collection<Integer> c, Predicate<Integer> p) {
        for(Integer x: c) {
            if(p.test(x)) {
                System.out.println(x);
            }
        }
    }
    

    public static void main(String[] args) {
        
        // 2. Creating new list collection al
        List<Integer> al = new ArrayList<Integer>(Arrays.asList(10, 5, 20, 7, 30));

        // 3. calling printCond using lambda expression
        printCond(al, x -> x % 2 == 0);
    }

}
