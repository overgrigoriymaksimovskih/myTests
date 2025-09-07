package ru.chelinvest_01.utils.digitHandlers.impl;

import ru.chelinvest_01.utils.digitHandlers.DigitHandler;
import ru.chelinvest_01.utils.signatureCheckers.RuCase;

public final class E implements DigitHandler {

    public E() {
    }
    //40.90.100
    @Override
    public String process(long num, String sGender, String sCase) {
        if (RuCase.I.equals(sCase) || RuCase.V.equals(sCase)) {

            //было
//            if (40 == num) return "сорок";
//            if (90 == num) return "девяносто";

            if (num >= 40 && num < 50) return "сорок";
            if (num >= 90 && num < 100) return "девяносто";

            return "сто";

        }

        //было
        //if (40 == num) return "сорока";
        //if (90 == num) return "девяноста";
        if (num >= 40 && num < 50) return "сорока";
        if (num >= 90 && num < 100) return "девяноста";

        return "ста";
    }


}
