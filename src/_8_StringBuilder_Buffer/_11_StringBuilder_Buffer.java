package _8_StringBuilder_Buffer;

public class _11_StringBuilder_Buffer {
    public static void main(String[] args) {
    //  non-primitive data types
    //  Scanner, String, StringBuilder/StringBuffer

        // 1
        String str1 = "Hello";

        // 2
        String str = new String("Hello");

        System.out.println("===================================");
        // 1
        StringBuilder sb1 = new StringBuilder(); // 16
        System.out.println(sb1.capacity());
        sb1.append("Mac");
        sb1.append("Book");
        System.out.println(sb1);
        System.out.println(sb1.capacity());

        System.out.println("===================================");
        // 2
        StringBuilder sb2 = new StringBuilder("Aloha"); // 16+5=21
        System.out.println(sb2.capacity());
        sb2.append("Mac");
        sb2.append("Book");
        System.out.println(sb2);
        System.out.println(sb2.capacity());
        System.out.println("===================================");
        //3
        StringBuilder sb3 = new StringBuilder(4);
        System.out.println(sb3.capacity());//4
        //          123
        sb3.append("Mac");
        //          4567
        sb3.append("Book");
        System.out.println(sb3.capacity());//10-4+6
        System.out.println(sb3);

        //Mac 3 [4]
        //Book

        // [1] [2] [3] [4]      [5] [6] [7] [8] [9] [0]
        // [M] [a] [c] [B]      [o] [o] [k] [] [] []

        //oldCapacity * 2 + 2
        //          4 * 2 + 2















    }
}
