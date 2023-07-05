package com.java.leetcode.GeneralDSA;

public class sqrt_x_69 {
    public int mySqrt(int x) {
        long left = 0;
        long right = (x / 2) + 1;
        while (left < right) {
            long mid = left + (right - left) / 2 + 1;
            long sq = mid * mid;
            if (sq == x)
                return (int) mid;
            else if (sq < x) {
                left = mid;
            }else {
                right = mid -1;
            }

        }
        return (int) left;
    }
}

//    Initially   we are assigning  left equals to 0.
//
//        We are assigning right using the formula.
//
//        While left is less than right.
//
//        We are finding mid using the formula.
//
//        We are taking the square of the mid
//
//        if squared mid equals the number then that is the value.
//
//        Suppose if it is less we are reducing the window by assigning the left to the middle value.
//
//        we are reducing the window by bringing the right closer to the middle if it is greater.
//
//        This Loop goes on until we find the answer
