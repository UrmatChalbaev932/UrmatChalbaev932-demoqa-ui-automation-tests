package _10_Loops;

import java.util.Scanner;

public class _2_LoopNested {
    public static void main(String[] args) {

        // nested
        for (int i = 0; i <= 3; i++) {
            //                 0 outer loop
            //                 1 outer loop
            //                  2 outer loop
            //                 3 outer loop
            System.out.println(i + " outer loop");
            for (int k = 0; k <= 2; k++) {
                //           2 outer loop:
                //                        0 inner loop
                //                        1 inner loop
                //                        2 inner loop
                System.out.println("\t" + k + " inner loop");
            }
        }
        //           012345678
        String ny = "New Year";
//           12345678


        //           0 < 3
        for (int i = 0; i <= ny.substring(0, 2).length(); i++) {
            // N
            // e
            System.out.println(ny.charAt(i));
            for (int h = 0; h < 2; h++) {

                //           4 < 8
                for (int p = 4; p < ny.length(); p++) {
                    System.out.print(" " + ny.charAt(p));
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("________");


        Scanner scan = new Scanner(System.in);
        String login = "Bems";
        String password = "b123";
        String userLogin;
        String userPassword = "";

        System.out.println("Enter your login: ");
        userLogin = scan.next();
        if (!userLogin.equals(login)) {
            for (int i = 0; i < 2; i++) {
                System.out.println("Invalid login! Try again: ");
                userLogin = scan.next();
                if (userLogin.equals(login)) {
                    System.out.println("Enter your password: ");
                    userPassword = scan.next();
                    break;
                }
            }
            if (!userPassword.equals(password)) {
                for (int j = 0; j < 2; j++) {
                    System.out.println("Invalid password! Try again: ");
                    userPassword = scan.next();
                    if (userPassword.equals(password)) {
                        System.out.println("Welcome");
                        break;
                    }
                }
            }
        } else {
            System.out.println("Enter your password: ");
            userPassword = scan.next();
            if (userPassword.equals(password)) {
                System.out.println("Welcome");
            } else {
                System.out.println("Invalid password!");
            }
        }
    }
}
