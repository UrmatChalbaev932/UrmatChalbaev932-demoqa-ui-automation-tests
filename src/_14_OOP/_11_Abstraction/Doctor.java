package _14_OOP._11_Abstraction;

public class Doctor extends Person{

    public Doctor(String name, int age, char gender, int iDPassport) {
        super(name, age, gender, iDPassport);
    }

    @Override
    public String work() {
        return "To treat somebody";
    }

}

