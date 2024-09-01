package _14_OOP._12_Interface1.HomeWork;

public class Bike implements Drivable{
    public String mark;
    public String model;
    public int wheels;

    public Bike(String mark, String model, int wheels) {
        this.mark = mark;
        this.model = model;
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", wheels='" + wheels + '\'' +
                '}';
    }

    @Override
    public String toDrive() {
        if (this.wheels==2) {
            return "the bike is riding";
        } else {
            return "not enough wheels";
        }
    }

    @Override
    public String signal() {
        return "bike honks";
    }

    @Override
    public String maneuver(String maneuver) {
        if ("right".equalsIgnoreCase(maneuver)) {
            return "right hand";
        } else if ("left".equalsIgnoreCase(maneuver)) {
            return "left hand";
        } else {
            return "what do you want to turn?";
        }
    }
}

