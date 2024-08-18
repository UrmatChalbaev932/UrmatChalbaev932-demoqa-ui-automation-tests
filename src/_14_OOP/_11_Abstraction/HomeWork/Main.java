package _14_OOP._11_Abstraction.HomeWork;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Contact obama = new Contact("Obama", 95682560,
                "Obama pick up the phone, this is not Putin");

        Contact mama = new Contact("BOSS", 16777215,
                "Di..Don...Din...Don...");



//        System.out.println("=======MobilePhone======");
//        MobilePhone apple = new MobilePhone("Apple", "Ipone-8", 100);
//        System.out.println(apple.brand);
//        System.out.println(apple.model);
//        System.out.println(apple.getBalance());
//        System.out.println(apple.call(obama));
//        apple.sendMassage(mama);
//        apple.useInternet();


        System.out.println("=======LandlineTelephon======");
        LandlineTelephone  landlineTelephone = new LandlineTelephone("PANASONI", "KX-TS2350", 0 );
        System.out.println(landlineTelephone.brand);
        System.out.println(landlineTelephone.model);
        System.out.println(landlineTelephone.getBalance());
        landlineTelephone.setBalance(100);
        System.out.println(landlineTelephone.getBalance());
        System.out.println(landlineTelephone.call(mama));

    }
}
