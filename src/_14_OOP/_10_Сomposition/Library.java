package _14_OOP._10_Сomposition;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

public class Library {
    public List <Book> book;

    public Librarian librarian;

    public Reader reader;

    public Library(List<Book> book, Librarian librarian, Reader reader) {
        this.book = new ArrayList<>(book);
        this.librarian = new Librarian(librarian.name, librarian.age, librarian.ID);
        this.reader = reader;
    }

    @Override
    public String toString() {
        return "Library{" +
                "book=" + book +
                ", librarian=" + librarian +
                ", reader=" + reader +
                '}';
    }
}
