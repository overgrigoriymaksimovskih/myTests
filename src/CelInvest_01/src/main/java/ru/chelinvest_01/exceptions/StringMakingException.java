package ru.chelinvest_01.exceptions;

public class StringMakingException extends IncorrectValueException{
    public StringMakingException() {
    }

    public StringMakingException(String message) {
        super(message);
    }
}
