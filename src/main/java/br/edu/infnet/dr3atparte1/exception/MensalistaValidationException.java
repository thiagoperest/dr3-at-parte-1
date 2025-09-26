package br.edu.infnet.dr3atparte1.exception;

public class MensalistaValidationException extends RuntimeException {

    public MensalistaValidationException(String message) {
        super(message);
    }

    public MensalistaValidationException(String message, Throwable cause) {
        super(message, cause);
    }
}
