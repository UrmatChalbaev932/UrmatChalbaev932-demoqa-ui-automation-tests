package _11_Arrays;

public class ArraysHomeWork {
    public static void main(String[] args) {

        String str = "Nomad";

        char[] arrstr = str.toCharArray();

        char shortword[] = new char[arrstr.length - 1];

            if ((arrstr.length - 1) % 2 == 0) {
                for (int i = 0; i <= shortword.length - 1; i++) {
                    shortword[i] += arrstr[i];
                    System.out.print(shortword[i]);
                }
            } else {
                for (int i = 0; i <= shortword.length - 2; i++) {
                    shortword[i] += arrstr[i];
                    System.out.print(shortword[i]);
                }
            }
        System.out.println();


//        - [ ] Создать массив с количеством 7-элементов
//        - [ ] Проинициализировать каждый элемент днями недели
//        в разброс, то есть не [ пн.вт.ср.чт.пт.сб.вс],
//        а в разброс н-р [вт.сб.ср.чт.пн.пт.вс]
//        - [ ] На консоль возвратить порядок дней недели.
//        Не в алфавитном порядке, а по последовательному порядку
//        дней недели [пн.вт.ср.чт.пт.сб.вс]
//        - [ ] После вывести на консоль такой результат
//
//        пн. - рабочий день
//        вт. - рабочий день
//        ср. - рабочий день
//        чт. - рабочий день
//        пт. - рабочий день
//        сб. - выходной день
//        вс. - выходной день

        String[] week = {"сб.", "ср.", "чт.", "пт.", "пн.", "вт.", "вс."};
        String[] weekCorrect = {"пн.", "вт.", "ср.", "чт.", "пт.", "сб.", "вс."};
        String[] weekCorrected = new String[week.length];

        for (int i = 0; i < weekCorrect.length; i++) {
            for (int f = 0; f < week.length; f++) {
                if (weekCorrect[i].equals(week[f])) {
                    weekCorrected[i] += week[f];
                    System.out.println(weekCorrected[i].substring(4) + (i < 5 ? " будние дни" : " выходные дни"));
                }
            }
        }
    }
}