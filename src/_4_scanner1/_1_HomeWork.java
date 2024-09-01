package _4_scanner1;
import java.util.Scanner;

public class _1_HomeWork {
    public static void main(String[] args) {

        String question = "What are name?";
        System.out.println(question);

        Scanner name = new Scanner(System.in);
        String who = name.nextLine();
        System.out.println("Hello "+who);
        String urmat = "Urmat";
        String badam = "Badam";
        if (who.equalsIgnoreCase(urmat)) {
            System.out.println("are you in love! "+who);
        }       else if (who.equalsIgnoreCase(badam)) {
            System.err.println("You are very beautiful! "+who);
        }       else {
            System.out.println("You are superman! "+who);}



        /*Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину прямоугольника a: ");
        int a = scan.nextInt();
        System.out.println("Введите ширину прямоугольника b: ");
        int b = scan.nextInt();
        int S = a * b;
        System.out.println("Площадь прямоугольника S равна: " + S);*/


    }
}