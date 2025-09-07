package ru.chelinvest_01.Exceptions;

public class IncorrectValueCaseException extends IncorrectValueException {
    public IncorrectValueCaseException() {
    }

    public IncorrectValueCaseException(String message) {
        super(message);
    }

    public IncorrectValueCaseException(String message, Throwable cause) {
        super(message, cause);
    }
}
