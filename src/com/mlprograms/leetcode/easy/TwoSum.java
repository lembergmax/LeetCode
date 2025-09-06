package com.mlprograms.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numIndices = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (numIndices.containsKey(target - nums[i])) {
                return new int[]{numIndices.get(target - nums[i]), i};
            }

            numIndices.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution found");
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9))); // Output: [0, 1]
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));      // Output: [1, 2]
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));         // Output: [0, 1]
    }

}
