package java_collection_framework.java_generics;

public class GenericClass<T, S> {
    T x;
    S y;
    static int count;

    GenericClass() {
        count++;
    }

    public static void main(String[] args) {
        GenericClass<Integer, String> p = new GenericClass<Integer, String>();
        p.x = 12;
        p.y = "Samit";
        // String str = (String)p.x;                   // It gives compile time error

        System.out.println(GenericClass.count);

        GenericClass<Double, Character> q = new GenericClass<Double, Character>();
        q.x = 12.4;
        q.y = 'c';

        System.out.println(GenericClass.count);
    }
}
