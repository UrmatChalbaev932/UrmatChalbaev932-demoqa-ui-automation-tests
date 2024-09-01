package _14_OOP._2_OOP;

public class CarMain {
    public static void main(String[] args) {
        Car merc = new Car();
        merc.mark = "Mercedes";
        merc.model = "S class";
        merc.color = "Black";
        System.out.println("Mark: \t" + merc.mark +
                "\nModel: \t" + merc.model +
                "\nColor: \t" + merc.color);
        System.out.println("_____");
        System.out.println(merc); // _16_oop.Car@2ff4acd0
        System.out.println("_____");

        Car toyota = new Car();
        toyota.mark = "Toyota";
        toyota.model = "Camry";
        toyota.color = "White";
        System.out.println(toyota);


    }
}