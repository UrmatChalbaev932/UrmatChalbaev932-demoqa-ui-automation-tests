package _14_OOP._13_Interface2;

public class NoteBook implements Printable{

    public String name;

    public NoteBook(String name) {
        this.name = name;
    }

    @Override
    public String print() {
        return name + " is printing";
    }

    @Override
    public String publish() {
        return null;
    }
}