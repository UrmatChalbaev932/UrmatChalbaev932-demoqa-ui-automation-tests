package _14_OOP._10_Сomposition.HomeWork;

import java.util.Arrays;
import java.util.List;

public class Waiter extends Person {

    public Waiter(int age, String name) {
        super(age, name);

    }
    @Override
    public String toString() {
        return "Waiter{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void welcome(List<Menu> list) {
        System.out.println("Waiter - Добро пожаловать, что хотели бы заказать из нашего меню? \n"+ list);
    }

    public static void checkOrder(){
        System.out.println("Waiter - Ваш заказ принят");
    }

    public String passingToChef(){
       return "Waiter - примите заказ на четвертый столик";
    }

    public String orderDone(){
        return "Waiter - Ваш заказ готов";
    }



}
