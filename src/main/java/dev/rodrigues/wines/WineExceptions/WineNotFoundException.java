package dev.rodrigues.wines.WineExceptions;

public class WineNotFoundException extends RuntimeException{

    public WineNotFoundException(String message) {
        super(message);
    }
}
