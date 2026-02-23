package com.mlprograms.leetcode.easy;

import java.util.HashSet;

// https://leetcode.com/problems/happy-number/
public class HappyNumber {

    public static boolean isHappy(int n) {
        final HashSet<Integer> seenNumbers = new HashSet<>();

        while (n != 1 && !seenNumbers.contains(n)) {
            seenNumbers.add(n);
            n = getSquareOfSumOfDigits(n);
        }

        return n == 1;
    }

    private static int getSquareOfSumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            final int digit = n % 10;   // letzte Zahl holen
            sum += digit * digit;       // quadrieren und zur Summe hinzufügen
            n /= 10;                    // letztes Zeichen entfernen
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));        // true
        System.out.println(isHappy(2));         // false
    }

}
