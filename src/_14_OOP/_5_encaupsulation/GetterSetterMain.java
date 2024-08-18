package _14_OOP._5_encaupsulation;
/*Итак, сеттер — это метод, который изменяет (устанавливает; от слова set)
         значение поля. А геттер — это метод, который возвращает (от слова get) нам
         значение какого-то поля.
         Геттер иногда называют accessor (аксессор, т.к. он предоставляет
         доступ к полю), а сеттер mutator (мутатор, т.к. он меняет значение
         переменной).*/
public class GetterSetterMain {
    public static void main(String[] args) {

        GetterSetter obj = new GetterSetter();
        obj.setNumber(9); //Successfully assigned: 9
        System.out.println(obj.getNumber()); // 9

        System.out.println("-----------------------------------");
        //              0 1 2 3 4 5
        int [] score = {1,2,3,4,5,6};
        obj.setScore(score);
        obj.display_score(); //1 2 3 4 5 6
        //score[1]=6;
        //obj.display_score(); //1 6 3 4 5 6
        // после создания адекватного метода setScore
        score[1]=6;
        obj.display_score(); //1 2 3 4 5 6

        System.out.println("-----------------------------------");

        int[] myScores = {5, 5, 4, 3, 2, 4}; // 1

        obj.setScore(myScores); //
        obj.display_score();  //

        int[] copyScores = obj.getScore(); //
        copyScores[1] = 1; //
        obj.display_score(); //




    }
}
