package _6_SwitchCase;

public class _3_HomeWork {
    public static void main(String[] args) {

       /* switch (7) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            default:
                System.out.println("Non");
        }*/

        System.out.println("=======================");
/*

        int a = 1;
        int b = 1;
        int c = 3;

        switch (a) {
            case 1:
                System.out.println("1");
                switch (b) {
                    case 1:
                        System.out.println("2");
                        switch (c) {
                            case 1:
                                System.out.println("3");
                                break;
                            case 2:
                                System.out.println("4");
                                break;
                            case 3:
                                System.out.println("5");
                                break;
                            case 4:
                                System.out.println("6");
                                break;
                            default:
                                System.out.println("7");
                        }
                        break;
                    case 2:
                        System.out.println("8");
                        break;
                    case 3:
                        System.out.println("9");
                        break;
                    case 4:
                        System.out.println("10");
                        break;
                    default:
                        System.out.println("11");
                }
                break;
            case 2 :
                System.out.println("12");
                break;
            case 3:
                System.out.println("13");
                break;
            case 4:
                System.out.println("14");
                break;
            default:
                System.out.println("15");
        }
*/

        System.out.println("=========================== ");


        int month = 12;
        String monthString;
        switch (month) {
            case 1:  monthString = "Январь";
                break;
            case 2:  monthString = "Февраль";
                break;
            case 3:  monthString = "Март";
                break;
            case 4:  monthString = "Апрель";
                break;
            case 5:  monthString = "Май";
                break;
            case 6:  monthString = "Июнь";
                break;
            case 7:  monthString = "Июль";
                break;
            case 8:  monthString = "Август";
                break;
            case 9:  monthString = "Сентябрь";
                break;
            case 10: monthString = "Октябрь";
                break;
            case 11: monthString = "Ноябрь";
                break;
            case 12: monthString = "Декабрь";
                break;
            default: monthString = "Не знаем такого";
                break;
        }
        System.out.println(monthString);

    }
}
