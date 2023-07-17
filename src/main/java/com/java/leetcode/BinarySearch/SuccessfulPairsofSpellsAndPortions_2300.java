package com.java.leetcode.BinarySearch;
import java.util.*;

/*You are given two positive integer arrays spells and potions, of length n and m respectively, where spells[i] represents the strength of the ith spell and potions[j] represents the strength of the jth potion.

You are also given an integer success. A spell and potion pair is considered successful if the product of their strengths is at least success.

Return an integer array pairs of length n where pairs[i] is the number of potions that will form a successful pair with the ith spell.

Example 1:

Input: spells = [5,1,3], potions = [1,2,3,4,5], success = 7
Output: [4,0,3]
Explanation:
- 0th spell: 5 * [1,2,3,4,5] = [5,10,15,20,25]. 4 pairs are successful.
- 1st spell: 1 * [1,2,3,4,5] = [1,2,3,4,5]. 0 pairs are successful.
- 2nd spell: 3 * [1,2,3,4,5] = [3,6,9,12,15]. 3 pairs are successful.
Thus, [4,0,3] is returned.*/

public class SuccessfulPairsofSpellsAndPortions_2300 {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        // Sort the potions array in ascending order
        Arrays.sort(potions);

        // Create an array to store the counts of successful pairs
        int[] res = new int[spells.length];

        // Iterate through each spell
        for (int i = 0; i < spells.length; i++) {
            // Retrieve the strength of the current spell
            int spell = spells[i];

            // Initialize the left and right pointers for binary search
            int left = 0;
            int right = potions.length - 1;

            // Initialize the index of the first potion that forms a successful pair
            int idx = potions.length;

            // Perform binary search within the potions array
            while (left <= right) {
                // Calculate the middle index
                int mid = left + (right - left) / 2;

                // Check if the product of the current spell and the potion at the middle index is greater than or equal to success
                if ((long) spell * potions[mid] >= success) {
                    // Update the index to the middle index and move the right pointer to the left half of the array
                    idx = mid;
                    right = mid - 1;
                } else {
                    // Move the left pointer to the right half of the array
                    left = mid + 1;
                }
            }

            // Calculate the count of successful pairs for the current spell and store it in the result array
            res[i] = potions.length - idx;
        }

        // Return the result array containing the counts of successful pairs for each spell
        return res;
    }

}
