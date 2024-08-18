package _14_OOP._5_encaupsulation;

import java.util.Arrays;

public class GetterSetter {


    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number > 10) {
            System.out.println("Stop:  number > 10");
        } else {
            this.number = number;
            System.out.println("Successfully assigned: " + this.number);
        }
    }


    private int[] score;

//    public int[] getScore() {- неправильный вариант - теряется смысл инкапсуляции java
//        return score;
//    }


    public int[] getScore() {
        int [] copy_score = new int[score.length];
        System.arraycopy(score,0, this.score, 0, score.length);
        return copy_score;
    }

    //    public void setScore(int[] score) { - неправильный вариант - теряется смысл инкапсуляции java
//        this.score = score;
//    }
    public void setScore (int[] score) {
        this.score = new int[score.length];
        System.arraycopy(score, 0, this.score, 0, score.length);
    }

    public void display_score() {
        for (int number : score) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "GetterSetter{" +
                "score=" + Arrays.toString(score) +
                '}';
    }
}
