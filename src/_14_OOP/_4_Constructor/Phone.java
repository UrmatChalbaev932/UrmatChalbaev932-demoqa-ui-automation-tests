package _14_OOP._4_Constructor;

public class Phone {

    public String brand; //    String color;
    public String model; // 13proMax
    public double price;
    public float memory;
    public char simCard;

    //    Motorola         Razr V3
    public Phone(String brand1, String model1){
        brand = brand1; //   motorola
        model = model1; // Razr V3
    }

    //                  13proMax
    public Phone(String model, char simCard) {
        this.model = model;  // 13ProMAx
        this.simCard = simCard;
    }

    public Phone(String brand, String model, double price, float memory, char simCard) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.memory = memory;
        this.simCard = simCard;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", memory=" + memory +
                ", simCard=" + simCard +
                '}';
    }
}
