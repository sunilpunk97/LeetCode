package com.java.leetcode.Arrays;

//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//        Note that you must do this in-place without making a copy of the array.

public class MoveZeroes_283 {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int i=0; i< nums.length;i++){
            if(nums[i] != 0)
                nums[index++] = nums[i];
        }
        for(int i= index; i<nums.length;i++){
            nums[i] = 0;
        }
    }
}

//Alg0:
//        Initialize an integer variable index to 0. This variable will be used to keep track of the index where the next non-zero element should be placed.
//
//        Iterate through each element of the nums array using a for loop.
//
//        For each element, check if it is not equal to 0. If it is not, move it to the position at index index in the array, and increment index by 1.
//
//        After the loop completes, all non-zero elements of the array will have been moved to the beginning of the array, and index will point to the next available position in the array.
//
//        Iterate through the remaining elements of the array (from index index to the end of the array)
//        and set them to 0. This step effectively moves all the zeroes in the array to the
//        end, while preserving the order of the non-zero elements.
