package java_collection_framework.collection_iterating;
import java.util.ArrayList;
import java.util.Collection;

public class Iterator {

    public static void removeEven(Collection<Integer> c) {
        java.util.Iterator<Integer> it = c.iterator();
        while(it.hasNext()) {
            int x = (Integer)it.next();
            if(x%2 == 0) {
                it.remove();
            }
        }
    }

    public static void removeByCondition(Collection<?> c) {
        java.util.Iterator<?> it = c.iterator();
        while(it.hasNext()) {
            if(cond(it.next()) == true) {
                it.remove();
            }
        }
    }

    public static <T> boolean cond(T t) {
        return true;
    }



    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(15);
        al.add(20);
        removeEven(al);
    }
    
}
