package _14_OOP._6_encaupsulation.PPD;

public class Driver {
    public String fullName;
    public IDPassport idPassport;
    public DriverCard DriverCard;
    public TechPassport techPassport;
    public int NumberCard;

    public Driver(String fullName, IDPassport idPassport, _14_OOP._6_encaupsulation.PPD.DriverCard driverCard, TechPassport techPassport, int numberCard) {
        this.fullName = fullName;
        this.idPassport = idPassport;
        DriverCard = driverCard;
        this.techPassport = techPassport;
        NumberCard = numberCard;
    }

    public void driverCheckCop() {
        System.out.println("Driver - The officer can indicate the reason for the stop and provide your documents");
    }
    public void checkProtocol(){
        System.out.println("Ok");
    }


    @Override
    public String toString() {
        return "Driver{" +
                "fullName='" + fullName + '\'' +
                ", idPassport=" + idPassport +
                ", DriverCard=" + DriverCard +
                ", techPassport=" + techPassport +
                ", NumberCard=" + NumberCard +
                '}';
    }
}
