package _8_StringBuilder_Buffer;

public class _10_StringBuilder {
    public static void main(String[] args) {

        // immutable
        String color = "Black";
        //String change = color.concat("& White");
        System.out.println(color);

        // mutable
        StringBuilder sb1 = new StringBuilder("Jet");
        sb1.append("Lee");
        System.out.println(sb1 );

        String str1 = "Laptop";
        String str2 = "Laptop";
        String str3 = new String ("Laptop");
        System.out.println("str1 & str2: " + (str1.hashCode() == str2.hashCode()));
        System.out.println(str1==str2);
        System.out.println("str1 & str3: " + (str1.hashCode() == str3.hashCode()));
        System.out.println(str1==str3);

        // String --> pool
        // new --> heap
        String s1 = "hi";
        String s2 = "hi";
        // "hi" -> 3329

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        // ==
        //.equals

        char sym1 = '?';
        char sym2 = '?';
        char sym3 = '?';
        char sym4 = '?';





    }
}
