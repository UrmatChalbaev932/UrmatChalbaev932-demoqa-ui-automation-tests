package _5_If_else;

import java.util.Scanner; // импортировали библиотеку данных сканера
import java.util.SplittableRandom;

public class _1_HomeWork {
    public static void main(String[] args) {

        // Создать задачу с if-else на тему - Как устроить ребенка в детский сад

        Scanner scan = new Scanner(System.in); // создаем объект сканер для разпознавания текста на консоле.

        // создаем переменные со значением для упрощецния задачи
        String question = "\n" +
                "I will list the documents necessary for \n" +
                "your child to enter our kindergarten, \n" +
                "f you have them, answer yes, if no, answer \n" +
                "no, do you understand??\b";
        String residence = "Сrtificate of residence";
        String birth = "Birth certificate";
        String parents = "Parents' identity document";
        String work = "Certificate from place of work";
        String medical = "Medical certificate";
        String photos = "How many 3x4 photographs of the child did you bring?";
        String welcome = "Your child can be enrolled in Kindergartenм";
        String yes = "Yes";
        int photo = 4;


        //3. Способ составления конструкций на основе If-Else
        System.out.println(question);
        String a = scan.nextLine();
        if (a.equalsIgnoreCase(yes)) {
            System.out.println(residence+" there is?");
            String b = scan.nextLine();
            if (b.equalsIgnoreCase(yes)) {
                System.out.println(birth+" there is?");
                String c = scan.nextLine();
                if (c.equalsIgnoreCase(yes)) {
                    System.out.println(parents+" there is?");
                    String d = scan.nextLine();
                    if (d.equalsIgnoreCase(yes)) {
                        System.out.println(work+" there is?");
                        String f = scan.nextLine();
                        if (f.equalsIgnoreCase(yes)) {
                            System.out.println(medical+" there is?");
                            String g = scan.nextLine();
                            if (g.equalsIgnoreCase(yes)) {
                                System.out.println(photos);
                                int h = scan.nextInt();
                                if (h == 1 || h < 4) {
                                    int k = photo - h;
                                    System.out.println("You need to provide an additional " + k + " photos");
                                } else if (h > 3) {
                                    int l = h - photo;
                                    System.out.println("You brought extra photos, please take " + l + " photos");
                                } else if (h == 4) {
                                    System.out.println("Great, you brought the required amount of photographs");
                                } else {
                                    System.out.println("Not a correct answer, start from the beginning");
                                }
                                System.out.println(welcome);
                            } else {
                                System.out.println("must be brought " + medical);
                            }
                        } else {
                            System.out.println("must be brought " + work);
                        }
                    } else {
                        System.out.println("must be brought " + parents);
                    }
                } else {
                    System.out.println("must be brought " + birth);
                }
            } else {
                System.out.println("must be brought " + residence);
            }
        } else {
            System.out.println("I don't have all the documents");
        }
    }
}

