package com.mlprograms.leetcode.hard;

// https://leetcode.com/problems/regular-expression-matching/
public class RegularExpressionMatching {

    public static boolean isMatch(String s, String p) {
        int textLength = s.length();
        int patternLength = p.length();

        boolean[][] matches = new boolean[textLength + 1][patternLength + 1];
        matches[0][0] = true;

        for (int j = 2; j <= patternLength; j++) {
            if (p.charAt(j - 1) == '*') {
                matches[0][j] = matches[0][j - 2];
            }
        }

        for (int i = 1; i <= textLength; i++) {
            for (int j = 1; j <= patternLength; j++) {
                char currentPatternChar = p.charAt(j - 1);

                if (currentPatternChar == '.' || currentPatternChar == s.charAt(i - 1)) {
                    matches[i][j] = matches[i - 1][j - 1];
                } else if (currentPatternChar == '*') {
                    matches[i][j] = matches[i][j - 2];

                    char precedingPatternChar = p.charAt(j - 2);
                    if (precedingPatternChar == '.' || precedingPatternChar == s.charAt(i - 1)) {
                        matches[i][j] = matches[i][j] || matches[i - 1][j];
                    }
                }
            }
        }

        return matches[textLength][patternLength];
    }

    public static void main(String[] args) {
        System.out.println(isMatch("aa", "a"));     // false
        System.out.println(isMatch("aa", "a*"));    // true
        System.out.println(isMatch("ab", ".*"));    // true
    }

}
