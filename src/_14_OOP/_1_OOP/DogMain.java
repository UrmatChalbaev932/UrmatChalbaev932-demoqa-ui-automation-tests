package _14_OOP._1_OOP;

public class DogMain {
    public static void main(String[] args) {

        Dog rex = new Dog();
        rex.name = "Rex";
        rex.age = 3;
        rex.color = "black";
        rex.breed = "labrador";
        System.out.println(rex.name);  // Rex
        System.out.println(rex.age);   // 3
        System.out.println(rex.color); // black
        System.out.println(rex.breed); // labrador
        System.out.println(rex.bark());
        System.out.println(rex.sleep());
        System.out.println(rex.eat());

        System.out.println("________");

        Dog belka = new Dog();
        belka.name = "Belka";
        belka.age = 5;
        belka.color = "brown";
        belka.breed = "golden retriever";
        System.out.println(belka.name);
        System.out.println(belka.age);
        System.out.println(belka.color);
        System.out.println(belka.breed);
        System.out.println(belka.bark());
        System.out.println(belka.sleep());
        belka.name = "Kate";
        System.out.println(belka.name);





        Integer num = 7;
        num.doubleValue(); // 7.0
        Integer.max(23, 34);

        Integer num2 = Integer.max(99, 47);
        System.out.println(num2);









        // local variable
        int num3 = 90;
    }
}









