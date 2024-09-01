package _14_OOP._3_Constructor;

public class Person {

    public String name;
    public int age;
    public char gender;

    // default constructor
    public Person(){

    }

    // constructor -> special method
    public Person(String name1, int age1, char gender1){
        name = name1;  // Dmitiy
        age = age1;    // 29
        gender = gender1; // M
    }

    public Person(String badam) {
    }

    // method
    public String eat(){
        return "Nyam Nyam";
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

// class:
// 1.instance variable/object --> = value
// 2.methods                  --> (){.... action}

// file --> class

// (file)class

// class --> default constructor