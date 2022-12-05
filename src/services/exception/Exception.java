package services.exception;

public class Exception extends java.lang.Exception {
    String message;

    public Exception(String message) {
        this.message = message;

    }

    @Override
    public String getMessage() {
        return message;
    }
}
