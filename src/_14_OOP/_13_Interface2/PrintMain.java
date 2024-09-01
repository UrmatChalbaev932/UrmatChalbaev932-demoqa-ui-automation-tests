package _14_OOP._13_Interface2;

import java.util.Map;

public class PrintMain {

    public static void main(String[] args) {
        Book harryP = new Book("Harry Potter");
        Magazine forbes = new Magazine("Forbes");
        NoteBook diary = new NoteBook("My Story");
        Check check = new Check("Globus check");

        System.out.println(harryP.print());
        System.out.println(harryP.publish());
        System.out.println(forbes.print());
        System.out.println(diary.print());
        System.out.println(check.print());
    }
}

// inheritance: class     -extends-    class
// interface:   interface -implements- class
//              interface -extends-     interface


// inheritance: class(1)         -extends-       class(1)
//              Son(1) extends Dad(1)

// interface:   interface(...)    -implements-   class(1)
//              Printable, Published, Bestseller implements Book(1)

//              interface(...)  -extends-        interface(1)
//              Printable, Published extends Bestseller