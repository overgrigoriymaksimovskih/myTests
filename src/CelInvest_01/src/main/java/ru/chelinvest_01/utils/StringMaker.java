package ru.chelinvest_01.utils;

import java.util.List;
import java.util.Map;

import static ru.chelinvest_01.utils.HandlersDispatcher.handleNumber;

public class StringMaker {
    public static void processNumberList(List<Map.Entry<Long, Integer>> numberList, String sGender, String sCase) {
        for (Map.Entry<Long, Integer> entry : numberList) {
            Long powerOfTen = entry.getKey();
            Integer digit = entry.getValue();

            if (digit != 0) {
                Long nSum = powerOfTen * digit;

                if (nSum < 1000) {
                    String result = handleNumber(nSum, sGender, sCase);
                    System.out.println(result);
                } else if (nSum < 1000000) { // тысячи
                    Long part = nSum / 1000;
                    String resultPart = handleNumber(part, "Ж", sCase); // Тысяча - женский род, множественное число (важно для согласования)
                    System.out.println(resultPart);
                    String resultFull = handleNumber(nSum, sGender, sCase);
                    System.out.println(resultFull);

                } else if (nSum < 1000000000L) { // миллионы
                    Long part = nSum / 1000000;
                    String resultPart = handleNumber(part, "М", sCase); // Миллион - мужской род, множ. число (для согласования)
                    System.out.println(resultPart);
                    String resultFull = handleNumber(nSum, sGender, sCase);
                    System.out.println(resultFull);
                } else { // миллиарды
                    Long part = nSum / 1000000000;
                    String resultPart = handleNumber(part, "М", sCase); //  Миллиард - мужской род, множ. число (для согласования)
                    System.out.println(resultPart);
                    String resultFull = handleNumber(nSum, sGender, sCase);
                    System.out.println(resultFull);
                }
            }
        }
    }
}
