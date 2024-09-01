
package _6_SwitchCase;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _5_HomeWork {
    public static void main(String[] args) {

        // .equals - Метод equals() проверяет, равны ли два
        // объекта (например, две строки). Метод прописан для основных классов Java.

String str1 = "Good morning";
        String str2 = "Good morning";
        String str3 = "Good evening";

        System.out.println("String '" + str1 + "' equals '" + str2 + "' : " + str1.equals(str2));
        System.out.println("String '" + str1 + "' equals '" + str3 + "' : " + str1.equals(str3));

        //==========================================================================================
        System.out.println("========================================================================");


        //.equalsIgnoreCase - Метод equalsIgnoreCase() – сравнивает данную строку с другой строкой,
        // игнорируя регистр. Две строки считаются равными, если они имеют одинаковую длину и
        // соответствующие символы у двух строк равны, игнорируя регистр букв.

        // Синтаксис метода - public boolean equalsIgnoreCase(String anotherString)

        // В Java equalsIgnoreCase() возвращает значение true, если аргумент не равен null и
        // строки равны, без учета регистра букв; в противном случае значение false.


String Str1 = "Добро пожаловать на Мистер";
        String Str2 = Str1;
        String Str3 = new String("Курс для изучения программирования");
        String Str4 = new String("Добро пожаловать на Мистер");
        boolean retVal;

        retVal = Str1.equalsIgnoreCase(Str2);
        System.out.println("Строка Str1 равна строке Str2? Ответ: " + retVal );

        retVal = Str1.equalsIgnoreCase(Str3);
        System.out.println("Строка Str1 равна строке Str3? Ответ: " + retVal );

        retVal = Str1.equalsIgnoreCase(Str4);
        System.out.println("Строка Str1 равна строке Str4? Ответ: " + retVal );


        //==========================================================================================
        System.out.println("========================================================================");

        //.subString -Метод substring() в Java имеет два варианта и возвращает новую строку,
        // которая является подстрокой данной строки. Подстрока начинается с символа, заданного
        // индексом, и продолжается до конца данной строки или до endIndex-1,
        // если введен второй аргумент.

        //beginIndex – начальный индекс, включительно;
        //endIndex – конечный индекс, не включая.

String Str = new String("Добро пожаловать Мистер");

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str.substring(5,17));

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str.substring(8, 16));

        //==========================================================================================
        System.out.println("========================================================================");

        //.endsWins = Метод endsWith() – проверяет, заканчивается ли эта строка указанным окончанием.

        // Синтаксис метода - public boolean endsWith(String suffix).

        //В Java endsWith() возвращает значение true, если последовательность символов, представленного
        // аргумента является окончанием последовательности символов, представленного этим объектом; в
        // противном случаи значение false. Обратите внимание, что результатом будет значение true,
        // если аргумент является пустой строкой или равным строковому объекту, определено как
        // методом equals(Object).

       /* String Str = new String("Добро пожаловать на курсы тестировщика");
        boolean retVal;

        retVal = Str.endsWith("щика");
        System.out.println("Возвращаемое значение: " + retVal);

        retVal = Str.endsWith("superman");
        System.out.println("Возвращаемое значение: " + retVal);*/


        //==========================================================================================
        System.out.println("========================================================================");

        //.contain - Метод contains() – это метод Java, позволяющий проверить, содержит ли String другую
        // подстроку или нет. Возвращает логическое значение, поэтому его можно использовать непосредственно
        // внутри операторов if.

        //public boolean String.contains(CharSequence s)

        //s – это последовательность поиска
        //Возвращаемое значение
        //Этот метод возвращает true, только если эта строка содержит «s», иначе false.
        //Исключеник - NullPointerException – если значение s является нулем.

String str_Sample = "This is a String contains Example";
        //Check if String contains a sequence
        System.out.println("Contains sequence 'ing': " + str_Sample.contains("ing"));
        System.out.println("Contains sequence 'Example': " + str_Sample.contains("Example"));
        //String contains method is case sensitive
        System.out.println("Contains sequence 'example': " + str_Sample.contains("example"));
        System.out.println("Contains sequence 'is String': " + str_Sample.contains("is String"));

        // Когда использовать метод Contains() ?
        // Это обычный случай в программировании, когда вы хотите проверить, содержит ли
        // конкретная строка определенную подстроку. Например, если вы хотите проверить,
        // содержит ли строка “The big red fox” подстроку  “red.”Этот метод полезен в
        // такой ситуации.

        System.out.println("========================================================================");


      /*  String str1 = "Java string contains If else Example";
        // In If-else statements you can use the contains() method
        if (str1.contains("example")) {
            System.out.println("The Keyword :example: is found in given string");
        } else {
            System.out.println("The Keyword :example: is not found in the string");
        }*/


        //==========================================================================================
        System.out.println("========================================================================");

        // 1. Scanner -> registration (Login, password, full  -> 'M', "ev/ov" ->'F')
        // 2. Login -> true -> password
        // 3. Login -> false -> Wrong login
        // 4. Login -> true -> password -> true -> Success

        Scanner scan = new Scanner(System.in);
        // Система - вы хотите зарегистрироваться ?
        System.out.print("Registration?: ");
        // Пользователь - Да
        String yes = "Yes";
        String yesAnswer = scan.next();
        // Система - просит указать возраст
        System.out.print("Аge: ");
        // Пользователь - указывает возраст
        int ageAnswer = scan.nextInt();
        // Система проверяет возраст пользователя
        int age = 18;
        // Система - если пользователю нет 18 лет отказывает в регистрации
        if (ageAnswer >= age) {
            System.out.println("Age appropriate");
        } else {
            System.out.println("Denied");
        }
        // Система - просит указать ФИО:
        System.out.print("Full name: ");
        // Пользователь вводит ФИО
        String name = scan.nextLine();
        // Система - автоматически определяет пол за счет окончания отчества
        if (name.endsWith("ич") || name.endsWith("ов")) {
            System.out.println("Gender: male");
        } else if (name.endsWith("на") || name.endsWith("ва")) {
            System.out.println("Gender: female");
        }else {
            System.out.println("Full name filled in incorrectly");
        }

        /*// Система - просит создать логин и указывает правила создания логина
        System.out.println("Создать логин - должно состоять не менее из 8 значений из латинских\n " +
                " букв верхнего и нижнего регистра а также содержать цифры и символы");
        // Пользователь - создает логин
        //  \d \Deprecated
        // "A.++a" - сверхжадный режим квантификатораЫ
        String login = scan.nextLine();
        Pattern pattern = Pattern.compile();
        Matcher matcher= pattern.matcher(login);
        while (matcher.find()) {
        System.out.println(login.substring(matcher.start(), matcher.end()));
        }*/


        // Система - проверяет правильно ли был создан логин !
        // Система - если ошибка отправляет на начало регистрации
        // Система - просит создать пароль и указывает правила создания пароля
        // Пользователь - создает пароль
        // Система - проверяет пароль
        // Система - регистрирует пользователя или отправляет на начало создание пароля

        // общая задача - найти фунцию возвращающий пользователя обратно
        // найти фунцию для

    }
}
