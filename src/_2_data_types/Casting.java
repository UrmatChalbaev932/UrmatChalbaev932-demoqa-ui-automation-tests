package _2_data_types;
// Casting -
public class Casting {
    public static void main(String[] args) {
        System.out.println("______1______");
        byte num1 = 23;
        short num2 = num1;
        System.out.println(num2);

        System.out.println("______2______");
        short num3 = 56;
        byte num4 = (byte) num3;
        System.out.println(num4);

        System.out.println("______3______");
        short num5 = 122;
        byte num6 = (byte) num5;
        System.out.println(num6);

        // short num5 = 138;
        // byte num6 = (byte) num5;
        // System.out.println (num6);

        System.out.println("______4______");
        float num7 = 78.9f;
        double num8 = num7;
        System.out.println(num7);
        System.out.println(num8);

        double num9 = 87.5;
        float num10 = (float) num9;
        System.out.println(num9);
        System.out.println(num10);

        int num11 = 78;
        float num12 = num11;
        System.out.println(num11); // 78
        System.out.println(num12); // 78.0

        double num13 = 34.65;
        int num14 = (int) num13;
        System.out.println(num13); // 34.65
        System.out.println(num14); //34

        int num15 = 65;
        char ch1 = 65;
        char ch2 = 'A';
        char ch3 = (char) num15;
        System.out.println(num15); // 65
        System.out.println(ch1); //A
        System.out.println(ch2); //A
        System.out.println(ch3); //A

        char ch4 = 'B';
        int num16 = 'B';
        int num17 = ch4;
        System.out.println(ch4); // B
        System.out.println(num16); // 66
        System.out.println(num17); // 66

        String phoneNumber = "Urmat how are you";
        System.out.println(phoneNumber);
        }

    }
