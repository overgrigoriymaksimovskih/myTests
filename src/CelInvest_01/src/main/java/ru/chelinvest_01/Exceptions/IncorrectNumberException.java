package ru.chelinvest_01.Exceptions;

public class IncorrectNumberException extends IncorrectValueException {
    public IncorrectNumberException() {
    }

    public IncorrectNumberException(String message) {
        super(message);
    }

    public IncorrectNumberException(String message, Throwable cause) {
        super(message, cause);
    }
}
