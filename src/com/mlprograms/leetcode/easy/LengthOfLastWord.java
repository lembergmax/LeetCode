package com.mlprograms.leetcode.easy;

// https://leetcode.com/problems/length-of-last-word/
public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        final String[] split = s.split(" ");

        for (int i = split.length - 1; i >= 0; i--) {
            if (" ".equals(split[i])) {
                continue;
            }

            return split[i].length();
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }

}
