package ru.chelinvest_01.utils.digitHandlers.impl;

import ru.chelinvest_01.utils.digitHandlers.DigitHandler;
import ru.chelinvest_01.utils.signatureCheckers.RuCase;

public final class F implements DigitHandler  {
    private static final String[] fromFiveToNineTemplates = {"пят", "шест", "сем", "восем", "девят"};
    private static final String[] fromTenToNineteenTemplates = {
            "десят", "одиннадцат", "двенадцат", "тринадцат", "четырнадцат",
            "пятнадцат", "шестнадцат", "семнадцат", "восемнадцат", "девятнадцат"
    };
    private static final String[] twentyAndThirtyTemplates = {"двадцат", "тридцат"};
    private static final String[] simpleNumberEndings = {"ь", "ью", "и"};
    public F() {
    }
    @Override
    //50-90
    public String process(long num, String sGender, String sCase) {
        if (RuCase.I.equals(sCase) || RuCase.V.equals(sCase)) {
            return fromFiveToNineToStr((int) (num / 10), sCase) + fromTenToNineteenTemplates[0];
        }

        return fromFiveToNineToStr((int) (num / 10), sCase) + fromTenToNineteenToStr(10, sCase);
    }

    private String fromFiveToNineToStr(int num, String sCase) {

        String template = fromFiveToNineTemplates[num - 5];

        if (8 == num
                && !RuCase.I.equals(sCase)
                && !RuCase.V.equals(sCase)
                && !RuCase.T.equals(sCase)
        ) {
            return "восьми";
        }

        return addSimpleNumberEnding(template, sCase);
    }
    private String fromTenToNineteenToStr(int num, String sCase) {

        String template = fromTenToNineteenTemplates[num - 10];

        return addSimpleNumberEnding(template, sCase);
    }

    private String addSimpleNumberEnding(String template, String sCase) {

        if (RuCase.I.equals(sCase) || RuCase.V.equals(sCase)) {
            return template + simpleNumberEndings[0];
        }

        if (RuCase.T.equals(sCase)) {
            return template + simpleNumberEndings[1];
        }

        return template + simpleNumberEndings[2];
    }
}
