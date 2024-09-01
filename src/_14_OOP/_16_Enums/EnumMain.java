package _14_OOP._16_Enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnumMain {
    public static void main(String[] args) {

        // вытащили конкретный элемент
        System.out.println(OS.WINDOWS);//WINDOWS
        // узнаем есть ли такой элемент
        System.out.println(OS.valueOf("WINDOWS"));//WINDOWS


        // вытаскиваем все элементы
        System.out.println(OS.values()); //[L_14_OOP._16_Enums.OS;@a09ee92
        System.out.println(Arrays.toString(OS.values()));//[WINDOWS, IOS, LINUX]
        for(OS os: OS.values()){
            System.out.println(os); //WINDOWS
                                    //IOS
                                    //LINUX
            //OS os = WINDOWS;
            //OS os = IOS;
            //OS os = LINUX;
        }
        // вытаскиваем либо индекс, либо значение
        System.out.println(OS.LINUX.ordinal()); //2
        System.out.println(OS.IOS.getDescription());//I Operation System

        // создали объект
        OS win = OS.WINDOWS;
        System.out.println(win); //WINDOWS

        ArrayList<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

    }
}
