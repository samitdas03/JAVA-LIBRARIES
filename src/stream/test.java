package stream;

import java.util.ArrayDeque;

public class test {

    public static void main(String[] args) {
        // int a = 16;
        // int r = (int)(Math.log10(a) / Math.log10(2));
        // System.out.println(r);

        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.push(10);
        ad.push(20);
        ad.push(30);

        System.out.println(ad.peekFirst());
    }
    
}
