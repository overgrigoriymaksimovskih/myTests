package ru.chelinvest_01.utils.digitHandlers.impl;

import ru.chelinvest_01.utils.digitHandlers.DigitHandler;
import ru.chelinvest_01.utils.digitHandlers.SimpleNumberEnder;
import ru.chelinvest_01.utils.CheckersOfSignature.RuCase;

public final class bDigitHandlerImpl implements DigitHandler {
    private static final String[] fromFiveToNineTemplates = {"пят", "шест", "сем", "восем", "девят"};

    public bDigitHandlerImpl() {
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
        SimpleNumberEnder simpleEnder = new SimpleNumberEnderImpl();
        return simpleEnder.addSimpleNumberEnding(template, sCase);
    }
}
