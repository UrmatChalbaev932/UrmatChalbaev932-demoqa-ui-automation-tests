package _15_exceptions._2_Custom_Exception;

public class Passport {
    public String fullName;
    public int age;
    public String citizen;

    public Passport(String fullName, int age, String citizen) {
        this.fullName = fullName;
        this.age = age;
        this.citizen = citizen;
    }

    public void getAPassport() throws InvalidAgeException, InvalidCitizenException {
        if (this.age >= 16) {
            if (this.citizen.equals("KG")) {
                System.out.println("You can get a passport");
            } else {
                throw new InvalidCitizenException("Stop citizen");
            }
        } else {
            Throwable coust = new RuntimeException();
            throw new InvalidAgeException("Stop age ", coust);
        }
    }
}
