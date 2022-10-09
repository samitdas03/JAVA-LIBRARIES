package lambda_expression;
import java.util.*;

public class MethodReference {

    public static void main(String[] args) {
        
        // 1. Creating new list al
        List<Integer> al = Arrays.asList(10, 20, 15, 16);
        
        // 2. Iterating list al using forEach method using lambda expression
        al.forEach(x -> System.out.println(x));

        // 3. Iterating list al using forEach method using method reference
        al.forEach(System.out :: println);
    }
    
}
