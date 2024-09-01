package _14_OOP._8_This_Super;

public class Apple extends Phone{

    private String e_sim;

    public Apple(String mark, String model, String color, float memory, String os, int balance, String e_sim) {
        super(mark, model, color, memory, os, balance);
        this.e_sim = e_sim;
    }

    @Override
    public String call(int balance, int time) {
        int min_tariff = 4;
        int saldo = balance - time * min_tariff;
        if (saldo <= 0){
            return "insufficient funds";
        }
        return "Call is completed";
    }

    // Overloading: method, constructor
    // Overriding:  method

    // Overloading -> Static polymorphism
    // Overriding  -> Dynamic polymorphism
}