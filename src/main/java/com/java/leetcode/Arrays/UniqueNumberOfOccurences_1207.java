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
        // Create a map to store the frequency of each number in the array
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Create a set to store the unique frequencies
        Set<Integer> freqSet = new HashSet<>();

        // Iterate through the array and count the frequency of each number
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Iterate through the values of the frequency map and add them to the set
        for (int counts : freqMap.values()) {
            freqSet.add(counts);
        }

        // Check if the size of the frequency set is equal to the size of the frequency map
        // If they are equal, it means all frequencies are unique; otherwise, there are duplicate frequencies
        return freqSet.size() == freqMap.size();
    }

}
