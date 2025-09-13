package com.mlprograms.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {

    private static HashMap<Character, String> getCharacterMap(HashMap<Character, String> characterMap) {
        characterMap.put('2', "abc");
        characterMap.put('3', "def");
        characterMap.put('4', "ghi");
        characterMap.put('5', "jkl");
        characterMap.put('6', "mno");
        characterMap.put('7', "pqrs");
        characterMap.put('8', "tuv");
        characterMap.put('9', "wxyz");
        return characterMap;
    }

    private static void allCombinations(List<String> result, HashMap<Character, String> characterMap, String digits, StringBuilder stringBuilder, int digitsIndex) {
        if (digitsIndex >= digits.length()) {
            if (!digits.isEmpty()) {
                result.add(stringBuilder.toString());
            }

            return;
        }

        String characterMapElementString = characterMap.get(digits.charAt(digitsIndex));
        for (int i = characterMapElementString.length(); i > 0; i--) {
            stringBuilder.append(characterMapElementString.charAt(i - 1));
            allCombinations(result, characterMap, digits, stringBuilder, digitsIndex + 1);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        allCombinations(result, getCharacterMap(new HashMap<>()), digits, new StringBuilder(), 0);
        return result;
    }

    public static void main(String[] args) {
        // order isn't important
        System.out.println(letterCombinations("23"));   // ["ad","ae","af","bd","be","bf","cd","ce","cf"]
        System.out.println(letterCombinations(""));     // []
        System.out.println(letterCombinations("2"));    // ["a","b","c"]
    }

}
