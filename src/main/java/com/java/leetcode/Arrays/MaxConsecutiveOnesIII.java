package com.java.leetcode.Arrays;

public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        // Initialize variables to keep track of zero count, left pointer, and the maximum length
        int zeroCount = 0;
        int i = 0;
        int result = 0;

        // Iterate through the array using a for loop with the right pointer
        for (int j = 0; j < nums.length; j++) {
            // If the current number is zero, increment the zero count
            if (nums[j] == 0) {
                zeroCount++;
            }

            // While the zero count exceeds the allowed number of flips (k),
            // move the left pointer and decrement the zero count as necessary
            while (zeroCount > k) {
                if (nums[i] == 0) {
                    zeroCount--;
                }
                i++;
            }

            // Calculate the length of the current subarray and update the maximum length
            result = Math.max(result, j - i + 1);
        }

        // Return the maximum length
        return result;
    }

}
