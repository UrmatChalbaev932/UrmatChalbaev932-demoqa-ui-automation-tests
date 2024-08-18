package _14_OOP._11_Abstraction.HomeWork;

public class LandlineTelephone extends Phone{
    public LandlineTelephone(String brand, String model, int balance) {
        super(brand, model, balance);
    }

    @Override
    public String call(Contact contact) {
        if (getBalance() > 0) {
            return contact.beep + " " + contact.beep;
        } else {
            return "Top up your balance";
        }
}


    @Override
    public String toString() {
        return "LandlineTelephone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
