package _15_exceptions._2_Custom_Exception;

public class Test {
    public static void main(String[] args) throws InvalidAgeException, InvalidCitizenException, InvalidMemoryException {

        Passport passport = new Passport("Urmat", 43, "KG");
        try {
            passport.getAPassport();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Hello Urmat");





    }
}
