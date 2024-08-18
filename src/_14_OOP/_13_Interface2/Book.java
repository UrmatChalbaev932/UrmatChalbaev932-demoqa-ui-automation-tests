package _14_OOP._13_Interface2;

public class Book implements Printable, Published{

    public String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public String print() {
        return name + " is printing";
    }

    @Override
    public String publish() {
        return name + " is publishing";
    }

    @Override
    public String published() {
        return null;
    }
}
