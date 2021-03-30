package lab7.io;

public class DocumentedException extends Exception {

    public DocumentedException(String message, Throwable cause) {
        super(message, cause);
    }

    public DocumentedException(String message) {
        super(message);
    }
}
