package _14_OOP._11_Abstraction;

public abstract class Person {

    public String name;
    public int age;
    public char gender;
    private int iDPassport;

    public Person(String name, int age, char gender, int iDPassport) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.iDPassport = iDPassport;
    }

    public int getIDPassport() {
        return iDPassport;
    }
    public void setIDPassport(int iDPassport) {
        this.iDPassport = iDPassport;
    }
    public String breath(){
        return "Inhale...Exhale";
    }
    public abstract String work ();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", iDPassport=" + iDPassport +
                '}';
    }
}
