package com.java.leetcode.Arrays;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK_560 {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> sum_counts = new HashMap<>();
        sum_counts.put(0,1);
        int sum = 0;
        int result = 0;

        for(int i=0;i< nums.length;i++){
            sum += nums[i];
            if(sum_counts.containsKey(sum-k))
                result += sum_counts.get(sum-k);
            sum_counts.put(sum, sum_counts.getOrDefault(sum, 0)+1);
        }
        return result;
    }
}
//
//Algo:
//        Create an empty hash map called sum_counts to store the counts of different subarray sums.
//
//        Initialize the hash map with an initial count of 1 for a sum of 0, since an empty subarray has a sum of 0.
//
//        Initialize a variable called sum to 0 to keep track of the running sum of the subarray.
//
//        Initialize a variable called result to 0 to keep track of the total number of subarrays whose sum equals k.
//
//        Iterate through each element of the input integer array nums.
//
//        For each element, add it to the running sum sum.
//
//        Check if the difference between sum and k is present in the hash map.
//
//        If the difference is present, then add the count of the corresponding sum to the result variable.
//
//        Increment the count of the current sum in the hash map.
//
//        Repeat steps 5 to 9 for all elements in the array.
//
//        After iterating through the array, return the result variable containing the total number of subarrays whose sum equals k
