package _15_exceptions._1_Exception;

public class Practica {

    public void division(int a, int b) throws ArithmeticException {
        if (b != 0) {
            int result = a / b;
            System.out.println(result);
        } else {
            throw new ArithmeticException("Stop Urmat");
        }
    }

    public static void main(String[] args) {
        Practica obj = new Practica();
        try {
            obj.division(9, 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("YES");
    }
}
