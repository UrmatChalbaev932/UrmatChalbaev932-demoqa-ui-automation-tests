package _10_Loops;

public class _4_DoWhile {
    public static void main(String[] args) {

        // for(start; end; ++/--);
// while(true/false){ ++/--};
// do-while

    /*    int count = 1;
        while (count > 4){ // false
            System.out.println(count);
            count++;
        }

        System.out.println("111___________");

        do {
            System.out.println(count);  // 1
            count++;                    // --> 2
        } while (count > 4); // false

        System.out.println("222___________");

        do {
            System.out.println(count); // 2, 3
            count++;                   // --> 3, 4
        } while (count <= 3); // false

        System.out.println("___________");

        System.out.println(count); // 4

        System.out.println("___________");

        int num = 4;

        do {
            System.out.println(num); // 4, 3, 2, 1
            num--;                   // 3, 2, 1, 0
        }while (num > 0);

        System.out.println("___________");

        System.out.println(num);*/


       /* String str = "nasa";
        int end = str.length();
        int start = str.length()-str.length();

        while (start<end) {

            do {
                System.out.println(start+ str);
                start++;
            }while (start>end);

        }*/

        //            12345678901
    /*    String str = "Ololo House";
        int o = str.length()-str.length();
        int i = str.length(); //

        while (o<i) {
            System.out.println(str.substring(0,str.lastIndexOf("o")));
            o++;
        }*/

//        int cnt;
//        for (cnt = 1; cnt < 5; cnt++) {
//            if (cnt == 3)
//                continue;
//            System.out.println("Current value of cnt is: " + cnt);
//        }
//        System.out.println("Current value of cnt is: " + cnt);


        String str = "kaadk";
        StringBuilder str1 = new StringBuilder(str).reverse();
        boolean rs = true;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) != str1.charAt(i)) {
                rs = false;
            }
        }
        System.out.println(rs);



    }
}
