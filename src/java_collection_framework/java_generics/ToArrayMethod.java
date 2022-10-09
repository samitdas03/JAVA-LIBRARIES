package java_collection_framework.java_generics;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class ToArrayMethod {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(15);
        list.add(20);
        Object arr[] = list.toArray();
        for(Object x: arr) {
            System.out.println(x);
        }

        System.out.println();

        Queue<Integer> q = new ArrayDeque<Integer>();
        q.add(50);
        q.add(60);
        q.add(70);
        Object arr2[] = q.toArray();
        for(Object x: arr2) {
            System.out.println(x);
        }

        System.out.println();

        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        Integer arr10[] = new Integer[0];
        arr10 = list2.toArray(arr10);                                  // same
        Integer arr3[] = list2.toArray(new Integer[0]);                // here toArray method creates a new array(type of the array is determined by the argument array)
        //                                                             // of Integer type to store list2 values and return the reference of it 
        for(Integer x: arr3) {
            System.out.println(x);
        }

        System.out.println();

        Queue<Integer> q2 = new ArrayDeque<Integer>();
        q2.add(10);
        q2.add(30);
        q2.add(50);
        Integer arr4[] = new Integer[q2.size()];
        arr4 = q2.toArray(arr4);                                       // here toArray method store q2 values in arr4 because of suffecient size and return reference to it
        for(int x: arr4) {
            System.out.println(x);
        }




    } 
    
}
