package com.java.leetcode.Arrays;
//Given an integer array nums, find the
//        subarray
//        with the largest sum, and return its sum.
//
//        Example 1:
//
//        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//        Output: 6
//        Explanation: The subarray [4,-1,2,1] has the largest sum 6.
//        Example 2:
//
//        Input: nums = [1]
//        Output: 1
//        Explanation: The subarray [1] has the largest sum 1.
public class MaximumSubarray_53 {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int sum = 0;
        for(int i: nums){
            if(sum < 0)
                sum = 0;
            sum += i;
            maxSum = Math.max(sum,maxSum);
        }
        return maxSum;
    }
}
//    Initialize two variables: "maxSum" and "sum" to the first element in the array.
//        Loop through the array, one element at a time.
//        For each element, check if the current sum is negative. If it is, reset the sum to 0. This is because if the sum is negative, it cannot contribute to a maximum subarray.
//        Add the current element to the sum.
//        Check if the current sum is greater than the maximum sum seen so far. If it is, update the maximum sum.
//        After the loop finishes, return the maximum sum seen so far.
