package com.mlprograms.leetcode.medium;

public class StringToIntegerAtoi {

    public static int myAtoi(String s) {
        int startingIndex = 0;
        int endIndex = 0;
        char currentCharacter;
        for (int i = 0; i < s.length() - 1; i++) {
            currentCharacter = s.charAt(i);
            if (!Character.isDigit(currentCharacter) && currentCharacter != '-' && currentCharacter != '+') {
                startingIndex = i + 1;
            }
        }
        for (int i = startingIndex; i < s.length(); i++) {
            currentCharacter = s.charAt(i);
            if (!Character.isDigit(currentCharacter)) {
                break;
            }
            endIndex = i + 1;
        }

        System.out.println(startingIndex + ", " + endIndex);
        System.out.println(s.substring(startingIndex, endIndex));
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("42"));
        System.out.println(myAtoi("   -042"));
        System.out.println(myAtoi("1337c0d3"));
        System.out.println(myAtoi("0-1"));
        System.out.println(myAtoi("words and 987"));
    }

}
