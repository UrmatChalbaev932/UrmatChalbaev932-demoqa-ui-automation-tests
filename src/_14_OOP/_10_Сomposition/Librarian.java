package _14_OOP._10_Сomposition;

public class Librarian extends Person {
    public Librarian(String name, int age, boolean ID) {
        super(name, age, ID);
    }

    public String registerCard(Reader reader) {
        if (reader.age >= 16) {
            if (reader.ID) {
                return "Card registretion for" + reader.name;
            } else {
                return "Invalid ID";
            }
        } else {
            return "Invalid age";
        }
    }
}
