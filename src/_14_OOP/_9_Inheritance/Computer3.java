package _14_OOP._9_Inheritance;

public class Computer3 {
    public static void main(String[] args) {
        Computer obj = new Computer2("Mac");
        System.out.println(obj.color);
        System.out.println(obj.mart);
        System.out.println(obj.model);


        System.out.println(minus(25, 5, 5, 10, 5, 5));

    }

    public static int sum(int... num) {
        int result = 0;
        for (int sum : num) {
            result = result + sum;
        }
        return result;
    }

    public static int minus(int... num) {
        int result = 0;
        for (int sum : num) {
            result = result - sum;
        }
        return result;
    }
}
