package array_list;

import java.util.*;

public class ListIterator {

    public static void main(String[] args) {
        // Creating new list
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        
        // Creating ListIterator object lt on list at firstIndex
        java.util.ListIterator<Integer> lt = list.listIterator();
        while(lt.hasNext()) {
            System.out.println(lt.next());
        }

        // Creating ListIterator object lt2 on list at lastIndex
        java.util.ListIterator<Integer> lt2 = list.listIterator(list.size());
        while(lt2.hasPrevious()) {
            System.out.println(lt2.previous());
        }

        // System.out.println(lt2.previous());           // Throws exception as li2 has no previous element
        // System.out.println(lt2.next());               // Throws no exception as li2 has next element

        java.util.ListIterator<Integer> lt3 = list.listIterator(list.size());
        while(lt3.hasPrevious()) {
            int x = lt3.previous();
            lt3.set(x * 2);                              // Modifies last returned object by previous() or next() method
        }

        System.out.println(list);




        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        java.util.ListIterator<Integer> it2 = list2.listIterator(2);
        System.out.println(it2.previousIndex());         // gives index of previous element
        System.out.println(it2.nextIndex());             // gives index of next element


        java.util.ListIterator<Integer> it = list2.listIterator();
        while(it.hasNext()) {
            it.add(5);                                   // add method does not change the next reference of it(List Iterator object), always add new element at previous reference
            it.next();
        }

        System.out.println(list2);



        
    }
    
}
