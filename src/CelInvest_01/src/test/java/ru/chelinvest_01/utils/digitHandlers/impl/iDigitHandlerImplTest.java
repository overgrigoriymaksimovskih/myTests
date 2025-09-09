package ru.chelinvest_01.utils.digitHandlers.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.chelinvest_01.utils.CheckersOfSignature.RuCase;

import static org.junit.jupiter.api.Assertions.*;

class iDigitHandlerImplTest {

    private iDigitHandlerImpl digitHandler;

    @BeforeEach
    void setUp() {
        // Создаем экземпляр класса перед каждым тестом
        digitHandler = new iDigitHandlerImpl();
    }

    // Всегда будет приходить М - гендер поэтому только его и тестируем
    @Test
    void process_OneMillion_RuCaseI_ReturnsMillion() {
        // Тестируем именительный падеж для 1 миллиона
        assertEquals("миллион", digitHandler.process(1000000, "М", RuCase.I));
    }

    @Test
    void process_OneMillion_RuCaseR_ReturnsMilliona() {
        // Тестируем родительный падеж для 1 миллиона
        assertEquals("миллиона", digitHandler.process(1000000, "М", RuCase.R));
    }

    @Test
    void process_OneMillion_RuCaseD_ReturnsMillionu() {
        // Тестируем дательный падеж для 1 миллиона
        assertEquals("миллиону", digitHandler.process(1000000, "М", RuCase.D));
    }

    @Test
    void process_OneMillion_RuCaseT_ReturnsMillionom() {
        // Тестируем творительный падеж для 1 миллиона
        assertEquals("миллионом", digitHandler.process(1000000, "М", RuCase.T));
    }

    @Test
    void process_OneMillion_RuCaseP_ReturnsMillione() {
        // Тестируем предложный падеж для 1 миллиона
        assertEquals("миллионе", digitHandler.process(1000000, "М", RuCase.P));
    }

    @Test
    void process_TwoMillion_RuCaseI_ReturnsMilliona() {
        // Тестируем именительный падеж для 2 миллионов
        assertEquals("миллиона", digitHandler.process(2000000L, "М", RuCase.I));
    }

    @Test
    void process_TwoMillion_RuCaseR_ReturnsMillionov() {
        // Тестируем родительный падеж для 2 миллионов
        assertEquals("миллионов", digitHandler.process(2000000L, "М", RuCase.R));
    }

    @Test
    void process_TwoMillion_RuCaseD_ReturnsMillionam() {
        // Тестируем дательный падеж для 2 миллионов
        assertEquals("миллионам", digitHandler.process(2000000L, "М", RuCase.D));
    }

    @Test
    void process_TwoMillion_RuCaseT_ReturnsMillionami() {
        // Тестируем творительный падеж для 2 миллионов
        assertEquals("миллионами", digitHandler.process(2000000L, "М", RuCase.T));
    }

    @Test
    void process_TwoMillion_RuCaseP_ReturnsMillionah() {
        // Тестируем предложный падеж для 2 миллионов
        assertEquals("миллионах", digitHandler.process(2000000L, "М", RuCase.P));
    }


    @Test
    void process_FiveMillion_RuCaseI_ReturnsMillionov() {
        // Тестируем именительный падеж для 5 миллионов
        assertEquals("миллионов", digitHandler.process(5000000L, "М", RuCase.I));
    }

    @Test
    void process_FiveMillion_RuCaseR_ReturnsMillionov() {
        // Тестируем родительный падеж для 5 миллионов
        assertEquals("миллионов", digitHandler.process(5000000L, "М", RuCase.R));
    }

    @Test
    void process_FiveMillion_RuCaseD_ReturnsMillionam() {
        // Тестируем дательный падеж для 5 миллионов
        assertEquals("миллионам", digitHandler.process(5000000L, "М", RuCase.D));
    }
    @Test
    void process_FiveMillion_RuCaseT_ReturnsMillionami() {
        // Тестируем творительный падеж для 5 миллионов
        assertEquals("миллионами", digitHandler.process(5000000L, "М", RuCase.T));
    }
    @Test
    void process_FiveMillion_RuCaseP_ReturnsMillionah() {
        // Тестируем предложный падеж для 5 миллионов
        assertEquals("миллионах", digitHandler.process(5000000L, "М", RuCase.P));
    }

    @Test //Валидация на то, что при большом числе все работает корректно
    void process_LargeNumber_ReturnsCorrectDeclension(){
        assertEquals("миллионов", digitHandler.process(999999999L, "М", RuCase.I));
    }
}
