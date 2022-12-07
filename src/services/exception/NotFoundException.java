package services.exception;

public class NotFoundException extends Exception {
    private String exception;

    public NotFoundException() {
        super("not found id");

    }
}


