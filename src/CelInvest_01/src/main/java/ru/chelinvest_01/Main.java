package ru.chelinvest_01;

import ru.chelinvest_01.Exceptions.IncorrectValueException;
import ru.chelinvest_01.service.NumberToTextConverter;
import ru.chelinvest_01.service.impl.NumberToTextConverterImpl;

public class Main {

//    private static NumberToTextConverter numberToTextConverter = null;
    public static void main(String[] args) throws IncorrectValueException {
        NumberToTextConverter numberToTextConverter = new NumberToTextConverterImpl();
        System.out.println(numberToTextConverter.numberToWords(111111111131L, "Ж", "Т"));

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
