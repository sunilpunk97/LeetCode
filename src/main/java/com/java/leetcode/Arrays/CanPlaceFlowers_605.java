package com.java.leetcode.Arrays;

public class CanPlaceFlowers_605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;

        // Iterate through each flowerbed
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) { // Check if the current flowerbed is empty
                int prev = (i == 0 || flowerbed[i - 1] == 0) ? 0 : 1; // Check if the previous flowerbed is empty
                int next = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) ? 0 : 1; // Check if the next flowerbed is empty

                if (prev == 0 && next == 0) { // Check if both the previous and next flowerbeds are empty
                    flowerbed[i] = 1; // Place a flower in the current flowerbed
                    count++; // Increment the count of placed flowers
                }
            }
        }

        return count >= n; // Check if the number of placed flowers is greater than or equal to the required amount
    }

}

