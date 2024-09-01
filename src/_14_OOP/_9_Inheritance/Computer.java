package _14_OOP._9_Inheritance;

public class Computer {
    public String mart;
    protected String model;
    String color;
    private double memory;


    public Computer(String mart) {
        this.mart = mart;
    }

    public Computer(String mart, String model, String color, double memory) {
        this.mart = mart;
        this.model = model;
        this.color = color;
        this.memory = memory;
    }


}
