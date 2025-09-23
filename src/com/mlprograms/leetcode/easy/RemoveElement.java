package com.mlprograms.leetcode.easy;

// https://leetcode.com/problems/remove-element/
public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums;

        nums = new int[]{3, 2, 2, 3};
        System.out.println(removeElement(nums, 3)); // 2

        nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(removeElement(nums, 2)); // 5
    }

}
