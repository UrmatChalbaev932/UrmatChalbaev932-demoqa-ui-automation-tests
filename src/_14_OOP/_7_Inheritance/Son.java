package _14_OOP._7_Inheritance;

public class Son extends Dad {


    public Son(String name, String eyes, String hair, String RHFactor) {
        super(name, eyes, hair, RHFactor);
    }

    @Override
    public String toDraw() {
        return "Painting ... nature";
    }

    public String toString() {
        return "Son{" +
                "name='" + name + '\'' +
                ", eyes='" + eyes + '\'' +
                ", hair='" + hair + '\'' +
                ", RHFactor'" + getRHFactor()  + '\'' +
                '}';
    }

    // inheritance
    // Dad            --> Son
    // Super class    --> subClass
    // Parent class   --> child class

    // polymorphism --> poly -> many, morph -> forms
    // 1. overloading  -> (current class) same methodNames, but different parameters
    // 2. overriding   -> (parallel classes) same methodNames, but different implementation

    // Home-work
    // Student (fields, methods - 2 (overloading))
    // Pervokursnik extends Students, 1 method(overriding)
    // vtorokursnik extends Students, 2 method(overriding)
}
