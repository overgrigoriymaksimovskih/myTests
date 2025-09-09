package ru.chelinvest_01.utils;

import org.junit.jupiter.api.Test;
import ru.chelinvest_01.exceptions.StringMakingException;
import ru.chelinvest_01.utils.StringMaker;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StringMakerTest {

    @Test
    void processNumberList_validInput_returnsCorrectString() throws StringMakingException {
        List<Map.Entry<Long, Integer>> numberList = new ArrayList<>();
        numberList.add(new AbstractMap.SimpleEntry<>(1000000000000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(100000000000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(10000000000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(1000000000L, 1));  // 1 миллиард
        numberList.add(new AbstractMap.SimpleEntry<>(100000000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(10000000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(1000000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(100000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(10000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(1000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(100L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(1L, 0));
        String result = StringMaker.processNumberList(numberList, "М", "И");
        assertTrue(result.contains("один миллиард"));
    }

    @Test
    void processNumberList_invalidSize_throwsException() {
        List<Map.Entry<Long, Integer>> numberList = new ArrayList<>();
        numberList.add(new AbstractMap.SimpleEntry<>(1L, 1));
        assertThrows(StringMakingException.class, () -> StringMaker.processNumberList(numberList, "М", "И"));
    }

    @Test
    void processNumberList_nullEntry_throwsException() {
        List<Map.Entry<Long, Integer>> numberList = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            numberList.add(null);
        }
        assertThrows(StringMakingException.class, () -> StringMaker.processNumberList(numberList, "М", "И"));
    }

    @Test
    void processNumberList_nullPowerOfTen_throwsException() {
        List<Map.Entry<Long, Integer>> numberList = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            numberList.add(new AbstractMap.SimpleEntry<>((long) (i + 1), 1));
        }
        numberList.add(new AbstractMap.SimpleEntry<>(null, 1));

        StringMakingException thrown = assertThrows(
                StringMakingException.class,
                ()-> StringMaker.processNumberList(numberList, "М", "И"),
                "Expected StringMakingException to be thrown"
        );

        assertTrue(thrown.getMessage().contains("ключ в паре \"разряд/значение\" не может быть null."));
    }

    @Test
    void processNumberList_invalidDigitRangeUnder20_throwsException() {
        List<Map.Entry<Long, Integer>> numberList = new ArrayList<>();
        numberList.add(new AbstractMap.SimpleEntry<>(1000000000000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(100000000000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(10000000000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(1000000000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(100000000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(10000000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(1000000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(100000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(10000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(1000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(100L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(1L, 20));

        StringMakingException thrown = assertThrows(
                StringMakingException.class,
                ()-> StringMaker.processNumberList(numberList, "М", "И"),
                "Expected StringMakingException to be thrown"
        );

        assertTrue(thrown.getMessage().contains("Digit не может быть null и должен находиться в диапазоне от 0 до 9"));
    }

    @Test
    void processNumberList_invalidDigitRangeOver9_throwsException() {
        List<Map.Entry<Long, Integer>> numberList = new ArrayList<>();
        numberList.add(new AbstractMap.SimpleEntry<>(1000000000000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(100000000000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(10000000000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(1000000000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(100000000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(10000000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(1000000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(100000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(10000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(1000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(100L, 10));
        numberList.add(new AbstractMap.SimpleEntry<>(1L, 0));

        StringMakingException thrown = assertThrows(
                StringMakingException.class,
                ()-> StringMaker.processNumberList(numberList, "М", "И"),
                "Expected StringMakingException to be thrown"
        );

        assertTrue(thrown.getMessage().contains("Digit не может быть null и должен находиться в диапазоне от 0 до 9"));
    }

    @Test
    void processNumberList_validThousand_returnsCorrectString() throws StringMakingException {
        List<Map.Entry<Long, Integer>> numberList = new ArrayList<>();
        numberList.add(new AbstractMap.SimpleEntry<>(1000000000000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(100000000000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(10000000000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(1000000000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(100000000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(10000000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(1000000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(100000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(10000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(1000L, 1));  // 1 тысяча
        numberList.add(new AbstractMap.SimpleEntry<>(100L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(1L, 0));
        String result = StringMaker.processNumberList(numberList, "Ж", "И");
        assertTrue(result.contains("одна "));
    }

    @Test
    void processNumberList_validMillion_returnsCorrectString() throws StringMakingException {
        List<Map.Entry<Long, Integer>> numberList = new ArrayList<>();
        numberList.add(new AbstractMap.SimpleEntry<>(1000000000000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(100000000000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(10000000000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(1000000000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(100000000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(10000000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(1000000L, 1));  // 1 миллион
        numberList.add(new AbstractMap.SimpleEntry<>(100000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(10000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(1000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(100L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(1L, 0));
        String result = StringMaker.processNumberList(numberList, "М", "И");
        assertTrue(result.contains("один миллион"));
    }

    @Test
    void processNumberList_complexNumber_returnsCorrectString() throws StringMakingException {
        List<Map.Entry<Long, Integer>> numberList = new ArrayList<>();
        numberList.add(new AbstractMap.SimpleEntry<>(1000000000000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(100000000000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(10000000000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(1000000000L, 1));  // 1 миллиард
        numberList.add(new AbstractMap.SimpleEntry<>(100000000L, 2));  // 200 миллионов
        numberList.add(new AbstractMap.SimpleEntry<>(10000000L, 3));  // 30 миллионов
        numberList.add(new AbstractMap.SimpleEntry<>(1000000L, 4));   // 4 миллиона
        numberList.add(new AbstractMap.SimpleEntry<>(100000L, 5));      // 500 тысяч
        numberList.add(new AbstractMap.SimpleEntry<>(10000L, 6));      // 60 тысяч
        numberList.add(new AbstractMap.SimpleEntry<>(1000L, 7));      // 7 тысяч
        numberList.add(new AbstractMap.SimpleEntry<>(100L, 8));       // 800
        numberList.add(new AbstractMap.SimpleEntry<>(1L, 9));        // 9

        String result = StringMaker.processNumberList(numberList, "М", "И");
        assertTrue(result.contains("один миллиард двести тридцать четыре миллиона пятьсот шестьдесят семь тысяч восемьсот девять"));
    }

    @Test
    void findLastRelevantDigit_validInput_returnsCorrectDigit() throws StringMakingException {
        List<Map.Entry<Long, Integer>> numberList = new ArrayList<>();
        numberList.add(new AbstractMap.SimpleEntry<>(1L, 1));
        numberList.add(new AbstractMap.SimpleEntry<>(100L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(1000L, 1));
        numberList.add(new AbstractMap.SimpleEntry<>(1000000L, 1));
        numberList.add(new AbstractMap.SimpleEntry<>(1000000000L, 0));

        Long lastRelevant = StringMaker.findLastRelevantDigit(numberList, 1000L, 1000000L);
        assertEquals(1000000L, lastRelevant);
    }

    @Test
    void findLastRelevantDigit_noRelevantDigit_returnsNull() throws StringMakingException {
        List<Map.Entry<Long, Integer>> numberList = new ArrayList<>();
        numberList.add(new AbstractMap.SimpleEntry<>(1L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(100L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(1000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(1000000L, 0));
        numberList.add(new AbstractMap.SimpleEntry<>(1000000000L, 0));

        Long lastRelevant = StringMaker.findLastRelevantDigit(numberList, 1000L, 1000000L);
        assertNull(lastRelevant);
    }

    @Test
    void findLastRelevantDigit_invalidInput_throwsException() {
        List<Map.Entry<Long, Integer>> numberList = new ArrayList<>();
        assertThrows(StringMakingException.class, () -> StringMaker.findLastRelevantDigit(numberList, 0L, 0L));
    }

    @Test
    void findLastRelevantDigit_nullDigitList_throwsException() {
        assertThrows(StringMakingException.class, () -> StringMaker.findLastRelevantDigit(null, 1000L, 1000000L));
    }


    @Test
    void findLastRelevantDigit_emptyDigitList_throwsException() {
        List<Map.Entry<Long, Integer>> numberList = new ArrayList<>();
        assertThrows(StringMakingException.class, () -> StringMaker.findLastRelevantDigit(numberList, 1000L, 1000000L));
    }

    @Test
    void findLastRelevantDigit_fromDigitGreateToDigit_throwsException() {
        List<Map.Entry<Long, Integer>> numberList = new ArrayList<>();
        assertThrows(StringMakingException.class, () -> StringMaker.findLastRelevantDigit(numberList, 1000000L, 1000L));
    }
}
