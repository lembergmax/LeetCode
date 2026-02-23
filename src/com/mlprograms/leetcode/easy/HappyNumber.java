package com.mlprograms.leetcode.easy;

import java.util.HashSet;

// https://leetcode.com/problems/happy-number/
public class HappyNumber {

    public static boolean isHappy(int n) {
        final HashSet<Integer> seenNumbers = new HashSet<>();

        while (n != 1 && !seenNumbers.contains(n)) {
            seenNumbers.add(n);

            int sum = 0;
            while (n != 0) {
                final int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }

            n = sum;
        }

        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));        // true
        System.out.println(isHappy(2));         // false
    }

}
