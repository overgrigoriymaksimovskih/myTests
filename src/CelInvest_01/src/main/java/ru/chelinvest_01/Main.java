package ru.chelinvest_01;

import ru.chelinvest_01.exceptions.IncorrectValueException;
import ru.chelinvest_01.service.NumberToTextConverter;
import ru.chelinvest_01.service.impl.NumberToTextConverterImpl;

public class Main {

//    private static NumberToTextConverter numberToTextConverter = null;
    public static void main(String[] args) throws IncorrectValueException {
        NumberToTextConverter numberToTextConverter = new NumberToTextConverterImpl();
//        for (int i = 0; i < 999999999999L; i++) {
//            System.out.println(numberToTextConverter.numberToWords((long) i, "М", "И"));
//        }

        long nsum = 121111;
//        System.out.println(numberToTextConverter.numberToWords(nsum, "М", "И"));
//        System.out.println(numberToTextConverter.numberToWords(nsum, "Ж", "И"));
//        System.out.println(numberToTextConverter.numberToWords(nsum, "С", "И"));
//        System.out.println(numberToTextConverter.numberToWords(nsum, "М", "Р"));
//        System.out.println(numberToTextConverter.numberToWords(nsum, "Ж", "Р"));
//        System.out.println(numberToTextConverter.numberToWords(nsum, "С", "Р"));
//        System.out.println(numberToTextConverter.numberToWords(nsum, "М", "Д"));
//        System.out.println(numberToTextConverter.numberToWords(nsum, "Ж", "Д"));
//        System.out.println(numberToTextConverter.numberToWords(nsum, "С", "Д"));
//        System.out.println(numberToTextConverter.numberToWords(nsum, "М", "В"));
//        System.out.println(numberToTextConverter.numberToWords(nsum, "Ж", "В"));
//        System.out.println(numberToTextConverter.numberToWords(nsum, "С", "В"));
//        System.out.println(numberToTextConverter.numberToWords(nsum, "М", "Т"));
//        System.out.println(numberToTextConverter.numberToWords(nsum, "Ж", "Т"));
//        System.out.println(numberToTextConverter.numberToWords(nsum, "С", "Т"));
//        System.out.println(numberToTextConverter.numberToWords(nsum, "М", "П"));
//        System.out.println(numberToTextConverter.numberToWords(nsum, "Ж", "П"));
        System.out.println(numberToTextConverter.numberToWords(nsum, "С", "П"));

//        if (args.length < 3) {
//            System.err.println("Неверные параметры были переданы в метод main");
//            return;
//        }
//
//
//        try {
//            numberToTextConverter = new NumberToTextConverterImpl();
//        } catch (Exception e) {
//            System.err.println("Ошибка при создании сервиса конвертации числа в строку");
//        }
//
//        try {
//            Long number = Long.parseLong(args[0]);
//            String result = numberToTextConverter.numberToWords(number, args[1], args[2]);
//
//            System.out.println(result);
//
//        } catch (IncorrectValueException e) {
//            System.err.println(e.getMessage());
//
//        } catch (NumberFormatException e) {
//            System.err.println("Не удалось распознать число: " + args[0]);
//        }
    }
}
