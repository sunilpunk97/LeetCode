package com.java.leetcode.Arrays;

import java.util.HashMap;

public class MaxNumberOfKSumPairs {
    public int maxOperations(int[] nums, int k) {
        // Create a HashMap to store the frequency of each number in the array
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Initialize a variable to count the number of valid pairs
        int count = 0;

        // Iterate through the array
        for(int num : nums) {
            // Calculate the complement for the current number
            int complement = k - num;

            // Check if the complement is present in the HashMap and its frequency is greater than 0
            if(freqMap.containsKey(complement) && freqMap.get(complement) > 0) {
                // If so, increment the count of valid pairs
                count++;

                // Decrement the frequency of the complement in the HashMap
                freqMap.put(complement, freqMap.get(complement) - 1);
            } else {
                // If the complement is not present or its frequency is 0, update the frequency of the current number in the HashMap
                freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            }
        }

        // Return the count of valid pairs
        return count;
    }


}
