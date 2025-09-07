package ru.chelinvest.Exceptions;

public class IncorrectCaseException extends IncorrectValueException {
    public IncorrectCaseException() {
    }

    public IncorrectCaseException(String message) {
        super(message);
    }

    public IncorrectCaseException(String message, Throwable cause) {
        super(message, cause);
    }
}
