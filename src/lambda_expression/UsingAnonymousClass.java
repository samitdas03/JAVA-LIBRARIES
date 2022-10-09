package lambda_expression;
import java.util.*;
import java.util.function.Predicate;

public class UsingAnonymousClass {
    
    // 1. Defining printCond mehtod
    public static void printCond(Collection<Integer> c, Predicate<Integer> p) {
        for(Integer x: c) {
            if(p.test(x)) {
                System.out.println(x);
            }
        }
    }



    public static void main(String[] args) {
        
        // 2. Creating anonymous class object myPredEven
        Predicate<Integer> myPredEven = new Predicate<Integer>() {

            // 3. defining abstract method test of Predicate functional interface
            public boolean test(Integer x) {
                return (x % 2 == 0);
            }
        };

        // 4. Creating new list collection al
        List<Integer> al = new ArrayList<Integer>(Arrays.asList(10, 5, 20, 7, 30));

        // 5. Calling printCond method over list al and an anonymous class object myPredEven
        printCond(al, myPredEven);

        System.out.println();

        // 6. Calling printCond method and creating anonymous class object in same line
        printCond(al, new Predicate<Integer>() {
            public boolean test(Integer x) {
                return (x % 2 == 0);
            }
        });
    }
}
