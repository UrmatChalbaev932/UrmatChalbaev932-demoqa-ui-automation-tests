package _14_OOP._11_Abstraction.HomeWork;

public abstract class Phone {
    public String brand;
    public String model;
    private int balance;

    public Phone(String brand, String model, int balance) {
        this.brand = brand;
        this.model = model;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", balance=" + balance +
                '}';
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public abstract String call(Contact contact);

}
