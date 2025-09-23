package com.mlprograms.leetcode.easy;

// https://leetcode.com/problems/find-closest-person/
public class FindClosestPerson {

    public static int findClosest(int x, int y, int z) {
        int distanceXtoZ = Math.abs(z - x);
        int distanceYtoZ = Math.abs(z - y);
        return distanceXtoZ > distanceYtoZ ? 2 : distanceXtoZ == distanceYtoZ ? 0 : 1;
    }

    public static void main(String[] args) {
        System.out.println(findClosest(2, 7, 4));   // 1
        System.out.println(findClosest(2, 5, 6));   // 2
        System.out.println(findClosest(1, 5, 3));   // 0
    }

}
