package _14_OOP._6_encaupsulation.PPD;

import java.util.ArrayList;

public class TechPassport {

    public String fullName;
    public String carMark;
    public String carModel;
    public String carNumber;
    public final ArrayList <String> techPassportBase = new ArrayList<>();

    public TechPassport(String fullName, String carMark, String carModel, String  carNumber) {
        this.fullName = fullName;
        this.carMark = carMark;
        this.carModel = carModel;
        this.carNumber = carNumber;
        this.techPassportBase.add(fullName);
        this.techPassportBase.add(carMark);
        this.techPassportBase.add(carModel);
        this.techPassportBase.add(carNumber);
    }

    public TechPassport() {

    }

    @Override
    public String toString() {
        return "TechPassport{" +
                "fullName='" + fullName + '\'' +
                ", carMark='" + carMark + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carNumber='" + carNumber + '\'' +
                '}';
    }
}
