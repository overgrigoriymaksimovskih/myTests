package ru.chelinvest_01.utils.CheckersOfSignature;

import java.util.Arrays;

public final class Sum {
    private Sum() {
    }

    public static boolean iisValidNumber(Long nSum) {
        return 0 <= nSum && nSum <= 999_999_999_999L;
    }
}
