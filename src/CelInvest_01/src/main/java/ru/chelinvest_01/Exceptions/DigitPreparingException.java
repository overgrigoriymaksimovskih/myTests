package ru.chelinvest_01.Exceptions;

public class DigitPreparingException extends IncorrectValueException{
    public DigitPreparingException() {
    }

    public DigitPreparingException(String message) {
        super(message);
    }
}
