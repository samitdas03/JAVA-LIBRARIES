package lambda_expression;
import java.util.Arrays;

public class MethodReference3 {

    public static void main(String[] args) {
        
        String a[] = {"Code", "IDE", "LOGIC"};
        String b[] = {"code", "ide", "Logic"};

        // Using method reference
        if(Arrays.equals(a, b, String :: compareToIgnoreCase)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // Using lambda expression
        if(Arrays.equals(a, b, (x, y) -> x.compareToIgnoreCase(y))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        

    }
    
}
