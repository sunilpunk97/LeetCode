package com.java.leetcode.Blind75;
//Given an integer array nums, find a subarray that has the largest product, and return the product.
//
//        The test cases are generated so that the answer will fit in a 32-bit integer.
//
//        Example 1:
//        Input: nums = [2,3,-2,4]
//        Output: 6
//        Explanation: [2,3] has the largest product 6.
//
//        Example 2:
//        Input: nums = [-2,0,-1]
//        Output: 0
//        Explanation: The result cannot be 2, because [-2,-1] is not a subarray.

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int maxProduct = Integer.MIN_VALUE;
        int currentMax = 1;
        int currentMin = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                currentMax = currentMax * nums[i];
                currentMin = Math.min(currentMin * nums[i], 1);
            } else if (nums[i] == 0) {
                currentMax = 0;
                currentMin = 1;
            } else {
                int temp = currentMax;
                currentMax = Math.max(currentMin * nums[i], 1);
                currentMin = temp * nums[i];
            }
            maxProduct = Math.max(maxProduct, currentMax);
            if (currentMax == 0) {
                currentMin = 1;
                currentMax = 1;
            }
        }
        return maxProduct;
    }
}

//    The algorithm starts by checking the length of the input array. If the array has only one element, then the function returns that element as the maximum product.
//
//        If the input array has more than one element, the algorithm initializes three variables:
//
//        maxProduct: The maximum product seen so far.
//        currentMax: The maximum product ending at the current position of the loop.
//        currentMin: The minimum product ending at the current position of the loop.
//        The algorithm then loops through the input array. For each element nums[i], the algorithm checks whether it is positive, negative, or zero.
//
//        If nums[i] is positive, the algorithm updates currentMax and currentMin as follows:
//
//        currentMax is updated by multiplying currentMax with nums[i].
//        currentMin is updated by taking the minimum value between currentMin * nums[i] and 1. This is because a negative number multiplied by another negative number yields a positive number, which could be larger than currentMax.
//        If nums[i] is zero, the algorithm resets currentMax to zero and currentMin to one.
//
//        If nums[i] is negative, the algorithm updates currentMax and currentMin as follows:
//
//        currentMax is updated by taking the maximum value between currentMin * nums[i] and 1. This is because a negative number multiplied by another negative number yields a positive number, which could be larger than currentMax.
//        currentMin is updated by multiplying currentMax with nums[i].
//        The algorithm also updates maxProduct by taking the maximum value between maxProduct and currentMax.
//
//        Finally, if currentMax is zero, the algorithm resets currentMax and currentMin to one.
//
//        After the loop is finished, the algorithm returns maxProduct.
