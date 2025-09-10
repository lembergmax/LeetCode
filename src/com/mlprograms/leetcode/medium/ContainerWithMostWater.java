package com.mlprograms.leetcode.medium;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int maxArea = 0;
        int pointerLeft = 0;
        int pointerRight = height.length - 1;
        int heightPointerLeft;
        int heightPointerRight;

        while (pointerLeft < pointerRight) {
            heightPointerLeft = height[pointerLeft];
            heightPointerRight = height[pointerRight];
            maxArea = Math.max(maxArea, Math.min(heightPointerLeft, heightPointerRight) * Math.abs(pointerLeft - pointerRight));

            if (heightPointerLeft < heightPointerRight) {
                pointerLeft++;
            } else {
                pointerRight--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        System.out.println(maxArea(new int[]{1, 1}));
    }

}
