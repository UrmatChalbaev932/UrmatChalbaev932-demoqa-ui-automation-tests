package _8_StringBuilder_Buffer;

import jdk.jshell.Snippet;

public class _15_strBuilder {
    public static void main(String[] args) {
        String name1 = "Will"; //Will
        String name2 = "Will"; //Will
        String name3 = "Will"; //Will
        String name4 = "Will"; //Will
        String name5 = "Will"; //Will
        System.out.println(name1.hashCode()); //2696178
        System.out.println(name2.hashCode()); //2696178
        System.out.println(name3.hashCode()); //2696178
        System.out.println(name4.hashCode()); //2696178
        System.out.println(name5.hashCode()); //2696178

        String name6 = "Will";  //Will/2696178
        name6 = "Will Smith"; // Will Smith/881245749
        System.out.println(name6.hashCode());


        // ==      --> hashCode
        // .equals --> values

        System.out.println(name1 == name2); // true
        System.out.println(name1 == name6); //false
        System.out.println(name1.equals(name2)); //true
        System.out.println(name5.equals(name6)); //false


        StringBuilder sb1 = new StringBuilder("Will");
        // System.out.println(name4 == sb1);
        String name7 = new String("Will");
        System.out.println(name1==name7); // false
        System.out.println(name1.hashCode()); //2696178
        System.out.println(name7.hashCode()); //2696178
        System.out.println(name1.equals(name7)); // true


        StringBuilder sb2 = new StringBuilder("Will");
        // System.out.println(name7 == sb2);
        System.out.println(name7.equals(sb2)); // false
        System.out.println(name7.equals(sb2.toString())); // true


        StringBuilder sb3 = new StringBuilder("Will");
        System.out.println(sb2 == sb3); // false
        System.out.println(sb2.equals(sb3)); // false
        System.out.println(sb2.toString().equals(sb3.toString())); // true


        StringBuilder color1 = new StringBuilder("Yellow");
        System.out.println(color1);
        color1.append("sun");
        System.out.println(color1);
        color1.toString(); //is ignored
        System.out.println(color1);
        color1.reverse(); //nuswolleY
        System.out.println(color1);
        System.out.println(color1);

        String convert1 = color1.toString();


        // non.primitive
        // .equals()
        // .hashcode()
        // .toString()



    }
}
