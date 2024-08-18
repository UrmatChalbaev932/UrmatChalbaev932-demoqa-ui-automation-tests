package _3_java_operators;

public class _3_ComparisonOperators {
    public static void main(String[] args) {

        //
        int a = 1;
        int b = 2;
        int c = 3;

        System.out.println("==");
        //== Equl to
        boolean d0 = a == b;
        boolean d1 = b == c;
        boolean d2 = a == 1;

        System.out.println(d0); //false
        System.out.println(d1); //false
        System.out.println(d2); //true

        System.out.println("!=");
        //!= Not equal
        boolean d4 = a != b; //true
        boolean d5 = b != c; //true
        boolean d6 = a != 1; //false

        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);

        System.out.println(">");
        //> Greater than
        boolean d7 = a > b; //false
        boolean d8 = b > c; //false
        boolean d9 = a > 1; //false

        System.out.println(d7);
        System.out.println(d8);
        System.out.println(d9);

        System.out.println("<");
        //< Less than
        boolean d10 = a < b; // true
        boolean d11 = b < c; // true
        boolean d12 = a < 1; // false

        System.out.println(d10);
        System.out.println(d11);
        System.out.println(d12);


        System.out.println(">=");
        //< Greater than or equal to
        boolean d13 = a >= b; // false
        boolean d14 = b >= c; // false
        boolean d15 = a >= 10; // false

        System.out.println(d13);
        System.out.println(d14);
        System.out.println(d15);




    }
}
