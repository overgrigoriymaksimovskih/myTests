package ru.chelinvest_01.utils.CheckersOfSignature;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    void iisValidNumber_PositiveNumbersWithinRange_ReturnsTrue() {
        assertTrue(Sum.iisValidNumber(100L));
        assertTrue(Sum.iisValidNumber(500_000_000_000L)); // Пример числа в середине допустимого диапазона
    }

    @Test
    void iisValidNumber_Zero_ReturnsTrue() {
        assertTrue(Sum.iisValidNumber(0L));
    }

    @Test
    void iisValidNumber_MaximumValidNumber_ReturnsTrue() {
        assertTrue(Sum.iisValidNumber(999_999_999_999L));
    }

    @Test
    void iisValidNumber_NegativeNumber_ReturnsFalse() {
        assertFalse(Sum.iisValidNumber(-1L));
        assertFalse(Sum.iisValidNumber(-100L));
    }

    @Test
    void iisValidNumber_NumberExceedingMaximum_ReturnsFalse() {
        assertFalse(Sum.iisValidNumber(1_000_000_000_000L)); // 1 триллион
        assertFalse(Sum.iisValidNumber(Long.MAX_VALUE)); // Проверка с максимально возможным значением Long
    }
}

