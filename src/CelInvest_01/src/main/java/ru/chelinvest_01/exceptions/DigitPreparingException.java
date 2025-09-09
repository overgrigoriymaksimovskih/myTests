package ru.chelinvest_01.exceptions;

public class DigitPreparingException extends IncorrectValueException{
    public DigitPreparingException() {
    }

    public DigitPreparingException(String message) {
        super(message);
    }
}
