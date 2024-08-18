package _11_Arrays;

import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {

        /*int indexN = 6;
        Scanner scan = new Scanner(System.in);
        int n2 = scan.nextInt();

        String colors [] = new String[2];
        colors [0]= "red";
        colors [1]= "green";
        System.out.println(colors[0]);//red
        System.out.println(Arrays.toString(colors));//red, green]
        colors [1]= "white"; // переназначили
        System.out.println(Arrays.toString(colors));//[red, white]
        colors [n2]= "black";
        System.out.println(Arrays.toString(colors));//[red, black]


        String cities [] = new String[3];
        cities[0]= "Bishkek";
        cities[1]= "New York";
        cities[2]= "Barcelona";
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(Arrays.toString(cities));
        cities[1]= "London";
        System.out.println(Arrays.toString(cities));
        cities[n2]="Astana";
        System.out.println(Arrays.toString(cities));*/

        String name1 = "Elzaada";
        String name2 = "Aidar";
        String name3 = "Azamat";

        //1 вариант создания.

        //String names [] = new String [ name1, name2, name3];
        String names[] = new String[3];

        names[0] = name1;
        names[1] = name2;
        names[2] = name3;

        System.out.println(Arrays.toString(names));//[Elzaada, Aidar, Azamat]

        //2 вариант создания.
        //String countries [] = new String {"KG", "USA", "UK", "KZ"};
        String countries[] = {"KG", "USA", "UK", "KZ"};
        countries[0] = "Kyrgyzstan";
        System.out.println(Arrays.toString(countries));//[Kyrgyzstan, USA, UK, KZ]
        countries[0] = countries[0].substring(0, 6);
        System.out.println(Arrays.toString(countries));//[Kyrgyz, USA, UK, KZ]
//                          0        1        3       4       5
        String strs[] = {name1, "Cholpon", "Askar", name2, name3};
//                          1        2        3       4       5

        System.out.println(strs[3]);
        System.out.println(strs[2]);
        System.out.println(Arrays.toString(strs));
        // System.out.println(strs[5]);

        // Home-work;
        String book = "Harry Potter";

        char[] symbol = book.toCharArray(); // перевели в массив типа чар наш текст
        System.out.println(Arrays.toString(symbol)); //[H, a, r, r, y,  , P, o, t, t, e, r]
        System.out.println(Arrays.toString(book.toCharArray())); //[H, a, r, r, y,  , P, o, t, t, e, r]


       /* String [][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                if ((i + j) % 2 == 0) chessBoard[i][j] = "W" + chessBoardCoord(j,i);
                else chessBoard[i][j] = "B"+ chessBoardCoord(j,i);
            }
        }

        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                System.out.print(" " + chessBoard[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static String chessBoardCoord(int a, int b) {
        String letters = "abcdefgh";
        String numbers = "87654321";
        if ((a > 7)|| (b>7)) return null; //если номер за пределами доски, возвращаем значение по умолчанию - null
        else return (Character.toString(letters.charAt(a)) + numbers.charAt(b));*/ /*charAt - метод, с помощью которого мы извлекаем из строки элемент под переданным номером, здесь - под номерами a и b. Character.toString - метод, который переводит полученный символ в строку*/
    }
}
