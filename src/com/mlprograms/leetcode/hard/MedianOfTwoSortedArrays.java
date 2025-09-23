package com.mlprograms.leetcode.hard;

import java.util.Arrays;

// https://leetcode.com/problems/median-of-two-sorted-arrays/
public class MedianOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int lengthNums1 = nums1.length;
        int lengthNums2 = nums2.length;
        int[] nums = new int[lengthNums1 + lengthNums2];
        System.arraycopy(nums1, 0, nums, 0, lengthNums1);
        System.arraycopy(nums2, 0, nums, lengthNums1, lengthNums2);
        nums = Arrays.stream(nums).sorted().toArray();

        int length = nums.length;
        int lengthDividedByTwo = length / 2;
        if (length % 2 == 0) {
            return (double) (nums[lengthDividedByTwo - 1] + nums[lengthDividedByTwo]) / 2;
        } else {
            return nums[lengthDividedByTwo];
        }
    }

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1, 3}, new int[]{2, 4, 5}));    // 3.0
        System.out.println(findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));       // 2.5
    }

}
