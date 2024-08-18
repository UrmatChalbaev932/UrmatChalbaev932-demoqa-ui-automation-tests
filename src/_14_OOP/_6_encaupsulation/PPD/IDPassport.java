package _14_OOP._6_encaupsulation.PPD;

public class IDPassport {
    public String fullName;
    public int INN;

    public IDPassport(String fullName, int INN) {
        this.fullName = fullName;
        this.INN = INN;
    }

    @Override
    public String toString() {
        return "IDPassport{" +
                "fullName='" + fullName + '\'' +
                ", INN=" + INN +
                '}';
    }
}