package _14_OOP._13_Interface2.HomeWork;

import java.util.LinkedHashMap;
import java.util.Map;

public class Menu {
    public Map <String, Integer> sups;
    public Map<String, Integer> secondСourse;
    public Map<String, Integer> drinks;

    public Menu(Map<String, Integer> sups, Map<String, Integer> secondСourse, Map<String, Integer> drinks) {
        this.sups = sups;
        this.secondСourse = secondСourse;
        this.drinks = drinks;
    }

    public Menu() {

    }

    @Override
    public String toString() {
        return "Menu{" +
                "sups=" + sups +
                ", secondСourse=" + secondСourse +
                ", drinks=" + drinks +
                '}';
    }
}
