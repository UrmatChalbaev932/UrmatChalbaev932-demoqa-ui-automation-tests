package _14_OOP._6_encaupsulation.PPD;

public class Protocol {

 public String fullName;
 public int INN;


    public Protocol(String fullName, int INN) {
        this.fullName = fullName;
        this.INN = INN;

    }

    public Protocol() {

    }

    @Override
    public String toString() {
        return "Protocol{" +
                "fullName='" + fullName + '\'' +
                ", protocolNumber=" + INN;
    }
}
