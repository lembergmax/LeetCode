package com.mlprograms.leetcode.easy;

// https://leetcode.com/problems/palindrome-number/
public class PalindromNumber {

    public static boolean isPalindrome(int x) {
        String stringX = String.valueOf(x);

        int pointerLeft = 0;
        int pointerRight = stringX.length() - 1;
        while(pointerLeft <= pointerRight) {
            if(stringX.charAt(pointerLeft) != stringX.charAt(pointerRight)) {
                return false;
            }

            pointerLeft++;
            pointerRight--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));  // Output: true
        System.out.println(isPalindrome(-121)); // Output: false
        System.out.println(isPalindrome(10));   // Output: false
    }

}
