package com.mlprograms.leetcode.medium;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = 0; j < height.length; j++) {
                if (i == j) {
                    continue;
                }

                maxArea = Math.max(maxArea, Math.min(height[i], height[j]) * Math.abs(i - j));
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
    }

}
