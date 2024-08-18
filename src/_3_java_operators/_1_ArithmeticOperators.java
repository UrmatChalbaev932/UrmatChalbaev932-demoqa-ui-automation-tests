package _3_java_operators;

public class _1_ArithmeticOperators {
    public static void main(String[] args) {

        //
        int a = 10;
        int b = 15;
        int c = 20;

        //+ Addition
        int Addition1 = a + b; // 25
        int Addition2 = a + (b + c); //45
        System.out.println(Addition1);
        System.out.println(Addition2);

        // - Subtraction
        double Subtraction1 = (double) a-b; // -5.0
        double Subtraction2 = (double) c-(a-b); // 25
        System.out.println(Subtraction1);
        System.out.println(Subtraction2);

        //* Multiplication
        int Multiplication1 = a*c; // 200
        float Multiplication2 = (float) b*c; // 300.0
        System.out.println(Multiplication1);
        System.out.println(Multiplication2);

        // Division
        double Division1 = (double) a/b; //0.666..
        float Division2 = (float) a/(b/c); //Infinity
        System.out.println(Division1);
        System.out.println(Division2);

        //% Modulus

        int Modulus1 = 34%5;// (33/5= остаток 3)
        double Modulus2 = (double) c%a; // 0.0
        System.out.println(Modulus1);
        System.out.println(Modulus2);

        // ++ Increment
        int Increment1 = ++a; // значение увеличивается и после присваевается переменной
        int Increment2 = ++a;
        int Increment3 = a++; // значение присваевается и после присваевается переменной
        System.out.println(Increment1);
        System.out.println(Increment2);
        System.out.println(Increment3);
        System.out.println("____________");
        // -- Decrement
        int Decrement1 = --a; // значение уменьшается и после присваевается переменной
        int Decrement2 = a--; // значение присваевается и после уменьшается переменной
        System.out.println(Decrement1);
        System.out.println(Decrement2);


    }
}
