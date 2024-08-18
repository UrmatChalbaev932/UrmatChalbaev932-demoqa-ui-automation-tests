package _14_OOP._2_OOP;

public class Car {

    // fields
    public String mark;
    public String model;
    public String color;


//    public String toString(){
//        return "Mark: \t" + mark + "\nModel: \t" + model + "\nColor: \t" + color;
//    }

    // mac  --> command + N
    // win  --> ctrl + N


    @Override // annotation
    public String toString() {
        return "Car{" +
                "mark: " + mark + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}