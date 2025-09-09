package ru.chelinvest_01.utils.digitHandlers.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.chelinvest_01.utils.CheckersOfSignature.Gender;
import ru.chelinvest_01.utils.CheckersOfSignature.RuCase;

import static org.junit.jupiter.api.Assertions.assertEquals;

class eDigitHandlerImplTest {

    private eDigitHandlerImpl digitHandler;

    @BeforeEach
    void setUp() {
        digitHandler = new eDigitHandlerImpl();
    }

    @Test
    void process_40_Nominative() {
        assertEquals("сорок", digitHandler.process(40, Gender.MALE, RuCase.I));
        assertEquals("сорок", digitHandler.process(40, Gender.FEMALE, RuCase.I));
        assertEquals("сорок", digitHandler.process(40, Gender.MIDDLE, RuCase.I));
    }

    @Test
    void process_40_Genitive() {
        assertEquals("сорока", digitHandler.process(40, Gender.MALE, RuCase.R));
        assertEquals("сорока", digitHandler.process(40, Gender.FEMALE, RuCase.R));
        assertEquals("сорока", digitHandler.process(40, Gender.MIDDLE, RuCase.R));
    }

    @Test
    void process_40_Dative() {
        assertEquals("сорока", digitHandler.process(40, Gender.MALE, RuCase.D));
        assertEquals("сорока", digitHandler.process(40, Gender.FEMALE, RuCase.D));
        assertEquals("сорока", digitHandler.process(40, Gender.MIDDLE, RuCase.D));
    }

    @Test
    void process_40_Accusative() {
        assertEquals("сорок", digitHandler.process(40, Gender.MALE, RuCase.V));
        assertEquals("сорок", digitHandler.process(40, Gender.FEMALE, RuCase.V));
        assertEquals("сорок", digitHandler.process(40, Gender.MIDDLE, RuCase.V));
    }

    @Test
    void process_40_Instrumental() {
        assertEquals("сорока", digitHandler.process(40, Gender.MALE, RuCase.T));
        assertEquals("сорока", digitHandler.process(40, Gender.FEMALE, RuCase.T));
        assertEquals("сорока", digitHandler.process(40, Gender.MIDDLE, RuCase.T));
    }

    @Test
    void process_40_Prepositional() {
        assertEquals("сорока", digitHandler.process(40, Gender.MALE, RuCase.P));
        assertEquals("сорока", digitHandler.process(40, Gender.FEMALE, RuCase.P));
        assertEquals("сорока", digitHandler.process(40, Gender.MIDDLE, RuCase.P));
    }

    @Test
    void process_90_Nominative() {
        assertEquals("девяносто", digitHandler.process(90, Gender.MALE, RuCase.I));
        assertEquals("девяносто", digitHandler.process(90, Gender.FEMALE, RuCase.I));
        assertEquals("девяносто", digitHandler.process(90, Gender.MIDDLE, RuCase.I));
    }

    @Test
    void process_90_Genitive() {
        assertEquals("девяноста", digitHandler.process(90, Gender.MALE, RuCase.R));
        assertEquals("девяноста", digitHandler.process(90, Gender.FEMALE, RuCase.R));
        assertEquals("девяноста", digitHandler.process(90, Gender.MIDDLE, RuCase.R));
    }

    @Test
    void process_90_Dative() {
        assertEquals("девяноста", digitHandler.process(90, Gender.MALE, RuCase.D));
        assertEquals("девяноста", digitHandler.process(90, Gender.FEMALE, RuCase.D));
        assertEquals("девяноста", digitHandler.process(90, Gender.MIDDLE, RuCase.D));
    }

    @Test
    void process_90_Accusative() {
        assertEquals("девяносто", digitHandler.process(90, Gender.MALE, RuCase.V));
        assertEquals("девяносто", digitHandler.process(90, Gender.FEMALE, RuCase.V));
        assertEquals("девяносто", digitHandler.process(90, Gender.MIDDLE, RuCase.V));
    }

    @Test
    void process_90_Instrumental() {
        assertEquals("девяноста", digitHandler.process(90, Gender.MALE, RuCase.T));
        assertEquals("девяноста", digitHandler.process(90, Gender.FEMALE, RuCase.T));
        assertEquals("девяноста", digitHandler.process(90, Gender.MIDDLE, RuCase.T));
    }

    @Test
    void process_90_Prepositional() {
        assertEquals("девяноста", digitHandler.process(90, Gender.MALE, RuCase.P));
        assertEquals("девяноста", digitHandler.process(90, Gender.FEMALE, RuCase.P));
        assertEquals("девяноста", digitHandler.process(90, Gender.MIDDLE, RuCase.P));
    }

    @Test
    void process_100_Nominative() {
        assertEquals("сто", digitHandler.process(100, Gender.MALE, RuCase.I));
        assertEquals("сто", digitHandler.process(100, Gender.FEMALE, RuCase.I));
        assertEquals("сто", digitHandler.process(100, Gender.MIDDLE, RuCase.I));
    }

    @Test
    void process_100_Genitive() {
        assertEquals("ста", digitHandler.process(100, Gender.MALE, RuCase.R));
        assertEquals("ста", digitHandler.process(100, Gender.FEMALE, RuCase.R));
        assertEquals("ста", digitHandler.process(100, Gender.MIDDLE, RuCase.R));
    }

    @Test
    void process_100_Dative() {
        assertEquals("ста", digitHandler.process(100, Gender.MALE, RuCase.D));
        assertEquals("ста", digitHandler.process(100, Gender.FEMALE, RuCase.D));
        assertEquals("ста", digitHandler.process(100, Gender.MIDDLE, RuCase.D));
    }

    @Test
    void process_100_Accusative() {
        assertEquals("сто", digitHandler.process(100, Gender.MALE, RuCase.V));
        assertEquals("сто", digitHandler.process(100, Gender.FEMALE, RuCase.V));
        assertEquals("сто", digitHandler.process(100, Gender.MIDDLE, RuCase.V));
    }

    @Test
    void process_100_Instrumental() {
        assertEquals("ста", digitHandler.process(100, Gender.MALE, RuCase.T));
        assertEquals("ста", digitHandler.process(100, Gender.FEMALE, RuCase.T));
        assertEquals("ста", digitHandler.process(100, Gender.MIDDLE, RuCase.T));
    }

    @Test
    void process_100_Prepositional() {
        assertEquals("ста", digitHandler.process(100, Gender.MALE, RuCase.P));
        assertEquals("ста", digitHandler.process(100, Gender.FEMALE, RuCase.P));
        assertEquals("ста", digitHandler.process(100, Gender.MIDDLE, RuCase.P));
    }
}
