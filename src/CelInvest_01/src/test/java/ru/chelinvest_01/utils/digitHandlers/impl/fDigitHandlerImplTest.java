package ru.chelinvest_01.utils.digitHandlers.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.chelinvest_01.utils.CheckersOfSignature.Gender;
import ru.chelinvest_01.utils.CheckersOfSignature.RuCase;

import static org.junit.jupiter.api.Assertions.assertEquals;

class fDigitHandlerImplTest {

    private fDigitHandlerImpl digitHandler;

    @BeforeEach
    void setUp() {
        digitHandler = new fDigitHandlerImpl();
    }

    @Test
    void process_50_Nominative() {
        assertEquals("пятьдесят", digitHandler.process(50, Gender.MALE, RuCase.I));
        assertEquals("пятьдесят", digitHandler.process(50, Gender.FEMALE, RuCase.I));
        assertEquals("пятьдесят", digitHandler.process(50, Gender.MIDDLE, RuCase.I));
    }

    @Test
    void process_50_Genitive() {
        assertEquals("пятидесяти", digitHandler.process(50, Gender.MALE, RuCase.R));
        assertEquals("пятидесяти", digitHandler.process(50, Gender.FEMALE, RuCase.R));
        assertEquals("пятидесяти", digitHandler.process(50, Gender.MIDDLE, RuCase.R));
    }

    @Test
    void process_50_Dative() {
        assertEquals("пятидесяти", digitHandler.process(50, Gender.MALE, RuCase.D));
        assertEquals("пятидесяти", digitHandler.process(50, Gender.FEMALE, RuCase.D));
        assertEquals("пятидесяти", digitHandler.process(50, Gender.MIDDLE, RuCase.D));
    }

    @Test
    void process_50_Accusative() {
        assertEquals("пятьдесят", digitHandler.process(50, Gender.MALE, RuCase.V));
        assertEquals("пятьдесят", digitHandler.process(50, Gender.FEMALE, RuCase.V));
        assertEquals("пятьдесят", digitHandler.process(50, Gender.MIDDLE, RuCase.V));
    }

    @Test
    void process_50_Instrumental() {
        assertEquals("пятьюдесятью", digitHandler.process(50, Gender.MALE, RuCase.T));
        assertEquals("пятьюдесятью", digitHandler.process(50, Gender.FEMALE, RuCase.T));
        assertEquals("пятьюдесятью", digitHandler.process(50, Gender.MIDDLE, RuCase.T));
    }

    @Test
    void process_50_Prepositional() {
        assertEquals("пятидесяти", digitHandler.process(50, Gender.MALE, RuCase.P));
        assertEquals("пятидесяти", digitHandler.process(50, Gender.FEMALE, RuCase.P));
        assertEquals("пятидесяти", digitHandler.process(50, Gender.MIDDLE, RuCase.P));
    }


    @Test
    void process_60_Nominative() {
        assertEquals("шестьдесят", digitHandler.process(60, Gender.MALE, RuCase.I));
        assertEquals("шестьдесят", digitHandler.process(60, Gender.FEMALE, RuCase.I));
        assertEquals("шестьдесят", digitHandler.process(60, Gender.MIDDLE, RuCase.I));
    }

    @Test
    void process_60_Genitive() {
        assertEquals("шестидесяти", digitHandler.process(60, Gender.MALE, RuCase.R));
        assertEquals("шестидесяти", digitHandler.process(60, Gender.FEMALE, RuCase.R));
        assertEquals("шестидесяти", digitHandler.process(60, Gender.MIDDLE, RuCase.R));
    }

    @Test
    void process_60_Dative() {
        assertEquals("шестидесяти", digitHandler.process(60, Gender.MALE, RuCase.D));
        assertEquals("шестидесяти", digitHandler.process(60, Gender.FEMALE, RuCase.D));
        assertEquals("шестидесяти", digitHandler.process(60, Gender.MIDDLE, RuCase.D));
    }

    @Test
    void process_60_Accusative() {
        assertEquals("шестьдесят", digitHandler.process(60, Gender.MALE, RuCase.V));
        assertEquals("шестьдесят", digitHandler.process(60, Gender.FEMALE, RuCase.V));
        assertEquals("шестьдесят", digitHandler.process(60, Gender.MIDDLE, RuCase.V));
    }

    @Test
    void process_60_Instrumental() {
        assertEquals("шестьюдесятью", digitHandler.process(60, Gender.MALE, RuCase.T));
        assertEquals("шестьюдесятью", digitHandler.process(60, Gender.FEMALE, RuCase.T));
        assertEquals("шестьюдесятью", digitHandler.process(60, Gender.MIDDLE, RuCase.T));
    }

    @Test
    void process_60_Prepositional() {
        assertEquals("шестидесяти", digitHandler.process(60, Gender.MALE, RuCase.P));
        assertEquals("шестидесяти", digitHandler.process(60, Gender.FEMALE, RuCase.P));
        assertEquals("шестидесяти", digitHandler.process(60, Gender.MIDDLE, RuCase.P));
    }

    @Test
    void process_70_Nominative() {
        assertEquals("семьдесят", digitHandler.process(70, Gender.MALE, RuCase.I));
        assertEquals("семьдесят", digitHandler.process(70, Gender.FEMALE, RuCase.I));
        assertEquals("семьдесят", digitHandler.process(70, Gender.MIDDLE, RuCase.I));
    }

    @Test
    void process_70_Genitive() {
        assertEquals("семидесяти", digitHandler.process(70, Gender.MALE, RuCase.R));
        assertEquals("семидесяти", digitHandler.process(70, Gender.FEMALE, RuCase.R));
        assertEquals("семидесяти", digitHandler.process(70, Gender.MIDDLE, RuCase.R));
    }

    @Test
    void process_70_Dative() {
        assertEquals("семидесяти", digitHandler.process(70, Gender.MALE, RuCase.D));
        assertEquals("семидесяти", digitHandler.process(70, Gender.FEMALE, RuCase.D));
        assertEquals("семидесяти", digitHandler.process(70, Gender.MIDDLE, RuCase.D));
    }

    @Test
    void process_70_Accusative() {
        assertEquals("семьдесят", digitHandler.process(70, Gender.MALE, RuCase.V));
        assertEquals("семьдесят", digitHandler.process(70, Gender.FEMALE, RuCase.V));
        assertEquals("семьдесят", digitHandler.process(70, Gender.MIDDLE, RuCase.V));
    }

    @Test
    void process_70_Instrumental() {
        assertEquals("семьюдесятью", digitHandler.process(70, Gender.MALE, RuCase.T));
        assertEquals("семьюдесятью", digitHandler.process(70, Gender.FEMALE, RuCase.T));
        assertEquals("семьюдесятью", digitHandler.process(70, Gender.MIDDLE, RuCase.T));
    }

    @Test
    void process_70_Prepositional() {
        assertEquals("семидесяти", digitHandler.process(70, Gender.MALE, RuCase.P));
        assertEquals("семидесяти", digitHandler.process(70, Gender.FEMALE, RuCase.P));
        assertEquals("семидесяти", digitHandler.process(70, Gender.MIDDLE, RuCase.P));
    }

    @Test
    void process_80_Nominative() {
        assertEquals("восемьдесят", digitHandler.process(80, Gender.MALE, RuCase.I));
        assertEquals("восемьдесят", digitHandler.process(80, Gender.FEMALE, RuCase.I));
        assertEquals("восемьдесят", digitHandler.process(80, Gender.MIDDLE, RuCase.I));
    }

    @Test
    void process_80_Genitive() {
        assertEquals("восьмидесяти", digitHandler.process(80, Gender.MALE, RuCase.R));
        assertEquals("восьмидесяти", digitHandler.process(80, Gender.FEMALE, RuCase.R));
        assertEquals("восьмидесяти", digitHandler.process(80, Gender.MIDDLE, RuCase.R));
    }

    @Test
    void process_80_Dative() {
        assertEquals("восьмидесяти", digitHandler.process(80, Gender.MALE, RuCase.D));
        assertEquals("восьмидесяти", digitHandler.process(80, Gender.FEMALE, RuCase.D));
        assertEquals("восьмидесяти", digitHandler.process(80, Gender.MIDDLE, RuCase.D));
    }

    @Test
    void process_80_Accusative() {
        assertEquals("восемьдесят", digitHandler.process(80, Gender.MALE, RuCase.V));
        assertEquals("восемьдесят", digitHandler.process(80, Gender.FEMALE, RuCase.V));
        assertEquals("восемьдесят", digitHandler.process(80, Gender.MIDDLE, RuCase.V));
    }

    @Test
    void process_80_Instrumental() {
        assertEquals("восемьюдесятью", digitHandler.process(80, Gender.MALE, RuCase.T));
        assertEquals("восемьюдесятью", digitHandler.process(80, Gender.FEMALE, RuCase.T));
        assertEquals("восемьюдесятью", digitHandler.process(80, Gender.MIDDLE, RuCase.T));
    }

    @Test
    void process_80_Prepositional() {
        assertEquals("восьмидесяти", digitHandler.process(80, Gender.MALE, RuCase.P));
        assertEquals("восьмидесяти", digitHandler.process(80, Gender.FEMALE, RuCase.P));
        assertEquals("восьмидесяти", digitHandler.process(80, Gender.MIDDLE, RuCase.P));
    }
}
