package _14_OOP._10_Сomposition.HomeWork;

import java.util.LinkedList;
import java.util.List;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {

        Menu lagam = new Menu("Vostoc", "Lagman", 234);
        Menu bosoLagan = new Menu("Vostoc","Boso Lagman", 359);
        Menu coffee = new Menu("Zapad","Nescafe", 150);
        Menu tea = new Menu("Zapad","Green tea", 50);
        List <Menu> menus = new LinkedList<>();
        menus.add(lagam);
        menus.add(bosoLagan);
        menus.add(coffee);
        menus.add(tea);

        Waiter waiter = new Waiter(23, "Sary");
        Client client = new Client(25, "Elana");
        Cook cook = new Cook(44, "Murat");
        Administrator administrator = new Administrator(35, "MiniShep");
        Founder founder = new Founder(55, "SHEP");

        CoffeeHouse coffeeHouse = new CoffeeHouse(administrator, client, cook, founder, menus, waiter);
        System.out.println(coffeeHouse);

        Client.callWaiter();
        Waiter.welcome(menus);
        String order= client.Order();
        Waiter.checkOrder();
        System.out.println(waiter.passingToChef());
        System.out.println(cook.done());
        System.out.println(waiter.orderDone());
        System.out.println(client.complaint());
        System.out.println(administrator.myName());
        System.out.println(administrator.receivingСomplaints());
        System.out.println(administrator.denunciation());
        System.out.println(founder.wicked());








    }
}
