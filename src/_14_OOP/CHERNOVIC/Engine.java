package _14_OOP.CHERNOVIC;

public class Engine {
    public static void main(String[] args) {
        System.out.println(n3(4));
    }
//    public static void n2(int n){
//        if (n==0)
//        return;
//        System.out.println(n);
//        n2(n-1);
//    }
    private static int n3(int n){
        if (n==1)
            return 1;
        System.out.println(n+"*"+(n-1) +"="+n*(n-1));
        return n*n3(n-1);
    }


}
