package _14_OOP._4_Constructor;


import java.util.LinkedHashMap;

public class StudentMain {
    public static void main(String[] args) {

        Student studentIsaacNewton = new Student("Isaac Newton", 1642);
        Student studentAlbertEinst = new Student("Albert Einstein", 1879);
        Student studentJamesMaxwel = new Student("James Maxwell", 1831);
        Student studentCharlesDarw = new Student("Charles Darwin", 1809);
        Student studentNikolaTesla = new Student("Nikola Tesla", 1987);
        Student unknownstudent = new Student("Unknown Student", 1809);
        System.out.println(studentAlbertEinst);

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(studentIsaacNewton.rollNumber, studentIsaacNewton.name);
        map.put(studentAlbertEinst.rollNumber, studentAlbertEinst.name);
        map.put(studentJamesMaxwel.rollNumber, studentJamesMaxwel.name);
        map.put(studentCharlesDarw.rollNumber, studentCharlesDarw.name);
        map.put(studentNikolaTesla.rollNumber, studentNikolaTesla.name);
        map.put(unknownstudent.rollNumber, unknownstudent.name);
        System.out.println(map);

        Student.checkKey(map);












    }


}