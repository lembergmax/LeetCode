package com.mlprograms.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int pointerJ = i + 1;
            int pointerK = nums.length - 1;

            while (pointerJ < pointerK) {
                int sum = nums[i] + nums[pointerJ] + nums[pointerK];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[pointerJ], nums[pointerK]));

                    while (pointerJ < pointerK && nums[pointerJ] == nums[pointerJ + 1]) {
                        pointerJ++;
                    }
                    while (pointerJ < pointerK && nums[pointerK] == nums[pointerK - 1]) {
                        pointerK--;
                    }

                    pointerJ++;
                    pointerK--;
                    continue;
                }

                if (sum < 0) {
                    pointerJ++;
                } else {
                    pointerK--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println(threeSum(new int[]{0, 1, 1}));
        System.out.println(threeSum(new int[]{0, 0, 0}));
    }

}
