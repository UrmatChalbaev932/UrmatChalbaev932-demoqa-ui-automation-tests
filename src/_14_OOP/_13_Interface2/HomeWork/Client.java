package _14_OOP._13_Interface2.HomeWork;

import java.util.Scanner;

public class Client implements CashPayment, CardPayment, Check {
    private String name;
    private Address address;

    public Client(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public String cardPayment() {
        return "card Payment";
    }

    @Override
    public String cashPayment() {
        return "cash Payment";
    }

    @Override
    public String getСheck() {
        return "get Сheck";
    }

    @Override
    public String provideCheck() {
        return "provide Check";
    }

    public Scanner scan = new Scanner(System.in);
    public Glovo glovo = new Glovo();

    public String order() throws Exception {

        System.out.println("Выберите заведение и укажите его номер: \t");
        glovo.listCafe();
        // выходят заведения
        int choiceOfCafe = scan.nextInt();
        System.out.println("Выберите раздел и укажите его номер: \t");
        // выходят разделы
        glovo.sectionSelection(choiceOfCafe);
        System.out.println("Сделайте заказ и укажите его номер: \t");
        int orderSelection = scan.nextInt();
        // выходит меню раздела
        glovo.menuSelection(orderSelection);
        System.out.println("Ваш заказ был добавлен в корзину!");
        // корзина: 1 - заказ
        // корзина: 2 - заказ
        // корзина: 3 - заказ

        // отмена заказа
        // назад в предыдущее окно
        return null;
    }
}



