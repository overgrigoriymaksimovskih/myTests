package ru.chelinvest_01.utils.digitHandlers.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.chelinvest_01.utils.CheckersOfSignature.RuCase;

import static org.junit.jupiter.api.Assertions.*;

class SimpleNumberEnderImplTest {

    private SimpleNumberEnderImpl simpleNumberEnder; // Объявляем как поле класса

    @BeforeEach
    void setUp() {
        // Создаем экземпляр класса перед каждым тестом
        simpleNumberEnder = new SimpleNumberEnderImpl();
    }

    @Test
    void addSimpleNumberEnding_RuCaseI_ReturnsCorrectEnding() {
        // Тестируем добавление окончания для именительного падежа (RuCase.I)
        assertEquals("Одиннадцать", simpleNumberEnder.addSimpleNumberEnding("Одиннадцат", RuCase.I));
    }

    @Test
    void addSimpleNumberEnding_RuCaseV_ReturnsCorrectEnding() {
        // Тестируем добавление окончания для винительного падежа (RuCase.V).  Этот падеж, как I, должен давать окончание "ь".
        assertEquals("Одиннадцать", simpleNumberEnder.addSimpleNumberEnding("Одиннадцат", RuCase.V));
    }

    @Test
    void addSimpleNumberEnding_RuCaseT_ReturnsCorrectEnding() {
        // Тестируем добавление окончания для творительного падежа (RuCase.T)
        assertEquals("Одиннадцатью", simpleNumberEnder.addSimpleNumberEnding("Одиннадцат", RuCase.T));
    }

    @Test
    void addSimpleNumberEnding_RuCaseR_ReturnsCorrectEnding() {
        // Тестируем добавление окончания для родительного падежа (RuCase.R)
        assertEquals("Одиннадцати", simpleNumberEnder.addSimpleNumberEnding("Одиннадцат", RuCase.R));
    }

    @Test
    void addSimpleNumberEnding_RuCaseD_ReturnsCorrectEnding() {
        // Тестируем добавление окончания для дательного падежа (RuCase.D)
        assertEquals("Одиннадцати", simpleNumberEnder.addSimpleNumberEnding("Одиннадцат", RuCase.D));
    }

    @Test
    void addSimpleNumberEnding_RuCaseP_ReturnsCorrectEnding() {
        // Тестируем добавление окончания для предложного падежа (RuCase.P)
        assertEquals("Одиннадцати", simpleNumberEnder.addSimpleNumberEnding("Одиннадцат", RuCase.P));
    }

    @Test
    void addSimpleNumberEnding_EmptyTemplate_ReturnsCorrectEnding() {
        // Тестируем, что произойдет, если передать пустую строку в качестве шаблона
        assertEquals("ь", simpleNumberEnder.addSimpleNumberEnding("", RuCase.I));
        assertEquals("ью", simpleNumberEnder.addSimpleNumberEnding("", RuCase.T));
        assertEquals("и", simpleNumberEnder.addSimpleNumberEnding("", RuCase.R));
    }
}

