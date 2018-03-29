package vectors;

public class BadValueException extends Exception {
    public BadValueException() {
        super("Bad value");
    }

    public BadValueException(String message) {
        super(message);
    }

    public BadValueException(String message, Throwable cause) {
        super(message, cause);
    }
}
