package ru.chelinvest_01.service.impl;

import ru.chelinvest_01.Exceptions.IncorrectValueException;
import ru.chelinvest_01.service.NumberToTextConverter;
import ru.chelinvest_01.utils.DigitPreparer;
import ru.chelinvest_01.utils.HandlersDispatcher;
import ru.chelinvest_01.utils.StringMaker;

import java.util.List;
import java.util.Map;


public class NumberToTextConverterImpl implements NumberToTextConverter {

    @Override
    public String numberToWords(Long nSum, String sGender, String sCase) throws IncorrectValueException {

//        return HandlersDispatcher.handleNumber(nSum, sGender, sCase);

        List<Map.Entry<Long, Integer>> preparedDigit = DigitPreparer.convertNumberToArray(nSum);
        StringMaker.processNumberList(preparedDigit, sGender, sCase);
        return "end";
    }
}
