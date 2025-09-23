package com.mlprograms.leetcode.easy;

// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
public class FindTheIndexOfTheFirstOccurrenceInAString {

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));     // 0
        System.out.println(strStr("leetcode", "leeto"));    // -1
        System.out.println(strStr("hello", "ll"));          // 2
        System.out.println(strStr("mississippi", "issip")); // 4
    }

}
