package _5_If_else;

public class TernaryOperation {
    public static void main(String[] args) {
        //                  0    1    2
//        char symbols [] = {'s', 'h', 'e'};
//        char temp [] = new char[symbols.length-1];
//        temp[i] = symbols[j]
//        System.out.println(symbols.length);
//        System.out.println(temp.length);

        System.out.println(new float[]{34.9f, 87.8f, 90.1f});

        // if
        // if - else
        // if else ladder
        // nested if

        // ternary operators

        int age = 16;
        int userAge = 23;
//        if (userAge >= age){
//            System.out.println("Can get a passport");
//        }
//        else {
//            System.out.println("Cannot get a passport");
//        }

        //                     false,                      true    :     false
        String passport = (userAge > age) ? "Can get a passport" : "Cannot get a passport";
        System.out.println(passport);

        boolean userAnswer = true;
        //                   true
        boolean isJavaFun = (userAnswer) ? true : false;
        System.out.println(isJavaFun);

        String gender = "male";
        char gender2 = (gender.charAt(0) == 'f') ? 'F' : 'M';
        System.out.println(gender2);
    }
}
