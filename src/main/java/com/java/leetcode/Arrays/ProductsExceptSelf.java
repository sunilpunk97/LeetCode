package com.java.leetcode.Arrays;

//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//
//        The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//
//        You must write an algorithm that runs in O(n) time and without using the division operation.

//        Example 1:
//        Input: nums = [1,2,3,4]
//        Output: [24,12,8,6]
//        Example 2:
//
//        Input: nums = [-1,1,0,-3,3]
//        Output: [0,0,9,0,0]
public class ProductsExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length; // Get the length of the input array
        int[] output = new int[length]; // Create an output array to store the results
        int[] forward = new int[length]; // Create an array to store the forward products
        int[] backward = new int[length]; // Create an array to store the backward products

        forward[0] = 1; // Initialize the first element of the forward array as 1 since there are no elements before it
        backward[length-1] = 1; // Initialize the last element of the backward array as 1 since there are no elements after it

        // Calculate the forward products
        for(int i=1;i<length;i++){
            forward[i] = nums[i-1] * forward[i-1]; // Multiply the previous forward product with the corresponding element in the input array
        }

        // Calculate the backward products
        for(int i=length-2;i>=0;i--){
            backward[i] = nums[i+1] * backward[i+1]; // Multiply the next backward product with the corresponding element in the input array
        }

        // Calculate the final output by multiplying the corresponding forward and backward products
        for(int i=0;i<length;i++){
            output[i] = forward[i] * backward[i];
        }

        return output; // Return the resulting array with products except self
    }

}


