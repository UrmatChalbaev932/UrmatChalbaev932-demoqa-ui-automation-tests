package _14_OOP._12_Interface1.HomeWork;

public class Main {
    public static void main(String[] args) {
        Car lexus = new Car("Luxus", "RX-350", true, 4, 25);
        System.out.println(lexus);
        System.out.println(lexus.maneuver("left"));
        System.out.println(lexus.signal());
        System.out.println(lexus.toDrive());

        Bike bike = new Bike("LSD", "fr-123", 2);
        System.out.println(bike);
        System.out.println(bike.maneuver("left"));
        System.out.println(bike.signal());
        System.out.println(bike.toDrive());
    }
}
