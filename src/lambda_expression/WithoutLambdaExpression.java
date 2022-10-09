package lambda_expression;
import java.util.*;
import java.util.function.Predicate;

public class WithoutLambdaExpression {

    // 1. Defining printCond method
    public static void printCond(Collection<Integer> c, Predicate<Integer> p) {
        for(Integer x: c) {
            if(p.test(x)) {
                System.out.println(x);
            }
        }
    }


    public static void main(String[] args) {

        // 2. Implementing MyPredicateEven class which implements Predicate interface
        class MyPredicateEven implements Predicate<Integer> {

            // 3. defining abstract method test of Predicate functional interface
            public boolean test(Integer x) {
                return (x % 2 == 0);
            }
        }

        // 4. Creating new list collection
        List<Integer> al = new ArrayList<Integer>(Arrays.asList(10, 5, 20, 7, 30));

        // 5. calling printCond method over List al and an object of MyPredicateEven class
        printCond(al, new MyPredicateEven());
    }
    
}
