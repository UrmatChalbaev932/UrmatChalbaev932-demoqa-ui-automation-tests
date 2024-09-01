package _10_Loops;

import java.util.Scanner;

public class _1_Loop {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) {

            System.out.println(i + " Digital Nomads");  // 0 Digital Nomads
                                                        // 1 Digital Nomads
                                                        // 2 Digital Nomads
                                                        // 3 Digital Nomads
                                                        // 4 Digital Nomads
        }


        System.out.println("++++++++++++++++++++++++++++");

        // Создать запрос пароля и логина с 3 попытками.
        // Сперва идет проверка логина после проверка пароля.



        System.out.println("++++++++++++++++++++++++++++");

       /* В стране XYZ население равно 10 миллионов человек.
        Рождаемость составляет 14 человек на 1000 человек,
        смертность - 8 человек. Рассчитайте, какая численность
        населения будет через 10 лет, принимая во внимание,
        что показатели рождаемости и смертности постоянны.*/

        // Решение:

        int population = 10000000;
        int born = 14;
        int death = 8;
        int dif = born - death; //6
        int years = 10;

        for (int i = 1; i < years; i++) {
            population += population * dif / 1000;
            // 1 years -> 10 000 000 * 0,006 = 60 000;
            // 10 000 000 + 60 000 = 10 060 000;
            // 2 years -> 10 060 000 * 0,006 = 60 360;
            // 10 060 000 + 60 360 = 10 120 360;
            // 3 years -> 10 120 360 * 0,006 = 60722,16;
            // 10 120 360 + 60 722 = 10 181 082;
            //..................................
            // через 10 лет численность населения станет 10 553 140;
        }
        System.out.println(population);


        System.out.println("++++++++++++++++++++++++++++");

       /* В стране XYZ население равно 10 миллионов человек.
       Рождаемость составляет 14 человек на 1000 человек,
       смертность - 8 человек. Каждый год рождается и умирает
       на 1 человек, меньше чем в предыдущий год. Рассчитайте,
       какая численность населения будет через 10 лет, учитывая,
       что рождаемость не может быть меньше 7 человек на 1000 человек,
       а смертоносность не может быть меньше 6 человек на 1000 человек.*/

        // Решение:

        int population0 = 10000000;
        int born0 = 14;
        int death0 = 8;
        int dif0 = born - death; //6
        int years0 = 10;

        for (int i = 1; i < years0; i++) {
            if (born0 > 7) born0-=1;
            if (death0 > 6) death0-=1;
            population0 += population0  * (born0-death0)/1000;
            // 1 years -> 10 000 000 * (14-8)/1 000 = 60 000;
            // 10 000 000 + 60 000 = 10 060 000;
            // 2 years -> 10 060 000 * (13-7)/1 000 = 60 360;
            // 10 060 000 + 60 360 = 10 120 360;
            // 3 years -> 10 120 360 * (12-6) = 60722,16;
            // 10 120 360 + 60 722 = 10 181 082;
            // 4 years -> 10 120 360 * (11-6) = 50 601,8;
            // 10 120 360 + 50 601,8 = 10 170 962;
            //..................................
            // через 10 лет численность населения станет 10 293 580;
        }
        System.out.println(population0);

        System.out.println("++++++++++++++++++++++++++++");

       /* За каждый месяц банк начисляет к сумме вклада 7% от суммы.
       Напишите консольную программу, в которую пользователь вводит
       сумму вклада и количество месяцев. А банк вычисляет конечную
       сумму вклада с учетом начисления процентов за каждый месяц.

       Для вычисления суммы с учетом процентов используйте цикл for.
       Пусть сумма вклада будет представлять тип float.*/

        // Решение:

        System.out.print("% начисления: ");
        float scanPercent = scan.nextFloat()/100;
        System.out.print("Введите сумму вклада: ");
        float scanSum = scan.nextFloat();
        System.out.print("Введите срок вклада в месяцах: ");
        int scanMonth = scan.nextInt();

        for (int i = 1; i < scanMonth; i++) {
            scanSum += scanSum * scanPercent;
        }
        System.out.println("После " + scanMonth+ " месяцев сумма вклада составит "+scanSum);



        System.out.println("++++++++++++++++++++++++++++");

       /* Перепишите предыдущую программу, только вместо
       цикла for используйте цикл while.*/

        // Решение:

        System.out.print("% начисления: ");
        float scanPercent0 = scan.nextFloat()/100;
        System.out.print("Введите сумму вклада: ");
        float scanSum0 = scan.nextFloat();
        System.out.print("Введите срок вклада в месяцах: ");
        int scanMonth0 = scan.nextInt();

        int i = 1;
        while (i < scanMonth0) {
            scanSum0 += scanSum0 * scanPercent0;
            i++;
        }
        System.out.println("После " + scanMonth0+ " месяцев сумма вклада составит "+scanSum0);



        System.out.println("++++++++++++++++++++++++++++");

       /* Напишите программу, которая выводит на
        консоль таблицу умножения*/

        // Решение:

        for (i = 1; i<10; i++) {
            for (int j = 1; j<10; j++) {
                System.out.printf("%d\t",i*j);
            }
            System.out.println();
        }
    }
}
