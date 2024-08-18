package _9_Methods;

import java.util.Scanner;

public class _27_2_Project {
    static Scanner scan = new Scanner(System.in);
    static _27_2_Project obj = new _27_2_Project();
    public String password() {
        int i;
        String result="";
        String result1="";
        for (i = 0; i<3; i++) {
            System.out.println("Login: ");
            String scanLogin = scan.next();
            System.out.println("Password: ");
            String scanPassword = scan.next();

            if (!(scanLogin.equals(_27_1_UserData.login) && scanPassword.equals(_27_1_UserData.password))) {
                System.out.println("Login or Password invalid");
                result1 = "account is blocked";
            } else {
                result1 = "Welcome in system " + scanLogin;
                break;
            }
        }return result1;
    }
}
