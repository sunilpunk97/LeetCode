package com.java.leetcode.Arrays;

public class CanPlaceFlowers_605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                int prev = (i == 0 || flowerbed[i - 1] == 0) ? 0 : 1;
                int next = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) ? 0 : 1;
                if (prev == 0 && next == 0) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }

        return count>=n;
    }
}

//    It starts by initializing a variable count to keep track of the number of flowers that can be planted.
//
//        It uses a for loop to iterate through each plot in the flowerbed array.
//
//        For each plot, it checks if the current plot is empty (flowerbed[i] == 0).
//
//        If the plot is empty, it determines the status of the previous plot and the next plot using conditional (ternary) operators. The variable prev represents the status of the previous plot, which is 0 if it is the first plot (i == 0) or if the previous plot is empty (flowerbed[i - 1] == 0), otherwise it is 1. The variable next represents the status of the next plot, which is 0 if it is the last plot (i == flowerbed.length - 1) or if the next plot is empty (flowerbed[i + 1] == 0), otherwise it is 1.
//
//        If both the previous plot and the next plot are empty (prev == 0 and next == 0), it means a flower can be planted in the current plot. So, it marks the current plot as planted (flowerbed[i] = 1) and increments the count variable.
//
//        The loop continues to the next plot until all plots in the flowerbed array have been checked.
//
//        After checking all plots, the code checks if the number of planted flowers (count) is greater than or equal to the required number of flowers to be planted (n). If so, it means all the required flowers can be planted without violating the adjacent flowers rule, and it returns true. Otherwise, it returns false.
