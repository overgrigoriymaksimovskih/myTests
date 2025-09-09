package ru.chelinvest_01.utils.digitHandlers.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.chelinvest_01.utils.CheckersOfSignature.RuCase;

import static org.junit.jupiter.api.Assertions.*;

class hDigitHandlerImplTest {

    private hDigitHandlerImpl digitHandler;

    @BeforeEach
    void setUp() {
        digitHandler = new hDigitHandlerImpl();
    }

    // Всегда будет приходить Ж - гендер поэтому только его и тестируем
    @Test
    void process_OneThousand_RuCaseI_ReturnsThysiacha() {
        assertEquals("тысяча", digitHandler.process(1000, "Ж", RuCase.I));
    }

    @Test
    void process_OneThousand_RuCaseR_ReturnsThysiachi() {
        assertEquals("тысячи", digitHandler.process(1000, "Ж", RuCase.R));
    }

    @Test
    void process_OneThousand_RuCaseD_ReturnsThysiache() {
        assertEquals("тысяче", digitHandler.process(1000, "Ж", RuCase.D));
    }

    @Test
    void process_OneThousand_RuCaseT_ReturnsThysyachei() {
        assertEquals("тысячей", digitHandler.process(1000, "Ж", RuCase.T));
    }

    @Test
    void process_OneThousand_RuCaseP_ReturnsThysiache() {
        assertEquals("тысяче", digitHandler.process(1000, "Ж", RuCase.P));
    }

    @Test
    void process_TwoThousand_RuCaseI_ReturnsThysiachi() {
        assertEquals("тысячи", digitHandler.process(2000, "Ж", RuCase.I));
    }

    @Test
    void process_TwoThousand_RuCaseR_ReturnsThysyach() {
        assertEquals("тысяч", digitHandler.process(2000, "Ж", RuCase.R));
    }

    @Test
    void process_TwoThousand_RuCaseD_ReturnsThysyacham() {
        assertEquals("тысячам", digitHandler.process(2000, "Ж", RuCase.D));
    }

    @Test
    void process_TwoThousand_RuCaseT_ReturnsThysyachami() {
        assertEquals("тысячами", digitHandler.process(2000, "Ж", RuCase.T));
    }

    @Test
    void process_TwoThousand_RuCaseP_ReturnsThysyachah() {
        assertEquals("тысячах", digitHandler.process(2000, "Ж", RuCase.P));
    }

    @Test
    void process_FiveThousand_RuCaseI_ReturnsThysiach() {
        assertEquals("тысяч", digitHandler.process(5000, "Ж", RuCase.I));
    }

    @Test
    void process_FiveThousand_RuCaseR_ReturnsThysiach() {
        assertEquals("тысяч", digitHandler.process(5000, "Ж", RuCase.R));
    }

    @Test
    void process_FiveThousand_RuCaseD_ReturnsThysyacham() {
        assertEquals("тысячам", digitHandler.process(5000, "Ж", RuCase.D));
    }

    @Test
    void process_FiveThousand_RuCaseT_ReturnsThysyachami() {
        assertEquals("тысячами", digitHandler.process(5000, "Ж", RuCase.T));
    }

    @Test
    void process_FiveThousand_RuCaseP_ReturnsThysyachah() {
        assertEquals("тысячах", digitHandler.process(5000, "Ж", RuCase.P));
    }

    @Test
    void process_SevenThousand_RuCaseI_ReturnsThysiach() { //доп тест, просто чтобы добавить еще один тест на > 4000
        assertEquals("тысяч", digitHandler.process(7000, "Ж", RuCase.I));
    }

    @Test
    void process_NineHundredNinetyNineThousand_RuCaseI_ReturnsThysiach() {
        assertEquals("тысяч", digitHandler.process(999000, "Ж", RuCase.I));
    }

    @Test
    void process_LargeNumberCloseToOneMillion_RuCaseI_ReturnsThysiach() {
        assertEquals("тысяч", digitHandler.process(999999, "Ж", RuCase.I));
    }
}

