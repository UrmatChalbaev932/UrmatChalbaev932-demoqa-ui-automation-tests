package _14_OOP._13_Interface2.HomeWork;

import java.util.Map;
import java.util.Scanner;

//        Создать класс Client сделать метод заказать еду, связать Client та с интерфейсами.
//        Этот клиент будет выполнять действия - заказать еду, оплатить. При оплате  спросить оплата наличкой или безналом
public class Glovo {
    public String name;
    public Bublic bublic;
    public Moqo moqo;
    public int i = 0;

    public Glovo(String name, Bublic bublic, Moqo moqo) {
        this.name = name;
        this.bublic = new Bublic(bublic.name, bublic.menu);
        this.moqo = new Moqo(moqo.name, moqo.menu);
    }

    public Glovo() {

    }

    @Override
    public String toString() {
        return "Glovo{" +
                "name='" + name + '\'' +
                ", bublic=" + bublic +
                ", moqo=" + moqo +
                '}';
    }

    public void listCafe() {
        System.out.println("1. " + bublic.name + "\n" +
                "\n2. " + moqo.name + "\n");
    }

    public void sectionSelection(int a) throws Exception {
        switch (a) {
            case 1:
                System.out.println("1. " + bublic.menu.sups + "\t" +
                        "\n2. " + bublic.menu.secondСourse + "\t" +
                        "\n3. " + bublic.menu.drinks + "\t");
                break;
            case 2:
                System.out.println("1. " + moqo.menu.sups + "\t" +
                        "\n2. " + moqo.menu.secondСourse + "\t" +
                        "\n3. " + moqo.menu.drinks + "\t");
                break;
            default:
                throw new Exception("Некорректный выбор");
        }
    }

    public void menuSelection(int a) throws Stop {
        switch (a) {
            case 1:
                for (Map.Entry<String, Integer> sup : bublic.menu.sups.entrySet()) {
                    System.out.println(sup);
                }
                break;
            case 2:
                for (Map.Entry<String, Integer> seconCourse : bublic.menu.secondСourse.entrySet()) {
                    System.out.println(seconCourse);
                }
                break;
            case 3:
                for (Map.Entry<String, Integer> drink : bublic.menu.drinks.entrySet()) {
                    System.out.println(drink);
                }
                break;
            default:
                throw new Stop("Некорректный выбор");
        }
    }
}