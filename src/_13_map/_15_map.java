package _13_map;

import java.util.*;

public class _15_map {
    public static void main(String[] args) {


        // 1. variable
// 2. object
        // String/StrungBuilder -> 1
        // Arrays -> fixed size              [12,34,67]
        // List   -> flexible -> index       [12,34,67]
        // Set    -> flexible -> no index    [12,34,67]
        // Map

//       Key,    Value
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(312, "Bishkek");
        map1.put(996, "KG");
        map1.put(555, "MegaCom");
        System.out.println("Map1 - " + map1);


        LinkedHashMap<Integer, String> map2 = new LinkedHashMap<>();
        map2.put(700, "O!");
        map2.putAll(map1);
        map2.put(777, "Beeline");
        System.out.println("Map2 - " + map2);

        TreeMap<Integer, String> map3 = new TreeMap<>();
        map3.putAll(map2);
        System.out.println("Map3 - " + map3);

        HashMap<String, String> map4 = new HashMap<>();
        map4.put("UK", "London");
        map4.put("KG", "Bishkek");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(23);
        list1.add(99);
        list1.add(10);             //   0,  1,  2,  3
        System.out.println(list1); // [23, 99, 10, 99]  0=23, 1=99..

        HashMap<Character, Integer> mark = new HashMap<>();
        mark.put('A', 100);
        mark.put('B', 80);
        mark.put('B', 70);
        mark.put('C', 100);
        System.out.println(mark);

        TreeMap<String, Boolean> status = new TreeMap<>();
        status.put("Nurzat", true);
        status.put("Elzaada", false);
        status.put("Askar", false);
        System.out.println(status);
        System.out.println(status.values()); //[false, false, true]
        System.out.println(status.keySet());//[Askar, Elzaada, Nurzat]

        TreeMap<Boolean, Character> map6 = new TreeMap<>();
        map6.put(true, '@');
        map6.put(true, 'L');
//
        System.out.println(map6);

//                      0        1        2       3
        String colors[] = {"White", "Green", "Black", "Pink"};
        colors[0] = "Gray";
        colors[0] = "Purple";
        System.out.println(Arrays.toString(colors));


        TreeMap <String, String> cars = new TreeMap<>();
        cars.put("Toyota", "Camry");
        cars.put("Honda",  "CR-V");
        cars.put("Subaru", "Forrester");
        cars.put("Mazda",  "626");
        for (String marca: cars.keySet()) {
            System.out.print(marca + " "+cars.get(marca));
        }
        System.out.println();
        for (Map.Entry<String, String> marca: cars.entrySet())
              {
                  System.out.print(marca+ " ");

        }
    }
}
