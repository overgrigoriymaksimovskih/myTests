package ru.chelinvest_01.service.impl;

import org.junit.jupiter.api.Test;
import ru.chelinvest_01.exceptions.*;
import ru.chelinvest_01.service.NumberToTextConverter;
import ru.chelinvest_01.service.impl.NumberToTextConverterImpl;
import ru.chelinvest_01.utils.CheckersOfSignature.RuCase;

import static org.junit.jupiter.api.Assertions.*;

class NumberToTextConverterImplTest {

    private final NumberToTextConverter converter = new NumberToTextConverterImpl();

    @Test
    void numberToWords_zero_returnsCorrectString() throws IncorrectValueException {
        assertEquals("ноль", converter.numberToWords(0L, "М", "И"));
        assertEquals("ноля", converter.numberToWords(0L, "М", "Р"));
        assertEquals("нолю", converter.numberToWords(0L, "М", "Д"));
        assertEquals("нолём", converter.numberToWords(0L, "М", "Т"));
        assertEquals(" ноле", converter.numberToWords(0L, "М", "П"));
    }

    @Test
    void numberToWords_validInput_returnsCorrectString() throws IncorrectValueException {
        assertEquals("один", converter.numberToWords(1L, "М", "И"));
        assertEquals("одна тысяча", converter.numberToWords(1000L, "Ж", "И"));
        assertEquals("один миллион", converter.numberToWords(1000000L, "М", "И"));
        assertEquals("один миллиард", converter.numberToWords(1000000000L, "М", "И"));

    }

    @Test
    void numberToWords_invalidGender_throwsException() {
        IncorrectGenderException thrown = assertThrows(
                IncorrectGenderException.class,
                () -> converter.numberToWords(1L, "X", "И"),
                "Expected IncorrectGenderException to be thrown"
        );
        assertTrue(thrown.getMessage().contains("X - неверный пол"));
    }

    @Test
    void numberToWords_invalidCase_throwsException() {
        IncorrectCaseException thrown = assertThrows(
                IncorrectCaseException.class,
                () -> converter.numberToWords(1L, "М", "Q"),
                "Expected IncorrectCaseException to be thrown"
        );
        assertTrue(thrown.getMessage().contains("Q - неверный падеж"));
    }

    @Test
    void numberToWords_invalidNumber_throwsException() {
        IncorrectNumberException thrown = assertThrows(
                IncorrectNumberException.class,
                () -> converter.numberToWords(1000000000000L, "М", "И"),
                "Expected IncorrectNumberException to be thrown"
        );
        assertTrue(thrown.getMessage().contains("1000000000000 - введено неверное число. Используйте от 0 до 999 999 999 999"));
    }

    @Test
    void numberToWords_complexNumber_returnsCorrectString() throws IncorrectValueException {
        String result = converter.numberToWords(123456789L, "М", "И");
        assertEquals("сто двадцать три миллиона четыреста пятьдесят шесть тысяч семьсот восемьдесят девять", result);
    }
}

