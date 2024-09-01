package _15_exceptions._2_Custom_Exception;

public class InvalidCitizenException extends Exception{
    public InvalidCitizenException() {
    }

    public InvalidCitizenException(String message) {
        super(message);
    }

}
