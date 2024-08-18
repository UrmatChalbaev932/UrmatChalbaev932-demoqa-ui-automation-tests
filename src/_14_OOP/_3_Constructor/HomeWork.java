package _14_OOP._3_Constructor;

import java.util.Scanner;

public class HomeWork {

    public Scanner scan = new Scanner(System.in);


    public String fullName;
    public Integer age;
    public String citizen;


    @Override
    public String toString() {
        return "HomeWork{" +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", citizen='" + citizen + '\'' +
                '}';
    }

    public HomeWork(String fullName, Integer age, String citizen) {
        this.fullName = fullName;
        this.age = age;
        this.citizen = citizen;
    }

    public String age_verification() {
        String str;
        if (age >= 18) {
            str = "You can get a passport";
        } else {
            str = "You can't get a passport";
        }
        return str;
    }

    public String Verification_of_birth_certificate() {
        String str;
        System.out.println("Enter full name according to: ");
        String fullNameScan = scan.nextLine();
        if (fullNameScan.equals(fullName))
            str = "You are approved";
         else str = "You have been denied";
        return str;
    }
}