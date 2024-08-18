package _14_OOP._10_Сomposition.HomeWork;

import java.util.Arrays;

public class Menu {

    public String kitchen;
    public String dish;
    public int prise;

    public Menu(String kitchen, String dish, int prise) {
        this.kitchen = kitchen;
        this.dish = dish;
        this.prise = prise;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "kitchen='" + kitchen + '\'' +
                ", dish='" + dish + '\'' +
                ", prise=" + prise +
                '}';
    }
}
