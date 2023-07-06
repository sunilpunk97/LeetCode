package com.java.leetcode.Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
//
//        Example 1:
//
//        Input: arr = [1,2,2,1,1,3]
//        Output: true
//        Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
public class UniqueNumberOfOccurences_1207 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        Set<Integer> freqSet = new HashSet<>();
        for(int num:arr){
            freqMap.put(num,freqMap.getOrDefault(num, 0)+1);
        }
        for (int counts:freqMap.values()){
            freqSet.add(counts);
        }
        return freqSet.size()==freqMap.size();
    }
}
