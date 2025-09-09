package ru.chelinvest_01.utils.digitHandlers.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.chelinvest_01.utils.CheckersOfSignature.RuCase;

import static org.junit.jupiter.api.Assertions.*;

class jDigitHandlerImplTest {

    private jDigitHandlerImpl digitHandler;

    @BeforeEach
    void setUp() {
        // Создаем экземпляр класса перед каждым тестом
        digitHandler = new jDigitHandlerImpl();
    }

    // Всегда будет приходить М - гендер поэтому только его и тестируем
    @Test
    void process_OneBillion_RuCaseI_ReturnsMilliard() {
        // Тестируем именительный падеж для 1 миллиарда
        assertEquals("миллиард", digitHandler.process(1000000000, "М", RuCase.I));
    }

    @Test
    void process_OneBillion_RuCaseR_ReturnsMilliarda() {
        // Тестируем родительный падеж для 1 миллиарда
        assertEquals("миллиарда", digitHandler.process(1000000000, "М", RuCase.R));
    }

    @Test
    void process_OneBillion_RuCaseD_ReturnsMilliardu() {
        // Тестируем дательный падеж для 1 миллиарда
        assertEquals("миллиарду", digitHandler.process(1000000000, "М", RuCase.D));
    }

    @Test
    void process_OneBillion_RuCaseT_ReturnsMilliardom() {
        // Тестируем творительный падеж для 1 миллиарда
        assertEquals("миллиардом", digitHandler.process(1000000000, "М", RuCase.T));
    }

    @Test
    void process_OneBillion_RuCaseP_ReturnsMilliarde() {
        // Тестируем предложный падеж для 1 миллиарда
        assertEquals("миллиарде", digitHandler.process(1000000000, "М", RuCase.P));
    }

    @Test
    void process_TwoBillion_RuCaseI_ReturnsMilliarda() {
        // Тестируем именительный падеж для 2 миллиардов
        assertEquals("миллиарда", digitHandler.process(2000000000L, "М", RuCase.I));
    }

    @Test
    void process_TwoBillion_RuCaseR_ReturnsMilliardov() {
        // Тестируем родительный падеж для 2 миллиардов
        assertEquals("миллиардов", digitHandler.process(2000000000L, "М", RuCase.R));
    }
    @Test
    void process_TwoBillion_RuCaseD_ReturnsMilliardam() {
        // Тестируем дательный падеж для 2 миллиардов
        assertEquals("миллиардам", digitHandler.process(2000000000L, "М", RuCase.D));
    }
    @Test
    void process_TwoBillion_RuCaseT_ReturnsMilliardami() {
        // Тестируем творительный падеж для 2 миллиардов
        assertEquals("миллиардами", digitHandler.process(2000000000L, "М", RuCase.T));
    }
    @Test
    void process_TwoBillion_RuCaseP_ReturnsMilliardah() {
        // Тестируем предложный падеж для 2 миллиардов
        assertEquals("миллиардах", digitHandler.process(2000000000L, "М", RuCase.P));
    }


    @Test
    void process_FiveBillion_RuCaseI_ReturnsMilliardov() {
        // Тестируем именительный падеж для 5 миллиардов
        assertEquals("миллиардов", digitHandler.process(5000000000L, "М", RuCase.I));
    }

    @Test
    void process_FiveBillion_RuCaseR_ReturnsMilliardov() {
        // Тестируем родительный падеж для 5 миллиардов
        assertEquals("миллиардов", digitHandler.process(5000000000L, "М", RuCase.R));
    }
    @Test
    void process_FiveBillion_RuCaseD_ReturnsMilliardam() {
        // Тестируем дательный падеж для 5 миллиардов
        assertEquals("миллиардам", digitHandler.process(5000000000L, "М", RuCase.D));
    }
    @Test
    void process_FiveBillion_RuCaseT_ReturnsMilliardami() {
        // Тестируем творительный падеж для 5 миллиардов
        assertEquals("миллиардами", digitHandler.process(5000000000L, "М", RuCase.T));
    }
    @Test
    void process_FiveBillion_RuCaseP_ReturnsMilliardah() {
        // Тестируем предложный падеж для 5 миллиардов
        assertEquals("миллиардах", digitHandler.process(5000000000L, "М", RuCase.P));
    }

    @Test //Валидация на то, что при большом числе все работает корректно
    void process_LargeNumber_ReturnsCorrect(){
        assertEquals("миллиардов", digitHandler.process(999999999999L, "М", RuCase.I));
    }
}
