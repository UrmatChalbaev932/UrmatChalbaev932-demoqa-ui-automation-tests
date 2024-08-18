package _14_OOP._10_Сomposition.HomeWork;

public class Cook extends Person{
    public Cook(int age, String name) {
        super(age, name);
    }
    public String done (){
        return "Заказ готов заберайте";
    }
}
