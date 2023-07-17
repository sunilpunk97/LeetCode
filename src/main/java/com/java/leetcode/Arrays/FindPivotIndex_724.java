package com.java.leetcode.Arrays;

//Given an array of integers nums, calculate the pivot index of this array.
//
//        The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
//        If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
//        Return the leftmost pivot index. If no such index exists, return -1.
//        Example 1:
//
//        Input: nums = [1,7,3,6,5,6]
//        Output: 3
//        Explanation:
//        The pivot index is 3.
//        Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
//        Right sum = nums[4] + nums[5] = 5 + 6 = 11
//        Example 2:
//
//        Input: nums = [1,2,3]
//        Output: -1
//        Explanation:
//        There is no index that satisfies the conditions in the problem statement.

public class FindPivotIndex_724 {
    public int pivotIndex(int[] nums) {
        // Calculate the total sum of all elements in the array
        int totalSum = 0;
        for(int num : nums) {
            totalSum += num;
        }

        // Initialize a variable to keep track of the left sum
        int leftSum = 0;

        // Iterate through the array
        for(int i = 0; i < nums.length; i++) {
            // If the current index is not the first element, update the left sum by adding the previous element
            if(i != 0) {
                leftSum += nums[i - 1];
            }

            // Check if the total sum minus the left sum minus the current element is equal to the left sum
            if(totalSum - leftSum - nums[i] == leftSum) {
                return i; // Return the current index as the pivot index
            }
        }

        return -1; // No pivot index found
    }

}


