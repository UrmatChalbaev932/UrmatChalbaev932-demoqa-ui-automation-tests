package _14_OOP._7_Inheritance;

public class Dad {

    public String name;
    public String eyes;
    public String hair;
    private String RHFactor;

    public Dad(String name, String eyes, String hair, String RHFactor) {
        this.name = name;
        this.eyes = eyes;
        this.hair = hair;
        this.RHFactor = RHFactor;
    }

    public String getRHFactor() {
        return RHFactor;
    }

    public String toDraw(){
        return "Painting.... horses";
    }

    public String toDraw(String oil){
        return "Painting.... horses, by oil";
    }

    @Override
    public String toString() {
        return "Dad{" +
                "name='" + name + '\'' +
                ", eyes='" + eyes + '\'' +
                ", hair='" + hair + '\'' +
                ", RHFactor='" + RHFactor + '\'' +
                '}';
    }
}