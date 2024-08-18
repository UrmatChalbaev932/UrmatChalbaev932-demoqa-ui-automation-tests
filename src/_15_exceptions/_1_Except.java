package _15_exceptions;

public class _1_Except {
    public static void main(String[] args) {

        // String str = true; -> CompileTime exceptions
        int num1 = 67;
        int num2 = 0;
        try {//// RunTime exceptions
            int res = num1/num2;// ArithmeticException
            System.out.println(res);
        } catch (Exception e) {
            System.out.println("Everything is OK");
            e.printStackTrace();
        }finally {
            System.out.println("lets go!");
        }
        System.out.println("Try catch work");

//        int [] nums = {12,34,45};
//        System.out.println(nums[4]);//ArrayIndexOutOfBoundsException
    }
}
// Exceptions
//1. CompileTime exceptions - checked
//2. RunTime exceptions - unchecked