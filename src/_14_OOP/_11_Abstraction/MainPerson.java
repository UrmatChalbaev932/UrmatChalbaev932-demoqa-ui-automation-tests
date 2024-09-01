package _14_OOP._11_Abstraction;

import javax.print.Doc;

public class MainPerson {
    public static void main(String[] args) {
        // Person obj = new Person ();
        // 1. abstract methods (no_body) -> abstract class;
        // 2. We cannot create object of Abstract class;
        // 3. Abstract class: regular methods & abstract methods



        // inheritance -> 1 class can inherit 1 class
        // multiple inheritance -> GrandFather -> Dad -> Son -> ....


        // multiple inheritance -> NO
        // multilevel inheritance ->YES

        // abstract class: fields, constructor, regular methods, abstract methods (non_body), -> non object
        // regular class : fields, constructor, regular methods,                              -> object

        // Person (abstract) -> Doctor
        //        no object    yes object


        Doctor doctor = new Doctor("Bykov", 47, 'm', 12345679);
        System.out.println(doctor.breath());
        System.out.println(doctor.work());


        Dentist jim = new Dentist("Jim", 39, 'm', 123);
        System.out.println(jim.breath());
        System.out.println(jim.work());



        StringBuilder sb = new StringBuilder("Hello");
        Object sb2 = new StringBuilder("Salam");
        System.out.println(sb);
        System.out.println(sb2);

        // GrandFather
        // Father
        // Son

        // GrandFather = new GrandFather;
        // GrandFather = new Father;
        // GrandFather = new Son;

        // Father = new Father;
        // Father = new Son;

        // Son - new Son;


        System.out.println("=================");

        Doctor doctor1 = new Doctor("Aibolit", 58, 'm', 123456);

        System.out.println(doctor1.breath());
        System.out.println(doctor1.work());

        Dentist doctor2 = new Dentist("House", 48, 'm', 567890);
        System.out.println(doctor2.breath());
        System.out.println(doctor2.work());
        System.out.println(doctor2.toTravel("USA"));

        }

}
