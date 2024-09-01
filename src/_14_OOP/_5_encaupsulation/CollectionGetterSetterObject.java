package _14_OOP._5_encaupsulation;

import java.util.ArrayList;
import java.util.List;

public class CollectionGetterSetterObject {
    private List<Person> list_people = new ArrayList<>();


//    public List<Person> getList_people(){
//        return new ArrayList<>(list_people);
//    }
//    public void setList_people(List<Person> list_people) {
//        this.list_people=new ArrayList<>(list_people);
        /*При создании новой коллекции на основе имеющейся,
        объекты, размещенные в оригинальной коллекции,
        не будут скопированы. Вместо этого в новую коллекцию
        будут скопированы только ссылки на эти объекты. И хоть в итоге
        две коллекции и различны, но содержат одни и те же объекты.*/
//    }




    public void setList_people2(List<Person> listPeople) {
        for (Person person : listPeople) {
            this.list_people.add((Person) person.clone());
        }
    }

    public List<Person> getList_people2() {
        List<Person> listPeople = new ArrayList<>();
        for (Person person : this.list_people) {
            listPeople.add((Person) person.clone());
        }
        return listPeople;

    }
    public static void main(String[] args) {
        CollectionGetterSetterObject app = new CollectionGetterSetterObject();

        //1
        List <Person> list1 = new ArrayList<>();
        list1.add(new Person("Aishoola"));
        list1.add(new Person("Urmat"));
        list1.add(new Person("Aiperi"));
        list1.add(new Person("Kutman"));

       /* app.setList_people(list1);
        System.out.println("List1: "+list1); //List1: [Person{name='Aishoola'}, Person{name='Urmat'}, Person{name='Aiperi'}, Person{name='Kutman'}]
        list1.get(2).setName("LULU");
        //2
        List<Person> list2 = app.getList_people();
        System.out.println("List2: "+list2); //List2: [Person{name='Aishoola'}, Person{name='Urmat'}, Person{name='LULU'}, Person{name='Kutman'}]
        list2.get(3).setName("PEPE");
        //3
        List<Person> list3 = app.getList_people();
        System.out.println("List3: "+ list3); //List3: [Person{name='Aishoola'}, Person{name='Urmat'}, Person{name='Badam'}, Person{name='PEPE'}]
        */
        System.out.println("---------------------------------");

        app.setList_people2(list1);
        System.out.println("List1: "+ list1);
        list1.get(2).setName("MAX");

        List <Person> list4 = app.getList_people2();
        System.out.println("List4: "+ list4);
        list4.get(3).setName("DIANA");

        List <Person> list5 = app.getList_people2();
        System.out.println("List5: "+list5);

       /* Таким образом, ключевыми моментами для реализации геттера и
        сеттера для коллекций являются:
        Для коллекций из элементов типа String не требуется специальной реализации,
        так как объекты этого типа неизменяемы (immutable)
        Для коллекций пользовательских типов данных необходимо:
        реализовать метод clone()
        в сеттере добавить клонирование элементов из исходной коллекции в конечную
        в геттере создать новую возвращаемую коллекцию, используя клонирование элементов
         из исходной коллекции в новую
*/
    }

}
