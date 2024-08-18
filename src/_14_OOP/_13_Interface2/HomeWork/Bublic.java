package _14_OOP._13_Interface2.HomeWork;

import _5_If_else.TernaryOperation;

public class Bublic {
    public String name;
    public Menu menu;

    public Bublic(String name, Menu menu) {
        this.name = name;
        this.menu = new Menu(menu.sups, menu.secondСourse, menu.drinks);
    }

    @Override
    public String toString() {
        return "Bublic{" +
                "name='" + name + '\'' +
                ", menu=" + menu +
                '}';
    }
}
