package com.mlprograms.leetcode.medium;

public class ZigZagConversion {

    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        char[][] zigzag2DArray = new char[s.length()][numRows];

        int x = 0;
        int y = 0;
        boolean add = true;
        for (char character : s.toCharArray()) {
            zigzag2DArray[x][y] = character;

            if (add) {
                y++;
            } else {
                y--;
                x++;
            }

            if (y >= numRows - 1) {
                add = false;
            } else if (y <= 0) {
                add = true;
            }
        }

        StringBuilder zigzagString = new StringBuilder();
        for (int dy = 0; dy < numRows; dy++) {
            for (int dx = 0; dx < s.length(); dx++) {
                char character = zigzag2DArray[dx][dy];
                if (character != 0) {
                    zigzagString.append(character);
                }
            }
        }

        return zigzagString.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));   // PAHNAPLSIIGYIR
        System.out.println(convert("PAYPALISHIRING", 4));   // PINALSIGYAHRPI
        System.out.println(convert("A", 1));                // A
    }

}
