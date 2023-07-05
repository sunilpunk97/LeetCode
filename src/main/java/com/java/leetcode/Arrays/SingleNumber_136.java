package com.java.leetcode.Arrays;
//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//        You must implement a solution with a linear runtime complexity and use only constant extra space.
//        Example 1:
//
//        Input: nums = [2,2,1]
//        Output: 1
import java.util.HashSet;
import java.util.Set;

public class SingleNumber_136 {
    public int singleNumber(int[] nums) {
        Set<Integer> mySet = new HashSet<>();
        for(int i:nums){
            if(mySet.contains(i))
                mySet.remove(i);
            else
                mySet.add(i);
        }
        for(int i:mySet){
            return i;
        }
        return -1;
    }
}

//    Create an empty hash set called mySet.
//        Iterate through each element of the input integer array nums.
//        For each element, if mySet already contains the element, remove it from the set because it has been seen before.
//        Otherwise, add the element to the set because it is a new element.
//        After iterating through the array, mySet contains only the unique element that appears once.
//        Iterate through mySet and return the unique element.
//        If mySet is empty, return -1 as a sentinel value to indicate that there is no unique element in the array.
