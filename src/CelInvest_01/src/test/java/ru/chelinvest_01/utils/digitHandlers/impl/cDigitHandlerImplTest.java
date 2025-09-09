package ru.chelinvest_01.utils.digitHandlers.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.chelinvest_01.utils.CheckersOfSignature.Gender;
import ru.chelinvest_01.utils.CheckersOfSignature.RuCase;

import static org.junit.jupiter.api.Assertions.assertEquals;

class cDigitHandlerImplTest {

    private cDigitHandlerImpl digitHandler;

    @BeforeEach
    void setUp() {
        digitHandler = new cDigitHandlerImpl();
    }

    @Test
    void process_10_Nominative() {
        assertEquals("десять", digitHandler.process(10, Gender.MALE, RuCase.I));
        assertEquals("десять", digitHandler.process(10, Gender.FEMALE, RuCase.I));
        assertEquals("десять", digitHandler.process(10, Gender.MIDDLE, RuCase.I));
    }

    @Test
    void process_10_Genitive() {
        assertEquals("десяти", digitHandler.process(10, Gender.MALE, RuCase.R));
        assertEquals("десяти", digitHandler.process(10, Gender.FEMALE, RuCase.R));
        assertEquals("десяти", digitHandler.process(10, Gender.MIDDLE, RuCase.R));
    }

    @Test
    void process_10_Dative() {
        assertEquals("десяти", digitHandler.process(10, Gender.MALE, RuCase.D));
        assertEquals("десяти", digitHandler.process(10, Gender.FEMALE, RuCase.D));
        assertEquals("десяти", digitHandler.process(10, Gender.MIDDLE, RuCase.D));
    }

    @Test
    void process_10_Accusative() {
        assertEquals("десять", digitHandler.process(10, Gender.MALE, RuCase.V));
        assertEquals("десять", digitHandler.process(10, Gender.FEMALE, RuCase.V));
        assertEquals("десять", digitHandler.process(10, Gender.MIDDLE, RuCase.V));
    }

    @Test
    void process_10_Instrumental() {
        assertEquals("десятью", digitHandler.process(10, Gender.MALE, RuCase.T));
        assertEquals("десятью", digitHandler.process(10, Gender.FEMALE, RuCase.T));
        assertEquals("десятью", digitHandler.process(10, Gender.MIDDLE, RuCase.T));
    }

    @Test
    void process_10_Prepositional() {
        assertEquals("десяти", digitHandler.process(10, Gender.MALE, RuCase.P));
        assertEquals("десяти", digitHandler.process(10, Gender.FEMALE, RuCase.P));
        assertEquals("десяти", digitHandler.process(10, Gender.MIDDLE, RuCase.P));
    }

    @Test
    void process_11_Nominative() {
        assertEquals("одиннадцать", digitHandler.process(11, Gender.MALE, RuCase.I));
        assertEquals("одиннадцать", digitHandler.process(11, Gender.FEMALE, RuCase.I));
        assertEquals("одиннадцать", digitHandler.process(11, Gender.MIDDLE, RuCase.I));
    }

    @Test
    void process_11_Genitive() {
        assertEquals("одиннадцати", digitHandler.process(11, Gender.MALE, RuCase.R));
        assertEquals("одиннадцати", digitHandler.process(11, Gender.FEMALE, RuCase.R));
        assertEquals("одиннадцати", digitHandler.process(11, Gender.MIDDLE, RuCase.R));
    }

    @Test
    void process_11_Dative() {
        assertEquals("одиннадцати", digitHandler.process(11, Gender.MALE, RuCase.D));
        assertEquals("одиннадцати", digitHandler.process(11, Gender.FEMALE, RuCase.D));
        assertEquals("одиннадцати", digitHandler.process(11, Gender.MIDDLE, RuCase.D));
    }

    @Test
    void process_11_Accusative() {
        assertEquals("одиннадцать", digitHandler.process(11, Gender.MALE, RuCase.V));
        assertEquals("одиннадцать", digitHandler.process(11, Gender.FEMALE, RuCase.V));
        assertEquals("одиннадцать", digitHandler.process(11, Gender.MIDDLE, RuCase.V));
    }

    @Test
    void process_11_Instrumental() {
        assertEquals("одиннадцатью", digitHandler.process(11, Gender.MALE, RuCase.T));
        assertEquals("одиннадцатью", digitHandler.process(11, Gender.FEMALE, RuCase.T));
        assertEquals("одиннадцатью", digitHandler.process(11, Gender.MIDDLE, RuCase.T));
    }

    @Test
    void process_11_Prepositional() {
        assertEquals("одиннадцати", digitHandler.process(11, Gender.MALE, RuCase.P));
        assertEquals("одиннадцати", digitHandler.process(11, Gender.FEMALE, RuCase.P));
        assertEquals("одиннадцати", digitHandler.process(11, Gender.MIDDLE, RuCase.P));
    }


    @Test
    void process_12_Nominative() {
        assertEquals("двенадцать", digitHandler.process(12, Gender.MALE, RuCase.I));
        assertEquals("двенадцать", digitHandler.process(12, Gender.FEMALE, RuCase.I));
        assertEquals("двенадцать", digitHandler.process(12, Gender.MIDDLE, RuCase.I));
    }

    @Test
    void process_12_Genitive() {
        assertEquals("двенадцати", digitHandler.process(12, Gender.MALE, RuCase.R));
        assertEquals("двенадцати", digitHandler.process(12, Gender.FEMALE, RuCase.R));
        assertEquals("двенадцати", digitHandler.process(12, Gender.MIDDLE, RuCase.R));
    }

    @Test
    void process_12_Dative() {
        assertEquals("двенадцати", digitHandler.process(12, Gender.MALE, RuCase.D));
        assertEquals("двенадцати", digitHandler.process(12, Gender.FEMALE, RuCase.D));
        assertEquals("двенадцати", digitHandler.process(12, Gender.MIDDLE, RuCase.D));
    }

    @Test
    void process_12_Accusative() {
        assertEquals("двенадцать", digitHandler.process(12, Gender.MALE, RuCase.V));
        assertEquals("двенадцать", digitHandler.process(12, Gender.FEMALE, RuCase.V));
        assertEquals("двенадцать", digitHandler.process(12, Gender.MIDDLE, RuCase.V));
    }

    @Test
    void process_12_Instrumental() {
        assertEquals("двенадцатью", digitHandler.process(12, Gender.MALE, RuCase.T));
        assertEquals("двенадцатью", digitHandler.process(12, Gender.FEMALE, RuCase.T));
        assertEquals("двенадцатью", digitHandler.process(12, Gender.MIDDLE, RuCase.T));
    }

    @Test
    void process_12_Prepositional() {
        assertEquals("двенадцати", digitHandler.process(12, Gender.MALE, RuCase.P));
        assertEquals("двенадцати", digitHandler.process(12, Gender.FEMALE, RuCase.P));
        assertEquals("двенадцати", digitHandler.process(12, Gender.MIDDLE, RuCase.P));
    }


    @Test
    void process_13_Nominative() {
        assertEquals("тринадцать", digitHandler.process(13, Gender.MALE, RuCase.I));
        assertEquals("тринадцать", digitHandler.process(13, Gender.FEMALE, RuCase.I));
        assertEquals("тринадцать", digitHandler.process(13, Gender.MIDDLE, RuCase.I));
    }

    @Test
    void process_13_Genitive() {
        assertEquals("тринадцати", digitHandler.process(13, Gender.MALE, RuCase.R));
        assertEquals("тринадцати", digitHandler.process(13, Gender.FEMALE, RuCase.R));
        assertEquals("тринадцати", digitHandler.process(13, Gender.MIDDLE, RuCase.R));
    }

    @Test
    void process_13_Dative() {
        assertEquals("тринадцати", digitHandler.process(13, Gender.MALE, RuCase.D));
        assertEquals("тринадцати", digitHandler.process(13, Gender.FEMALE, RuCase.D));
        assertEquals("тринадцати", digitHandler.process(13, Gender.MIDDLE, RuCase.D));
    }

    @Test
    void process_13_Accusative() {
        assertEquals("тринадцать", digitHandler.process(13, Gender.MALE, RuCase.V));
        assertEquals("тринадцать", digitHandler.process(13, Gender.FEMALE, RuCase.V));
        assertEquals("тринадцать", digitHandler.process(13, Gender.MIDDLE, RuCase.V));
    }

    @Test
    void process_13_Instrumental() {
        assertEquals("тринадцатью", digitHandler.process(13, Gender.MALE, RuCase.T));
        assertEquals("тринадцатью", digitHandler.process(13, Gender.FEMALE, RuCase.T));
        assertEquals("тринадцатью", digitHandler.process(13, Gender.MIDDLE, RuCase.T));
    }

    @Test
    void process_13_Prepositional() {
        assertEquals("тринадцати", digitHandler.process(13, Gender.MALE, RuCase.P));
        assertEquals("тринадцати", digitHandler.process(13, Gender.FEMALE, RuCase.P));
        assertEquals("тринадцати", digitHandler.process(13, Gender.MIDDLE, RuCase.P));
    }


    @Test
    void process_14_Nominative() {
        assertEquals("четырнадцать", digitHandler.process(14, Gender.MALE, RuCase.I));
        assertEquals("четырнадцать", digitHandler.process(14, Gender.FEMALE, RuCase.I));
        assertEquals("четырнадцать", digitHandler.process(14, Gender.MIDDLE, RuCase.I));
    }

    @Test
    void process_14_Genitive() {
        assertEquals("четырнадцати", digitHandler.process(14, Gender.MALE, RuCase.R));
        assertEquals("четырнадцати", digitHandler.process(14, Gender.FEMALE, RuCase.R));
        assertEquals("четырнадцати", digitHandler.process(14, Gender.MIDDLE, RuCase.R));
    }

    @Test
    void process_14_Dative() {
        assertEquals("четырнадцати", digitHandler.process(14, Gender.MALE, RuCase.D));
        assertEquals("четырнадцати", digitHandler.process(14, Gender.FEMALE, RuCase.D));
        assertEquals("четырнадцати", digitHandler.process(14, Gender.MIDDLE, RuCase.D));
    }

    @Test
    void process_14_Accusative() {
        assertEquals("четырнадцать", digitHandler.process(14, Gender.MALE, RuCase.V));
        assertEquals("четырнадцать", digitHandler.process(14, Gender.FEMALE, RuCase.V));
        assertEquals("четырнадцать", digitHandler.process(14, Gender.MIDDLE, RuCase.V));
    }

    @Test
    void process_14_Instrumental() {
        assertEquals("четырнадцатью", digitHandler.process(14, Gender.MALE, RuCase.T));
        assertEquals("четырнадцатью", digitHandler.process(14, Gender.FEMALE, RuCase.T));
        assertEquals("четырнадцатью", digitHandler.process(14, Gender.MIDDLE, RuCase.T));
    }

    @Test
    void process_14_Prepositional() {
        assertEquals("четырнадцати", digitHandler.process(14, Gender.MALE, RuCase.P));
        assertEquals("четырнадцати", digitHandler.process(14, Gender.FEMALE, RuCase.P));
        assertEquals("четырнадцати", digitHandler.process(14, Gender.MIDDLE, RuCase.P));
    }


    @Test
    void process_15_Nominative() {
        assertEquals("пятнадцать", digitHandler.process(15, Gender.MALE, RuCase.I));
        assertEquals("пятнадцать", digitHandler.process(15, Gender.FEMALE, RuCase.I));
        assertEquals("пятнадцать", digitHandler.process(15, Gender.MIDDLE, RuCase.I));
    }

    @Test
    void process_15_Genitive() {
        assertEquals("пятнадцати", digitHandler.process(15, Gender.MALE, RuCase.R));
        assertEquals("пятнадцати", digitHandler.process(15, Gender.FEMALE, RuCase.R));
        assertEquals("пятнадцати", digitHandler.process(15, Gender.MIDDLE, RuCase.R));
    }

    @Test
    void process_15_Dative() {
        assertEquals("пятнадцати", digitHandler.process(15, Gender.MALE, RuCase.D));
        assertEquals("пятнадцати", digitHandler.process(15, Gender.FEMALE, RuCase.D));
        assertEquals("пятнадцати", digitHandler.process(15, Gender.MIDDLE, RuCase.D));
    }

    @Test
    void process_15_Accusative() {
        assertEquals("пятнадцать", digitHandler.process(15, Gender.MALE, RuCase.V));
        assertEquals("пятнадцать", digitHandler.process(15, Gender.FEMALE, RuCase.V));
        assertEquals("пятнадцать", digitHandler.process(15, Gender.MIDDLE, RuCase.V));
    }

    @Test
    void process_15_Instrumental() {
        assertEquals("пятнадцатью", digitHandler.process(15, Gender.MALE, RuCase.T));
        assertEquals("пятнадцатью", digitHandler.process(15, Gender.FEMALE, RuCase.T));
        assertEquals("пятнадцатью", digitHandler.process(15, Gender.MIDDLE, RuCase.T));
    }

    @Test
    void process_15_Prepositional() {
        assertEquals("пятнадцати", digitHandler.process(15, Gender.MALE, RuCase.P));
        assertEquals("пятнадцати", digitHandler.process(15, Gender.FEMALE, RuCase.P));
        assertEquals("пятнадцати", digitHandler.process(15, Gender.MIDDLE, RuCase.P));
    }


    @Test
    void process_16_Nominative() {
        assertEquals("шестнадцать", digitHandler.process(16, Gender.MALE, RuCase.I));
        assertEquals("шестнадцать", digitHandler.process(16, Gender.FEMALE, RuCase.I));
        assertEquals("шестнадцать", digitHandler.process(16, Gender.MIDDLE, RuCase.I));
    }

    @Test
    void process_16_Genitive() {
        assertEquals("шестнадцати", digitHandler.process(16, Gender.MALE, RuCase.R));
        assertEquals("шестнадцати", digitHandler.process(16, Gender.FEMALE, RuCase.R));
        assertEquals("шестнадцати", digitHandler.process(16, Gender.MIDDLE, RuCase.R));
    }

    @Test
    void process_16_Dative() {
        assertEquals("шестнадцати", digitHandler.process(16, Gender.MALE, RuCase.D));
        assertEquals("шестнадцати", digitHandler.process(16, Gender.FEMALE, RuCase.D));
        assertEquals("шестнадцати", digitHandler.process(16, Gender.MIDDLE, RuCase.D));
    }

    @Test
    void process_16_Accusative() {
        assertEquals("шестнадцать", digitHandler.process(16, Gender.MALE, RuCase.V));
        assertEquals("шестнадцать", digitHandler.process(16, Gender.FEMALE, RuCase.V));
        assertEquals("шестнадцать", digitHandler.process(16, Gender.MIDDLE, RuCase.V));
    }

    @Test
    void process_16_Instrumental() {
        assertEquals("шестнадцатью", digitHandler.process(16, Gender.MALE, RuCase.T));
        assertEquals("шестнадцатью", digitHandler.process(16, Gender.FEMALE, RuCase.T));
        assertEquals("шестнадцатью", digitHandler.process(16, Gender.MIDDLE, RuCase.T));
    }

    @Test
    void process_16_Prepositional() {
        assertEquals("шестнадцати", digitHandler.process(16, Gender.MALE, RuCase.P));
        assertEquals("шестнадцати", digitHandler.process(16, Gender.FEMALE, RuCase.P));
        assertEquals("шестнадцати", digitHandler.process(16, Gender.MIDDLE, RuCase.P));
    }


    @Test
    void process_17_Nominative() {
        assertEquals("семнадцать", digitHandler.process(17, Gender.MALE, RuCase.I));
        assertEquals("семнадцать", digitHandler.process(17, Gender.FEMALE, RuCase.I));
        assertEquals("семнадцать", digitHandler.process(17, Gender.MIDDLE, RuCase.I));
    }

    @Test
    void process_17_Genitive() {
        assertEquals("семнадцати", digitHandler.process(17, Gender.MALE, RuCase.R));
        assertEquals("семнадцати", digitHandler.process(17, Gender.FEMALE, RuCase.R));
        assertEquals("семнадцати", digitHandler.process(17, Gender.MIDDLE, RuCase.R));
    }

    @Test
    void process_17_Dative() {
        assertEquals("семнадцати", digitHandler.process(17, Gender.MALE, RuCase.D));
        assertEquals("семнадцати", digitHandler.process(17, Gender.FEMALE, RuCase.D));
        assertEquals("семнадцати", digitHandler.process(17, Gender.MIDDLE, RuCase.D));
    }

    @Test
    void process_17_Accusative() {
        assertEquals("семнадцать", digitHandler.process(17, Gender.MALE, RuCase.V));
        assertEquals("семнадцать", digitHandler.process(17, Gender.FEMALE, RuCase.V));
        assertEquals("семнадцать", digitHandler.process(17, Gender.MIDDLE, RuCase.V));
    }

    @Test
    void process_17_Instrumental() {
        assertEquals("семнадцатью", digitHandler.process(17, Gender.MALE, RuCase.T));
        assertEquals("семнадцатью", digitHandler.process(17, Gender.FEMALE, RuCase.T));
        assertEquals("семнадцатью", digitHandler.process(17, Gender.MIDDLE, RuCase.T));
    }

    @Test
    void process_17_Prepositional() {
        assertEquals("семнадцати", digitHandler.process(17, Gender.MALE, RuCase.P));
        assertEquals("семнадцати", digitHandler.process(17, Gender.FEMALE, RuCase.P));
        assertEquals("семнадцати", digitHandler.process(17, Gender.MIDDLE, RuCase.P));
    }


    @Test
    void process_18_Nominative() {
        assertEquals("восемнадцать", digitHandler.process(18, Gender.MALE, RuCase.I));
        assertEquals("восемнадцать", digitHandler.process(18, Gender.FEMALE, RuCase.I));
        assertEquals("восемнадцать", digitHandler.process(18, Gender.MIDDLE, RuCase.I));
    }

    @Test
    void process_18_Genitive() {
        assertEquals("восемнадцати", digitHandler.process(18, Gender.MALE, RuCase.R));
        assertEquals("восемнадцати", digitHandler.process(18, Gender.FEMALE, RuCase.R));
        assertEquals("восемнадцати", digitHandler.process(18, Gender.MIDDLE, RuCase.R));
    }

    @Test
    void process_18_Dative() {
        assertEquals("восемнадцати", digitHandler.process(18, Gender.MALE, RuCase.D));
        assertEquals("восемнадцати", digitHandler.process(18, Gender.FEMALE, RuCase.D));
        assertEquals("восемнадцати", digitHandler.process(18, Gender.MIDDLE, RuCase.D));
    }

    @Test
    void process_18_Accusative() {
        assertEquals("восемнадцать", digitHandler.process(18, Gender.MALE, RuCase.V));
        assertEquals("восемнадцать", digitHandler.process(18, Gender.FEMALE, RuCase.V));
        assertEquals("восемнадцать", digitHandler.process(18, Gender.MIDDLE, RuCase.V));
    }

    @Test
    void process_18_Instrumental() {
        assertEquals("восемнадцатью", digitHandler.process(18, Gender.MALE, RuCase.T));
        assertEquals("восемнадцатью", digitHandler.process(18, Gender.FEMALE, RuCase.T));
        assertEquals("восемнадцатью", digitHandler.process(18, Gender.MIDDLE, RuCase.T));
    }

    @Test
    void process_18_Prepositional() {
        assertEquals("восемнадцати", digitHandler.process(18, Gender.MALE, RuCase.P));
        assertEquals("восемнадцати", digitHandler.process(18, Gender.FEMALE, RuCase.P));
        assertEquals("восемнадцати", digitHandler.process(18, Gender.MIDDLE, RuCase.P));
    }


    @Test
    void process_19_Nominative() {
        assertEquals("девятнадцать", digitHandler.process(19, Gender.MALE, RuCase.I));
        assertEquals("девятнадцать", digitHandler.process(19, Gender.FEMALE, RuCase.I));
        assertEquals("девятнадцать", digitHandler.process(19, Gender.MIDDLE, RuCase.I));
    }

    @Test
    void process_19_Genitive() {
        assertEquals("девятнадцати", digitHandler.process(19, Gender.MALE, RuCase.R));
        assertEquals("девятнадцати", digitHandler.process(19, Gender.FEMALE, RuCase.R));
        assertEquals("девятнадцати", digitHandler.process(19, Gender.MIDDLE, RuCase.R));
    }

    @Test
    void process_19_Dative() {
        assertEquals("девятнадцати", digitHandler.process(19, Gender.MALE, RuCase.D));
        assertEquals("девятнадцати", digitHandler.process(19, Gender.FEMALE, RuCase.D));
        assertEquals("девятнадцати", digitHandler.process(19, Gender.MIDDLE, RuCase.D));
    }

    @Test
    void process_19_Accusative() {
        assertEquals("девятнадцать", digitHandler.process(19, Gender.MALE, RuCase.V));
        assertEquals("девятнадцать", digitHandler.process(19, Gender.FEMALE, RuCase.V));
        assertEquals("девятнадцать", digitHandler.process(19, Gender.MIDDLE, RuCase.V));
    }

    @Test
    void process_19_Instrumental() {
        assertEquals("девятнадцатью", digitHandler.process(19, Gender.MALE, RuCase.T));
        assertEquals("девятнадцатью", digitHandler.process(19, Gender.FEMALE, RuCase.T));
        assertEquals("девятнадцатью", digitHandler.process(19, Gender.MIDDLE, RuCase.T));
    }

    @Test
    void process_19_Prepositional() {
        assertEquals("девятнадцати", digitHandler.process(19, Gender.MALE, RuCase.P));
        assertEquals("девятнадцати", digitHandler.process(19, Gender.FEMALE, RuCase.P));
        assertEquals("девятнадцати", digitHandler.process(19, Gender.MIDDLE, RuCase.P));
    }
}
