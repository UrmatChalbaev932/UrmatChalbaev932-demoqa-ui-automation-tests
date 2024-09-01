package _14_OOP._7_Inheritance.HomeWork;

public class StudentMain {
    public static void main(String[] args) {

        Student_First_well Jarkyn = new Student_First_well("Taalaibekova Jarkynai", 24);
        Jarkyn.hello(); // @Override - Student_First_well // метод изменили в классе Student_First_well
        Jarkyn.hello(Jarkyn.fullName); // @Overloading - Student Taalaibekova  // метод не изменяли


        Student_Second_well Tugolbai = new Student_Second_well("Arstanbekov Tugolbai", 23);
        Tugolbai.hello(); //@Overloading - Student // метод не изменяли
        Tugolbai.hello(Tugolbai.fullName); //@Overloading - Student Arstanbekov Tugolbai Override - Student_Second_well

    }
}
