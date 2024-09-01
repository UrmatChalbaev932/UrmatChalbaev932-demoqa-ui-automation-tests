package _14_OOP._11_Abstraction.HomeWork;

import java.util.List;
import java.util.Scanner;

public class MobilePhone extends Phone {
    public MobilePhone(String brand, String model, int balance) {
        super(brand, model, balance);
    }

    @Override
    public String call(Contact contact) {
        if (getBalance() > 0) {
            return contact.beep +" "+ contact.beep;
        } else {
            return "Top up your balance";
        }
    }

    public void sendMassage(Contact contact) {
        Scanner scan = new Scanner(System.in);
        System.out.print("type the text: ");
        String sms = scan.nextLine();
        if (getBalance() > 0) {
            System.out.println("Sms send to : "+contact.name+ "\nnumber Mobile phone: " +contact.number+ "\n" +sms);
        } else {
            System.out.println("top up your balance");
        }
    }
    public void useInternet() {
        if (getBalance() > 0) {
            System.out.println("Internet connection");
        } else {
            System.out.println("top up your balance");
        }
    }
}

   /* Home work: abstraction
        Создать абстрактный класс телефон с instance variables с разными access modifiers
        Создать getter & setter для private variables
        Создать абстрактный метод звонить
        Унаследовать от него Проводной телефон и Мобильный телефон
        В «Проводной телефон» переопределить метод «звонить» с реализацией, - если есть ежемесячная оплата , то совершить звонок, если нет, то попросить оплатить
        В «Мобильный телефон» переопределить метод «звонить»с реализацией, - если есть баланс, то совершить звонок, если нет баланса, то попросить пополнить баланс:white_check_mark:
        Создать обычный метод «sendMessage»
        Создать обычный метод «useInternet»
        Создать Main class , создать объекты по шаблонам и вызвать все методы (edited)
*/