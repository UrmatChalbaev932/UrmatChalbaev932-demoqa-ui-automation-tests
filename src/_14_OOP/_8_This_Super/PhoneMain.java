package _14_OOP._8_This_Super;

public class PhoneMain {
    public static void main(String[] args) {

        Apple iPhone = new Apple("Apple", "iPhone 13 Pro", "blue",
                256, "ios", 557, "MegaCom");
        System.out.println(iPhone.sendMessage("Hello John Doe"));

        Samsung samsung = new Samsung("Samsung", "Galaxy S22 Ultra", "black",
                513, "Android", 227, "O!", "Beeline");

        System.out.println(samsung.call(samsung.balance, 7));

        System.out.println("=======");

        Contact contact = new Contact("Tanya", "0772001122");
        System.out.println(contact.checkMobileOperator(contact.phoneNumber));
    }
}
