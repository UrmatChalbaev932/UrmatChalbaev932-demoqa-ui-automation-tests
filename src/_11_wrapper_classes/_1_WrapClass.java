package _11_wrapper_classes;

public class _1_WrapClass {
    public static void main(String[] args) {
        // class
        // wrapper class

        // primitive     --> byte, short, int, flout, double, char, boolean
        // non-primitive --> Scanner, String, StringBuilder...


        // primitive     --> byte, short, int, flout, double, char, boolean
        // wrapper classes --> Byte, short, Integer, Long, Flout, Double, Character, Boolean


        int num2 = 67;
        Integer num3 = new Integer(35);
        Integer num4 = 58;
        Double dnum1 = num4.doubleValue();

        System.out.println(Integer.max(num2, num3)); //67

        Boolean b = true;

        // convert:
        // 1. casting
        // 2. boxing

        // AutoBoxing
        int n = 12;
        Integer n2 = n;
        System.out.println(n); //12 primitive
        System.out.println(n2);//12 non-primitive


        // Unboxing
        Integer n3 = 78;//78 non-primitive
        int n4 = n3;//78 primitive




    }
}
