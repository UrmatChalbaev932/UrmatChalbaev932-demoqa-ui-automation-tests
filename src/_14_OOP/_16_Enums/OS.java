package _14_OOP._16_Enums;

public enum OS {
    WINDOWS("Windows XP"),
    IOS("I Operation System"),
    LINUX("Linux");

    /* переменные здесь всегда
    приват по умолчанию потому что
    мы собираемся работать с константами*/
    private String description;

    OS(String description) {
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
