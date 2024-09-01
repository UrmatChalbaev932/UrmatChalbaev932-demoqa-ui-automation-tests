package _14_OOP._4_Constructor;

import java.util.*;

public class Student {

    public String name;
    public Integer rollNumber;
    public static ArrayList <String> arrN = new ArrayList<>();
    public static ArrayList <Integer> arrRN = new ArrayList<>();

    public Student(String name, Integer rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        arrRN.add(rollNumber);
        arrN.add(name);
    }

    public static void checkKey(LinkedHashMap<Integer, String> map) {
        map.clear();
        for (int i = 0; i < arrRN.size() - 1; i++) {
            for (int j = i + 1; j < arrRN.size(); j++) {
                if (arrRN.get(i).equals(arrRN.get(j))) {
                    arrRN.set(i, arrRN.get(i) + i);
                }
            }
        }
        for (int i = 0; i < arrN.size(); i++) {
            map.put(arrRN.get(i), arrN.get(i));
        }
        System.out.println(map);
    }
    
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                '}';
    }
}
