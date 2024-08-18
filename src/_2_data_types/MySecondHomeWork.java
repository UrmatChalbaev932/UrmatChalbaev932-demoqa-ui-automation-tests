package _2_data_types;

public class MySecondHomeWork {
    public static void main(String[] args) {


        byte numb1 = 1;
        short numb2 = 2;
        int numb3 = 3;
        long numb4 = 4;
        float numb5 =5f;
        double numb6 = 6d;
        char symbol7 = 'S';
        boolean logic8 = true;


        System.out.print(numb1+" ");
        System.out.print(numb2+" ");
        System.out.print(numb3+" ");
        System.out.print(numb4+" ");
        System.out.print(numb5+" ");
        System.out.print(numb6+" ");
        System.out.print(symbol7+" ");
        System.out.println(logic8+" ");

       // byte
        byte b = 111;
        short s = b;
        int i = b;
        long l = b;
        float f = b;
        double d = b;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);


        System.out.println("____________");
        // short
        short s1 = 1234;
        byte b1 = (byte) s1;
        int i1 = s1;
        long l1 = s1;
        float f1 = s1;
        double d1 = s1;

        System.out.println(s1);
        System.out.println(b1);
        System.out.println(i1);
        System.out.println(l1);
        System.out.println(f1);
        System.out.println(d1);

        // int
        int i2 = 333333333;
        byte b2 = (byte)i2;
        short s2 = (short)i2;
        long l2 = i2;
        float f2 = i2;
        double d2 = i2;

        System.out.println(i2);
        System.out.println(b2);
        System.out.println(s2);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d2);

        // Special characters
        // \t
        System.out.println("1Tik\tTak");
        // \b
        System.out.println("2Tik\bTak");
        // \n
        System.out.println("3Tik\nTak");
        // \r
        System.out.println("4Tik\rTak");
        // \f
        System.out.println("5Tik\fTak");
        // \'
        System.out.println("6Tik\'Tak\'");
        // \
        System.out.println("6Tik\\Tak\\");



    }
}
