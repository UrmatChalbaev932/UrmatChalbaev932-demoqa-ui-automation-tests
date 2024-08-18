package _8_StringBuilder_Buffer;

import java.util.Scanner;

public class _14_HomeWork {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int ageMin = 18;
        int ageMax = 100;
        int weightMin = 50;
        int weightMax = 100;

        System.out.println("Age:");
        int scannerAge = scan.nextInt();

        System.out.println("Weight:");
        int scannerWeight = scan.nextInt();


        if (scannerAge <= ageMax && scannerAge >= ageMin && scannerWeight <= weightMax && scannerWeight >= weightMin) {
            System.out.println("Donate blood!");
        } else if (scannerAge <= ageMax && scannerAge >= ageMin&& scannerWeight < weightMin) {
            System.out.println("No right to donate blood");
            int res1 = weightMin-scannerWeight;
            System.out.println("You must gain " + res1 + " kg to donate blood");
        } else if (scannerAge < ageMin && scannerWeight <= weightMax && scannerWeight >= weightMin) {
            System.out.println("Must be over 18 years old");
            int res2 = ageMin - scannerAge;
            System.out.println("You must wait " + res2 + " years to donate blood");
        } else {
            System.out.println("you cannot donate blood");
            int res3 = ageMin - scannerAge;
            System.out.println("You must wait " + res3 + " years to donate blood");
            int res4 = weightMin - scannerWeight;
            System.out.println("You must gain " + res4 + " kg to donate blood");
        }





    }
}
