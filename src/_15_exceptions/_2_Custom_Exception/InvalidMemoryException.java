package _15_exceptions._2_Custom_Exception;

public class InvalidMemoryException extends Exception {
    public InvalidMemoryException() {
    }
    public InvalidMemoryException (String message) {
        super(message);
    }
}
