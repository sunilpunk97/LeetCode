package com.java.leetcode.Arrays;

//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//        Note that you must do this in-place without making a copy of the array.

public class MoveZeroes_283 {
    public void moveZeroes(int[] nums) {
        // Initialize an index to keep track of the position to overwrite non-zero numbers
        int index = 0;

        // Iterate through the array
        for(int i = 0; i < nums.length; i++) {
            // If the current number is not zero, move it to the next available position at index and increment the index
            if(nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }

        // After moving all non-zero numbers to the beginning, fill the remaining positions with zeros
        for(int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

}


