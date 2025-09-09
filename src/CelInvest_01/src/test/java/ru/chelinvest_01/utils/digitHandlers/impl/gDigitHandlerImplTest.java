package ru.chelinvest_01.utils.digitHandlers.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.chelinvest_01.utils.CheckersOfSignature.Gender;
import ru.chelinvest_01.utils.CheckersOfSignature.RuCase;

import static org.junit.jupiter.api.Assertions.assertEquals;

class gDigitHandlerImplTest {

    private gDigitHandlerImpl digitHandler;

    @BeforeEach
    void setUp() {
        digitHandler = new gDigitHandlerImpl();
    }

    @Test
    void process_200_Nominative() {
        assertEquals("двести", digitHandler.process(200, Gender.MALE, RuCase.I));
        assertEquals("двести", digitHandler.process(200, Gender.FEMALE, RuCase.I));
        assertEquals("двести", digitHandler.process(200, Gender.MIDDLE, RuCase.I));
    }

    @Test
    void process_200_Accusative() {
        assertEquals("двести", digitHandler.process(200, Gender.MALE, RuCase.V));
        assertEquals("двести", digitHandler.process(200, Gender.FEMALE, RuCase.V));
        assertEquals("двести", digitHandler.process(200, Gender.MIDDLE, RuCase.V));
    }


    @Test
    void process_200_Genitive() {
        assertEquals("двухсот", digitHandler.process(200, Gender.MALE, RuCase.R));
        assertEquals("двухсот", digitHandler.process(200, Gender.FEMALE, RuCase.R));
        assertEquals("двухсот", digitHandler.process(200, Gender.MIDDLE, RuCase.R));
    }

    @Test
    void process_200_Dative() {
        assertEquals("двумстам", digitHandler.process(200, Gender.MALE, RuCase.D));
        assertEquals("двумстам", digitHandler.process(200, Gender.FEMALE, RuCase.D));
        assertEquals("двумстам", digitHandler.process(200, Gender.MIDDLE, RuCase.D));
    }

    @Test
    void process_200_Instrumental() {
        assertEquals("двумястами", digitHandler.process(200, Gender.MALE, RuCase.T));
        assertEquals("двумястами", digitHandler.process(200, Gender.FEMALE, RuCase.T));
        assertEquals("двумястами", digitHandler.process(200, Gender.MIDDLE, RuCase.T));
    }

    @Test
    void process_200_Prepositional() {
        assertEquals("двухстах", digitHandler.process(200, Gender.MALE, RuCase.P));
        assertEquals("двухстах", digitHandler.process(200, Gender.FEMALE, RuCase.P));
        assertEquals("двухстах", digitHandler.process(200, Gender.MIDDLE, RuCase.P));
    }

    @Test
    void process_300_Nominative() {
        assertEquals("триста", digitHandler.process(300, Gender.MALE, RuCase.I));
        assertEquals("триста", digitHandler.process(300, Gender.FEMALE, RuCase.I));
        assertEquals("триста", digitHandler.process(300, Gender.MIDDLE, RuCase.I));
    }

    @Test
    void process_300_Accusative() {
        assertEquals("триста", digitHandler.process(300, Gender.MALE, RuCase.V));
        assertEquals("триста", digitHandler.process(300, Gender.FEMALE, RuCase.V));
        assertEquals("триста", digitHandler.process(300, Gender.MIDDLE, RuCase.V));
    }

    @Test
    void process_300_Genitive() {
        assertEquals("трёхсот", digitHandler.process(300, Gender.MALE, RuCase.R));
        assertEquals("трёхсот", digitHandler.process(300, Gender.FEMALE, RuCase.R));
        assertEquals("трёхсот", digitHandler.process(300, Gender.MIDDLE, RuCase.R));
    }

    @Test
    void process_300_Dative() {
        assertEquals("трёмстам", digitHandler.process(300, Gender.MALE, RuCase.D));
        assertEquals("трёмстам", digitHandler.process(300, Gender.FEMALE, RuCase.D));
        assertEquals("трёмстам", digitHandler.process(300, Gender.MIDDLE, RuCase.D));
    }

    @Test
    void process_300_Instrumental() {
        assertEquals("тремястами", digitHandler.process(300, Gender.MALE, RuCase.T));
        assertEquals("тремястами", digitHandler.process(300, Gender.FEMALE, RuCase.T));
        assertEquals("тремястами", digitHandler.process(300, Gender.MIDDLE, RuCase.T));
    }

    @Test
    void process_300_Prepositional() {
        assertEquals("трёхстах", digitHandler.process(300, Gender.MALE, RuCase.P));
        assertEquals("трёхстах", digitHandler.process(300, Gender.FEMALE, RuCase.P));
        assertEquals("трёхстах", digitHandler.process(300, Gender.MIDDLE, RuCase.P));
    }

    @Test
    void process_400_Nominative() {
        assertEquals("четыреста", digitHandler.process(400, Gender.MALE, RuCase.I));
        assertEquals("четыреста", digitHandler.process(400, Gender.FEMALE, RuCase.I));
        assertEquals("четыреста", digitHandler.process(400, Gender.MIDDLE, RuCase.I));
    }

    @Test
    void process_400_Accusative() {
        assertEquals("четыреста", digitHandler.process(400, Gender.MALE, RuCase.V));
        assertEquals("четыреста", digitHandler.process(400, Gender.FEMALE, RuCase.V));
        assertEquals("четыреста", digitHandler.process(400, Gender.MIDDLE, RuCase.V));
    }
    @Test
    void process_400_Genitive() {
        assertEquals("четырёхсот", digitHandler.process(400, Gender.MALE, RuCase.R));
        assertEquals("четырёхсот", digitHandler.process(400, Gender.FEMALE, RuCase.R));
        assertEquals("четырёхсот", digitHandler.process(400, Gender.MIDDLE, RuCase.R));
    }

    @Test
    void process_400_Dative() {
        assertEquals("четырёмстам", digitHandler.process(400, Gender.MALE, RuCase.D));
        assertEquals("четырёмстам", digitHandler.process(400, Gender.FEMALE, RuCase.D));
        assertEquals("четырёмстам", digitHandler.process(400, Gender.MIDDLE, RuCase.D));
    }
    @Test
    void process_400_Instrumental() {
        assertEquals("четырьмястами", digitHandler.process(400, Gender.MALE, RuCase.T));
        assertEquals("четырьмястами", digitHandler.process(400, Gender.FEMALE, RuCase.T));
        assertEquals("четырьмястами", digitHandler.process(400, Gender.MIDDLE, RuCase.T));
    }
    @Test
    void process_400_Prepositional() {
        assertEquals("четырёхстах", digitHandler.process(400, Gender.MALE, RuCase.P));
        assertEquals("четырёхстах", digitHandler.process(400, Gender.FEMALE, RuCase.P));
        assertEquals("четырёхстах", digitHandler.process(400, Gender.MIDDLE, RuCase.P));
    }

    @Test
    void process_500_Genitive() {
        assertEquals("пятисот", digitHandler.process(500, Gender.MALE, RuCase.R));
        assertEquals("пятисот", digitHandler.process(500, Gender.FEMALE, RuCase.R));
        assertEquals("пятисот", digitHandler.process(500, Gender.MIDDLE, RuCase.R));
    }

    @Test
    void process_500_Dative() {
        assertEquals("пятистам", digitHandler.process(500, Gender.MALE, RuCase.D));
        assertEquals("пятистам", digitHandler.process(500, Gender.FEMALE, RuCase.D));
        assertEquals("пятистам", digitHandler.process(500, Gender.MIDDLE, RuCase.D));
    }

    @Test
    void process_500_Instrumental() {
        assertEquals("пятьюстами", digitHandler.process(500, Gender.MALE, RuCase.T));
        assertEquals("пятьюстами", digitHandler.process(500, Gender.FEMALE, RuCase.T));
        assertEquals("пятьюстами", digitHandler.process(500, Gender.MIDDLE, RuCase.T));
    }

    @Test
    void process_500_Prepositional() {
        assertEquals("пятистах", digitHandler.process(500, Gender.MALE, RuCase.P));
        assertEquals("пятистах", digitHandler.process(500, Gender.FEMALE, RuCase.P));
        assertEquals("пятистах", digitHandler.process(500, Gender.MIDDLE, RuCase.P));
    }

}
