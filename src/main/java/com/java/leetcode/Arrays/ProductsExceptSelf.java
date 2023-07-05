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
        int length = nums.length;
        int[] output = new int[length];
        int[] forward = new int[length];
        int[] backward = new int[length];
        forward[0] = 1;
        backward[length-1] = 1;
        for(int i=1;i<length;i++){
            forward[i] = nums[i-1] * forward[i-1];
        }
        for(int i=length-1;i>=0;i--){
            backward[i] = nums[i+1] * backward[i+1];
        }
        for(int i=0;i<length;i++){
            output[i] = forward[i] * backward[i];
        }

        return output;

    }
}

//    Get the length of the nums array and initialize an output array of the same length.
//    Initialize two additional arrays, forward and backward, both of the same length as nums.
//    Set the first element of forward to 1, and the last element of backward to 1.
//   Use a for loop to calculate the product of all the elements before the current element in nums and store them in forward.
//    Use another for loop to calculate the product of all the elements after the current element in nums and store them in backward.
//      Use a third for loop to calculate the product of the corresponding elements in forward and backward and store them in the output array.
//    Return the output array.
