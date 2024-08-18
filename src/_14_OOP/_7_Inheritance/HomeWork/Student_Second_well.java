package _14_OOP._7_Inheritance.HomeWork;

public class Student_Second_well extends Student {

    public Student_Second_well(String fullName, Integer age) {
        super(fullName, age);
    }
    @Override
    public String toString() {
        return "Student_Second_well{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public void hello(String fullName) {
        super.hello(fullName);
    }
}
