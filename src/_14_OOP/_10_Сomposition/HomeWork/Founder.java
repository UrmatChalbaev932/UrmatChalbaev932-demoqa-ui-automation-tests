package _14_OOP._10_Сomposition.HomeWork;

public class Founder extends Person{

    public Founder(int age, String name) {
        super(age, name);
    }

    @Override
    public String toString() {
        return "Founder{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    public String wicked (){
        return "founder - Урезать ЗП виновнику";
    }
}
