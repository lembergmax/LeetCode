package com.mlprograms.leetcode.medium;

import java.util.Arrays;

// https://leetcode.com/problems/largest-number/
public class LargestNumber {

    public static String largestNumber(int[] nums) {
        String[] stringNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            stringNums[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(stringNums, (a, b) -> (b + a).compareTo(a + b));

        if (stringNums[0].equals("0")) {
            return "0";
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (String string : stringNums) {
            stringBuilder.append(string);
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(largestNumber(new int[]{10, 2}));            // 210
        System.out.println(largestNumber(new int[]{3, 30, 34, 5, 9}));  // 9534330
    }

}
