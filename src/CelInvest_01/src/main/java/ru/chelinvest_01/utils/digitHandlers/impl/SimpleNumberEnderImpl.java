package ru.chelinvest_01.utils.digitHandlers.impl;

import ru.chelinvest_01.utils.digitHandlers.SimpleNumberEnder;
import ru.chelinvest_01.utils.CheckersOfSignature.RuCase;

public final class SimpleNumberEnderImpl implements SimpleNumberEnder {
    private static final String[] simpleNumberEndings = {"ь", "ью", "и"};

    public SimpleNumberEnderImpl() {
    }

    public String addSimpleNumberEnding(String template, String sCase) {

        if (RuCase.I.equals(sCase) || RuCase.V.equals(sCase)) {
            return template + simpleNumberEndings[0];
        }

        if (RuCase.T.equals(sCase)) {
            return template + simpleNumberEndings[1];
        }

        return template + simpleNumberEndings[2];
    }
}
