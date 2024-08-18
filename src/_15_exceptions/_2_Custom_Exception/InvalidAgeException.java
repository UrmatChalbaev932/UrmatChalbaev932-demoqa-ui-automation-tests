package _15_exceptions._2_Custom_Exception;

public class InvalidAgeException extends Exception{

    public InvalidAgeException() {
        super();
    }
    InvalidAgeException(String massage){
        super(massage);
    }
    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause);
    }
}
