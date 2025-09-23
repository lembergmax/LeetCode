package com.mlprograms.leetcode.medium;

import java.util.Arrays;

// https://leetcode.com/problems/3sum-closest/
public class ThreeSumClosest {

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int length = nums.length;
        int previvousDifference = Integer.MAX_VALUE;
        int result = 0;

        for (int i = 0; i < length; i++) {
            int pointerJ = i + 1;
            int pointerK = length - 1;

            while (pointerJ < pointerK) {
                int sum = nums[i] + nums[pointerJ] + nums[pointerK];
                if (Math.abs(sum - target) < previvousDifference) {
                    previvousDifference = Math.abs(sum - target);
                    result = sum;
                }

                if (sum > target) {
                    pointerK--;
                } else {
                    pointerJ++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
        System.out.println(threeSumClosest(new int[]{0, 0, 0}, 1));
    }

}
