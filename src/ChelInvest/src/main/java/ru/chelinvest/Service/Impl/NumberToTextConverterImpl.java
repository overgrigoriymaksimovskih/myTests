package ru.chelinvest.Service.Impl;

import ru.chelinvest.Exceptions.IncorrectCaseException;
import ru.chelinvest.Exceptions.IncorrectValueException;
import ru.chelinvest.Exceptions.IncorrectValueGenderException;
import ru.chelinvest.Exceptions.IncorrectValueNumberException;
import ru.chelinvest.Service.NumberToTextConverter;
import ru.chelinvest.Utils.Gender;
import ru.chelinvest.Utils.NumberClasses;
import ru.chelinvest.Utils.NumberCategories;
import ru.chelinvest.Utils.RuCase;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class NumberToTextConverterImpl implements NumberToTextConverter {

    private final NumberClasses numberClasses = new NumberClasses();
    private final NumberCategories numberCategories = new NumberCategories();

    @Override
    public String numberToWords(Long nSum, String sGender, String sCase) throws IncorrectValueException {

        if (Gender.isNotGender(sGender)) {

            String msg = String.format("%s - неверный пол", sGender);
            throw new IncorrectValueGenderException(msg);
        }

        if (RuCase.isNotRuCase(sCase)) {

            String msg = String.format("%s - неверный падеж", sCase);
            throw new IncorrectCaseException(msg);
        }

        if (isNotValidNumber(nSum)) {

            String msg = String.format("%d - неверное число. Используйте от 0 до 999 999 999 999", nSum);
            throw new IncorrectValueNumberException(msg);
        }

        return getStrByNumber(nSum, sGender, sCase);

    }

    private String getStrByNumber(Long nSum, String sGender, String sCase) {

        if (0L == nSum) return zeroToStr(sCase);

        StringBuilder result = new StringBuilder();

        List<Integer> splitedNumber = splitNumberOnClass(nSum);
        ListIterator<Integer> iterator = splitedNumber.listIterator(splitedNumber.size());

        int classIndex = splitedNumber.size() - 1;

        while (iterator.hasPrevious()) {

            Integer currentNumber = iterator.previous();
            String gender = getGender(classIndex, sGender);

            String classNumber = numberCategories.numberToStr(currentNumber, gender, sCase);

            if ( ! classNumber.isEmpty()) {

                result.append(classNumber);
                result.append(" ");
            }

            if (0 < currentNumber) {

                int classNameForm = getNumberClassForm(currentNumber);
                String className = numberClasses.numberClassToStr(classIndex, sCase, classNameForm);

                result.append(className);
                result.append(" ");
            }

            classIndex--;
        }

        return result.toString().trim();
    }
    private boolean isValidNumber(Long nSum) {

        return 0 <= nSum && nSum <= 999_999_999_999L;
    }

    private boolean isNotValidNumber(Long nSum) {

        return !isValidNumber(nSum);
    }

    private String zeroToStr(String sCase) {

        if (RuCase.R.equals(sCase)) return "ноля";
        if (RuCase.D.equals(sCase)) return "нолю";
        if (RuCase.T.equals(sCase)) return "нолём";
        if (RuCase.P.equals(sCase)) return " ноле";

        return "ноль";
    }

    private List<Integer> splitNumberOnClass(Long nSum) {

        List<Integer> result = new LinkedList<>();

        while (0L < nSum) {
            result.add((int) (nSum % 1000L));
            nSum = nSum / 1000L;
        }

        return result;
    }

    private String getGender(int numClass, String sGender) {

        return numClass > 0
                ? getNumberClassGender(numClass)
                : sGender;
    }

    private String getNumberClassGender(int numClass) {

        return numClass == 1 ? Gender.FEMALE : Gender.MALE;
    }

    private int getNumberClassForm(int number) {

        number %= 100;

        if (9 < number && number < 20) return 3;

        number %= 10;

        if (1 == number) return 1;
        if (1 < number && number < 5) return 2;

        return 3;
    }
}
