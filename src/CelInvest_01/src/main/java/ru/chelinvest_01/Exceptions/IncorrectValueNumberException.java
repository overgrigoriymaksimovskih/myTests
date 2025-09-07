package ru.chelinvest_01.Exceptions;

public class IncorrectValueNumberException extends IncorrectValueException {
    public IncorrectValueNumberException() {
    }

    public IncorrectValueNumberException(String message) {
        super(message);
    }

    public IncorrectValueNumberException(String message, Throwable cause) {
        super(message, cause);
    }
}
