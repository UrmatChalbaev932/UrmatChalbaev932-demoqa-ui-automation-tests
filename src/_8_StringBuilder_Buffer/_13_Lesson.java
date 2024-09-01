package _8_StringBuilder_Buffer;

import _5_If_else.IfElse;

import java.util.Scanner;

public class _13_Lesson {
    public static void main(String[] args) {

        // Login -> password -> full name -> gender

        String UserName1 = "Urmat";
        String Password1 = "0555016979U";
        String LastName1 = "Urmat Tolkunbekovich Tolkunbekovich";

        String UserName2 = "Badam";
        String Password2 = "0704153215B";
        String LastName2 = "Turgunbaeva Badam Almasbekovna";

        System.out.println("Username:");
        Scanner scan = new Scanner(System.in);
        String scannerUserName = scan.next();

        switch (scannerUserName) {
            case "Urmat":
                if (scannerUserName.equalsIgnoreCase(UserName1)) {
                    System.out.println("Password:");
                    String scannerPassword = scan.next();
                    if (scannerPassword.equalsIgnoreCase(Password1)) {
                        scan.nextLine();
                        System.out.println("Full name:");
                        String scannerFullName = scan.nextLine();
                        if (scannerFullName.equalsIgnoreCase(LastName1)) {
                            if (scannerFullName.endsWith("ich") || (scannerFullName.endsWith("ov"))) {
                                System.out.println("Gender: man");
                                System.out.println("Welcome");}
                        } else {System.out.println("Stop full name!");}
                    } else {System.out.println("Stop password!");}
                }
            case "Badam":
                if (scannerUserName.equalsIgnoreCase(UserName2)) {
                    System.out.println("Password:");
                    String scannerPassword2 = scan.next();
                    if (scannerPassword2.equalsIgnoreCase(Password2)) {
                        scan.nextLine();
                        System.out.println("Full name:");
                        String scannerFullName2 = scan.next();
                        if (scannerFullName2.equalsIgnoreCase(LastName2)) {
                            if (scannerFullName2.endsWith("ich") || (scannerFullName2.endsWith("ov"))) {
                                System.out.println("Gender: women");
                                System.out.println("Welcome");}
                        } else {System.out.println("Stop full name!");}
                    } else {System.out.println("Stop password!");}
                }
                break;
            default:
                System.out.println("SpotUserName");
        }






    }
}
