package _14_OOP._7_Inheritance;

import _14_OOP._7_Inheritance.Dad;
import _14_OOP._7_Inheritance.Son;

public class MainFamily {
        public static void main(String[] args) {

            Dad dad = new Dad("kalys", "brown", "black", "1-positive");
            System.out.println(dad);
            System.out.println(dad.getRHFactor());
            System.out.println(dad.toDraw());
            System.out.println(dad.toDraw("Belka"));

            System.out.println("--------------");

            Son son = new Son("Mirbek", "green", "black", "2-negative");
            System.out.println(son);
            System.out.println(son.getRHFactor());
            System.out.println(son.toDraw());
        }
    }