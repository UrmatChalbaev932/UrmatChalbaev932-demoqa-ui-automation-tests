package _9_Methods;

import java.util.Scanner;

public class _23_HomeWork {
    public static void main(String[] args) {
        _23_HomeWork obj = new _23_HomeWork();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String str = scan.next();

        // 1. non_return_non_static
        obj.non_return_non_static(1, str);

        // 2. non_return_static
        non_return_static(2, str);

        // 3. return_non_static
        System.out.println(obj.return_non_static(3,str));

        //4. return_static
        System.out.println(_23_HomeWork.return_static(4,str));

    }

   // 1. non_return_non_static
    public void non_return_non_static (int option, String word) {
        System.out.print(option+". non_return_non_static: ");
        String str1="";
        if (word.length()%2==0) {
            str1 = word.substring(word.length()/2);
            System.out.println(str1);
        }else {
            System.out.println("odd word");
        }
    }

    // 2. non_return_static
    public static void non_return_static (int option, String word) {
        System.out.print(option+". non_return_static: ");
        String str1="";
        if (word.length()%2==0) {
            str1 = word.substring(word.length()/2);
            System.out.println(str1);
        }else {
            System.out.println("odd word");
        }
    }

    // 3. return_non_static
    public String return_non_static (int option, String word) {
        System.out.print(option+". return_non_static: ");
        String str1="";
        if (word.length()%2==0) {
            str1 = word.substring(word.length()/2);
            return str1;
        }else {
            return "odd word";
        }
    }

    // 14 return_static
    public static String return_static (int option, String word) {
        System.out.print(option+". return_static: ");
        String str1="";
        if (word.length()%2==0) {
            str1 = word.substring(word.length()/2);
            return (str1);
        }else {
            return "odd word";
        }
    }
}
