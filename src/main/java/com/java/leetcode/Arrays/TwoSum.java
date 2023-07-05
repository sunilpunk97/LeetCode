package com.java.leetcode.Arrays;

import java.util.HashMap;
import java.util.Map;
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//        You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//        You can return the answer in any order.
//        Example 1:
//
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int remainder = target - nums[i];
            if(myMap.containsKey(remainder))
                return new int[] {myMap.get(remainder), i};
            myMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("not found");
    }
}

//    Initialize a HashMap called myMap.
//        Loop through each element in the nums array using a for loop with an index variable i.
//        Calculate the remainder variable by subtracting the current element nums[i] from the target.
//        Check if the myMap HashMap already contains the remainder key using the containsKey() method.
//        If the remainder key is already in myMap, return an array containing the index of the remainder key value and the current i value.
//        If the remainder key is not in myMap, add the current element nums[i] as a key to myMap with the value of i.
//        If the loop completes and no solution is found, throw an IllegalArgumentException.
