package ru.chelinvest_01.utils.digitHandlers.impl;

import ru.chelinvest_01.utils.digitHandlers.DigitHandler;
import ru.chelinvest_01.utils.signatureCheckers.RuCase;

public final class C implements DigitHandler {
    private static final String[] fromTenToNineteenTemplates = {
            "десят", "одиннадцат", "двенадцат", "тринадцат", "четырнадцат",
            "пятнадцат", "шестнадцат", "семнадцат", "восемнадцат", "девятнадцат"
    };
    private static final String[] simpleNumberEndings = {"ь", "ью", "и"};
    public C() {
    }
    @Override
    // 10 - 19
    public String process(long num, String sGender, String sCase) {
        String template = fromTenToNineteenTemplates[(int) (num - fromTenToNineteenTemplates.length)];
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
