package ru.chelinvest_01.utils.CheckersOfSignature;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RuCaseTest {

    @Test
    void isRuCase_ValidCases_ReturnsTrue() {
        assertTrue(RuCase.isRuCase(RuCase.I));
        assertTrue(RuCase.isRuCase(RuCase.R));
        assertTrue(RuCase.isRuCase(RuCase.D));
        assertTrue(RuCase.isRuCase(RuCase.V));
        assertTrue(RuCase.isRuCase(RuCase.T));
        assertTrue(RuCase.isRuCase(RuCase.P));
    }

    @Test
    void isRuCase_InvalidCases_ReturnsFalse() {
        assertFalse(RuCase.isRuCase("A")); // Недопустимая буква
        assertFalse(RuCase.isRuCase("ИВ")); // Два символа
        assertFalse(RuCase.isRuCase("")); // Пустая строка
        assertFalse(RuCase.isRuCase(null)); // Null
        assertFalse(RuCase.isRuCase("и")); // Строчная буква
        assertFalse(RuCase.isRuCase(" ")); // Пробел
    }

    @Test
    void isRuCase_CaseSensitivity_ReturnsFalse() {
        assertFalse(RuCase.isRuCase("и")); // Проверка, что метод чувствителен к регистру
    }

    @Test
    void isRuCase_NullInput_ReturnsFalse() {
        assertFalse(RuCase.isRuCase(null));
    }
}

