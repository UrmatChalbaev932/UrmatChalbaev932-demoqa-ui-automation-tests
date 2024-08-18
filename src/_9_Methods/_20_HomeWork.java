package _9_Methods;

import java.util.Scanner;

public class _20_HomeWork {
    public static void main(String[] args) {
        _20_HomeWork week = new _20_HomeWork();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first three letters of the names of the days of the week: ");
        String day = scan.next().toLowerCase();
        week.toDay(day);
        System.out.println(week.toDay2(day));

    }

    public void toDay (String day){
        String tue = "Tuesday";
        String wed = "Wednesday";
        String thu = "Thursday";
        String fri = "Friday";
        String sat = "Saturday";
        String sun = "Sunday";

        switch (day) {
            case "tue":
                System.out.println("Result = ".concat(tue));
                break;
            case "wed":
                System.out.println("Result = ".concat(wed));
                break;
            case "thu":
                System.out.println("Result = ".concat(thu));
                break;
            case "fri":
                System.out.println("Result = ".concat(fri));
                break;
            case "sat":
                System.out.println("Result = ".concat(sat));
                break;
            case "sun":
                System.out.println("Result = ".concat(sun));
                break;
            default:
                System.out.println("Stop!");
        }
    }
    public String toDay2 (String day) {
        String tue = "Tuesday";
        String wed = "Wednesday";
        String thu = "Thursday";
        String fri = "Friday";
        String sat = "Saturday";
        String sun = "Sunday";

        if (day.equalsIgnoreCase("tue")) {
            return tue;
        } else if (day.equalsIgnoreCase("wed")) {
            return wed;
        }else if (day.equalsIgnoreCase("thu")) {
            return thu;
        }else if (day.equalsIgnoreCase("fri")) {
            return fri;
        }else if (day.equalsIgnoreCase("sat")) {
            return sat;
        }else if (day.equalsIgnoreCase("sun")) {
            return sun;
        }else {
            return "Stop";}


    }
}
