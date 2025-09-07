package ru.chelinvest.Utils;

import java.util.Arrays;

public final class Gender {
    public static final String MALE = "М";
    public static final String FEMALE = "Ж";
    public static final String MIDDLE = "С";

    private static final String[] genders = {MALE, FEMALE, MIDDLE};

    private Gender() {}

    public static boolean isGender(String str) {

        return Arrays.asList(genders).contains(str);
    }

    public static boolean isNotGender(String str) {

        return !isGender(str);
    }
}
