package _6_SwitchCase;

public class _2_SwitchCase {
    public static void main(String[] args) {
        // nested {{{}}}
        int month = 1;
        int day = 2;
        int time = 0;

        switch (month) { // работает с конкретными данными!!!
            case 1:
                System.out.println("January");
                switch (day) {
                    case 1:
                        System.out.println("First day");
                        break;
                    case 2:
                        System.out.println("Second day");
                        if (time >= 8 && time <= 10) {
                            System.out.println("Breakfast");
                        }else if (time >= 12 && time <= 14) {
                            System.out.println("Lunch");
                        }else if (time >= 17 && time <= 19) {
                            System.out.println("Dinner");
                        }else {
                            System.out.println("Stop eat");
                }
                        break;
                    default:
                        System.out.println("No day");
                }
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            default:
                System.out.println("Invalid month");
        }

        // Do not work - flout/ long/ boolean/ double


        System.out.println("___________________");

        if (true) {
            if (true) {
                switch ('y') {
                    case 'R':
                        System.out.println("Rose");
                        break;
                    case 'y':
                        System.out.println("Yellow");
                    default:
                        System.out.println("No color");
                }
            }
        }
    }
}
