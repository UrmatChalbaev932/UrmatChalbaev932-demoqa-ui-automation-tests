package _9_Methods;

public class _18_voidMethods {
    public static void main(String[] args) {
        String str = new String ("Hello");
        System.out.println((str.toUpperCase()));

        _18_voidMethods obj1 = new _18_voidMethods();
        obj1.sum();
        obj1.sum2(20,20);
        obj1.sum2(50,50);
        obj1.sum2(10,10);
        obj1.somToDollar(1300);

    }
    // методы без параметров
    public void sum () {
        int num1 = 8;
        int num2= 9;
        int result = num1 + num2;
        System.out.println(result);
    }
    // методы с параметрами
    public void sum2 (int num1, int num2) {
        int result1 = num1 + num2;
        System.out.println(result1);
    }

    public void somToDollar(int som){
        double convert = 88.12;
        double convert1 = som/convert;
        System.out.println(convert1);

    }
    // return
    // non-return (void)

    // non-primitive data types
    // Java:                   User:
    // Scanner                 Car
    // String                  Flower
    // StringBuilder           Phone
    // StringBuffer            LapTop
    // ....                    .....

    // .toString               sum
    // .equals                 somToDollar
    // .trim                   toDrive
    // .indexOf                .........
    // .nextLine
    // ...

    // Methods:
    // 1. return
    // 2. non-return (void)
}
