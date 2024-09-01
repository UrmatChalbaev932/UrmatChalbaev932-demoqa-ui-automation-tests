package _3_java_operators;

public class _5_Conversion {
    public static void main(String[] args) {

        // 1 способ - использование оператора конкатенации
        int num = 123;
        String intToStr = "" + num;
        System.out.println(intToStr);
        // данный способ не является оптимальным с точки зрения производительности
        // и может привести к неэфективному использованию памяти
        // проверим работает ли наш способ
        System.out.println(intToStr+50);//12350 результат, значит все правильно
        System.out.println("______________________\n");


        //2 способ - использование метода valueOf() - статистический метод
        int num1 = 42;
        String intToStr1 = String.valueOf(num1);
        System.out.println(intToStr1);
        /*Этот метод имеет ряд преимуществ по сревнению с оператором конкатенации
        Во-первых он является более проиводительным так как не создает лишних обьектов в памяти
        Во-вторых он позволяет работать с другими типами данных такими как double, float*/
        // проверим работает ли наш способ
        System.out.println(intToStr1+10); //4210 результат значит работает


        System.out.println("______________________\n");
        // 3 способ - исользование метода Integer.toString() - статистический метод
        int num2 = 145;
        String intToStr2 = Integer.toString (num2);
        System.out.println(intToStr2);
        System.out.println(intToStr2+10); //14510 результат значит работает


        System.out.println("______________________\n");
        // переведем int в String

        String str = "123";
        int strToInt = Integer.parseInt (str);
        System.out.println(strToInt);
        int resus = strToInt+2;
        System.out.println(resus);

        String str1 = "123";
        int strToInt1 = Integer.valueOf (str1);
        System.out.println(strToInt1);
        int resus1 = strToInt+2;
        System.out.println(resus1);



    }
}
