package _9_Methods;

import java.util.Scanner;

public class _17_jump {
    public static void main(String[] args) {

       _17_jump jump1 = new _17_jump ();
        jump1.toJump();
        System.out.println(jump1);

    }
    void toJump () {

        int ageMin = 18;
        int ageMax = 75;
        int weightMin = 50;
        int weightMax = 80;
        String yes = "Yes";
        Scanner scan = new Scanner(System.in);

        System.out.println("You age: ");
        int ageUser = scan.nextInt();
        System.out.println("You weighMax: ");
        int weightUser = scan.nextInt();
        if (ageUser >= ageMin && ageUser <= ageMax && weightUser >= weightMin && weightUser <= weightMax) {
            System.out.println("Do you agree to the jump: ");
            String agree = scan.next();
            if (agree.equalsIgnoreCase(yes)) {
                System.out.println("You can Jump");
            } else {
                System.out.println("you can not jump");
            }

        }

    }
}

