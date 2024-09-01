package _11_Arrays;

import java.util.Arrays;

public class Arrays3 {
    public static void main(String[] args) {

        int num[] = {23, 91, 11, 87};
        System.out.println(Arrays.toString(num));//[23, 91, 11, 87]

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        for (int newNums : num) {
            System.out.print(newNums + " ");
        }

        System.out.println();

        String phone[] = {"Samsung", "Blackberry", "Sony"};
        for (String myPhone : phone) {
            System.out.print(myPhone+" ");

        }

        System.out.println();

        // Multidimensional Arrays

        int numbers[][] = new int[2][3];

        numbers[0][0] = 10;
        numbers[0][1] = 20;
        numbers[0][2] = 30;

        numbers[1][0] = 400;
        numbers[1][1] = 500;
        numbers[1][2] = 600;

        System.out.println(Arrays.deepToString(numbers));//[[10, 20, 30], [400, 500, 600]]
        //        0               1
        // [[10, 20, 30], [400, 500, 600]]
        //   0    1   2    0    1      2

        System.out.println(numbers[1][2]); //600


        //                      0       1
        int numbers2[][] = {{12, 45}, {98, 9}};
        //                   0   1    0  1

        System.out.println(numbers2[1][0]);//98
        System.out.println(numbers2[0][1]);//45

        int numbers3[][] = new int[1][2];
        numbers3[0][0] = 34;
        numbers3[0][1] = 81;
        System.out.println(Arrays.deepToString(numbers3));//[[34, 81]]


        int numbers4[][] = {{34}, {81}};

        String [][] brands = {{"Mercedes", "BMW"}, {"Toyota", "Honda"}};
        System.out.println(Arrays.deepToString(brands));//[[Mercedes, BMW], [Toyota, Honda]]
        System.out.println(brands.length); //2
        System.out.println(Arrays.toString(brands[0]));//[Mercedes, BMW]
        System.out.println(brands[0].length);//2
        System.out.println(brands[0][0].length());//8

        A:
        for (int i = 0; i < brands.length; i++) {
            B:
            for (int j = 0; j < brands[i].length; j++) {
                System.out.print(brands[i][j] + " "); //Mercedes BMW Toyota Honda
            }
        }

        char symbols[][] = new char[3][2]; //[[q, k], [%, *], [S, G]]

        symbols[0][0] = 'q';
        symbols[0][1] = 'k';

        symbols[1][0] = '%';
        symbols[1][1] = '*';

        symbols[2][0] = 'S';
        symbols[2][1] = 'G';

        System.out.println(Arrays.deepToString(symbols)); //[[q, k], [%, *], [S, G]]
        //              0 < 3
        for (int i = 0; i < symbols.length; i++) {
            //              0 < 2
            for (int f = 0; f < symbols[1].length; f++) {

                System.out.print(symbols[i][f] + " "); //q k % * S G
            }
        }

        System.out.println();

        String fashionBrands[][] = {{"Chanel", "Dior"}, {"Paul Shark", "Lore Piano"}};

        for (String[] fb : fashionBrands) {
            for (String fb2 : fb) {
                System.out.print(fb2+" "); //Chanel Dior Paul Shark Lore Piano
            }
        }

        System.out.println();

        for (int i = 0; i < fashionBrands.length; i++) {
            for (int f = 0; f < fashionBrands.length; f++) {
                System.out.print(fashionBrands[i][f]+" "); //Chanel Dior Paul Shark Loro Piano
            }
        }
        System.out.println();
        char[][][] ch =
                {{{'q','w','e'}, {'r','t','y'}, {'u','i','o'}},
                 {{'p','a','s'}, {'d','f','g'}, {'h','j','k'}},
                 {{'l','z','x'}, {'c','v','b'}, {'n','m','a'}}};

        System.out.println(ch[1][2][0]);

        for (char[][] sym : ch) {
            for ( char [] sy : sym) {
                for ( char s: sy) {
                    System.out.print(s+" "); //q w e r t y u i o p a s d f g h j k l z x c v b n m a
                }
            }
        }
        System.out.println();

        for (int i = 0; i<ch.length; i++){
            for (int f = 0; f<ch[0].length; f++){
                for (int d = 0; d<ch[0][0].length; d++){
                    System.out.print(ch[i][f][d]+" "); //q w e r t y u i o p a s d f g h j k l z x c v b n m a
                }
            }
        }
        System.out.println();

        int [][] number = new int[2][3];
        number [0][0]= 1;
        number [0][1]= 2;
        number [0][2]= 3;

        number [1][0]= 4;
        number [1][1]= 5;
        number [1][2]= 6;

        System.out.println(Arrays.deepToString(number)); //[[1, 2, 3], [4, 5, 6]];



    }
}



