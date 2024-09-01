package _12_set;

import java.util.*;

public class Set1 {
    public static void main(String[] args) {

        // List = ArrayList
// List = LinkedList

// Set = HashSet
// Set = LinkedHashSet
// Set = TreeSet

        ArrayList<String> list1 = new ArrayList<>();
        HashSet<String> set1 = new HashSet<>();

        List<String> list2 = new LinkedList<>();
        Set<String> set2 = new LinkedHashSet<>();


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(55);
        numbers.add(98);
        numbers.add(73);
        numbers.add(11);
        System.out.println(numbers);

        HashSet<Integer> numset = new HashSet<>();
        numset.add(12);
        numset.add(55);
        numset.add(98);
        numset.add(73);
        numset.add(11);
        System.out.println(numset);

        LinkedHashSet<Integer> numset2 = new LinkedHashSet<>();
        numset2.add(12);
        numset2.add(55);
        numset2.add(98);
        numset2.add(73);
        numset2.add(11);
        System.out.println(numset2);

        TreeSet<Integer> numset3 = new TreeSet<>();
        numset3.add(12);
        numset3.add(55);
        numset3.add(98);
        numset3.add(73);
        numset3.add(11);
        System.out.println(numset3);
        System.out.println(numset3);


// List -> work with index
// Set  -> no index (HashSet, LinkedHashSet, TreeSet)

// Arrays.sort
// Collections: List, Set

// List -> Collection.sort
// Set  -> TreeSet

        int [] nums = {23,56,12};
        Arrays.sort(nums);

        ArrayList<String> listNames = new ArrayList<>();
        listNames.add("Zyinat");   // 0
        listNames.add("Tynchtyk"); // 1
        listNames.add("Mira");     // 2
        listNames.add("Aizhan");   // 3
        listNames.add("Mira");     // 4
        System.out.println(listNames);

        LinkedHashSet<String> setNames = new LinkedHashSet<>();
        setNames.add("Zyinat");
        setNames.add("Tynchtyk");
        setNames.add("Mira");
        setNames.add("Aizhan");
        setNames.add("Aizhan");
        setNames.add("Aizhan");
        setNames.add("Aizhan");
        setNames.add("Mira");
        setNames.add("Mira");
        setNames.add("Mira");
        setNames.add("Mira");
        setNames.add("Mira");
        setNames.add("Mira");
        System.out.println(setNames); // Zyinat <-> Tynchtyk <-> Mira <-> Aizhan

        LinkedHashSet<String> setNames2 = new LinkedHashSet<>();
        setNames2.addAll(listNames);
        System.out.println(setNames2);

// 0123456
// philips


        HashSet<Character>setChar=new HashSet<>();
        setChar.add('a');
        setChar.add('b');
        setChar.add('c');
        setChar.add('d');
        setChar.add('e');
        System.out.println(setChar);

        setChar.remove('d');
        System.out.println(setChar);

        String[] str= {"One","Two","Three"};
        HashSet strSet=new HashSet<>();

        for (String one: str){
            strSet.add(one);
        }
        System.out.println(strSet);

        strSet.addAll(Arrays.asList(str));
        System.out.println(strSet);


        LinkedHashSet <String> qwer = new LinkedHashSet<>();
        qwer.addAll(listNames);
        System.out.println(qwer);

    }
}
