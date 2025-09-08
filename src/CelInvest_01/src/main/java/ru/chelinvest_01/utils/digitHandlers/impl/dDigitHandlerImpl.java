package ru.chelinvest_01.utils.digitHandlers.impl;

import ru.chelinvest_01.utils.digitHandlers.DigitHandler;
import ru.chelinvest_01.utils.digitHandlers.SimpleNumberEnder;

public final class dDigitHandlerImpl implements DigitHandler {
    private static final String[] twentyAndThirtyTemplates = {"двадцат", "тридцат"};

    public dDigitHandlerImpl() {
    }
    @Override
    //20-30
    public String process(long num, String sGender, String sCase) {
        String template = twentyAndThirtyTemplates[(int) (num / 10 - twentyAndThirtyTemplates.length)];
        SimpleNumberEnder simpleEnder = new SimpleNumberEnderImpl();
        return simpleEnder.addSimpleNumberEnding(template, sCase);
    }
}
