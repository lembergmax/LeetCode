package com.mlprograms.leetcode.easy;

// https://leetcode.com/problems/minimum-operations-to-make-array-sum-divisible-by-k/description/
public class MinimumOperationsToMakeArraySumDivisibleByK {

    public static int minOperations(int[] nums, int k) {
        return sum(nums) % k;
    }

    private static int sum(final int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{3, 9, 7}, 5));       // 4
        System.out.println(minOperations(new int[]{4, 1, 3}, 4));       // 0
        System.out.println(minOperations(new int[]{3, 2}, 6));          // 5
    }

}
