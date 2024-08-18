package _14_OOP._15_Enums;

import java.util.Arrays;

// is a
public class FirstClass {
    public static final String AUTHOR = "Aitmatov";

    public enum Seasons {
        WINTER("Zima"), // Seasons.WINTER("Zima");
        SPRING("Vesna"), // Seasons.SPRING("Vesna");
        SUMMER("Leto"), // Seasons.SUMMER("Leto");
        FALL("Osen"); // Seasons.FALL("Osen");

        private String season;

        Seasons(String season) {
            this.season = season;
        }
        public String getSeason(){
            return this.season;
    }
}
    public static void main(String[] args) {
        System.out.println(Seasons.SPRING);//SPRING
        System.out.println(Seasons.FALL.getSeason());//Osen
        System.out.println(Seasons.valueOf("SUMMER").getSeason());//Leto
        System.out.println(Arrays.toString(Seasons.values()));//[WINTER, SPRING, SUMMER, FALL]

        Seasons jai = Seasons.SUMMER;
        System.out.println(jai.getSeason());//Leto
        System.out.println(jai.ordinal());//2

    }

}
