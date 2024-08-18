package _3_java_operators;
public class _4_LogicalOperator {
    public static void main(String[] args) {

        boolean res1 = 55>45;
        System.out.println(res1);

        boolean res2 = 67 < 28;
        System.out.println(res2);


        // & - амперсан
        // && - дабл амперсан
        // && - означает "и"
        //                true && false
        boolean res3 = 99 > 45 && 67 < 28;
        System.out.println(res3);

        //               false && true
        boolean res4 = 67 < 28 && 99 > 45;
        System.out.println(res4);

        //               false && false
        boolean res5 = 67 < 28 && 67 < 45;
        System.out.println(res5);

        //               true && true
        boolean res6 = 99 > 45 && 99 > 45;
        System.out.println(res6);

        // && => false
        // true && false = false
        // false && true = false
        // false && false = false
        // true && true = true
        System.out.println("_______________");

       // || = "или" пайлайн
       //                    true || false
        System.out.println(90 >12 || 45 == 7);
        //                  false || true
        System.out.println(45==7 || 90 >12);
        //                  false || false
        System.out.println(45 ==7 || 45 ==7);
        //                   true || true
        System.out.println(90 >12 || 90>12);

        // || => true
        // true || false = true
        // false || true = true
        // false || false = false
        // true || true = true



        //!
        System.out.println(!(90 >12 || 90>12));
        //                   true || true
        //                   true || false
        System.out.println(90 >12 || !(90>12));




    }
}
