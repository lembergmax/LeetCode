package com.mlprograms.leetcode.easy;

import java.util.ArrayList;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        ArrayList<String> prefixList = new ArrayList<>();
        String firstWord = strs[0];

        for (int i = 1; i <= firstWord.length(); i++) {
            prefixList.add(firstWord.substring(0, i));
        }

        for (String string : strs) {
            if (prefixList.isEmpty()) {
                break;
            }

            while (!string.startsWith(prefixList.getLast())) {
                prefixList.removeLast();

                if (prefixList.isEmpty()) {
                    break;
                }
            }
        }

        return prefixList.isEmpty() ? "" : prefixList.getLast();
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }

}
