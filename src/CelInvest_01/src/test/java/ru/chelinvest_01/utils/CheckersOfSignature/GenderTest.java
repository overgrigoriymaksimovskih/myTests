package ru.chelinvest_01.utils.CheckersOfSignature;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GenderTest {

    @Test
    void isGender_ValidGenders_ReturnsTrue() {
        assertTrue(Gender.isGender(Gender.MALE));
        assertTrue(Gender.isGender(Gender.FEMALE));
        assertTrue(Gender.isGender(Gender.MIDDLE));
    }

    @Test
    void isGender_InvalidGenders_ReturnsFalse() {
        assertFalse(Gender.isGender("X")); // Недопустимый символ
        assertFalse(Gender.isGender("МЖ")); // Два символа
        assertFalse(Gender.isGender("")); // Пустая строка
        assertFalse(Gender.isGender(null)); // Null
        assertFalse(Gender.isGender("м")); // Строчная буква
        assertFalse(Gender.isGender(" ")); // Пробел
    }

    @Test
    void isGender_CaseSensitivity_ReturnsFalse() {
        assertFalse(Gender.isGender("м")); // Проверка, что метод чувствителен к регистру
    }

    @Test
    void isGender_NullInput_ReturnsFalse() {
        assertFalse(Gender.isGender(null));
    }
}

