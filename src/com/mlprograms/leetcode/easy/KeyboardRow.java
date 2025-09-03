package com.mlprograms.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeyboardRow {

    private static final String row1 = "qwertyuiop";
    private static final String row2 = "asdfghjkl";
    private static final String row3 = "zxcvbnm";

    public static String[] findWords(String[] words) {
        List<String> rows = Arrays.asList(row1, row2, row3);
        List<String> wordsWithinRow = new ArrayList<>(List.of());
        String currentWordInLowercase;

        for (String row : rows) {
            for (String word : words) {
                currentWordInLowercase = word.toLowerCase();
                for (char character : word.toCharArray()) {
                    String characterAsStringInLowercase = String.valueOf(character).toLowerCase();
                    if (row.contains(characterAsStringInLowercase)) {
                        currentWordInLowercase = currentWordInLowercase.replace(characterAsStringInLowercase, "");
                    }
                }
                if (currentWordInLowercase.isBlank() && !wordsWithinRow.contains(currentWordInLowercase)) {
                    wordsWithinRow.add(word);
                }
            }
        }

        return wordsWithinRow.toArray(new String[0]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"})));    // [Alaska, Dad]
        System.out.println(Arrays.toString(findWords(new String[]{"omk"})));                                // []
        System.out.println(Arrays.toString(findWords(new String[]{"adsdf", "sfd"})));                       // [adsdf, adsdf]
    }

}
