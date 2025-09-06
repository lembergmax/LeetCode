package com.mlprograms.leetcode.medium;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        int longestSubstring = 0;

        for (int i = 0; i < s.length(); i++) {
            int tempLongestSubstring = 0;
            String foundCharacters = "";

            for (int j = i; j < s.length(); j++) {
                String currentCharacter = String.valueOf(s.charAt(j));

                if (!foundCharacters.contains(currentCharacter)) {
                    foundCharacters += currentCharacter;
                    tempLongestSubstring++;
                } else {
                    break;
                }
            }

            longestSubstring = Math.max(longestSubstring, tempLongestSubstring);
        }

        return longestSubstring;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring(" "));
        System.out.println(lengthOfLongestSubstring("jbpnbwwd"));
    }

}
