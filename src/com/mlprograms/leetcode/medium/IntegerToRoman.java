package com.mlprograms.leetcode.medium;

import java.util.List;

public class IntegerToRoman {

    private static final List<String> ROMAN_NUMBER_CHARACTERS = List.of(
            "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
    );
    private static final List<Integer> NUMBERS = List.of(
            1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
    );

    public static String intToRoman(int num) {
        if (num <= 0 || num > 3999) {
            throw new IllegalArgumentException("Number must be between 1 and 3999");
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < NUMBERS.toArray().length; i++) {
            int numberAtI = NUMBERS.get(i);
            while (num >= numberAtI) {
                num -= numberAtI;
                stringBuilder.append(ROMAN_NUMBER_CHARACTERS.get(i));
            }
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(3749)); // Output: "MMMDCCXLIX"
        System.out.println(intToRoman(58));   // Output: "LVIII"
        System.out.println(intToRoman(1994)); // Output: "MCMXCIV
    }

}
