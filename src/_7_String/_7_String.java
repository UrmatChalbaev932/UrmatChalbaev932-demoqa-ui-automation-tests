package _7_String;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class _7_String {
    public static void main(String[] args) {
        // String -> non primitive data type

        // variable
        String name ="Kate";

        // object
        String name2 = new String("William");
        //                                 1234567
        System.out.println(name2);
        System.out.println(name2.length()); //7
        int lengthOfName2=name2.length(); //7
        System.out.println(lengthOfName2); //7

        // .length() - метод возвращает длину строки

        System.out.println("Will".length());

        //обьекты выполняют определенные действия

        //              01234 -> index starts with 0
        String color = "white";
        //              12345 -> length starts with 1
        System.out.println(color.length() + "- Length()");

        System.out.println(color.indexOf('i'));

        // mommy
        // phone
        //_qwerty123

        // .indextOf()

        // Метод indexOf() возвращает индекс первого
        // вхождения указанного значения в строковый
        // объект String , на котором он был вызван,
        // начиная с индекса fromIndex . Возвращает -1,
        // если значение не найдено.

        String red1 = "RED";
        String red2 = "RED";
        //             012
        System.out.println(red1==red2);
        System.out.println(red2.indexOf('D'));
        System.out.println(red2.indexOf(3));
        System.out.println(red2.indexOf('K'));


        System.out.println("--------------------------------");
        //               012345678901234
        String lapTop = "Mac Book Pro00o";
        System.out.println(lapTop);
        System.out.println(lapTop.indexOf('o'));
        System.out.println(lapTop.indexOf('o', 10));
        System.out.println(lapTop.indexOf('o', 6));
        System.out.println(lapTop.indexOf('o', 12));
        System.out.println(lapTop);

        System.out.println("----------------------------------");
        //               0123456789
        String color2 = "Yellowuiol";
        System.out.println(color2.indexOf('l'));
        System.out.println(color2.indexOf('l'));
        System.out.println(color2.indexOf('l',3));
        System.out.println(color2.indexOf('l',4));

        System.out.println("-----------------------------------");
        //              0123456789012345678901234
        String phone = "Iphone 14 Pro Max Predict";
        System.out.println(phone.indexOf("Pro")); //10
        System.out.println(phone.indexOf('p')); //1
        System.out.println(phone.indexOf('P')); //10
        System.out.println(phone.indexOf("Pr")); //10
        System.out.println(phone.indexOf("Pre")); //18

        System.out.println("-----------------------------------");
        //               0123456789012345678901234567
        String phone2 = "Samsung galaxy ultra sam Sam";
        System.out.println(phone.indexOf("Sam", 4)); //10

        // HomeWork

        //


    }
}
