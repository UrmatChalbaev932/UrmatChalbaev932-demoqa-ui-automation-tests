package _14_OOP._7_Inheritance.HomeWork;

public class Student {
    public String fullName;
    public Integer age;

    public Student(String fullName, Integer age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }


    public void hello (){
        System.out.println("@Overloading - Student");
    }

    public void hello (String fullName){
        System.out.println("@Overloading - Student"+fullName);
    }


}
