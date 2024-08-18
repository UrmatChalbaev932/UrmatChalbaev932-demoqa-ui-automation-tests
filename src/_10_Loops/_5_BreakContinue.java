package _10_Loops;

public class _5_BreakContinue {
    public static void main(String[] args) {

        // Оператор break позволяет завершить цикл раньше времени
        // break позволяет прервать выполнение цикла в любой удобный
        // для программиста момент - раньше, чем цикл "должен был бы" завершиться.

        //1. Оператор break для выхода из цикла
        int i;
        int a;

        i = 1;
        a = 3;
        while(i <= 5){
            // 1: цикл выполняется!
            // 2: цикл выполняется!
            // 3: цикл выполняется!
            System.out.println(i + ": цикл выполняется!");
            if (i == a) // когда i станет равна переменной а, (т.е. станет равна трем) нам нужно остановить цикл.
                break; // оператор остановки
            i++;
        }

        //2. Оператор break для выхода из цикла: вложенные циклы

        for (int s = 1; s <= 3; s ++) { //первый цикл выполняется 3 раза
            System.out.println("Это первый цикл! Я выполняюсь " + s + " раз");
            for (int d = 1; d <= 10; d++) { //второй цикл - каждый раз только два раза
                System.out.println("    Это второй цикл! Я выполняюсь " + d + " раз");
                if (d == 2)
                    break; //оператор break прерывает только один цикл - тот, который его непосредственно вызывает.
            }
        }

       /* Заключение
        1- break вызывается лаконично - просто break и точка с запятой;
        2- break работает одинаково для всех циклов - while, for, do...while и др.;
        3- break прерывает выполнение только одного цикла - того, который его непосредственно вызывает;
        4- break применяется в операторе switch.*/



        // Оператор continue позволяет проигнорировать часть кода
        // Continue позволяет опустить участок кода и вернуться в начало цикла


        for (int q = 1; q <= 7; q++){
            System.out.println(q + ": я выполнюсь перед continue!"); //выполняется семь раз
            if (q > 2)
                continue; // аждый раз когда i будет больше 2 (а именно будет равняться 3, 4, 5 , 6  и 7)
            // вторая строка не будет выведена в консоль. Это будет происходить потому, что continue будет
            // перенаправлять нас в начало цикла
            System.out.println("     "+ i + ": я выполнюсь всего два раза ;("); //выполняется два раза
        }



      String str = "Give papa a cup of proper coffee in a copper coffee cup";
        for (int t = 0; t < str.length(); t++) {
            System.out.print(str.charAt(t));
            if (t > str.lastIndexOf('a'))
                break;
        }
        System.out.println();
        String ss = "";
        String str1 = "Give papa a cup of proper coffee in a copper coffee cup";
        for (int t = 0; t < str.length(); t++) {
            ss += str.charAt(t);
            if (t > str.lastIndexOf('a'))
                continue;
            ss ="";
        }
        System.out.println(ss);
    }
}
