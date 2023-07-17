package com.java.leetcode.Arrays;
import java.util.*;
/*
* There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.

 */
public class KidsWithGreatestNumOfCandies_1431 {
    // This method takes an array of candies and the number of extra candies
// and returns a list of booleans indicating if each kid can have the maximum number of candies.

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();

        // Find the maximum number of candies among all the kids.
        int max = candies[0];
        int n = candies.length;
        for (int i = 1; i < n; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        // Check if each kid can have the maximum number of candies by adding the extra candies
        // and comparing it with the maximum number of candies.
        for (int i = 0; i < n; i++) {
            list.add(candies[i] + extraCandies >= max);
        }

        // Return the list of booleans indicating if each kid can have the maximum number of candies.
        return list;
    }

}
