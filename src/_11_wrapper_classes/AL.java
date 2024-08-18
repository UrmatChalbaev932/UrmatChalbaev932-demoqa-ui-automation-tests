package _11_wrapper_classes;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.*;

public class AL {
    public static void main(String[] args) {

        // String
        // StringBuilder

        // Arrays - конкретный
        // ArrayList - гибкий

        // non-generic -> не указан тип данных
        ArrayList list1 = new ArrayList();
        list1.add("Student");
        list1.add('P');
        list1.add(567);
        list1.add(false);
        System.out.println(list1); //[Student, P, 567, false]

        int iii = (int) list1.get(2);
        System.out.println(iii);

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i)); // Student, \n P, \n  567, \n false
        }


        // generic -> указан тип данных
        ArrayList<String> LastName = new ArrayList<>();
        LastName.add("Tanya");
        LastName.add("Badam");
        LastName.add("Azamat");
        LastName.add("Valeriya");
        LastName.add("Dar'ya");
        // LastName.add(123); -> не сработает потому что другой тип
        System.out.println(LastName); //[Tanya, Badam, Azamat, Valeriya, Dar'ya]

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(34);
        list2.add(100);
        list2.add(21);
        System.out.println(list2); //[12, 34, 100, 21]
        list2.add(2, 788); // добавили новое элемент под 1 индексом
        System.out.println(list2); //[12, 34, 788, 100]
        System.out.println(list2.get(3)); //100
        System.out.println(list2.set(2, 100)); // заменяем элемент после 1 индекса
        System.out.println(list2);// [12, 34, 100, 100, 21]
        System.out.println(list2.contains(888)); //false
        list2.set(list2.size() - 1, 555); // последний элемент заменили на 555
        System.out.println(list2); //[12, 34, 100, 100, 555]

        ArrayList<String> names = new ArrayList<>();
        names.add("Ruslan");
        names.add("Umut");
        names.add("Asiya");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Askar");
        names2.add("Elzaada");
        names2.add("Meerim");
        names2.add(1, "Bakyt");
        System.out.println(names2); //[Askar, Bakyt, Elzaada, Meerim]
        names2.addAll(names); // добавить ко второму массиву первый массив
        System.out.println(names2); //[Askar, Bakyt, Elzaada, Meerim, + Ruslan, Umut, Asiya]
        names2.addAll(0, names); // добавить в начало второго массива первый массив
        System.out.println(names2); //[Ruslan, Umut, Asiya, + Askar, Bakyt, Elzaada, Meerim, Ruslan, Umut, Asiya]
        Collections.sort(names2); // сортировака
        System.out.println(names2); // [Asiya, Asiya, Askar, Bakyt, Elzaada, Meerim, Ruslan, Ruslan, Umut, Umut]

        Integer[] numbers = {23, 87, 11, 6};
        System.out.println(Arrays.toString(numbers));

        ArrayList<Integer> arrToList = new ArrayList<>(Arrays.asList(numbers));
        System.out.println(arrToList);


// Primitive     :     byte, shoert, .....
// Non-primitive :     String, Scanner, ArrayList ....
// Arrays        :     []
// Collections   :     ArrayList, LinkedList....


        ArrayList<String> arrCities = new ArrayList<>();
        arrCities.add("Bishkek");
        arrCities.add("Columbus");
        arrCities.add("Rim");

        ArrayList<String> arrCountries = new ArrayList<>();
        arrCountries.add("KG");
        arrCountries.add("USA");
        arrCountries.add("Italy");

        ArrayList<String> arrCityCountry = new ArrayList<>();
        arrCityCountry.add(arrCities.get(0).concat(" ").concat(arrCountries.get(0)));
        arrCityCountry.add(arrCities.get(1).concat(" ").concat(arrCountries.get(1)));
        arrCityCountry.add(arrCities.get(2).concat(" ").concat(arrCountries.get(2)));
        System.out.println(arrCityCountry);
        System.out.println("_________");


        ArrayList<String> arrCityCountry2 = new ArrayList<>();
        for (int i = 0; i < arrCities.size(); i++) {
            arrCityCountry2.add(arrCities.get(i).concat(" ").concat(arrCountries.get(i)));
        }
        System.out.println(arrCityCountry2);


        List<String> lastName = new ArrayList<>();
        lastName.add("a");
        lastName.add("b");
        lastName.add("c");
        lastName.add("d");
        System.out.println(lastName);
        String[] arrayOfStrings = lastName.toArray(new String[0]);
        System.out.println(Arrays.toString(arrayOfStrings));

        String[][] ch = {{"a", "b", "c"}, {"d", "f", "j"}};
        for (int i = 0; i < ch.length * ch[0].length; i++) { // 6 итерации
            int str = i / ch[0].length;
            int stb = i % ch[0].length;
            System.out.print(ch[str][stb] + " ");
        }

        System.out.println(Arrays.binarySearch(ch[0], "a"));
    }


    public boolean frontAgain(String str) {

        if ((str.startsWith("a") && str.endsWith("d"))) {
            return true;
        } else {
            return false;
        }
    }
}