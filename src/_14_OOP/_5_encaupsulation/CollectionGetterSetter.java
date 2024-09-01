package _14_OOP._5_encaupsulation;

import java.util.ArrayList;
import java.util.List;

public class CollectionGetterSetter {

    private List<String> List_Titles;


    public List <String> getList_Titles(){
       // return List_Titles;
        return new ArrayList<>(List_Titles);
    }

    public void setList_Titles(List<String> List_Titles){
        this.List_Titles = List_Titles;
        this.List_Titles = new ArrayList<>(List_Titles);
    }

    public static void main(String[] args) {

        CollectionGetterSetter app = new CollectionGetterSetter();
        //1
        List <String> titles = new ArrayList<>();
        titles.add("Name1");
        titles.add("Name2");
        titles.add("Name3");
        titles.add("Name4");

        app.setList_Titles(titles); // назначили филдовый приват лист

        System.out.println("titles: "+titles); //titles: [Name1, Name2, Name3, Name4]
        titles.set(0, "Urmat");

        //2.
        List <String> titles1= app.getList_Titles();
        System.out.println("titles1: "+titles1); //titles1: [Urmat, Name, Name, Name]
        titles1.set(1, "Badam");

        //3.
        List <String> titles2 = app.getList_Titles();
        System.out.println("titles2: "+titles2); //titles2: [Urmat, Badam, Name3, Name4]

     /*  Мы можем ожидать, что в консоли будут отображены три одинаковых результата.
         Однако при запуске программа выдает следующее:
                titles:  [Name1, Name2, Name3, Name4]
                titles1: [Urmat, Name2, Name3, Name4]
                titles2: [Urmat, Badam, Name3, Name4]
         Это означает, что коллекция может быть изменена из кода, находящегося
         за пределами геттера и сеттера.*/

        /*Для коллекции из String'ов одним из решений является использование конструктора,
        который принимает другую коллекцию в качестве аргумента. Например, мы можем изменить
        код вышеупомянутого геттера и сеттера следую


         */








    }

}
