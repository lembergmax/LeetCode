package com.mlprograms.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

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

    public static String longestCommonPrefixImproved(String[] strs) {
        String firstWord = strs[strs.length - 1];
        int length = firstWord.length();
        List<String> prefixList = new ArrayList<>(length);

        for (int i = 0; i < length; i++) {
            prefixList.add(firstWord.substring(0, i));
        }

        for (int i = 1; i < strs.length; i++) {
            if (prefixList.isEmpty()) {
                break;
            }

            while (!strs[i].startsWith(prefixList.get(0))) {
                prefixList.removeLast();

                if (prefixList.isEmpty()) {
                    break;
                }
            }
        }

        return prefixList.isEmpty() ? "" : prefixList.getFirst();
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));  // fl
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));     // ""
    }

}
