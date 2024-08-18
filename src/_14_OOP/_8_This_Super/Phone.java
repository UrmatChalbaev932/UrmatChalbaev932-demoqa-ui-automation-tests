package _14_OOP._8_This_Super;

public class Phone {

    public String mark;
    public String model;
    public String color;
    public float memory;
    public  String os;
    protected int balance;

    public Phone(String mark, String model, String color, float memory, String os, int balance) {
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.memory = memory;
        this.os = os;
        this.balance = balance;
    }

    public String call(int balance, int time){
        int min_tariff = 4;
        int saldo = balance - time * min_tariff;
        if (saldo <= 0){
            return "insufficient funds";
        }
        return "Call is completed";
    }

    public  String sendMessage(String message){

        return "Sent: " + message;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", memory=" + memory +
                ", os='" + os + '\'' +
                '}';
    }
}
