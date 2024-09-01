import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Test ts = new Test();

    }

    public void toFlyJump() {
        int age = 18;
        int weight = 60;
        String str = "agree";

        System.out.println("welcome to fly jump");
        Scanner scan = new Scanner(System.in);
        System.out.println("how old are you?");
        int scannerAge = scan.nextInt();
        if (scannerAge >= 18 && scannerAge < 50) {
            System.out.println("What weight do you have");
            int scannerWeight = scan.nextInt();
            if (scannerAge >= 18 && scannerAge < 50 && scannerWeight >= 55 && scannerWeight < 100) {
                System.out.println("you signed?");
                String ScannerAgree = scan.next();
                if (str.equalsIgnoreCase(str)) {
                    System.out.println("fly jump");
                } else {
                    System.out.println("dont fly jump");
                }
            } else {
                System.out.println("weight does not match");

            }
        } else {
            System.out.println("age does not match");
        }
    }
}