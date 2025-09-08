package ru.chelinvest_01.utils;

import ru.chelinvest_01.Exceptions.StringMakingException;

import java.util.List;
import java.util.Map;
import static ru.chelinvest_01.utils.HandlersDispatcher.handleNumber;

public class StringMaker {

    public static String processNumberList(List<Map.Entry<Long, Integer>> numberList, String sGender, String sCase) throws StringMakingException {

        if (numberList.size() != 12) {
            throw new StringMakingException("неверный размер списка пар \"разряд/значение\"");
        }

        StringBuilder mergedResult = new StringBuilder();

        for (Map.Entry<Long, Integer> entry : numberList) {
            if (entry == null) {
                throw new StringMakingException("Entry в numberList не может быть null.");
            }

            Long powerOfTen = entry.getKey();
            if (powerOfTen == null){
                throw new StringMakingException("ключ в паре \"разряд/значение\" не может быть null.");
            }

            Integer digit = entry.getValue();
            if(digit == null || digit > 9 || digit < 0){
                throw new StringMakingException("Digit не может быть null и должен находиться в диапазоне от 0 до 9");
            }

            Long lastBillion = findLastRelevantDigit(numberList, 999999999L, 1000000000000L);
            Long lastMillion = findLastRelevantDigit(numberList, 999999L, 1000000000L);
            Long lastThousand = findLastRelevantDigit(numberList, 999L, 1000000L);

            if (digit != 0) {                          // 0 - 999-------------------------------------------------------
                Long nSum = powerOfTen * digit;
                if (nSum < 1000) {
                    String result = handleNumber(nSum, sGender, sCase);
                    if (nSum < 19) {
                        mergedResult.append(result);// после последней цифры пробел не нужен
                    } else {
                        mergedResult.append(result).append(" ");
                    }

                } else if (nSum < 1000000) {            // тысячи-------------------------------------------------------

                    Long part = nSum / 1000;
                    String resultPart = handleNumber(part, "Ж", sCase); // Тысяча - женский род
                    mergedResult.append(resultPart).append(" ");

                    if (powerOfTen.equals(lastThousand)) {
                        String resultFull = handleNumber(nSum, sGender, sCase);
                        mergedResult.append(resultFull).append(" ");
                    }

                } else if (nSum < 1000000000L) {       // миллионы------------------------------------------------------
                    Long part = nSum / 1000000;
                    String resultPart = handleNumber(part, "М", sCase); // Миллион - миллион миллион алых роз )
                    mergedResult.append(resultPart).append(" ");

                    if (powerOfTen.equals(lastMillion)) {
                        String resultFull = handleNumber(nSum, sGender, sCase);
                        mergedResult.append(resultFull).append(" ");
                    }
                } else {                              // миллиарды------------------------------------------------------
                    Long part = nSum / 1000000000;
                    String resultPart = handleNumber(part, "М", sCase); //  Миллиард - мужской род
                    mergedResult.append(resultPart).append(" ");

                    if (powerOfTen.equals(lastBillion)) {
                        String resultFull = handleNumber(nSum, sGender, sCase);
                        mergedResult.append(resultFull).append(" ");
                    }
                }
            }
        }
        return mergedResult.toString();
    }

    // Вспомогательная функция - Находит последний значащий разряд в заданном диапазоне разрядов. Нужна чтобы знатб после
    // какого разряда ставить слова "тысяча" "миллион" "миллиард"
    private static Long findLastRelevantDigit(List<Map.Entry<Long, Integer>> digits, Long fromDigit, Long toDigit) throws StringMakingException {
        if (digits == null || digits.isEmpty() || fromDigit <= 0 || toDigit <= 0 || fromDigit > toDigit) {
            throw new StringMakingException("в метод \"findLastRelevantDigit\" переданы некорректные данные");
        }

        Long lastRelevant = null;

        // Проходим по списку разрядов в обратном порядке (от наибольших к наименьшим)
        for (int i = 0; i < digits.size(); i++) {
            Map.Entry<Long, Integer> entry = digits.get(i);
            Long digitPlace = entry.getKey();

            // Проверяем, что разряд находится в заданном диапазоне
            if (digitPlace >= fromDigit && digitPlace <= toDigit) {
                // Проверяем, что цифра в разряде не равна нулю
                if (entry.getValue() != 0) {
                    lastRelevant = digitPlace; // Нашли значащий разряд
                }
            }
        }
        return lastRelevant;
    }
}
