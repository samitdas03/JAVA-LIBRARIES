package array_list;
import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        // void add(object)
        al.add(10);                                  // insert 10 at the end
        al.add(20);
        al.add(30);
        System.out.println(al);

        // void add(index, object)
        al.add(1, 40);                               // insert 40 at position 1, if index > size throws exception
        al.add(3, 70);
        System.out.println(al);

        // boolean contains(object)
        boolean b = al.contains(20);
        System.out.println(b);

        // Object remove(index)
        int x = al.remove(3);
        System.out.println(x);
        System.out.println(al);

        // boolean remove(object)
        Integer i = 10;
        boolean y = al.remove(i);
        System.out.println(y);
        System.out.println(al);

        // object get(index)
        System.out.println(al.get(1));

        // void set(index, object)
        al.set(1, 100);
        System.out.println(al.get(1));

        al.add(40);
        System.out.println(al);

        // int indexOf(object)
        System.out.println(al.indexOf(40));
        
        // int lastIndexOf(object)
        System.out.println(al.lastIndexOf(40));

        // void clear()
        al.clear();
        System.out.println(al);

        // boolean isEmpty()
        boolean bol = al.isEmpty();
        System.out.println(bol);

        



    }
    
}
