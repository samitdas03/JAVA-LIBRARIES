package lambda_expression;

@FunctionalInterface
interface Test1 {
    abstract void print();
}

interface Test2 {
    abstract void print(Integer x);
}

interface Test3 {
    abstract void print(Integer x, Integer y);
}

public class LambdaExpressionSyntax {

    static void fun1(Test1 t) {
        t.print();
    }

    static void fun2(Test2 t, Integer x) {
        t.print(x);
    }

    static void fun3(Test3 t, Integer x, Integer y) {
        t.print(x, y);
    }



    public static void main(String[] args) {
        fun1(() -> System.out.println("Hello"));

        fun2((x) -> System.out.println(x), 10);

        fun3((a, b) -> System.out.println(a + " " + b), 10, 20);
    }
    
    
}
