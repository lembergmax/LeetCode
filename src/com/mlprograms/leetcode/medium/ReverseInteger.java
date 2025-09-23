package com.mlprograms.leetcode.medium;

// https://leetcode.com/problems/reverse-integer/
public class ReverseInteger {

    public static int reverse(int x) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(x));
        String reversedX = stringBuilder.reverse().toString();
        if (reversedX.contains("-")) {
            reversedX = "-" + reversedX.replace("-", "");
        }

        try {
            return Integer.parseInt(reversedX);
        } catch (Exception exception) {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));   // 321
        System.out.println(reverse(-123));  // -321
        System.out.println(reverse(120));   // 21
    }

}
