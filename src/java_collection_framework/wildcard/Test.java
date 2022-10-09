package java_collection_framework.wildcard;
import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        Student s1 = new Student();
        EnggStudent s2 = new EnggStudent();
        s1 = s2;                                                  // compiles fine

        ArrayList<Student> al1 = new ArrayList<Student>();
        ArrayList<EnggStudent> al2 = new ArrayList<EnggStudent>();
        // al1 = al2;                                             // gives compile time error BECAUSE Student is parent of EnggStudent and MgmtStudent
        //                                                           but ArrayList<Student> is not parent of ArrayList<EnggStudent> and ArrayList<MgmtStudent>
        //                                                           they are just arraylist of different types.

        ArrayList<?> al3 = new ArrayList<>();                     // a array list of unknown type and can be asigned to any type
        al3 = al2;

        ArrayList<? extends Student> al4 = new ArrayList<>();     // a array list of unknown type which can be asigned to Student and it's decendent only
        al4 = al2;

        ArrayList< ? super Student> al5 = new ArrayList<>();      // a array list of unknown type which can be asigned to Student and it's ancesters only
        ArrayList<Object> al6 = new ArrayList<>();
        // al5 = al2;                                             // gives compile time error
        al5 = al6;
    }
    
}
