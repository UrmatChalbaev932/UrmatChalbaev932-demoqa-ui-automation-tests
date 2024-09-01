package _15_exceptions._2_Custom_Exception;

public class PhoneMemory {
    public String model;
    private int memory;
    public int photo;
    public int video;
    public int song;

    public PhoneMemory(String model, int memory, int photo, int video, int song) {
        this.model = model;
        this.memory = memory;
        this.photo = photo;
        this.video = video;
        this.song = song;
    }

    @Override
    public String toString() {
        return "PhoneMemory{" +
                "model='" + model + '\'' +
                ", memory=" + memory +
                ", photo=" + photo +
                ", video=" + video +
                ", song=" + song +
                '}';
    }

    public void getMemory() throws InvalidMemoryException{
       int memory = this.photo+this.video+this.song;
       if (memory > this.memory) {
           throw  new InvalidMemoryException("not memory "+ memory);
       } else {
           System.out.println("yes memory "+memory);
       }
    }

    public static void main(String[] args) throws InvalidMemoryException {
        PhoneMemory phoneMemory = new PhoneMemory("Nokia", 521, 566, 0, 3);

        PhoneMemory a = new PhoneMemory("j", 5, 1, 1, 1);

        try {
            phoneMemory.getMemory();
        } catch (InvalidMemoryException e){
            e.printStackTrace();
        }
        System.out.println("Yhuu!");
    }
}
