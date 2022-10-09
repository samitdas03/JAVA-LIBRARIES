package java_collection_framework.java_generics;

public class WithoutGenericClass {
    Object x;
    Object y;
    

    public static void main(String[] args) {
        WithoutGenericClass p = new WithoutGenericClass();
        p.x = 12;
        p.y = "Samit";
        // String str = (String)p.x;                          // Gives runtime error
    }
}
