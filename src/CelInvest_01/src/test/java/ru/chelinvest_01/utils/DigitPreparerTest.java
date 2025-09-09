package ru.chelinvest_01.utils;

import org.junit.jupiter.api.Test;
import ru.chelinvest_01.exceptions.DigitPreparingException;
import ru.chelinvest_01.utils.DigitPreparer;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class DigitPreparerTest {
    @Test //проверяем ten
    void convertNumberToArray_ValidNumber_ReturnsCorrectList_ten() throws DigitPreparingException {
        List<Map.Entry<Long, Integer>> result = DigitPreparer.convertNumberToArray(123456789002L);
        assertNotNull(result);
        assertEquals(12, result.size());

        assertEquals(1, result.get(0).getValue());
        assertEquals(2, result.get(1).getValue());
        assertEquals(3, result.get(2).getValue());
        assertEquals(4, result.get(3).getValue());
        assertEquals(5, result.get(4).getValue());
        assertEquals(6, result.get(5).getValue());
        assertEquals(7, result.get(6).getValue());
        assertEquals(8, result.get(7).getValue());
        assertEquals(9, result.get(8).getValue());
        assertEquals(0, result.get(9).getValue());
        assertEquals(0, result.get(10).getValue());
        assertEquals(2, result.get(11).getValue());

        assertEquals(100000000000L, result.get(0).getKey());
        assertEquals(10000000000L, result.get(1).getKey());
        assertEquals(1000000000L, result.get(2).getKey());
        assertEquals(100000000L, result.get(3).getKey());
        assertEquals(10000000L, result.get(4).getKey());
        assertEquals(1000000L, result.get(5).getKey());
        assertEquals(100000L, result.get(6).getKey());
        assertEquals(10000L, result.get(7).getKey());
        assertEquals(1000L, result.get(8).getKey());
        assertEquals(100L, result.get(9).getKey());
        assertEquals(10L, result.get(10).getKey());
        assertEquals(1L, result.get(11).getKey());

    }

    @Test //проверяем teen
    void convertNumberToArray_ValidNumber_ReturnsCorrectList_teen() throws DigitPreparingException {
        List<Map.Entry<Long, Integer>> result = DigitPreparer.convertNumberToArray(123456789012L);
        assertNotNull(result);
        assertEquals(12, result.size());

        assertEquals(1, result.get(0).getValue());
        assertEquals(2, result.get(1).getValue());
        assertEquals(3, result.get(2).getValue());
        assertEquals(4, result.get(3).getValue());
        assertEquals(5, result.get(4).getValue());
        assertEquals(6, result.get(5).getValue());
        assertEquals(7, result.get(6).getValue());
        assertEquals(8, result.get(7).getValue());
        assertEquals(9, result.get(8).getValue());
        assertEquals(0, result.get(9).getValue());
        assertEquals(0, result.get(10).getValue());
        assertEquals(12, result.get(11).getValue());

        assertEquals(100000000000L, result.get(0).getKey());
        assertEquals(10000000000L, result.get(1).getKey());
        assertEquals(1000000000L, result.get(2).getKey());
        assertEquals(100000000L, result.get(3).getKey());
        assertEquals(10000000L, result.get(4).getKey());
        assertEquals(1000000L, result.get(5).getKey());
        assertEquals(100000L, result.get(6).getKey());
        assertEquals(10000L, result.get(7).getKey());
        assertEquals(1000L, result.get(8).getKey());
        assertEquals(100L, result.get(9).getKey());
        assertEquals(10L, result.get(10).getKey());
        assertEquals(1L, result.get(11).getKey());

    }

    @Test
    void convertNumberToArray_NumberWithZeroes_ReturnsCorrectList() throws DigitPreparingException {
        List<Map.Entry<Long, Integer>> result = DigitPreparer.convertNumberToArray(100000000001L);
        assertNotNull(result);
        assertEquals(12, result.size());

        assertEquals(1, result.get(0).getValue());
        assertEquals(0, result.get(1).getValue());
        assertEquals(0, result.get(2).getValue());
        assertEquals(0, result.get(3).getValue());
        assertEquals(0, result.get(4).getValue());
        assertEquals(0, result.get(5).getValue());
        assertEquals(0, result.get(6).getValue());
        assertEquals(0, result.get(7).getValue());
        assertEquals(0, result.get(8).getValue());
        assertEquals(0, result.get(9).getValue());
        assertEquals(0, result.get(10).getValue());
        assertEquals(1, result.get(11).getValue());
    }

    @Test
    void convertNumberToArray_SmallNumber_ReturnsCorrectList() throws DigitPreparingException {
        List<Map.Entry<Long, Integer>> result = DigitPreparer.convertNumberToArray(5L);

        assertEquals(12, result.size());

        assertEquals(0, result.get(0).getValue());
        assertEquals(0, result.get(1).getValue());
        assertEquals(0, result.get(2).getValue());
        assertEquals(0, result.get(3).getValue());
        assertEquals(0, result.get(4).getValue());
        assertEquals(0, result.get(5).getValue());
        assertEquals(0, result.get(6).getValue());
        assertEquals(0, result.get(7).getValue());
        assertEquals(0, result.get(8).getValue());
        assertEquals(0, result.get(9).getValue());
        assertEquals(0, result.get(10).getValue());
        assertEquals(5, result.get(11).getValue());

    }

    @Test
    void convertNumberToArray_BoundaryValues_ReturnsCorrectList() throws DigitPreparingException {
        List<Map.Entry<Long, Integer>> resultMin = DigitPreparer.convertNumberToArray(1L);
        assertEquals(resultMin.get(11).getValue(), 1);

        List<Map.Entry<Long, Integer>> resultMax = DigitPreparer.convertNumberToArray(999999999999L);
        assertEquals(resultMax.get(0).getValue(), 9);
        assertEquals(resultMax.get(1).getValue(), 9);
        assertEquals(resultMax.get(2).getValue(), 9);
        assertEquals(resultMax.get(3).getValue(), 9);
        assertEquals(resultMax.get(4).getValue(), 9);
        assertEquals(resultMax.get(5).getValue(), 9);
        assertEquals(resultMax.get(6).getValue(), 9);
        assertEquals(resultMax.get(7).getValue(), 9);
        assertEquals(resultMax.get(8).getValue(), 9);
        assertEquals(resultMax.get(9).getValue(), 9);
        assertEquals(resultMax.get(10).getValue(), 9);
        assertEquals(9, resultMax.get(11).getValue());
    }

    @Test
    void convertNumberToArray_InvalidNumberTooSmall_ThrowsException() {
        DigitPreparingException exception = assertThrows(DigitPreparingException.class, () -> {
            DigitPreparer.convertNumberToArray(0L);
        });
        assertEquals("Число не находится в диапазоне от 1 до 999 999 999 999", exception.getMessage());
    }

    @Test
    void convertNumberToArray_InvalidNumberTooLarge_ThrowsException() {
        DigitPreparingException exception = assertThrows(DigitPreparingException.class, () -> {
            DigitPreparer.convertNumberToArray(1000000000000L);
        });
        assertEquals("Число не находится в диапазоне от 1 до 999 999 999 999", exception.getMessage());
    }

    @Test
    void convertNumberToArray_TeenNumber_ReturnsCorrectList() throws DigitPreparingException {
        List<Map.Entry<Long, Integer>> result = DigitPreparer.convertNumberToArray(15L);

        assertEquals(12, result.size());

        assertEquals(0, result.get(0).getValue());
        assertEquals(0, result.get(1).getValue());
        assertEquals(0, result.get(2).getValue());
        assertEquals(0, result.get(3).getValue());
        assertEquals(0, result.get(4).getValue());
        assertEquals(0, result.get(5).getValue());
        assertEquals(0, result.get(6).getValue());
        assertEquals(0, result.get(7).getValue());
        assertEquals(0, result.get(8).getValue());
        assertEquals(0, result.get(9).getValue());
        assertEquals(0, result.get(10).getValue());
        assertEquals(15, result.get(11).getValue());

    }

    @Test
    void convertNumberToArray_NumberEndingWithTeen_ReturnsCorrectList() throws DigitPreparingException {
        List<Map.Entry<Long, Integer>> result = DigitPreparer.convertNumberToArray(112L);

        assertEquals(12, result.size());

        assertEquals(0, result.get(0).getValue());
        assertEquals(0, result.get(1).getValue());
        assertEquals(0, result.get(2).getValue());
        assertEquals(0, result.get(3).getValue());
        assertEquals(0, result.get(4).getValue());
        assertEquals(0, result.get(5).getValue());
        assertEquals(0, result.get(6).getValue());
        assertEquals(0, result.get(7).getValue());
        assertEquals(0, result.get(8).getValue());
        assertEquals(1, result.get(9).getValue());
        assertEquals(0, result.get(10).getValue());
        assertEquals(12, result.get(11).getValue());

    }
}

