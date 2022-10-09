package stream;
import java.util.Arrays;
import java.util.stream.Stream;

public class SumOfArray {

    public static void main(String[] args) {
        int arr[] = {30, 20, 10};

        // Sum of array items
        int sum = Arrays.stream(arr)
                        .sum();

        System.out.println(sum);

        System.out.println();

        // Max of array items
        int max = Arrays.stream(arr)
                        .max()
                        .getAsInt();

        System.out.println(max);

        System.out.println();

        // Average of array items
        double avg = Arrays.stream(arr)
                           .average()
                           .getAsDouble();

        System.out.println(avg);

        System.out.println();

        // Print n natural number with given digit d
        Stream.iterate(1, x -> x + 1)
              .filter(x -> x.toString().contains("5"))
              .limit(10)
              .forEach(System.out :: println);

        System.out.println();

        // Print elemets of a array of string which begins with a and end with c
        String arr2[] = {"abc", "cde", "acd", "aec", "xyz"};
        Arrays.stream(arr2)
              .filter(x -> x.startsWith("a"))
              .filter(x -> x.endsWith("c"))
              .forEach(System.out :: println);
        
        System.out.println();



        
    }


    
}
