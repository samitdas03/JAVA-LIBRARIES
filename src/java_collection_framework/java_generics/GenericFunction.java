package java_collection_framework.java_generics;

public class GenericFunction {

    public static <T> int count(T arr[], T x) {
        int res = 0;
        for(T e: arr) {
            if(e.equals(x)) {
                res++;
            }
        }
        return res;
    }



    public static void main(String[] args) {
        Integer arr[] = {10, 20, 30, 10, 40, 50, 60};
        int result = count(arr, 10);
        System.out.println(result);
    }
    
}
