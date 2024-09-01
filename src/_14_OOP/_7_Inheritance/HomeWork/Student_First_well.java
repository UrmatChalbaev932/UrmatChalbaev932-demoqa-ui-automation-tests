package _14_OOP._7_Inheritance.HomeWork;

public class Student_First_well extends Student {

    public Student_First_well(String fullName, Integer age) {
        super(fullName, age);
    }

    @Override
    public void hello() {
        System.out.println("@Override - Student_First_well");
    }

}
