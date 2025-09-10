package com.mlprograms.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefixAndre {

    public static String longestCommonPrefixMax(String[] strs) {
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

    public static String longestCommonPrefixAndre(String[] strs) {
        String firstWord = strs[strs.length - 1];
        List<String> prefixList = new ArrayList<>(firstWord.length());

        // i = firstWord.length() - 1; i >= 0: i--
        for (int i = firstWord.length(); i >= 0; i--) {
            prefixList.add(firstWord.substring(0, i));
        }

        // erstes Wort skippen
        // for-each ist langsamer als
        for (int i = strs.length - 1; i >= 0; i--) {
            if (prefixList.isEmpty()) {
                break;
            }

            while (!prefixList.getFirst().startsWith(strs[i])) {
                prefixList.removeFirst();

                if (prefixList.isEmpty()) {
                    break;
                }
            }
        }

        return prefixList.isEmpty() ? "" : prefixList.getFirst();
    }

    public static void main(String[] args) {
        long start;
        long end;

        start = System.currentTimeMillis();
        for (int i = 0; i < 15000000; i++) {
            longestCommonPrefixMax(new String[]{"flight", "flow", "flower"});
            longestCommonPrefixMax(new String[]{"car", "racecar", "dog"});
        }
        end = System.currentTimeMillis();
        System.out.println("Dauer (Max): " + (end - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < 15000000; i++) {
            longestCommonPrefixAndre(new String[]{"flight", "flow", "flower"});
            longestCommonPrefixAndre(new String[]{"car", "racecar", "dog"});
        }
        end = System.currentTimeMillis();
        System.out.println("Dauer (Andre): " + (end - start) + " ms");


    }

}
