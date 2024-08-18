package _14_OOP._6_encaupsulation.PPD;

public class DriverCard {
    public String fullName;
    public char category;

    public DriverCard(String fullName, char category) {
        this.fullName = fullName;
        this.category = category;
    }

    @Override
    public String toString() {
        return "DriverCard{" +
                "fullName='" + fullName + '\'' +
                ", category=" + category +
                '}';
    }
}
