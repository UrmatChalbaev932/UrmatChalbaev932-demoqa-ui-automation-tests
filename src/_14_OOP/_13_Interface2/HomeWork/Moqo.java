package _14_OOP._13_Interface2.HomeWork;

public class Moqo {
    public String name;
    public Menu menu;

    public Moqo(String name, Menu menu) {
        this.name = name;
        this.menu = new Menu(menu.sups, menu.secondСourse, menu.drinks);
    }

    @Override
    public String toString() {
        return "Moqo{" +
                "name='" + name + '\'' +
                ", menu=" + menu +
                '}';
    }
}
