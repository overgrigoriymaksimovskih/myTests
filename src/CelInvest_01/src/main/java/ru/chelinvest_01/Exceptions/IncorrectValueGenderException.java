package ru.chelinvest_01.Exceptions;

public class IncorrectValueGenderException extends IncorrectValueException {
    public IncorrectValueGenderException() {
    }

    public IncorrectValueGenderException(String message) {
        super(message);
    }

    public IncorrectValueGenderException(String message, Throwable cause) {
        super(message, cause);
    }
}
