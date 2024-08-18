package _14_OOP._13_Interface2.HomeWork;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) throws Exception {

        Map<String, Integer> bublicSups = new LinkedHashMap<>();
        bublicSups.put("Solianka", 240);

        Map<String, Integer> bublicsecondСourse = new LinkedHashMap<>();
        bublicsecondСourse.put("Manty", 270);

        Map<String, Integer> bublicdrinks = new LinkedHashMap<>();
        bublicdrinks.put("Tea", 40);

        Menu menuBublic = new Menu(bublicSups, bublicsecondСourse, bublicdrinks);
        Bublic bublicMenu = new Bublic("Bublic menu", menuBublic);

        Map<String, Integer> moqoSups = new LinkedHashMap<>();
        moqoSups.put("Solianka", 240);

        Map<String, Integer> moqosecondСourse = new LinkedHashMap<>();
        moqosecondСourse.put("Manty", 270);

        Map<String, Integer> moqodrinks = new LinkedHashMap<>();
        moqodrinks.put("Tea", 40);

        Menu menuMoqo = new Menu(bublicSups, bublicsecondСourse, bublicdrinks);
        Moqo moqoMenu = new Moqo("Moqo", menuMoqo);

        Glovo glovo = new Glovo("Glovo", bublicMenu, moqoMenu);

        Address address = new Address("Kyrgyzstan", "Bishkek", "Pervomaisky","Isanov", 1 );

        Client client = new Client("Badam", address);

        client.order();









    }
}
