package com.java.leetcode.Arrays;

public class MissingNumber_268 {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int i:nums){
            sum += i;
        }
        int n = nums.length+1;
        return (n*(n-1)/2)-sum;
    }
}


//        Input: nums = [3,0,1]
//        Output: 2
//        Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.


//Algo:
//        Initialize a variable sum to 0.
//
//        Loop through each element i in the nums array:
//
//        Add i to sum.
//        Calculate the value of n as nums.length + 1.
//
//        Calculate the expected sum of integers from 0 to n using the formula (n * (n - 1) / 2).
//
//        Subtract the sum of the nums array from the expected sum calculated in step 4.
//
//        Return the result of step 5 as the missing number.