package ru.chelinvest_01.service.impl;

import ru.chelinvest_01.Exceptions.*;
import ru.chelinvest_01.service.NumberToTextConverter;
import ru.chelinvest_01.utils.CheckersOfSignature.Sum;
import ru.chelinvest_01.utils.DigitPreparer;
import ru.chelinvest_01.utils.StringMaker;
import ru.chelinvest_01.utils.CheckersOfSignature.Gender;
import ru.chelinvest_01.utils.CheckersOfSignature.RuCase;
import java.util.List;
import java.util.Map;


public class NumberToTextConverterImpl implements NumberToTextConverter {

    @Override
    public String numberToWords(Long nSum, String sGender, String sCase) throws IncorrectValueException {

        if (0L == nSum) return zeroToStr(sCase);

        if (!Gender.isGender(sGender)) {

            String msg = String.format("%s - неверный пол", sGender);
            throw new IncorrectGenderException(msg);
        }
        if (!RuCase.isRuCase(sCase)) {

            String msg = String.format("%s - неверный падеж", sCase);
            throw new IncorrectCaseException(msg);
        }
        if (!Sum.iisValidNumber(nSum)) {

            String msg = String.format("%d - введено неверное число. Используйте от 0 до 999 999 999 999", nSum);
            throw new IncorrectNumberException(msg);
        }

        List<Map.Entry<Long, Integer>> preparedDigit = null;

        try {
            preparedDigit = DigitPreparer.convertNumberToArray(nSum);
        } catch (DigitPreparingException e) {
            throw new IncorrectValueException("Ошибка при подготовке числа для преобразования", e);
        }

        try {
            return StringMaker.processNumberList(preparedDigit, sGender, sCase);
        } catch (StringMakingException e) {
            throw new IncorrectValueException("Ошибка при создании строки из подготовленного списка пар \"Разряд/Значение\" ", e);
        }
    }

    private String zeroToStr(String sCase) {

        if (RuCase.R.equals(sCase)) return "ноля";
        if (RuCase.D.equals(sCase)) return "нолю";
        if (RuCase.T.equals(sCase)) return "нолём";
        if (RuCase.P.equals(sCase)) return " ноле";

        return "ноль";
    }
}
