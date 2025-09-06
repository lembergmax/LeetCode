package com.mlprograms.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        List<Integer> newDigits = new ArrayList<>();
        int carry = 1;

        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            newDigits.addFirst(sum % 10);
            carry = sum / 10;
        }

        if (carry > 0) {
            newDigits.addFirst(carry);
        }

        return newDigits.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3})));                       // [1, 2, 4]
        System.out.println(Arrays.toString(plusOne(new int[]{4, 3, 2, 1})));                    // [4, 3, 2, 2]
        System.out.println(Arrays.toString(plusOne(new int[]{9})));                             // [1, 0]
        System.out.println(Arrays.toString(plusOne(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0})));  // [9, 8, 7, 6, 5, 4, 3, 2, 1, 1]
    }

}
