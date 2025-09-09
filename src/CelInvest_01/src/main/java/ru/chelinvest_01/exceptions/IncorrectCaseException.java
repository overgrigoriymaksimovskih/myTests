package ru.chelinvest_01.exceptions;

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
