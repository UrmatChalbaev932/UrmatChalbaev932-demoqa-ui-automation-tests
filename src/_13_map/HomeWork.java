package _13_map;

import java.util.*;

public class HomeWork {
    public static void main(String[] args) {

        Map <String, Integer> map = new HashMap<>();
        map.put("XS",40);
        map.put("S",42);
        map.put("M",44);
        map.put("L",46);
        map.put("XL",48);
        map.put("XXL",50);
        map.put("XXXL",52);
        System.out.println(map);

        //1. вариант исполнения.

//         map.keySet().removeIf(key -> key.contains("XX"));
//         System.out.println(map);
//
//         ArrayList <String> arrMap = new ArrayList<>(map.keySet());
//         System.out.println(arrMap);
//
//         TreeSet <Integer> treeSetMap = new TreeSet<>(map.values());
//         System.out.println(treeSetMap);


        //2. вариант исполнения

//        Iterator <String> iterator = map.keySet().iterator();
//        while (iterator.hasNext()) {
//            if (iterator.next().contains("XX")) {
//                iterator.remove();
//            }
//        }
//
//         ArrayList <String> arrMap = new ArrayList<>(map.keySet());
//         System.out.println(arrMap);
//
//         TreeSet <Integer> treeSetMap = new TreeSet<>(map.values());
//         System.out.println(treeSetMap);


        //3. вариант исполнения

//        ArrayList <String> arrMap = new ArrayList<>();
//        TreeSet<Integer> treeSetMap = new TreeSet<>();
//        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
//
//        while (iterator.hasNext()){
//            Map.Entry<String, Integer> entry = iterator.next();
//            if (entry.getKey().contains("XX")){
//                iterator.remove();
//            }
//            else {arrMap.add(entry.getKey());
//                 treeSetMap.add(entry.getValue());
//            }
//        }
//
//        System.out.println(map); //{S=42, XL=48, XS=40, L=46, M=44}
//        System.out.println(arrMap); //[S, XL, XS, L, M]
//        System.out.println(treeSetMap); //[40, 42, 44, 46, 48]


    }

}
