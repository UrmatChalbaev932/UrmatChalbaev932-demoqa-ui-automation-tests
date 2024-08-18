package _15_exceptions._1_Exception;

public class Except3 {
    public String countElements(String [] arr) throws ArrayIndexOutOfBoundsException{
        if (arr.length >=5) {
            return arr[4];
        }
        else {
            throw new ArrayIndexOutOfBoundsException("No index");
            //return null;
        }
    }

    public static void main(String[] args) {
        Except3 obj = new Except3();
        try {
            System.out.println(obj.countElements(new String[]{"While", "Green", "Pink", "Yellow"}));
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("YES");
    }
}
