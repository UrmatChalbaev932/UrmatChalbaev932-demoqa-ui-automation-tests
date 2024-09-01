package _14_OOP._4_Constructor;

public class BookMain {
    public static void main(String[] args) {

        Book obj = new Book("Harry Potter");
        System.out.println(obj);

        //
        Book goldenFish = new Book("Golden fish", "A.S.Pushkin", 200);
        System.out.println(goldenFish);

        //                               = "White";
        Phone fonex = new Phone("Motorola", "Razr V3");
        System.out.println(fonex); //    System.out.println(color);

        Phone nokia = new Phone("Nokia", "6300");



    }
}