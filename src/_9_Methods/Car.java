package _9_Methods;

import java.util.Scanner;

public class Car {
    public static void main(String[] args) {
    /*    String name = new String("Kristal");
        name.concat(" Jameson");
        name.substring(1,4);

        Car bmw = new Car();
        bmw.toBreak();
        bmw.toDrive();
*/
        // key words            --> variable
        // class(non-primitive) --> object


   /* public void toDrive(){
        System.out.println("Wrooom Wrooom!");
    }

    public void toBreak(){
        System.out.println("STOP");
    }

    // void method*/
        // return method

        Scanner scan = new Scanner(System.in);

        userLogin();
    }

    public static void userLogin() {
        System.out.println("Выполните вход в аккаунт");
        System.out.println(loginCheck(""));
        System.out.println(passCheck(""));
        System.out.println(keywordCheck(""));
    }

    public static String loginCheck(String str) {
        Scanner loginScan = new Scanner(System.in);
        String login = "xsenen";
        System.out.println("Введите логин: ");
        String str1 = loginScan.next();
        if (!(str1.equalsIgnoreCase(login))) {
            return "Неверный логин";
        }
        return "Введите пароль: ";
    }

    public static String passCheck(String str) {
        Scanner loginScan2 = new Scanner(System.in);
        String password = "qwerty123";
        String str2 = loginScan2.next();
        if (!(str2.equals(password))) {
            return "Неверный пароль. Введите ключевое слово:";
        }
        return "Вход в аккаунт выполнен.";
    }

    public static String keywordCheck(String str) {
        Scanner loginScan3 = new Scanner(System.in);
        String keyWord = "Oblako";
        String str3 = loginScan3.next();
        if (!(str3.equalsIgnoreCase(keyWord))) {
            return "Повторите вход заново.";
        } else if (str3.equalsIgnoreCase(keyWord)) {
            System.out.println("Задайте новый пароль:");
            String newPass = loginScan3.next();
            return newPassword(newPass) + "\nПароль был успешно изменен.";
        }
        return "Вход в аккаунт выполнен.";
    }

    public static String newPassword(String newUserPass) {
        return "Ваш новый пароль: " + newUserPass;
    }
}


