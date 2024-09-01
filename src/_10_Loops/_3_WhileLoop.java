
package _10_Loops;

public class _3_WhileLoop {

    /* public static void main(String[] args) {

            int age = 4;
            while (age < 12) {
                System.out.println(age);
                age++;


                System.out.println("_______________");



                int a = 11;
                while (a > 4) {
                    System.out.println(a);
                    a--;

            revers("ffffff");
        }


        public static void revers(String name) {
            int a = name.length() - name.length();
            int s = name.length() - 1;
            while (s > a) {
                if (name.charAt(a) != name.charAt(s)) {
                    System.out.println("no");
                    return;
                }
                s--;
                a++;
                }
            System.out.println("yes");
            }
        }
            */
    public static void main(String[] args) {
        isPalindrome("level");

        //              0123
        String color = "red";
        System.out.println(color);
        System.out.println(color.length()); // 3
        System.out.println(color.length() - 1); // 2
        System.out.println(color.charAt(2)); // d
        System.out.println(color.substring(0, 2));
        System.out.println(color.substring(0, 3));
        System.out.println(color.substring(0, color.length())); // 0, 3
        System.out.println(color.substring(0, color.length() - 1));

        int in = 0;
        //            012345
        String str = "Hello";
        System.out.println(str.charAt(in));
        System.out.println("__________");
        //  4 < 4
        while (in < str.length()) {
            System.out.println(str.charAt(in));
            in++;
        }

        System.out.println("__________");

        while (true) {
            System.out.println("P");
        }

    }

    // 01234
    // level
    // level
    // 43210                                        12345
//                                                  01234     43210
    public static void isPalindrome(String str) { // level ==  level
        //                                          level ==  level
        int i = 0; // 0 -> l
        int j = str.length() - 1; // 4 -> l   5-1=4

        //     2 < 2
        while (i < j) {
            //             3                4 -> l
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("ЭТО СЛОВО НЕ ПАЛИНДРОМ ЖЫЕСТЬ");
                return;
            }
            //          0 1 2 3 4
            i++; //  -> l e v e l
            //          4 3 2 1 0
            j--; //  <- l e v e l
        }

        // mom


        System.out.println("ЭТО СЛОВО ПАЛИНДРОМ ЖЫЕСТЬ");
    }

    public static void palindrome1(String str) { // level
        String reversedWord = "";
        int index = str.length() - 1; // 4->l
        //         -1 >= 0 -> true
        while (index >= 0) {                   //        4      43      432      4321      432109
            reversedWord += str.charAt(index); // "" -> "l" += "le" += "lev" += "leve" += "level"
            index--;
        }
        if (str.equals(reversedWord)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("NOT palindrome");
        }
    }
}