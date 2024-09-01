package _14_OOP._4_Constructor;

public class Book {

    public String name;
    public String author;
    public double price;

    // Overloading --> Polymorphism
    // 1
    public Book(){

    }

    // 2
    public Book(String name1){
        name = name1;
    }

    // 3
    public Book(double price) {
        this.price = price;
    }

    // 4
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    // 5
    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // 6
    public Book(double price, String name){
        this.price = price;
        this.name = name;
    }

    // 7
    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }


    // 1. default constructor (Java)
    // 2. constructor without parameters (User)
    // 3. constructor with parameters (User)



    public String publishing(){
        return "Published...";
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}