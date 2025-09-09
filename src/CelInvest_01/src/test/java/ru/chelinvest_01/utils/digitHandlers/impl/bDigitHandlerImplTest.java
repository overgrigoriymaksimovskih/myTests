package ru.chelinvest_01.utils.digitHandlers.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.chelinvest_01.utils.CheckersOfSignature.Gender;
import ru.chelinvest_01.utils.CheckersOfSignature.RuCase;

import static org.junit.jupiter.api.Assertions.assertEquals;

class bDigitHandlerImplTest {

    private bDigitHandlerImpl digitHandler;

    @BeforeEach
    void setUp() {
        digitHandler = new bDigitHandlerImpl();
    }

    @Test
    void process_5_Nominative() {
        assertEquals("пять", digitHandler.process(5, Gender.MALE, RuCase.I));
        assertEquals("пять", digitHandler.process(5, Gender.FEMALE, RuCase.I));
        assertEquals("пять", digitHandler.process(5, Gender.MIDDLE, RuCase.I));
    }

    @Test
    void process_5_Genitive() {
        assertEquals("пяти", digitHandler.process(5, Gender.MALE, RuCase.R));
        assertEquals("пяти", digitHandler.process(5, Gender.FEMALE, RuCase.R));
        assertEquals("пяти", digitHandler.process(5, Gender.MIDDLE, RuCase.R));
    }

    @Test
    void process_5_Dative() {
        assertEquals("пяти", digitHandler.process(5, Gender.MALE, RuCase.D));
        assertEquals("пяти", digitHandler.process(5, Gender.FEMALE, RuCase.D));
        assertEquals("пяти", digitHandler.process(5, Gender.MIDDLE, RuCase.D));
    }

    @Test
    void process_5_Accusative() {
        assertEquals("пять", digitHandler.process(5, Gender.MALE, RuCase.V));
        assertEquals("пять", digitHandler.process(5, Gender.FEMALE, RuCase.V));
        assertEquals("пять", digitHandler.process(5, Gender.MIDDLE, RuCase.V));
    }

    @Test
    void process_5_Instrumental() {
        assertEquals("пятью", digitHandler.process(5, Gender.MALE, RuCase.T));
        assertEquals("пятью", digitHandler.process(5, Gender.FEMALE, RuCase.T));
        assertEquals("пятью", digitHandler.process(5, Gender.MIDDLE, RuCase.T));
    }

    @Test
    void process_5_Prepositional() {
        assertEquals("пяти", digitHandler.process(5, Gender.MALE, RuCase.P));
        assertEquals("пяти", digitHandler.process(5, Gender.FEMALE, RuCase.P));
        assertEquals("пяти", digitHandler.process(5, Gender.MIDDLE, RuCase.P));
    }



    @Test
    void process_6_Nominative() {
        assertEquals("шесть", digitHandler.process(6, Gender.MALE, RuCase.I));
        assertEquals("шесть", digitHandler.process(6, Gender.FEMALE, RuCase.I));
        assertEquals("шесть", digitHandler.process(6, Gender.MIDDLE, RuCase.I));
    }

    @Test
    void process_6_Genitive() {
        assertEquals("шести", digitHandler.process(6, Gender.MALE, RuCase.R));
        assertEquals("шести", digitHandler.process(6, Gender.FEMALE, RuCase.R));
        assertEquals("шести", digitHandler.process(6, Gender.MIDDLE, RuCase.R));
    }

    @Test
    void process_6_Dative() {
        assertEquals("шести", digitHandler.process(6, Gender.MALE, RuCase.D));
        assertEquals("шести", digitHandler.process(6, Gender.FEMALE, RuCase.D));
        assertEquals("шести", digitHandler.process(6, Gender.MIDDLE, RuCase.D));
    }

    @Test
    void process_6_Accusative() {
        assertEquals("шесть", digitHandler.process(6, Gender.MALE, RuCase.V));
        assertEquals("шесть", digitHandler.process(6, Gender.FEMALE, RuCase.V));
        assertEquals("шесть", digitHandler.process(6, Gender.MIDDLE, RuCase.V));
    }

    @Test
    void process_6_Instrumental() {
        assertEquals("шестью", digitHandler.process(6, Gender.MALE, RuCase.T));
        assertEquals("шестью", digitHandler.process(6, Gender.FEMALE, RuCase.T));
        assertEquals("шестью", digitHandler.process(6, Gender.MIDDLE, RuCase.T));
    }

    @Test
    void process_6_Prepositional() {
        assertEquals("шести", digitHandler.process(6, Gender.MALE, RuCase.P));
        assertEquals("шести", digitHandler.process(6, Gender.FEMALE, RuCase.P));
        assertEquals("шести", digitHandler.process(6, Gender.MIDDLE, RuCase.P));
    }

    @Test
    void process_7_Nominative() {
        assertEquals("семь", digitHandler.process(7, Gender.MALE, RuCase.I));
        assertEquals("семь", digitHandler.process(7, Gender.FEMALE, RuCase.I));
        assertEquals("семь", digitHandler.process(7, Gender.MIDDLE, RuCase.I));
    }

    @Test
    void process_7_Genitive() {
        assertEquals("семи", digitHandler.process(7, Gender.MALE, RuCase.R));
        assertEquals("семи", digitHandler.process(7, Gender.FEMALE, RuCase.R));
        assertEquals("семи", digitHandler.process(7, Gender.MIDDLE, RuCase.R));
    }

    @Test
    void process_7_Dative() {
        assertEquals("семи", digitHandler.process(7, Gender.MALE, RuCase.D));
        assertEquals("семи", digitHandler.process(7, Gender.FEMALE, RuCase.D));
        assertEquals("семи", digitHandler.process(7, Gender.MIDDLE, RuCase.D));
    }

    @Test
    void process_7_Accusative() {
        assertEquals("семь", digitHandler.process(7, Gender.MALE, RuCase.V));
        assertEquals("семь", digitHandler.process(7, Gender.FEMALE, RuCase.V));
        assertEquals("семь", digitHandler.process(7, Gender.MIDDLE, RuCase.V));
    }

    @Test
    void process_7_Instrumental() {
        assertEquals("семью", digitHandler.process(7, Gender.MALE, RuCase.T));
        assertEquals("семью", digitHandler.process(7, Gender.FEMALE, RuCase.T));
        assertEquals("семью", digitHandler.process(7, Gender.MIDDLE, RuCase.T));
    }

    @Test
    void process_7_Prepositional() {
        assertEquals("семи", digitHandler.process(7, Gender.MALE, RuCase.P));
        assertEquals("семи", digitHandler.process(7, Gender.FEMALE, RuCase.P));
        assertEquals("семи", digitHandler.process(7, Gender.MIDDLE, RuCase.P));
    }
    @Test
    void process_8_Nominative() {
        assertEquals("восемь", digitHandler.process(8, Gender.MALE, RuCase.I));
        assertEquals("восемь", digitHandler.process(8, Gender.FEMALE, RuCase.I));
        assertEquals("восемь", digitHandler.process(8, Gender.MIDDLE, RuCase.I));
    }

    @Test
    void process_8_Genitive() {
        assertEquals("восьми", digitHandler.process(8, Gender.MALE, RuCase.R));
        assertEquals("восьми", digitHandler.process(8, Gender.FEMALE, RuCase.R));
        assertEquals("восьми", digitHandler.process(8, Gender.MIDDLE, RuCase.R));
    }

    @Test
    void process_8_Dative() {
        assertEquals("восьми", digitHandler.process(8, Gender.MALE, RuCase.D));
        assertEquals("восьми", digitHandler.process(8, Gender.FEMALE, RuCase.D));
        assertEquals("восьми", digitHandler.process(8, Gender.MIDDLE, RuCase.D));
    }

    @Test
    void process_8_Accusative() {
        assertEquals("восемь", digitHandler.process(8, Gender.MALE, RuCase.V));
        assertEquals("восемь", digitHandler.process(8, Gender.FEMALE, RuCase.V));
        assertEquals("восемь", digitHandler.process(8, Gender.MIDDLE, RuCase.V));
    }

    @Test
    void process_8_Instrumental() {
        assertEquals("восемью", digitHandler.process(8, Gender.MALE, RuCase.T));
        assertEquals("восемью", digitHandler.process(8, Gender.FEMALE, RuCase.T));
        assertEquals("восемью", digitHandler.process(8, Gender.MIDDLE, RuCase.T));
    }

    @Test
    void process_8_Prepositional() {
        assertEquals("восьми", digitHandler.process(8, Gender.MALE, RuCase.P));
        assertEquals("восьми", digitHandler.process(8, Gender.FEMALE, RuCase.P));
        assertEquals("восьми", digitHandler.process(8, Gender.MIDDLE, RuCase.P));
    }


    @Test
    void process_9_Nominative() {
        assertEquals("девять", digitHandler.process(9, Gender.MALE, RuCase.I));
        assertEquals("девять", digitHandler.process(9, Gender.FEMALE, RuCase.I));
        assertEquals("девять", digitHandler.process(9, Gender.MIDDLE, RuCase.I));
    }

    @Test
    void process_9_Genitive() {
        assertEquals("девяти", digitHandler.process(9, Gender.MALE, RuCase.R));
        assertEquals("девяти", digitHandler.process(9, Gender.FEMALE, RuCase.R));
        assertEquals("девяти", digitHandler.process(9, Gender.MIDDLE, RuCase.R));
    }

    @Test
    void process_9_Dative() {
        assertEquals("девяти", digitHandler.process(9, Gender.MALE, RuCase.D));
        assertEquals("девяти", digitHandler.process(9, Gender.FEMALE, RuCase.D));
        assertEquals("девяти", digitHandler.process(9, Gender.MIDDLE, RuCase.D));
    }

    @Test
    void process_9_Accusative() {
        assertEquals("девять", digitHandler.process(9, Gender.MALE, RuCase.V));
        assertEquals("девять", digitHandler.process(9, Gender.FEMALE, RuCase.V));
        assertEquals("девять", digitHandler.process(9, Gender.MIDDLE, RuCase.V));
    }

    @Test
    void process_9_Instrumental() {
        assertEquals("девятью", digitHandler.process(9, Gender.MALE, RuCase.T));
        assertEquals("девятью", digitHandler.process(9, Gender.FEMALE, RuCase.T));
        assertEquals("девятью", digitHandler.process(9, Gender.MIDDLE, RuCase.T));
    }

    @Test
    void process_9_Prepositional() {
        assertEquals("девяти", digitHandler.process(9, Gender.MALE, RuCase.P));
        assertEquals("девяти", digitHandler.process(9, Gender.FEMALE, RuCase.P));
        assertEquals("девяти", digitHandler.process(9, Gender.MIDDLE, RuCase.P));
    }
}
