package _14_OOP._12_Interface1;

import java.util.ArrayList;
import java.util.List;

public class PlaneMain {
    public static void main(String[] args) {
        Plane plane = new Plane();
        System.out.println(plane.toFly());

        Bird bird = new Bird();
        System.out.println(bird.toFly());

        ArrayList list1 = new ArrayList();
        List list2 = new ArrayList<>();

        Flying plane1 = new Plane();
        System.out.println(plane1.toFly());
        Flying bird1 = new Bird();
        System.out.println(bird1.toFly());

        System.out.println(Flying.toLanding());

        // car
        // mers
        // mers (is a) car - > extends

        // Flying
        // Plane
        // Plane (is a) flying - implements>



    }
}
