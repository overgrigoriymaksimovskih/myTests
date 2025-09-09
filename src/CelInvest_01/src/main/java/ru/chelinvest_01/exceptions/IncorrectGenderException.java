package ru.chelinvest_01.exceptions;

public class IncorrectGenderException extends IncorrectValueException {
    public IncorrectGenderException() {
    }

    public IncorrectGenderException(String message) {
        super(message);
    }

    public IncorrectGenderException(String message, Throwable cause) {
        super(message, cause);
    }
}
