package _14_OOP._10_Сomposition.HomeWork;

import java.security.cert.CertPath;
import java.util.LinkedList;
import java.util.List;

public class CoffeeHouse {
    Administrator administrator;
    Client client;
    Cook cook;
    Founder founder;
    List<Menu> menu;
    Waiter waiter;

    public CoffeeHouse(Administrator administrator, Client client, Cook cook, Founder founder, List<Menu> menu, Waiter waiter) {
        this.administrator = new Administrator(administrator.age, administrator.name);
        this.client = client;
        this.cook =new Cook(cook.age, cook.name);
        this.founder = new Founder(founder.age, founder.name);
        this.menu = new LinkedList<>(menu);
        this.waiter = new Waiter(waiter.age, waiter.name);
    }

    @Override
    public String toString() {
        return "CoffeeHouse{" +
                "administrator=" + administrator +
                ", client=" + client +
                ", cook=" + cook +
                ", founder=" + founder +
                ", menu=" + menu +
                ", waiter=" + waiter +
                '}';
    }
}
