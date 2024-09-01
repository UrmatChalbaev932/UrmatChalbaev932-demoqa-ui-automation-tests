package _9_Methods;

public class _19_returnMethods {
    public static void main(String[] args) {

        _19_returnMethods object = new _19_returnMethods();
        System.out.println(object.sum(10, 10));
        System.out.println(object.greeting("Barbie"));
        System.out.println(object.isJavaFun("y s"));

    }

    public int sum(int num1, int num2) {
        String str1 = "Will";
        return num1 + num2; // 10
    }

    public String greeting(String name) {
        return "Hi " + name;
    }

    public boolean isJavaFun(String answer) {
        if (answer.equalsIgnoreCase("Yes")) {
            return true;
            }
            else {
            return false;
        }
    }
    // void(non-return) -> should to use "void"        --> {sout}    --> call in main by name of method
    // return           -> should to use data types    --> {return}  --> call in main by name of method in sout
}
