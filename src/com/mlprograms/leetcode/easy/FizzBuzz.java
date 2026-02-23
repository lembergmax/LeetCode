package com.mlprograms.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/fizz-buzz/
public class FizzBuzz {

    public static List<String> fizzBuzz(int n) {
        final List<String> result = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            final boolean divisibleByThree = (i % 3) == 0;
            final boolean divisibleByFive = (i % 5) == 0;

            if(divisibleByThree && divisibleByFive) {
                result.addLast("FizzBuzz");
            } else if(divisibleByThree) {
                result.addLast("Fizz");
            } else if(divisibleByFive) {
                result.addLast("Buzz");
            } else {
                result.addLast(String.valueOf(i));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(3));        // [1, 2, Fizz]
        System.out.println(fizzBuzz(5));        // [1, 2, Fizz, 4, Buzz]
        System.out.println(fizzBuzz(15));       // [1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz]
    }

}
