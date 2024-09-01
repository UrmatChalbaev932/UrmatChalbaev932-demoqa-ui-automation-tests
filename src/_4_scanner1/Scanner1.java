package _4_scanner1;
import java.util.Scanner;
public class Scanner1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        /*char gradeLetter = ' ';
        System.out.println("What is your grade?");
        int grade = scan.nextInt();
        if (grade >= 90 && grade <= 100) {
            gradeLetter = 'A';
        } else if (grade >= 70 && grade <= 89) {
            gradeLetter = 'B';
        } else if (grade >=40  && grade <= 69) {
            gradeLetter = 'C';
        } else if (grade >=0  && grade <= 39) {
            gradeLetter = 'D';
        } else {
            System.out.println("Not grade");
        }
        System.err.println(gradeLetter);*/
        // |0.....39|40....68|70.....89|90.......100

        System.out.println("__________________");
// nested if
        boolean citizen = true;
         int age =24;
         if (citizen == true) {
             System.out.println("KG citizen");
             if (age >=16) {
                 System.out.println("Get ID Passport");
             } else {
                 System.out.println("not valid age for ID passport");
             }

         } else {
             System.out.println("You are a not citizen of KG");
         }

        System.out.println("_________________");

        if (citizen == true && age >=16) {
            System.out.println("You are KG citizen and you can get ID Passport");
        }else {
            System.out.println("No Passport");
        }



    }
}
