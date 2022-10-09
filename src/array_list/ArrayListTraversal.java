package array_list;
import java.util.*;

public class ArrayListTraversal {
    
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Coding");
        al.add("IDE");
        al.add("Development");



        // 1. Using get()
        for(int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

        // 2. Using for each loop
        for(String s: al) {
            System.out.println(s);
        }

        // 3. Using Iterator
        Iterator<String> it = al.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // 4. Using for each method
        al.forEach(x -> System.out.println(x));

    }
}
