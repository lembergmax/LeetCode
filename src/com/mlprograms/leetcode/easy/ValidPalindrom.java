package com.mlprograms.leetcode.easy;

public class ValidPalindrom {

    public static boolean isPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char character : s.toCharArray()) {
            if (Character.isAlphabetic(character) || Character.isDigit(character)) {
                stringBuilder.append(String.valueOf(character).toLowerCase());
            }
        }
        String sbString = stringBuilder.toString();

        int pointerLeft = 0;
        int pointerRight = sbString.length() - 1;
        while (pointerLeft <= pointerRight) {
            if (sbString.charAt(pointerLeft) != sbString.charAt(pointerRight)) {
                return false;
            }

            pointerLeft++;
            pointerRight--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
    }

}
