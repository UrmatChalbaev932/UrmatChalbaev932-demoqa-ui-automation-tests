package _14_OOP._11_Abstraction;

public class Dentist extends Doctor{
    public Dentist(String name, int age, char gender, int iDPassport) {
        super(name, age, gender, iDPassport);
    }

    @Override
    public String work() {
        return "to treat teeth";
    }


    public String toTravel (String country) {
        return "Habib come to " + country;
    }
}
