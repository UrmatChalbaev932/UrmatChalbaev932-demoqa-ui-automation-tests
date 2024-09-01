package _9_Methods;

public class _22_StaticMethods {
    public static void main(String[] args) {

        System.out.println(_22_StaticMethods.greeting("James"));
        _22_StaticMethods obj = new _22_StaticMethods();
        System.out.println(obj.minus(72, 72));
        saySMTH("AbraKadabra");
        obj.sayCheese();
    }

    // static, return
    public static String greeting(String name){
        return "Hi " + name;
    }

    // non-static, return
    public int minus(int num1, int num2){
        int result;
        //      7 > 3   false
        if (num1 > num2){
            result = num1 - num2;
        }
        else {
            result = num2 - num1;
        }
        return result; // 16
    }

    // static, void
    public static void saySMTH(String word){
        System.out.println("Say " + word);
    }

    // non-static, void
    public void sayCheese(){
        System.out.println("Cheeeeeese");
    }



    // Methods
    // 1. java methods               2. user methods

    // 1.return                      2. non-return (void)
    // data type                        nothing (sout)

    // Access modifiers              Optional Access modifiers
    // public                        static
    // protected   *
    // default     ***
    // private     *****

    // 1. static method              2. non-static method
    // call ClassName.methodName()      // call with object

    // public static    -> methodName()

    // 1. return:                                       2. non-return(void -> sout)
    // static     -> sout(.methodName())                static      -> .methodName()
    // non-static -> sout(with object.methodNAme())     non-static  ->  with object.methodName()
}