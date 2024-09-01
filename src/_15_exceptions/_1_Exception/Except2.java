package _15_exceptions._1_Exception;

public class Except2 {
    public static void main(String[] args) {
        try {
            System.out.println(89 / 0);
        }catch (NullPointerException | ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Tabu: / by zaro");
            e.printStackTrace();
        }

        try {
            int [] arrs = { 1,2,3,4};
            System.out.println(arrs[90]);
        } catch (ArithmeticException e ){
            //e.printStackTrace();
            System.out.println("/ 0");
        }catch (NullPointerException e){
            //e.printStackTrace();
            System.out.println("Null - empty");
        }catch (ArrayIndexOutOfBoundsException e){
            //e.printStackTrace();
            System.out.println("No index");
        }finally {
            System.out.println("The end");
        }

        try {
            int [] arrs = { 1,2,3,4};
            System.out.println(arrs[90]);
        } catch (Exception e) {
            e.printStackTrace();
        }





    }
}
