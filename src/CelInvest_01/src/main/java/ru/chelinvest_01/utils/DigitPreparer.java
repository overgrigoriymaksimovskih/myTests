package ru.chelinvest_01.utils;

import java.util.ArrayList;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DigitPreparer {
    public static List<Map.Entry<Long, Integer>> convertNumberToArray(long number) {
        if (number < 1 || number > 999999999999L) {
            throw new IllegalArgumentException("Number must be between 1 and 999999999999");
        }

        List<Map.Entry<Long, Integer>> result = new ArrayList<>();
        long powerOfTen = 1; // Starting from the ones place
        long currentPowerOfTen = 1;

        // Find the highest power of ten needed (up to 10^11 for 999,999,999,999)
        long highestPowerOfTen = 1;
        while (highestPowerOfTen <= 99999999999L) { // Up to 10^11
            highestPowerOfTen *= 10;
        }


        // Iterate through all possible powers of ten, from highest to lowest
        while (highestPowerOfTen >= 1) {
            int digit = (int) (number / highestPowerOfTen); // Get the digit for the current power of ten.
            result.add(new AbstractMap.SimpleEntry<>(highestPowerOfTen, digit));
            number %= highestPowerOfTen; // Remove the digit to find the remainder.
            highestPowerOfTen /= 10;    // Move to the next lower power of ten.
        }

        // Optional: Print the calculated values to verify
        for (Map.Entry<Long, Integer> a : result) {
            System.out.println(a.getKey() * a.getValue());
        }

        return result;
    }
}
