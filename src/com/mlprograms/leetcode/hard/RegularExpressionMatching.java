package com.mlprograms.leetcode.hard;

public class RegularExpressionMatching {

    public static boolean isMatch(String s, String p) {
        int indexS = 0;
        int indexP = 0;
        char currentCharacterS = p.charAt(indexS);
        char currentCharacterP = p.charAt(indexP);
        // Iteriere über jeden Buchstaben in s

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isMatch("aa", "a"));
        System.out.println(isMatch("aa", "a*"));
        System.out.println(isMatch("ab", ".*"));
    }

}
