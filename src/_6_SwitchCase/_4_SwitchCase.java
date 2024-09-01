package _6_SwitchCase;

public class _4_SwitchCase {
    public static void main(String[] args) {

        String quarter = "";
        int numq = 3;
        String month = "December";
        switch (month) {
            case "January":
            case "February":
            case "March":
               quarter =  "First Quarter";
                break;
            case "April":
            case "May":
            case "June":
                quarter = "Second Quarter";
                break;
            case "July":
            case "Auqust":
            case "September":
                quarter = "Third Quarter";
                break;
            case "October":
            case "November":
            case "December":
                quarter = "First Quarter";
                break;
            default:
                System.out.println("No Quarter");
        }
        System.out.println(quarter);




    }
}
