package _14_OOP._10_Сomposition;

public class Person {
    public String name;
    public int age;
    public boolean ID
            ;
    public Person(String name, int age, boolean ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public String myName (){
        return "Здравствуйте меня зовут "+ this.name;
    }
}