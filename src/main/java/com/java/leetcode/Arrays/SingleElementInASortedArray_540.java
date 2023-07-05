package com.java.leetcode.Arrays;
//You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.
//
//        Return the single element that appears only once.
//
//        Your solution must run in O(log n) time and O(1) space.
import java.util.HashMap;
import java.util.Map;

public class SingleElementInASortedArray_540 {
    public int singleNonDuplicate(int[] nums) {
        int result = 0;
        Map<Integer,Integer> count_map = new HashMap<>();
        for(int i:nums){
            count_map.put(i,count_map.get(i)==null?1:count_map.get(i)+1);
        }
        for(int i:count_map.keySet()){
            if(count_map.get(i)==1)
                result = i;
        }
        return  result;
    }
}

//    Create a hash map count_map to store the count of each element in the input array nums.
//
//        Iterate through each element of the input array nums.
//
//        For each element, use it as a key to access the corresponding value in the hash map count_map.
//
//        If the value is null, set it to 1, otherwise increment it by 1.
//
//        Iterate through each key-value pair in the hash map count_map.
//
//        For each key-value pair, check if the value is equal to 1.
//
//        If the value is 1, set the result to the key.
//
//        Return the result.
