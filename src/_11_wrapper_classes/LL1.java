package _11_wrapper_classes;

import java.util.*;

public class LL1 {
    public static void main(String[] args) {
        String[][] arrStr = {{"KG", "RU"}, {"USA", "KZ"}};

        ArrayList list = new ArrayList();

        for (String[] str : arrStr) {
            for (String st : str) {
                list.add(st);

            }
        }
        System.out.println(list); //[KG, RU, USA, KZ]

        System.out.println("------------------------");

        // ArraysList -> data type, Length();

        // Arrays -> generic/nom generic, free size;

        // StringBuilder - StringBuffer;

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Aigul");
        list1.add("Iroda");
        System.out.println(list1); //[Aigul, Iroda]
        list1.set(0, "Mira");
        System.out.println(list1);//[Mira, Iroda]

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Sultan");
        list2.add("Kanykey0");
        list2.add("Kanykey1");
        list2.add("Kanykey2");
        System.out.println(list2); //[Sultan, Kanykey]
        list2.set(0, "Asan");

        String sss = list2.get(2);
        System.out.println(sss);
        System.out.println(list2);
        System.out.println("=========");
        System.out.println(list2);//[Asan, Kanykey]
        list2.addFirst("Asiya");
        System.out.println(list2);//[Asiya, Asan, Kanykey]
        list2.addLast("Azamat");
        System.out.println(list2); //[Asiya, Asan, Kanykey, Azamat]
        list2.remove("Asiya");
        System.out.println(list2); //[Asan, Kanykey, Azamat]
        list2.removeFirst(); //[Kanykey, Azamat]
        list2.removeLast(); //[Kanykey]
        System.out.println(list2);

        // ArrayList ->
        // 1. add(object);
        // 2. add(index, object);
        // 3. addAll(collection);
        // 4. addAll(index, Collection);
        // 1. remove(object);
        // 2. remove(index, object);
        // 3. remove(collection);
        // 4. remove(index, Collection);

        // LinkedList ->
        // 1. add(object);
        // 2. add(index, object);
        // 3. addAll(collection);
        // 4. addAll(index, Collection);
        // 5. addFirst();
        // 6. addLast();
        // 1. remove(object);
        // 2. remove(index, object);
        // 3. removeAll(collection);
        // 4. removeAll(index, Collection);
        // 5. removeFirst();
        // 6. removeLast();


        // Создать list с 5 элементами из городов
        // Если города дублируются 2 раза, то удалить дубликаты
        // Если города дублируются 3 и более раз, то оставить первый дубликат, а остальные удалить
        // Если все города дублируются, то возвратить пустой массив


        System.out.println("------------------------");

        // вариант Айжан Тумарбековой

        LinkedList<String> cities = new LinkedList<>();
        cities.add("Bishkek");
        cities.add("Bishkek");
        cities.add("London");
        cities.add("London");
        cities.add("Moscow");
        cities.add("Moscow");
        cities.add("Novolend");
        cities.add("Novolend");


        System.out.println(cities);

        LinkedList<String> uniqueCities = new LinkedList<>();

        for (String city : cities) {
            // Проверяем, сколько раз город уже встретился
            int count = 0;
            for (String uniqueCity : uniqueCities) {
                if (uniqueCity.equals(city)) {
                    count++;
                }
            }

            if (count == 0) { // индекс
                // Город встречается первый раз
                uniqueCities.add(city);
            } else if (count == 1) {
                // Город встречается второй раз, удаляем дубликат
                uniqueCities.remove(city);
            }
        }

        if (uniqueCities.isEmpty()) {
            System.out.println("Пустой массив");
        } else {
            System.out.println("Уникальные города:");
            for (String city : uniqueCities) {
                System.out.println(city);
            }
        }


     System.out.println(Arrays.toString(sayHi(new String[]{"White", "Green", "Green", "red"})));
    }


public static String[] sayHi(String[] arrays){

        for (int i = 0; i < arrays.length; i++){
            for (int j = i + 1; j < arrays.length; j++){
                if (arrays[i] == arrays[j]){
                    arrays[i] = "0";
                    j--;
                }
            }
        }
            return arrays;
    }


}

