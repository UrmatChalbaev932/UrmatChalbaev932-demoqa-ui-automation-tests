package _11_wrapper_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_my {
    public static void main(String[] args) {

        //ArrayList делиться на:
        //1. generic; - когда тип данных не указан
        //2. non-generic; - когда тип данных не указан


        ArrayList<String> deliveryCities = new ArrayList<>(); // создали лист без указания количества элементов;
        // через метод add() добавляем в список элементы со значением
        deliveryCities.add("New York");
        deliveryCities.add("Chicago");
        deliveryCities.add("Toronto");
        deliveryCities.add("Paris");
        System.out.println(deliveryCities.size());//4

        //А что, если нам нужно добавить элемент в середину списка?
        add:
        deliveryCities.add(1, "London"); // добавили после 0 индекса элемент со значением Лондон
        System.out.println(deliveryCities); //[Chicago, London, New York, Toronto, Paris]

        // как добавления элемента выглядит в Arrays:
        System.out.println("==================start пример с Array=====================");
        String [] seasons1 = {"Winter", "Spring", "Summer", "Autumn"};
        String [] seasons2 = new String[seasons1.length+1];
        int i =0;
        for (String seas: seasons1) {
            if (seas.equals("Spring")){
                seasons2[i] = "London";
                i++;
            }
            seasons2[i] = seas;
            i++;
        }
        System.out.println(Arrays.toString(seasons2));
        System.out.println("==================end пример с Array=====================");

        //А как же получить элемент под определенным индексом, например, под индексом 2?
        get:
        System.out.println(deliveryCities.get(2)); //New York -> указали индекс в скобках;

        //А как узнать индекс определенного элемента?

        indexOF:
        System.out.println(deliveryCities.indexOf("London")); // 1 указали объект в скобке
        System.out.println(deliveryCities.indexOf("No")); // указали отсутствующий объект в скобке и он вернул нам -1
        contains:
        System.out.println(deliveryCities.contains("London")); // true - такой элемент присутствует в списке
        System.out.println(deliveryCities.contains("No")); // false - такой элемент отсутствует в списке

        //Хорошо, а каким образом мы можем заменить один элемент на другой?

        System.out.println(deliveryCities.set(1, "Berlin")); //London - этот объект хранится под индексом 1
        System.out.println(deliveryCities);//[Chicago, Berlin, New York, Toronto, Paris] заменили элемент Lindon на Berlin

        //А как удалить элементы из Arraylist?
        // есть два способа через индекс элемента в списке и через название элемента в списке

        removeIndex:
        System.out.println(deliveryCities.remove(1)); // Berlin метод remove удаляет элемент под индексом 1
        System.out.println(deliveryCities); // [Chicago, New York, Toronto, Paris] Berlin удален
        removeObject:
        System.out.println(deliveryCities.remove("Paris")); //  true - данный элемент есть в списке и он будет удален
        System.out.println(deliveryCities); //[Chicago, New York, Toronto] Paris удален

        // как отсортировать список ArrayList?
        Collections.sort(deliveryCities);// сортировка через метод collection
        System.out.println(deliveryCities); //[Chicago, New York, Toronto]

        // можно ли массив перевести в ArrayList?
         Integer [] in = {12, 11, 10};
         ArrayList <Integer> inToIn = new ArrayList<>(Arrays.asList(in));
         System.out.println(inToIn); //[12, 11, 10] перевели с массива на ArrayList

        //Если же нам нужно удалить все элементы списка?

        Clear:
        deliveryCities.clear(); // очищает весь список от элементов
        System.out.println(deliveryCities); //[]

        //Заключение:
        /*Когда же использовать обычные массивы, а когда ArrayList?

        Массивы используются, когда:
        1. заранее известно точное количество элементов
        2. не будут добавляться/удаляться элементы

        ArrayList используют во всех остальных случаях.*/





        //ссылка - https://vertex-academy.com/tutorials/ru/arraylist-v-java/
    }
}
