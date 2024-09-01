package _14_OOP._12_Interface1.HomeWork;

public class Car implements Drivable {
    public String mark;
    public String model;
    public boolean engine;
    public int wheels;
    public int fuel;

    public Car(String mark, String model, boolean engine, int wheels, int fuel) {
        this.mark = mark;
        this.model = model;
        this.engine = engine;
        this.wheels = wheels;
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                ", wheels=" + wheels +
                ", fuel=" + fuel +
                '}';
    }

    @Override
    public String toDrive() {
        if (!this.engine && this.wheels != 4 && this.fuel <= 0) {
            return "Stop";
        } else if (this.engine && this.wheels >= 4 && this.fuel < 10) {
            return "car rides, but Fuel your car urgently";
        } else if (this.engine && this.wheels >= 4 && this.fuel > 10) {
            return "car rides";
        } else return "Stop";
    }


    @Override
    public String signal() {
        return "car honks";
    }

    @Override
    public String maneuver(String maneuver) {
        if ("left".equalsIgnoreCase(maneuver)) {
            return "left turn";
        } else if ("right".equalsIgnoreCase(maneuver)) {
            return "right turn";
        } else {
            return "what do you want to turn?";
        }
    }
}
