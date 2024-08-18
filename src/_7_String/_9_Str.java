package _7_String;

import java.sql.Struct;
import java.text.spi.BreakIteratorProvider;

public class _9_Str
{ public static void main(String[] args) {

    //МЕТОДЫ СТРОК

    // String str = new String ("Hello");
    // Часто используем что можно сократить

    String str = "Hello";
    System.out.println(str.indexOf('H'));
    // - символ под каким индексом находится узнаем

    System.out.println(str.charAt(2));
    // - индекс над каким символом находится узнаем

    int num = 12;
    int num2 = 'A'; //65

    char ch1 = 'G';
    char ch2 =67;

    char res = str.charAt(1); // e
    System.out.println(res);

    char res2 = str.charAt(4); // o
    System.out.println(res2);

    int res3 = str.charAt(4); // 111
    System.out.println(res3);

    int res4 = 'o';
    System.out.println(res4); // 111



    // .concat(); - метод соединения строк
    String one = "First";
    String two = "Second";
    String concact1 = one.concat(two);
    System.out.println(concact1);

    String concact2 = one + two;
    System.out.println(concact2);

    System.out.println("Hello".concat("World"));
    // System.out.println("Hi".concat(123));
    // concat - принадлежит только String
    // нужен когда нужно пользователя обязать
    // использовать только тексты

    //                  2
    //                  "2Bishkek"
    //                     "2Bishkek1"
    //                         "2Bishkek11"
    System.out.println(1+1+" Bishkek " +1+1);
    System.out.println(1+1+" Bishkek " +(1+1));

    // .subString();

    //               01234567
    String flower = "Red rose";
    String resF1 = flower.substring(3); // ___ rose
    System.out.println(resF1);

    String resF2 = flower.substring(4,7); // ___ ros_
    System.out.println(resF2);

    String resF3 = flower.substring(4,8); // ___ rose
    // 8 - находится резервная ячейка
    System.out.println(resF3);

   // String resF4 = flower.substring(4,10); // ошибка
    // System.out.println(resF4);


    // .LastIndexOf - метод ищет последнюю букву
    //                  01234567890
    String coworking = "ololo house";
    System.out.println(coworking.lastIndexOf('o')); // возвращает последнюю букву
    System.out.println(coworking.lastIndexOf("house")); // возвращает первый индекс над первым символом
    //                                       найди о до 3 индекса
    System.out.println(coworking.lastIndexOf('o',3)); // возвращает последнюю букву до 3 индекса
    System.out.println(coworking.lastIndexOf('o',6));


    // .toUpperCase - возвращает строку в большой регистр
    String drink = "Sandora";
    String upper1 = drink.toUpperCase();
    System.out.println(upper1);

    // .toLowerCase() - возвращает строку в нижний регистр
    System.out.println("LAgmAn".toLowerCase());

    // SimpoBoyNoneTvoi

    // .replase (); - заменить / поменять

    String browser = "Gogle chrome";
    System.out.println(browser.replace('c','C')); //Google Chrome
    System.out.println(browser.replace("Gogle","Google"));//Google chrome

    //          01234567890
    String o = "ololo house";
    System.out.println(o.replace("ololo house","ololO house"));
    System.out.println(o.substring(0,4)+o.substring(4,5).toUpperCase()+o.substring(5,11));

            //.toUpperCase().substring(1));
    // System.out.println(o.replace();
   //  charAt(2)


    // method chaining
    //                012345678901234
    String country = "Kyrgyz Republic";
    String result = country.toUpperCase().substring(0,7).trim().toLowerCase().concat("stan");
    //  country        ---> Kyrgyz Republi
    //                      012345678901234
    // .toUpperCase()  ---> KYRGYZ REPUBLIK
    // .substring(0,8) ---> [KYRGYZ ]
    // .trim()         ---> [KYRGYZ]
    // .toLowerCase()  ---> kyrgyz
    // .concat()       ---> kyrgyzstan

    System.out.println(result);

    String school = "Cambridge";
    //                 Cambridge.cambridge.bridge.d
    System.out.println(school.toLowerCase().substring(3).charAt(3));//d
    //                 Cambridge.cambridge.bridge.100
    int result2 = school.toLowerCase().substring(3).charAt(3);//100
    System.out.println(result2);
    //                 Cambridge.cambridge.bridge.не пусто?
    System.out.println(school.toLowerCase().substring(3).isEmpty()); // false

    System.out.println("========================");
    String name1 ="Alex";
    String name2 = "Alex";
    System.out.println(name1==name2); // true
    System.out.println(name1.equals(name2)); // true

    String name3 = new String ("Alex");
    System.out.println(name1 == name3); // false
    System.out.println(name1.equals(name3)); // true

    //хешкод #
    String str1 = "Hello"; // 87823748 - рандомный набор/случайным образом
    // java создает хешкод (уникальный код) для этого значения
    // для приметивных не создается хешкод
    // для непреметивных создается хешкод

    // .trim() - удаляет пробелы
    String str3 = "   hello    ";
    System.out.println(str3);
    System.out.println(str3.trim());

















    }
}
