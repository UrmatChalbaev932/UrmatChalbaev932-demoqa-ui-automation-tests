package _9_Methods;

public class _25_Methods {
    public static void main(String[] args) {

        System.out.println(multiple(4));
        System.out.println(multiple(6));


        _25_Methods obj = new _25_Methods();
        obj.sayHello();


    }
    public static int multiple (int num) {
        return num*2;
    }
    public void sayHello(){
        System.out.println("Hello");
    }
}
