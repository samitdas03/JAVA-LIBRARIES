package java_collection_framework.wildcard;
import java.util.ArrayList;
import java.util.Collection;

public class Test2 {

    public static void printStudents(ArrayList<? extends Student> al) {
        for(Student s: al) {
            s.print();
        }
    }

    public static void printCollection(Collection<?> c) {
        for(Object e: c) {
            System.out.println(e);
        }
    }





    public static void main(String[] args) {
        ArrayList<EnggStudent> al1 = new ArrayList<>();
        al1.add(new EnggStudent());
        al1.add(new EnggStudent());

        ArrayList<MgmtStudent> al2 = new ArrayList<>();
        al2.add(new MgmtStudent());

        printStudents(al1);
        printStudents(al2);

        printCollection(al1);
    }
    
}
