package _9_Methods;

import java.util.Scanner;

public class _27_1_UserData {

    public static Scanner scan  = new Scanner(System.in);
    public static String login;
    public static String password;
    public static int numberTelephone;
    public static String keyWords;
    public static String yes;
    public static String no;
    public static String userData() {

        System.out.println("Login: ");
        login = scan.next();

        System.out.println("Password: ");
        password = scan.next();

        System.out.println("Number Telephone: ");
        numberTelephone = scan.nextInt();

        System.out.println("Key words; ");
        keyWords = scan.next();

        return ("account created");
    }
}
