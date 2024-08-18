package _11_wrapper_classes;

import java.util.*;

public class List1 {
    public static void main(String[] args) {
        // interface
        List<Integer> list1 = new ArrayList<>();
        list1.add(34);
        list1.add(67);
        list1.add(12);
        System.out.println(list1);

        List<Integer> list2 = new LinkedList<>();
        list2.add(90);
        list2.add(80);
        list2.add(20);
        System.out.println(list2);

        StringBuilder sb1 = new StringBuilder("Hello");
        ArrayList<Integer> list3 = new ArrayList<>();

//         List<Integer> list4 = new List<Integer>();


        // primitive(key words)   -> variable
        // non-primitive(class)   -> object

        ArrayList<String> brands = new ArrayList<>();
        brands.add("Mercedes");
        brands.add("Porsche");
        brands.add("Ford");
        brands.add("Toyota");
        System.out.println(brands);  // [Mercedes, Porsche, Ford, Toyota]
        brands.remove(0);
        System.out.println(brands);


        System.out.println("________");

        Iterator itr = brands.iterator(); // [Porsche, Ford, Toyota]
//        while (itr.hasNext()){ // false
//            // 1. true
//            // 2. true
//            // 3. true
//            // 4. true
//            System.out.println(itr.next());
//            // 1. Mercedes
//            // 2. Porsche
//            // 3. Ford
//            // 4. toyota
//        }


        System.out.println(itr.hasNext()); // true
        System.out.println(itr.next());    // Porsche
        System.out.println(itr.hasNext()); // true
        System.out.println(itr.next());    // Ford
        itr.remove(); //// Ford -> delete
        System.out.println(brands); //[Porsche, Toyota]


        System.out.println("-------");

        LinkedList<Integer> link = new LinkedList<>();
        link.add(78);
        link.add(12);
        link.add(33);
        link.add(56);
        link.add(45);
        System.out.println(link); //[78, 12, 33, 56, 45]

        Iterator<Integer> iter = link.iterator();

        while (iter.hasNext()) {

            if (iter.next() == 78) {

                iter.remove();
            }
        }

        System.out.println(link); //[12, 33, 56, 45]

        LinkedList list0 = new LinkedList();

        list0.add(12);
        list0.add('A');
        list0.add("ASD");
        list0.add(true);
        list0.add(10.2);

//        for (int i = 0; i < list0.size(); i++) {
//            if (list0.get(i).equals(true)) {
//                list0.remove(i);
//            }
//        } System.out.println(list0); //[12, A, ASD, 10.2]
// }


        Iterator itera = list0.iterator();
        while (itera.hasNext()) {
            if (itera.next().equals(true)) {
                itera.remove();
            }
        }
        System.out.println(list0); //[12, A, ASD, 10.2]
    }
}