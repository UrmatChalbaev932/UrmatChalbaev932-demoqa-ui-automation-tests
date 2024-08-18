package _5_If_else;

import java.util.Scanner;
import java.util.SortedMap;

public class IfElse {
    public static void main(String[] args) {

        //Оператор if – состоит из логического выражения,
        // после которого следует один или более операторов.

        // В Java оператор if может сопровождаться дополнительным
        // оператором else, который выполняется при ложном логическое
        // выражение.

        // В Java всегда допустимы вложенные операторы if-else,
        // которые означают, что Вы можете использовать один
        // оператор if или else внутри другого оператора if или else.





        int age = 16;
        int nick = 1;

        // 1. if-else
        // 48>=16
        if (nick >= age) {
            System.out.println("Get ID Passport");
        } else {
            System.out.println("Invalid age");
        }


        int number1 = 888;
        int number2 = 123;
        int number3 = 777;

        int myNumber = 123;


        // 2. if-else ledder
        //  777 === 8888 false
        if (myNumber == number1) {
            System.out.println("Success for 888");
        } else if (myNumber == number2) {
            System.out.println("Success for 123");
        } else if (myNumber == number3) {
            System.out.println("Success for 777");
        }
        // optional - хочешь ставь хочешь не ставь!
        else {
            System.out.println("Invalid number");
        }
        // int num = 98; // redandent -  не активный код можно удалить!

       /* if (false) {
            System.out.println("aaa");
        }
        else if (false) {
            System.out.println("bbb");
        }
        else {
            System.out.println("ccc");
        }*/

        // 3. nested if


        String citizen = "KG";
        int age1 = 16;

        Scanner scan = new Scanner(System.in);

        System.out.println("Citizen:");
        String userCZ = scan.next();

        if (citizen.equalsIgnoreCase(userCZ)) {
            System.out.println("You are a citizen of KG");
            System.out.println("Age:");
            int userAge = scan.nextInt();

            if (age1 <= userAge) {
                System.out.println("You can get an ID Passport");
            } else {
                System.out.println("NOOT");
            }
        } else {
            System.out.println("Not");
        }

    }
}