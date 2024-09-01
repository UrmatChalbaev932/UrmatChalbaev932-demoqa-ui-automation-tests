package _14_OOP._10_Сomposition.HomeWork;

public class Administrator extends Person{

    public Administrator(int age, String name) {
        super(age, name);
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public String receivingСomplaints (){
        return "administrator - Здравствуйте озвучите вашу жалобу";

    }
    public String myName (){
        return "administrator - Здравствуйте меня зовут "+ this.name;
    }
    public String denunciation(){
        return "administrator - Шеф жалоба поступила";
    }
}
