package ru.chelinvest;

import ru.chelinvest.Exceptions.IncorrectValueException;
import ru.chelinvest.Service.Impl.NumberToTextConverterImpl;
import ru.chelinvest.Service.NumberToTextConverter;

public class Main {
    public static void main(String[] args) throws IncorrectValueException {
        NumberToTextConverter numberToTextConverter = new NumberToTextConverterImpl();
//        System.out.println(numberToTextConverter.numberToWords(0L, "М", "И"));// ноль
//        System.out.println(numberToTextConverter.numberToWords(0L, "М", "Р"));// ноля
//        System.out.println(numberToTextConverter.numberToWords(0L, "М", "Д"));// нолю
//        System.out.println(numberToTextConverter.numberToWords(0L, "М", "В"));// ноль
//        System.out.println(numberToTextConverter.numberToWords(0L, "М", "Т"));// нолём
//        System.out.println(numberToTextConverter.numberToWords(0L, "М", "П"));// о ноле
//        System.out.println(numberToTextConverter.numberToWords(1234567L, "М", "И"));// // один миллион двести тридцать четыре тысячи пятьсот шестьдесят семь
//        System.out.println(numberToTextConverter.numberToWords(21L, "Ж", "Р"));// двадцати одной
//        System.out.println(numberToTextConverter.numberToWords(1000L, "Ж", "И"));// одна тысяча
//        System.out.println(numberToTextConverter.numberToWords(2000L, "Ж", "Р"));// двух тысяч**
//        System.out.println(numberToTextConverter.numberToWords(3000L, "Ж", "Д"));// трём тысячам**
        System.out.println(numberToTextConverter.numberToWords(222222222L, "Ж", "Т"));// пятью
//        System.out.println(numberToTextConverter.numberToWords(1234567890L, "М", "В"));// один миллиард двести тридцать четыре миллиона пятьсот шестьдесят семь тысяч восемьсот девяносто
//        System.out.println(numberToTextConverter.numberToWords(999999999L, "Ж", "П"));// о девятистах девяноста девяти миллионах девятистах девяноста девяти тысячах девятистах девяноста девяти*
    }
}
