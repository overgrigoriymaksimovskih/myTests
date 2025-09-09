package ru.chelinvest_01.utils.digitHandlers.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.chelinvest_01.utils.CheckersOfSignature.Gender;
import ru.chelinvest_01.utils.CheckersOfSignature.RuCase;

import static org.junit.jupiter.api.Assertions.assertEquals;

class aDigitHandlerImplTest {

    private aDigitHandlerImpl digitHandler;

    @BeforeEach
    void setUp() {
        digitHandler = new aDigitHandlerImpl();
    }

    @Test
    void process_1_Male_Nominative() {
        assertEquals("один", digitHandler.process(1, Gender.MALE, RuCase.I));
    }

    @Test
    void process_1_Female_Nominative() {
        assertEquals("одна", digitHandler.process(1, Gender.FEMALE, RuCase.I));
    }

    @Test
    void process_1_Middle_Nominative() {
        assertEquals("одно", digitHandler.process(1, Gender.MIDDLE, RuCase.I));
    }

    @Test
    void process_1_Male_Genitive() {
        assertEquals("одного", digitHandler.process(1, Gender.MALE, RuCase.R));
    }

    @Test
    void process_1_Female_Genitive() {
        assertEquals("одной", digitHandler.process(1, Gender.FEMALE, RuCase.R));
    }

    @Test
    void process_1_Middle_Genitive() {
        assertEquals("одного", digitHandler.process(1, Gender.MIDDLE, RuCase.R));
    }

    @Test
    void process_1_Male_Dative() {
        assertEquals("одному", digitHandler.process(1, Gender.MALE, RuCase.D));
    }

    @Test
    void process_1_Female_Dative() {
        assertEquals("одной", digitHandler.process(1, Gender.FEMALE, RuCase.D));
    }

    @Test
    void process_1_Middle_Dative() {
        assertEquals("одному", digitHandler.process(1, Gender.MIDDLE, RuCase.D));
    }

    @Test
    void process_1_Male_Accusative() {
        assertEquals("один", digitHandler.process(1, Gender.MALE, RuCase.V));
    }

    @Test
    void process_1_Female_Accusative() {
        assertEquals("одну", digitHandler.process(1, Gender.FEMALE, RuCase.V));
    }

    @Test
    void process_1_Middle_Accusative() {
        assertEquals("одно", digitHandler.process(1, Gender.MIDDLE, RuCase.V));
    }

    @Test
    void process_1_Male_Instrumental() {
        assertEquals("одним", digitHandler.process(1, Gender.MALE, RuCase.T));
    }

    @Test
    void process_1_Female_Instrumental() {
        assertEquals("одной", digitHandler.process(1, Gender.FEMALE, RuCase.T));
    }

    @Test
    void process_1_Middle_Instrumental() {
        assertEquals("одним", digitHandler.process(1, Gender.MIDDLE, RuCase.T));
    }

    @Test
    void process_1_Male_Prepositional() {
        assertEquals("одном", digitHandler.process(1, Gender.MALE, RuCase.P));
    }

    @Test
    void process_1_Female_Prepositional() {
        assertEquals("одной", digitHandler.process(1, Gender.FEMALE, RuCase.P));
    }

    @Test
    void process_1_Middle_Prepositional() {
        assertEquals("одном", digitHandler.process(1, Gender.MIDDLE, RuCase.P));
    }




    @Test
    void process_2_Male_Nominative() {
        assertEquals("два", digitHandler.process(2, Gender.MALE, RuCase.I));
    }

    @Test
    void process_2_Female_Nominative() {
        assertEquals("две", digitHandler.process(2, Gender.FEMALE, RuCase.I));
    }

    @Test
    void process_2_Middle_Nominative() {
        assertEquals("два", digitHandler.process(2, Gender.MIDDLE, RuCase.I));
    }

    @Test
    void process_2_Male_Genitive() {
        assertEquals("двух", digitHandler.process(2, Gender.MALE, RuCase.R));
    }

    @Test
    void process_2_Female_Genitive() {
        assertEquals("двух", digitHandler.process(2, Gender.FEMALE, RuCase.R));
    }

    @Test
    void process_2_Middle_Genitive() {
        assertEquals("двух", digitHandler.process(2, Gender.MIDDLE, RuCase.R));
    }

    @Test
    void process_2_Male_Dative() {
        assertEquals("двум", digitHandler.process(2, Gender.MALE, RuCase.D));
    }

    @Test
    void process_2_Female_Dative() {
        assertEquals("двум", digitHandler.process(2, Gender.FEMALE, RuCase.D));
    }

    @Test
    void process_2_Middle_Dative() {
        assertEquals("двум", digitHandler.process(2, Gender.MIDDLE, RuCase.D));
    }

    @Test
    void process_2_Male_Accusative() {
        assertEquals("два", digitHandler.process(2, Gender.MALE, RuCase.V));
    }

    @Test
    void process_2_Female_Accusative() {
        assertEquals("две", digitHandler.process(2, Gender.FEMALE, RuCase.V));
    }

    @Test
    void process_2_Middle_Accusative() {
        assertEquals("два", digitHandler.process(2, Gender.MIDDLE, RuCase.V));
    }

    @Test
    void process_2_Male_Instrumental() {
        assertEquals("двумя", digitHandler.process(2, Gender.MALE, RuCase.T));
    }

    @Test
    void process_2_Female_Instrumental() {
        assertEquals("двумя", digitHandler.process(2, Gender.FEMALE, RuCase.T));
    }

    @Test
    void process_2_Middle_Instrumental() {
        assertEquals("двумя", digitHandler.process(2, Gender.MIDDLE, RuCase.T));
    }

    @Test
    void process_2_Male_Prepositional() {
        assertEquals("двух", digitHandler.process(2, Gender.MALE, RuCase.P));
    }

    @Test
    void process_2_Female_Prepositional() {
        assertEquals("двух", digitHandler.process(2, Gender.FEMALE, RuCase.P));
    }

    @Test
    void process_2_Middle_Prepositional() {
        assertEquals("двух", digitHandler.process(2, Gender.MIDDLE, RuCase.P));
    }


    @Test
    void process_3_Nominative() {
        assertEquals("три", digitHandler.process(3, Gender.MALE, RuCase.I));
    }

    @Test
    void process_3_Genitive() {
        assertEquals("трёх", digitHandler.process(3, Gender.MALE, RuCase.R));
    }

    @Test
    void process_3_Dative() {
        assertEquals("трём", digitHandler.process(3, Gender.MALE, RuCase.D));
    }

    @Test
    void process_3_Accusative() {
        assertEquals("три", digitHandler.process(3, Gender.MALE, RuCase.V));
    }

    @Test
    void process_3_Instrumental() {
        assertEquals("тремя", digitHandler.process(3, Gender.MALE, RuCase.T));
    }

    @Test
    void process_3_Prepositional() {
        assertEquals("трёх", digitHandler.process(3, Gender.MALE, RuCase.P));
    }



    @Test
    void process_4_Nominative() {
        assertEquals("четыре", digitHandler.process(4, Gender.MALE, RuCase.I));
    }

    @Test
    void process_4_Genitive() {
        assertEquals("четырёх", digitHandler.process(4, Gender.MALE, RuCase.R));
    }

    @Test
    void process_4_Dative() {
        assertEquals("четырём", digitHandler.process(4, Gender.MALE, RuCase.D));
    }

    @Test
    void process_4_Accusative() {
        assertEquals("четыре", digitHandler.process(4, Gender.MALE, RuCase.V));
    }

    @Test
    void process_4_Instrumental() {
        assertEquals("четырьмя", digitHandler.process(4, Gender.MALE, RuCase.T));
    }

    @Test
    void process_4_Prepositional() {
        assertEquals("четырёх", digitHandler.process(4, Gender.MALE, RuCase.P));
    }

}
