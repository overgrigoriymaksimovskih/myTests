package ru.chelinvest_01.utils.digitHandlers.impl;

import ru.chelinvest_01.utils.digitHandlers.DigitHandler;
import ru.chelinvest_01.utils.signatureCheckers.RuCase;

public final class B implements DigitHandler {
    private static final String[] fromFiveToNineTemplates = {"пят", "шест", "сем", "восем", "девят"};
    private static final String[] simpleNumberEndings = {"ь", "ью", "и"};
    public B() {
    }
    @Override
    //5-9
    public String process(long num, String sGender, String sCase) {
        String template = fromFiveToNineTemplates[(int) (num - fromFiveToNineTemplates.length)];


        if (8 == num
                && !RuCase.I.equals(sCase)
                && !RuCase.V.equals(sCase)
                && !RuCase.T.equals(sCase)
        ) {
            return "восьми";
        }

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
