package com.java.leetcode.Arrays;
//You are given an integer array nums consisting of n elements, and an integer k.
//
//        Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.
//
//        Example 1:
//
//        Input: nums = [1,12,-5,-6,50,3], k = 4
//        Output: 12.75000
//        Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
//        Example 2:
//
//        Input: nums = [5], k = 1
//        Output: 5.00000
public class MaxAverageSubarray_643 {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }
}

//    The findMaxAverage method takes an integer array nums and an integer k as input and returns the maximum average value of a contiguous subarray of length k.
//
//        Initialize a variable sum to keep track of the sum of the first k elements of nums. Iterate through the array from index 0 to index k-1 and add each element to sum.
//
//        Assign the value of sum to a new variable maxSum, which represents the maximum sum encountered so far.
//
//        Start a new loop from index k to the end of the array nums. This loop will slide a window of length k over the array.
//
//        In each iteration, update sum by adding the current element at index i and subtracting the element at index i-k. This step effectively shifts the window one position to the right.
//
//        Update maxSum by taking the maximum value between maxSum and sum. This ensures that maxSum always holds the maximum sum encountered during the sliding window process.
//
//        After the loop, return the value of maxSum divided by k as the maximum average value. We convert maxSum to a double before performing the division to obtain the decimal representation.
