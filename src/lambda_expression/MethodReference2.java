package lambda_expression;
import java.util.*;

public class MethodReference2 {

    // 1. Defining method printSquare
    public static void printSquare(Integer x) {
        System.out.println(x * x);
    }

    public static void main(String[] args) {
        
        // 1. Creating list al
        List<Integer> al = Arrays.asList(10, 20, 7, 8);

        // 2. Iterating list al using forEach method using lambda expression
        al.forEach(x -> System.out.println(x * x));

        // 3. Iterating list al using forEach method using method reference
        al.forEach(MethodReference2 :: printSquare);
    }
    
}
