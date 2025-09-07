package ru.chelinvest.Utils;

/**
 * Предназначен для работы с классами чисел: тысячи, миллионы, миллиарды
 */
public final class NumberClasses {

    private static final String[] classTemplates = {"миллион", "миллиард"};

    /**
     * Возвращает строковое представление класса числа
     * @param numClass 1 - тысяча, 2 - миллион, 3 - миллиард.<br>
     *                 В других случая пустая строка.
     *
     * @param sCase падеж. Перечислены в классе {@link RuCase}.
     *
     * @param form номер количественной формы:<br>
     *             1 - для одного(ой)<br>
     *             2 - от двух до четырёх<br>
     *             3 - во всех остальных случаях<br>
     */
    public String numberClassToStr(int numClass, String sCase, int form) {

        if (1 == numClass)
            return thousandToStr(sCase, form);

        if (2 == numClass || 3 == numClass)
            return millionAndBillionToStr(numClass, sCase, form);

        return "";
    }

    private String thousandToStr(String sCase, int form) {

        if (1 == form) {
            if (RuCase.I.equals(sCase)) return "тысяча";
            if (RuCase.R.equals(sCase)) return "тысячи";
            if (RuCase.V.equals(sCase)) return "тысячу";
            if (RuCase.T.equals(sCase)) return "тысячей";

            return "тысяче";
        }

        if (2 == form) {
            if (RuCase.R.equals(sCase)) return "тысяч";
            if (RuCase.D.equals(sCase)) return "тысячам";
            if (RuCase.T.equals(sCase)) return "тысячами";
            if (RuCase.P.equals(sCase)) return "тысячах";

            return "тысячи";
        }

        if (RuCase.D.equals(sCase)) return "тысячам";
        if (RuCase.T.equals(sCase)) return "тысячами";
        if (RuCase.P.equals(sCase)) return "тысячах";

        return "тысяч";
    }

    private String millionAndBillionToStr(int numClass, String sCase, int form) {

        String template = classTemplates[numClass - 2];

        if (1 == form) {
            if (RuCase.R.equals(sCase)) return template + "а";
            if (RuCase.D.equals(sCase)) return template + "у";
            if (RuCase.T.equals(sCase)) return template + "ом";
            if (RuCase.P.equals(sCase)) return template + "е";

            return template;
        }

        if (2 == form) {
            if (RuCase.R.equals(sCase)) return template + "ов";
            if (RuCase.D.equals(sCase)) return template + "ам";
            if (RuCase.T.equals(sCase)) return template + "ами";
            if (RuCase.P.equals(sCase)) return template + "ах";

            return template + "а";
        }

        if (RuCase.D.equals(sCase)) return template + "ам";
        if (RuCase.T.equals(sCase)) return template + "ами";
        if (RuCase.P.equals(sCase)) return template + "ах";

        return template + "ов";

    }
}
