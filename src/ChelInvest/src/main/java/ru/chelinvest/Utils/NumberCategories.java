package ru.chelinvest.Utils;

/**
 * Предназначен для работы с разрядами чисел: сотни, десятки, единицы
 */
public final class NumberCategories {

    private static final String[] fromFiveToNineTemplates = {"пят", "шест", "сем", "восем", "девят"};
    private static final String[] fromTenToNineteenTemplates = {
            "десят", "одиннадцат", "двенадцат", "тринадцат", "четырнадцат",
            "пятнадцат", "шестнадцат", "семнадцат", "восемнадцат", "девятнадцат"
    };
    private static final String[] twentyAndThirtyTemplates = {"двадцат", "тридцат"};
    private static final String[] simpleNumberEndings = {"ь", "ью", "и"};

    /**
     * Преобразует число в строку.
     *
     * @param num     от 1 до 999 включительно.
     * @param sCase   падеж. Перечислены в классе {@link RuCase}
     * @param sGender род. Перечислены в классе {@link Gender}
     */
    public String numberToStr(int num, String sGender, String sCase) {

        int firstCategory = num % 10;
        int secondCategory = (num % 100) / 10;
        int thirdCategory = num / 100;

        StringBuilder result = new StringBuilder();

        if (0 < thirdCategory) {
            result.append(thirdCategoryHandler(thirdCategory * 100, sCase));
            result.append(" ");
        }

        if (1 < secondCategory) {
            result.append(secondCategoryHandler(secondCategory * 10, sCase));
            result.append(" ");
        }

        if (1 == secondCategory) {
            result.append(fromTenToNineteenToStr(firstCategory + 10, sCase));
        } else if (0 < firstCategory) {
            result.append(firstCategoryHandler(firstCategory, sGender, sCase));
        }

        return result.toString().trim();
    }

    // единицы 1 - 9
    private String firstCategoryHandler(int num, String sGender, String sCase) {

        if (1 == num) return oneToStr(sGender, sCase);
        if (2 == num) return twoToStr(sGender, sCase);
        if (3 == num) return threeToStr(sCase);
        if (4 == num) return fourToStr(sCase);

        return fromFiveToNineToStr(num, sCase);
    }

    // десятки 20 - 90
    private String secondCategoryHandler(int num, String sCase) {

        if (20 == num || 30 == num) return twentyAndThirtyToStr(num, sCase);
        if (40 == num || 90 == num) return fortyAndNinetyAndHundredToStr(num, sCase);

        return fromFiftyToEightyToStr(num, sCase);
    }

    // сотни 100 - 900
    private String thirdCategoryHandler(int num, String sCase) {

        if (100 == num) return fortyAndNinetyAndHundredToStr(100, sCase);

        return fromTwoToNineHundredToStr(num, sCase);
    }
    // 1
    private String oneToStr(String sGender, String sCase) {

        if (Gender.FEMALE.equals(sGender)) {

            if (RuCase.I.equals(sCase)) return "одна";
            if (RuCase.V.equals(sCase)) return "одну";

            return "одной";
        }

        if (RuCase.I.equals(sCase) || RuCase.V.equals(sCase)) {

            if (Gender.MALE.equals(sGender)) return "один";
            if (Gender.MIDDLE.equals(sGender)) return "одно";
        }

        if (RuCase.R.equals(sCase)) return "одного";
        if (RuCase.D.equals(sCase)) return "одному";
        if (RuCase.T.equals(sCase)) return "одним";
        if (RuCase.P.equals(sCase)) return "одном";


        throw new IllegalArgumentException();
    }
    // 2
    private String twoToStr(String sGender, String sCase) {

        if (RuCase.I.equals(sCase) || RuCase.V.equals(sCase)) {

            if (Gender.FEMALE.equals(sGender)) return "две";

            return "два";

        }

        if (RuCase.D.equals(sCase)) return "двум";
        if (RuCase.T.equals(sCase)) return "двумя";

        return "двух";
    }
    //3
    private String threeToStr(String sCase) {

        if (RuCase.R.equals(sCase) || RuCase.P.equals(sCase)) return "трёх";

        if (RuCase.D.equals(sCase)) return "трём";
        if (RuCase.T.equals(sCase)) return "тремя";

        return "три";
    }
    //4
    private String fourToStr(String sCase) {

        if (RuCase.R.equals(sCase) || RuCase.P.equals(sCase)) return "четырёх";

        if (RuCase.D.equals(sCase)) return "четырём";
        if (RuCase.T.equals(sCase)) return "четырьмя";

        return "четыре";
    }

    // 5 - 9
    private String fromFiveToNineToStr(int num, String sCase) {

        String template = fromFiveToNineTemplates[num - 5];

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

    // 10 - 19
    private String fromTenToNineteenToStr(int num, String sCase) {

        String template = fromTenToNineteenTemplates[num - 10];

        return addSimpleNumberEnding(template, sCase);
    }

    // 20, 30
    private String twentyAndThirtyToStr(int num, String sCase) {

        String template = twentyAndThirtyTemplates[num / 10 - 2];

        return addSimpleNumberEnding(template, sCase);
    }

    // 40, 90, 100
    private String fortyAndNinetyAndHundredToStr(int num, String sCase) {

        if (RuCase.I.equals(sCase) || RuCase.V.equals(sCase)) {

            if (40 == num) return "сорок";
            if (90 == num) return "девяносто";

            return "сто";

        }

        if (40 == num) return "сорока";
        if (90 == num) return "девяноста";

        return "ста";

    }

    // 50 - 80
    private String fromFiftyToEightyToStr(int num, String sCase) {

        if (RuCase.I.equals(sCase) || RuCase.V.equals(sCase)) {
            return fromFiveToNineToStr(num / 10, sCase) + fromTenToNineteenTemplates[0];
        }

        return fromFiveToNineToStr(num / 10, sCase) + fromTenToNineteenToStr(10, sCase);

    }

    // 200 - 900
    private String fromTwoToNineHundredToStr(int num, String sCase) {

        if (RuCase.I.equals(sCase) || RuCase.V.equals(sCase)) {
            if (200 == num) return "двести";
            if (300 == num) return "триста";
            if (400 == num) return "четыреста";
        }

        String template = firstCategoryHandler(num / 100, Gender.MALE, sCase);

        if (RuCase.D.equals(sCase)) return template + "стам";
        if (RuCase.T.equals(sCase)) return template + "стами";
        if (RuCase.P.equals(sCase)) return template + "стах";

        return template + "сот";
    }

}
