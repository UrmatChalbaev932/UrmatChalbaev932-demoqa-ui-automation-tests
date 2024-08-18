package _14_OOP._3_Constructor;

public class PersonMain {
    public static void main(String[] args) {

        Person dmitriy = new Person("Dmitriy", 29, 'M');
        System.out.println(dmitriy.name);
        System.out.println(dmitriy.age);
        System.out.println(dmitriy.gender);
        System.out.println(dmitriy);

        Person clark = new Person();

    }
}