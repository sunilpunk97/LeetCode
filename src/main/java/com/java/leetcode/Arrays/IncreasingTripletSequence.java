package com.java.leetcode.Arrays;
/*Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.*/
public class IncreasingTripletSequence {
    public boolean increasingTriplet(int[] nums) {
        // Initialize two variables to store the smallest and second smallest values encountered
        int val1 = Integer.MAX_VALUE;
        int val2 = Integer.MAX_VALUE;

        // Iterate through the array
        for(int i = 0; i < nums.length; i++) {
            // If the current number is smaller than or equal to the smallest value
            if(nums[i] <= val1){
                // Update the smallest value to the current number
                val1 = nums[i];
            }
            // If the current number is greater than the smallest value but smaller than or equal to the second smallest value
            else if (nums[i] <= val2) {
                // Update the second smallest value to the current number
                val2 = nums[i];
            }
            // If the current number is greater than both smallest and second smallest values
            else {
                // We have found an increasing triplet, so return true
                return true;
            }
        }

        // No increasing triplet found, return false
        return false;
    }

}
