package ru.chelinvest_01.utils.digitHandlers.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.chelinvest_01.utils.CheckersOfSignature.Gender;
import ru.chelinvest_01.utils.CheckersOfSignature.RuCase;

import static org.junit.jupiter.api.Assertions.assertEquals;

class dDigitHandlerImplTest {

    private dDigitHandlerImpl digitHandler;

    @BeforeEach
    void setUp() {
        digitHandler = new dDigitHandlerImpl();
    }

    @Test
    void process_20_Nominative() {
        assertEquals("двадцать", digitHandler.process(20, Gender.MALE, RuCase.I));
        assertEquals("двадцать", digitHandler.process(20, Gender.FEMALE, RuCase.I));
        assertEquals("двадцать", digitHandler.process(20, Gender.MIDDLE, RuCase.I));
    }

    @Test
    void process_20_Genitive() {
        assertEquals("двадцати", digitHandler.process(20, Gender.MALE, RuCase.R));
        assertEquals("двадцати", digitHandler.process(20, Gender.FEMALE, RuCase.R));
        assertEquals("двадцати", digitHandler.process(20, Gender.MIDDLE, RuCase.R));
    }

    @Test
    void process_20_Dative() {
        assertEquals("двадцати", digitHandler.process(20, Gender.MALE, RuCase.D));
        assertEquals("двадцати", digitHandler.process(20, Gender.FEMALE, RuCase.D));
        assertEquals("двадцати", digitHandler.process(20, Gender.MIDDLE, RuCase.D));
    }

    @Test
    void process_20_Accusative() {
        assertEquals("двадцать", digitHandler.process(20, Gender.MALE, RuCase.V));
        assertEquals("двадцать", digitHandler.process(20, Gender.FEMALE, RuCase.V));
        assertEquals("двадцать", digitHandler.process(20, Gender.MIDDLE, RuCase.V));
    }

    @Test
    void process_20_Instrumental() {
        assertEquals("двадцатью", digitHandler.process(20, Gender.MALE, RuCase.T));
        assertEquals("двадцатью", digitHandler.process(20, Gender.FEMALE, RuCase.T));
        assertEquals("двадцатью", digitHandler.process(20, Gender.MIDDLE, RuCase.T));
    }

    @Test
    void process_20_Prepositional() {
        assertEquals("двадцати", digitHandler.process(20, Gender.MALE, RuCase.P));
        assertEquals("двадцати", digitHandler.process(20, Gender.FEMALE, RuCase.P));
        assertEquals("двадцати", digitHandler.process(20, Gender.MIDDLE, RuCase.P));
    }


    @Test
    void process_30_Nominative() {
        assertEquals("тридцать", digitHandler.process(30, Gender.MALE, RuCase.I));
        assertEquals("тридцать", digitHandler.process(30, Gender.FEMALE, RuCase.I));
        assertEquals("тридцать", digitHandler.process(30, Gender.MIDDLE, RuCase.I));
    }

    @Test
    void process_30_Genitive() {
        assertEquals("тридцати", digitHandler.process(30, Gender.MALE, RuCase.R));
        assertEquals("тридцати", digitHandler.process(30, Gender.FEMALE, RuCase.R));
        assertEquals("тридцати", digitHandler.process(30, Gender.MIDDLE, RuCase.R));
    }

    @Test
    void process_30_Dative() {
        assertEquals("тридцати", digitHandler.process(30, Gender.MALE, RuCase.D));
        assertEquals("тридцати", digitHandler.process(30, Gender.FEMALE, RuCase.D));
        assertEquals("тридцати", digitHandler.process(30, Gender.MIDDLE, RuCase.D));
    }

    @Test
    void process_30_Accusative() {
        assertEquals("тридцать", digitHandler.process(30, Gender.MALE, RuCase.V));
        assertEquals("тридцать", digitHandler.process(30, Gender.FEMALE, RuCase.V));
        assertEquals("тридцать", digitHandler.process(30, Gender.MIDDLE, RuCase.V));
    }

    @Test
    void process_30_Instrumental() {
        assertEquals("тридцатью", digitHandler.process(30, Gender.MALE, RuCase.T));
        assertEquals("тридцатью", digitHandler.process(30, Gender.FEMALE, RuCase.T));
        assertEquals("тридцатью", digitHandler.process(30, Gender.MIDDLE, RuCase.T));
    }

    @Test
    void process_30_Prepositional() {
        assertEquals("тридцати", digitHandler.process(30, Gender.MALE, RuCase.P));
        assertEquals("тридцати", digitHandler.process(30, Gender.FEMALE, RuCase.P));
        assertEquals("тридцати", digitHandler.process(30, Gender.MIDDLE, RuCase.P));
    }
}
