package Prezent._VectorDemo;

import java.util.*;
public class _VectorDemo {

    public static void main(String args[]) {
        // Начальный размер равен 3, Инкремент равен 2
        Vector v = new Vector(3, 2);
        System.out.println("Начальный размер: " + v.size());
        System.out.println("Начальная вместимость: " + v.capacity());

        v.addElement(new Integer(1));
        v.addElement(new Integer(2));
        v.addElement(new Integer(3));
        v.addElement(new Integer(4));
        System.out.println("Вместимость после четырёх дополнений: " + v.capacity());

        v.addElement(new Double(5.45));
        System.out.println("Текущая вместимость: " + v.capacity());

        v.addElement(new Double(6.08));
        v.addElement(new Integer(7));
        System.out.println("Текущая вместимость: " + v.capacity());

        v.addElement(new Float(9.4));
        v.addElement(new Integer(10));
        System.out.println("Текущая вместимость: " + v.capacity());

        v.addElement(new Integer(11));
        v.addElement(new Integer(12));
        System.out.println("Первый элемент: " + (Integer)v.firstElement());
        System.out.println("Последний элемент: " + (Integer)v.lastElement());

        if(v.contains(new Integer(3)))
            System.out.println("Вектор содержит 3.");

        // Перечисляет элементы в векторе.
        Enumeration vEnum = v.elements();
        System.out.println("\nЭлементов в векторе:");

        while(vEnum.hasMoreElements())
            System.out.print(vEnum.nextElement() + " ");
        System.out.println();
    }
}
    /*Получим следующее:

        Начальный размер: 0
        Начальная вместимость: 3
        Вместимость после четырёх дополнений: 5
        Текущая вместимость: 5
        Текущая вместимость: 7
        Текущая вместимость: 9
        Первый элемент: 1
        Последний элемент: 12
        Вектор содержит 3.

        Элементов в векторе:
        1 2 3 4 5.45 6.08 7 9.4 10 11 12



        4Java.ru
*/

