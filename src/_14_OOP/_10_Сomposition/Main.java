package _14_OOP._10_Сomposition;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book Ak_keme = new Book("Ak Keme", "Chingiz Aitmatov", 250);
        Book Singan_kilich = new Book("Syngan Kilich", "Tologon Lasymbekov", 450);
        Book Beliy_klik = new Book("Beliy Klik", "Eldic", 550);

        List<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(Ak_keme);
        listOfBooks.add(Singan_kilich);
        listOfBooks.add(Beliy_klik);

        Librarian urmat = new Librarian("Urmat", 30, true);
        Reader badam = new Reader("Badam", 24, true);

        Library library = new Library(listOfBooks, urmat, badam);
        System.out.println(library.librarian.name);
        System.out.println(badam.requestTheBook("Eldic"));
        System.out.println(urmat.registerCard(badam));
        System.out.println(library);






    }
}
