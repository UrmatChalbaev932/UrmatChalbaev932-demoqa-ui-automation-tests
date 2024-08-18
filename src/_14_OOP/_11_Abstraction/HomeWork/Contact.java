package _14_OOP._11_Abstraction.HomeWork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Contact {
    public String name;
    public  int number;
    public String beep;

    public Contact(String name, int number, String beep) {
        this.name = name;
        this.number = number;
        this.beep = beep;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", beep='" + beep + '\'' +
                '}';
    }
}
