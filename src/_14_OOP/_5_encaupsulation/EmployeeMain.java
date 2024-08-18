package _14_OOP._5_encaupsulation;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMain {
    public static void main(String[] args) {

        Address willAddress = new Address("Kyrgyzstan",
                "Bishkek", "Oktyabr", "Sovetskoe",
                51);
        // 3. для исполняния пукта три создали еще один обьект класса address
        Address willAddress1 = new Address("Kyrgyzstan",
                "Bishkek", "Oktyabr", "Sovetskoe",
                51);

        Employee will = new Employee(3417, "Jim",
                "doctor", willAddress);

        System.out.println(will);
        //1. поменяли адрес дома:
        willAddress.house= 55;
        System.out.println(will);
        //2. вызываем адрес;
        System.out.println(will.getAddress());
        //3. меняем один из свойств:
        will.setStreetAddress("Kievskaya");
        System.out.println(will.getStreetAddress());
        System.out.println(will);
        //4. создать универасальный способ для поменяния свойств:
        will.setAddress("Kyrgyzstan",
                "Bishkek", "Oktyabr", "Sovetskoe",
                52); // не то что мы хотели
        Map<Employee, Address> map = new HashMap<>();
        map.put(will, willAddress1);
        System.out.println(map);

    }
}
