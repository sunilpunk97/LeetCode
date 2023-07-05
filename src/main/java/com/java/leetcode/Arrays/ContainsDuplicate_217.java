package com.java.leetcode.Arrays;

import java.util.HashSet;
import java.util.Set;
//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//        Example 1:
//        Input: nums = [1,2,3,1]
//        Output: true

//        Example 2:
//        Input: nums = [1,2,3,4]
//        Output: false
public class ContainsDuplicate_217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        int i=0;
        while (i<nums.length){
            if(mySet.contains(nums[i]))
                return true;
            else {
                mySet.add(nums[i++]);
            }

        }
        return false;
    }
}

//        Use a hash set.
//
//        Basically starting from zero  we are looping through each element of the array.
//
//        I'm pushing into our set based on a condition.
//
//        If the element is not present then we push it.
//
//        If it is already present then it is a duplicate then we simply return  true.
//
//        If all the elements are unique then we finally return  false which means it does not contain any duplicate
