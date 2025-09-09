package ru.chelinvest_01.exceptions;

public class IncorrectValueException extends Exception {
    public IncorrectValueException() {
    }
    public IncorrectValueException(String message) {
        super(message);
    }

    public IncorrectValueException(String message, Throwable cause) {
        super(message, cause);
    }
}
