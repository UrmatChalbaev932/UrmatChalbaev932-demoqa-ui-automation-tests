package _14_OOP._3_Constructor;

public class HomeWorkMain {
    public static void main(String[] args) {
        HomeWork person = new HomeWork("Chalbaev Urmat Tolkunbekovich", 30, "Kyrgystan");
        System.out.println(person);
        System.out.println(person.age_verification());
        System.out.println(person.Verification_of_birth_certificate());
    }
}
