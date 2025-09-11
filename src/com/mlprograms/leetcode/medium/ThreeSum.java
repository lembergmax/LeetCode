package com.mlprograms.leetcode.medium;

import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {

        // 1. Sort the given array in non-decreasing order.
        nums = Arrays.stream(nums).sorted().toArray();

        // 2. Loop through the array from index 0 to n-1.
        // 3. For each iteration, set the target as -nums[i].
        // 4. Set two pointers, j=i+1 and k=n-1.
        // 5. While j<k, check if nums[j]+nums[k]==target.
        // 6. If yes, add the triplet {nums[i], nums[j], nums[k]} to the result and move j to the right and k to the left.
        // 7. If no, move either j or k based on the comparison of nums[j]+nums[k] with target.
        // 8. To avoid duplicate triplets, skip the iterations where nums[i]==nums[i-1] and also skip the iterations where nums[j]==nums[j-1] or nums[k]==nums[k+1].

        return List.of(List.of());
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println(threeSum(new int[]{0, 1, 1}));
        System.out.println(threeSum(new int[]{0, 0, 0}));
    }

}
