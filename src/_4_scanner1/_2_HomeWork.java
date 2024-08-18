package _4_scanner1;

import java.util.Scanner;

public class _2_HomeWork {
    public static void main(String[] args) {

        String yes = "Да";
        int term = 8;

        Scanner scan = new Scanner(System.in);
        System.out.println("Хотите получить ВНЖ Турций? ");
        String answer = scan.next();
            if (answer.equalsIgnoreCase(yes)) {
            System.out.println("Вы являетесь беженцем? :");
            String answer1 = scan.next();
                 if (answer1.equalsIgnoreCase(yes)) {
                System.out.println("Сколько лет вы живете в Турций? :");
                int numb = scan.nextInt();
                     if (numb >= term) {
                     System.out.println("ВНЖ одобрен!");
                     } else {
                     System.out.println("Срок проживания не соответствует");
                     System.out.println("Вам отказано");
                     }
                } else {
                System.out.println("ВНЖ могут получить только беженцы");
                System.out.println("Вам отказано");
            }
        } else {
                System.out.println("Извините за беспокойство");
            }

//  _____________________________________________________________________________
       /* boolean vnj = true;
        boolean superman = true;
        boolean investor = true;
        int year = 5;

        if (vnj) {
            System.out.println("You have resident permit?");
            if (superman) {
                System.out.println("You have special achievements");
                if (investor) {
                    System.out.println("You are investor");
                    if (year >= 5) {
                        System.out.println("You have been living in Turkiye more than 5 years");
                        System.out.println("You can become a Turkiye citizen!!");
                    } else {
                        System.out.println("You havent enough living years in Turkiye");
                    }
                } else {
                    System.out.println("You didnt investor to Turkiye");
                }
            } else {
                System.out.println("You heva done anything for Turkiye");
            }
        } else {
            System.out.println("You havent resident permit");
        }
    }
}*/


        //*_______________________________________________________________
        /*String VNJ = "Да";
        String Supermen = "Да";
        String investor = "Да";
        int Years = 5;


        Scanner scan = new Scanner(System.in);
        System.out.println("Для получения гражданства Труций");
        System.out.println("У Вас есть ВНЖ?;");
        String CZ = scan.nextLine();
        if (VNJ.equalsIgnoreCase(CZ)) {
            System.out.println("Следующий вопрос ");
            System.out.println("Вы Супермен? :");
            String userS = scan.next();
            if (userS.equalsIgnoreCase(Supermen)) {
                System.out.println("Следующий вопрос ");
                System.out.println("Вы Инвестор: ");
                String userI = scan.next();
                if (userI.equalsIgnoreCase(Supermen)) {
                    System.out.println("Следующий вопрос ");
                    System.out.println("Сколько лет вы живете в Турции? : ");
                    int userY = scan.nextInt();
                    if (userY >= Years) {
                        System.out.println("Вы можете стать гражданином Турции!");
                    } else {
                        System.out.println("Отказано");
                    }
                } else {
                    System.out.println("Отказано");
                }
            } else {
                System.out.println("Отказано");
            }
        } else {
            System.out.println("Отказано");
        }*/
    }
}



















