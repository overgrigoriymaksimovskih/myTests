package ru.chelinvest_01.utils.digitHandlers.impl;

import ru.chelinvest_01.utils.digitHandlers.DigitHandler;
import ru.chelinvest_01.utils.signatureCheckers.RuCase;

public final class D implements DigitHandler {
    private static final String[] twentyAndThirtyTemplates = {"двадцат", "тридцат"};
    private static final String[] simpleNumberEndings = {"ь", "ью", "и"};
    public D() {
    }
    @Override
    //20-30
    public String process(long num, String sGender, String sCase) {
        String template = twentyAndThirtyTemplates[(int) (num / 10 - twentyAndThirtyTemplates.length)];

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
