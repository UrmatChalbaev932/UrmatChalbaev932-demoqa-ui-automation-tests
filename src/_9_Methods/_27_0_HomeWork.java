package _9_Methods;

import java.util.Scanner;

public class _27_0_HomeWork {

    static Scanner scan = new Scanner(System.in);
    static _27_0_HomeWork obj = new _27_0_HomeWork();

    public static void main(String[] args) {

        System.out.print("do you want to register: ");
        String yes = scan.next();
        if (yes.equalsIgnoreCase("yes")) {
            System.out.println(_27_1_UserData.userData());
            System.out.println("log into your account?");
            String yes1 = scan.next();
            if (yes1.equalsIgnoreCase("yes")) {
                System.out.println(_27_2_Project.obj.password());
            }
        } else {
            System.out.println("Stop register!");
        }
    }
}

// пользователь в базе - забыл пароль-3 попытка -
// система предложить ключевое слово и
// ли номер телефона - ключевое слово - система
    /*    сама показывает пароль которую в раннее создавал
                не правильно создан - изменит пароль*/
//снова зайти с новым логином