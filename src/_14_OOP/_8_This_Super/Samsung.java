package _14_OOP._8_This_Super;

public class Samsung extends Phone{

    public String main_sim_card;
    private String second_sim_card;

    public Samsung(String mark, String model, String color, float memory, String os, int balance, String main_sim_card, String second_sim_card) {
        super(mark, model, color, memory, os, balance);
        this.main_sim_card = main_sim_card;
        this.second_sim_card = second_sim_card;
    }
}