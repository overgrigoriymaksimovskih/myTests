package ru.chelinvest_01.utils.digitHandlers.impl;

import ru.chelinvest_01.utils.digitHandlers.DigitHandler;
import ru.chelinvest_01.utils.signatureCheckers.RuCase;

public final class I  implements DigitHandler {
    private static final String classTemplate = "миллион";

    public I() {
    }
    @Override
    //1 000 000 - 999 999 999
    public String process(long num, String sGender, String sCase) {
//        System.out.println(num);
        StringBuilder result = new StringBuilder(classTemplate);

        if(num == 1000000){
            if (RuCase.R.equals(sCase)) {
                result.append("а");
            }
            if (RuCase.D.equals(sCase)) {
                result.append("у");
            }
            if (RuCase.T.equals(sCase)) {
                result.append("ом");
            }
            if (RuCase.P.equals(sCase)) {
                result.append("е");
            }
        }


        if (num == 2000000 || num == 3000000 || num == 4000000) {
            if (!RuCase.R.equals(sCase)
                    && !RuCase.D.equals(sCase)
                    && !RuCase.T.equals(sCase)
                    && !RuCase.P.equals(sCase)){
                result.append("а") ;
            }
            if (RuCase.R.equals(sCase)) {
                result.append("ов");
            }
            if (RuCase.D.equals(sCase)){
                result.append("ам");
            }
            if (RuCase.T.equals(sCase)){
                result.append("ами");
            }
            if (RuCase.P.equals(sCase)){
                result.append("ах");
            }


        }

        if ( num > 4000000) {
            if (!RuCase.D.equals(sCase)
                    && !RuCase.T.equals(sCase)
                    && !RuCase.P.equals(sCase)){
                result.append("ов");
            }
            if (RuCase.D.equals(sCase)) {
                result.append("ам");
            }
            if (RuCase.T.equals(sCase)) {
                result.append("ами");
            }
            if (RuCase.P.equals(sCase)) {
                result.append("ах");
            }
        }

        return result.toString();
    }
}
