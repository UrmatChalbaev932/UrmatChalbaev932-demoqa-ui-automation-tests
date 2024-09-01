package _8_StringBuilder_Buffer;

public class _12_StrBuilder {
    public static void main(String[] args) {


        int num = 78; // в переменной можно хранить только значение

        String str = "Hello"; // в объекте можно делать действия со значениями

        String str1 = "green"; // в качестве переменной --> создается в pool
        String str2 = "green"; // в качестве переменной --> создается в pool
        String str3 = new String("green"); // в качестве объекта --> создается в heap отдельно
        String str4 = new String("green"); // в качестве объекта --> создается в heap отдельно

        System.out.println("str1 " + str1.hashCode()); // 98619139
        System.out.println("str2 " + str2.hashCode()); // 98619139
        System.out.println("str3 " + str3.hashCode()); // 98619139
        System.out.println("str4 " + str4.hashCode()); // 98619139
        // == проверяет ссылки на hashCode
        System.out.println(str1 == str2); // 98619139 = 98619139 --> true
        System.out.println(str1 == str3); // false, т.к. str1 и str2 были созданы как переменные, а str3 как объект
        System.out.println(str3 == str4); // false

        StringBuilder sb1 = new StringBuilder("Red");
        StringBuilder sb2 = new StringBuilder("Red");
        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb1.hashCode()); // 356573597
        System.out.println(sb2.hashCode()); // 1735600054

        // невозможно сравнить то, что хранится в pool с тем, что хранится в heap

        // String -> variable
        // String -> object
        // variable("red") == variable("red") -> true
        // variable("red") == object ("red") -> false
        // object ("red) == object ("red") -> false, т.к. объекты не сравниваются

        System.out.println("____________");

        StringBuilder sb3 = new StringBuilder("Coffee"); // создался в качестве объекта в Heap
        StringBuilder sb4 = new StringBuilder("Coffee"); // создался в качестве объекта в Heap
        sb4.append(" is my life");
        System.out.println("sb3: " + sb3 + " - " + sb3.hashCode());
        System.out.println("sb4: " + sb4 + " - " + sb4.hashCode());

        String coffee1 = "Coffee"; // создался в качестве переменной Pool
        String coffee2 = "Coffee"; // ссылается уже на созданную переменную Coffee в Pool
        String coffee3 = "Coffee"; // ссылается уже на созданную переменную Coffee в Pool
        String coffee4 = "Coffee"; // ссылается уже на созданную переменную Coffee в Pool
        coffee4.concat("WOW"); // ничего не изменится, т.к. переменная уже создана, а String неизменяемый тип

        // StringBuilder -> as object
        // object ("coffee") == object ("coffee") --> false
        // object ("coffee") == object ("tea") --> tea

        System.out.println("____________");
        String color1 = "purple";
        String color2 = "purple";
        System.out.println(color1.hashCode() + " | " + color2.hashCode());
        System.out.println(color1 == color2); //      true --> same hashCode
        System.out.println(color1.equals(color2)); // true --> same values

        System.out.println("____________");

        StringBuilder color3 = new StringBuilder("Gray");
        StringBuilder color4 = new StringBuilder("Gray");
        System.out.println(color3.hashCode() + " | " + color4.hashCode());
        System.out.println(color3 == color4);          // false
        System.out.println(color3.equals(color4));     // false

        System.out.println(color3.toString().equals(color4.toString())); // true


        StringBuffer sb6 = new StringBuffer("Hello");
        sb6.setCharAt(3,'F');
        System.out.println(sb6);
        System.out.println(sb6.hashCode());

        //Home work:
        //String сконвертировать в StringBuilder и наоборот тоже
        // StringBuilder «Nomad» -  в конце добавить «s», удалить первую букву,
        // вставить в индекс 0 символ «n», символ «M » сделать верхним регистром
        System.out.println("==========================");


        StringBuilder sb7 = new StringBuilder("Nomad");
        String sb8 = "Nomad";
        // 1.

        // StringBuilder перевели в String

        System.out.println(sb7.toString().hashCode());

        // String перевели в StringBuilder

        StringBuilder sb9 = new StringBuilder(sb8);
        System.out.println(sb9.hashCode());

        // String перевели в StringBuilder

        StringBuilder sb10 = new StringBuilder();
        sb10.append(sb8);
        System.out.println(sb10.hashCode());

        System.out.println("================================");

        // 2.                                  012345
        StringBuilder sb11 = new StringBuilder("Nomad");

        // метод setCharAt() устанавливает символ
        // по определенному индексу:

        sb11.deleteCharAt(0);
        System.out.println(sb11);

        // Метод delete() удаляет все символы с определенного
        // индекса c определенной позиции, а метод deleteCharAt()
        // удаляет один символ по определенному индексу:

        sb11.insert(4,'s');
        System.out.println(sb11);

        System.out.println("================================");

        // 3.
        StringBuilder sb13 = new StringBuilder("Nomad");

        // метод setCharAt() устанавливает символ по определенному индексу:

        sb13.setCharAt(0,'n');
        System.out.println(sb13);

        // метод setCharAt() устанавливает символ по определенному индексу:

        sb13.setCharAt(2,'M');
        System.out.println(sb13);







    }
}
