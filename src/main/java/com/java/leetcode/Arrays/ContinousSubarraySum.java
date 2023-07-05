package com.java.leetcode.Arrays;

import java.util.HashMap;
import java.util.Map;
//Given an integer array nums and an integer k, return true if nums has a good subarray or false otherwise.
//
//        A good subarray is a subarray where:
//
//        its length is at least two, and
//        the sum of the elements of the subarray is a multiple of k.
//        Note that:
//
//        A subarray is a contiguous part of the array.
//        An integer x is a multiple of k if there exists an integer n such that x = n * k. 0 is always a multiple of k.
public class ContinousSubarraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> myMap = new HashMap<>();
        if(k==0){
            boolean zeros = false;//if k is 0 then we have look for two contiguos elements having o as their value.
            for(int i=1;i<nums.length;i++){
                if(nums[i]==0 && nums[i-1]==0)
                    zeros = true;
            }
            return zeros;
        }

        myMap.put(0,-1);
        int  sum = 0;
        for(int i=0; i<nums.length;i++){//traversing through the array and we are  taking mod of k for each element and adding it to the sum.
            sum += nums[i];
            if(myMap.containsKey(sum%k)){//checking if the remainder is already available in the key set.
                if(i-(myMap.get(sum%k))>1)//if we again encounter the same remainder we check whether the corresponding value of the pre existing remainder reducted from the cureent index
                    return true;//is greater than 1. then it means there is a multiple of k exist so we return true.
            }
            myMap.putIfAbsent(sum%k,i);// if the rem is not avaiable we add it to our map with the index value.
        }
        return false;
    }
}

//    Create a HashMap called myMap to store the cumulative sum of the array mod k as the key, and the index of the first occurrence of that mod value as the value.
//
//        If k is 0, iterate through the array to check if there are consecutive zeros. If there are, return true, otherwise, return false.
//
//        Add an entry to myMap with a key of 0 and a value of -1, indicating that the cumulative sum of the first 0 elements is 0 (mod k), and the index is -1.
//
//        Iterate through each element of the nums array, adding the current element's value to the cumulative sum.
//
//        Compute the cumulative sum mod k and check if it exists as a key in myMap.
//
//        If the cumulative sum mod k exists in myMap, check if the difference between the current index and the value associated with the cumulative sum mod k is greater than 1. If it is, return true, as this indicates that there exists a subarray whose sum is a multiple of k.
//
//        If the cumulative sum mod k does not exist in myMap, add it to the map with the current index as the value.
//
//        If the loop completes without finding a subarray whose sum is a multiple of k, return false.
