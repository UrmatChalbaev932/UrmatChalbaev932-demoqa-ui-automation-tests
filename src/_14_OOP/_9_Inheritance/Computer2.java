package _14_OOP._9_Inheritance;

public class Computer2 extends Computer {
    public Computer2(String mart) {
        super(mart);
    }

    public Computer2(String mart, String model, String color, double memory) {
        super(mart, model, color, memory);
    }

    public static void main(String[] args) {

        Computer obj = new Computer2("HP");
        System.out.println(obj.color);
        System.out.println(obj.mart);
        System.out.println(obj.model);

    }


}
