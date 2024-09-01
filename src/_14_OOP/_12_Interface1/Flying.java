package _14_OOP._12_Interface1;

public interface Flying {

    // 1 abstract methods
    public abstract String toFly();
    // 2 static methods
    public static String toLanding(){
        return "Landing";
    }

    // 3 default methods
    public default String speed () {
        return "Speed";

    }

    // 4 private method
    private String makeManeuver(){
        return "Make any Maneuver";
    }

    //public abstract String toFly(String smth);

    // abstract class -> object;
    // interface      -> methods

    // default -> access modifiers
    // default -> key work: 1. switch
    //                      2. interface

}
