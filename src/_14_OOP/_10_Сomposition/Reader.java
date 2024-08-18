package _14_OOP._10_Сomposition;

public class Reader extends Person{
    public Reader(String name, int age, boolean ID) {
        super(name, age, ID);
    }
    public String requestTheBook(String author){
        return "Can I get the book by "+ author;
    }

    public String requestTheBook(String author, String name){
        return "Can I get the book " + name + " by "+ author;
    }
}
