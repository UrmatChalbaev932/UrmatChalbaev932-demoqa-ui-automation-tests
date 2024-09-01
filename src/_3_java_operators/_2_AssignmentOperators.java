package _3_java_operators;

public class _2_AssignmentOperators {
    public static void main(String[] args) {


        //=
        int a = 11;


        //+=
        a+=1; // переменной a присваивается результат сложения a и 11
        System.out.println(a);


        //инкрементирование переменной
        // a+=1; -> a = 0 + 1 => а = 1
        // a+=1; -> a = 1 + 1 => a = 2
        // a+=1; -> a = 2 + 1 => a = 3


        //-=
        a-=2; // переменной a присваивается результат вычитания a и 2
        System.out.println(a);


        //*=
        a*=3; // переменной а присваивается результат произведения а и 3
        System.out.println(a);


        ///=
        a/=4; // переменной а присваивается результат деления а и 4
        System.out.println((double) a);


        //%=
        a%=5; // переменной а присваивается остаток от деления а на 5
        System.out.println((float) a);

        int b = 10;
        b&=1;
        System.out.println(b);
        b|=1;
        System.out.println(b);
        b^=1;
        System.out.println(b);
        b >>=1;
        System.out.println(b);
        b <<=1;
        System.out.println(b);

    }
}
