package _14_OOP._10_Сomposition.HomeWork;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Client extends Person{
    public Scanner scan = new Scanner(System.in);
    public Client(int age, String name) {
        super(age, name);

    }

    public static void callWaiter(){
        System.out.println("Client - официант можно меню");
    }

    public String Order(){
        System.out.println("Client - введите ваш заказ: ");
        String order = scan.nextLine();
        System.out.println ("Client - я хотела бы заказать " +order);
        return order;
    }
    public String complaint (){
        return "Client - это не мой заказ, позовите администратора";
    }
}
