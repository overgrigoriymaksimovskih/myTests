package ru.chelinvest_01.utils.digitHandlers.impl;

import ru.chelinvest_01.utils.digitHandlers.DigitHandler;
import ru.chelinvest_01.utils.CheckersOfSignature.RuCase;

public final class eDigitHandlerImpl implements DigitHandler {

    public eDigitHandlerImpl() {
    }
    @Override
    //40.90.100
    public String process(long num, String sGender, String sCase) {
        if (RuCase.I.equals(sCase) || RuCase.V.equals(sCase)) {

            if (num >= 40 && num < 50) return "сорок";
            if (num >= 90 && num < 100) return "девяносто";

            return "сто";
        }
        if (num >= 40 && num < 50) return "сорока";
        if (num >= 90 && num < 100) return "девяноста";

        return "ста";
    }
}
