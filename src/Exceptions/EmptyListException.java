package Exceptions;

public class EmptyListException extends RuntimeException {
    public EmptyListException() {
        super();
    }

    public EmptyListException(String message) {
        super(message);
    }
}
