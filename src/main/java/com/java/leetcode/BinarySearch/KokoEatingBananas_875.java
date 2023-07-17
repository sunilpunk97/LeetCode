package com.java.leetcode.BinarySearch;
/*Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.

Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

Return the minimum integer k such that she can eat all the bananas within h hours.

Example 1:

Input: piles = [3,6,7,11], h = 8
Output: 4*/

public class KokoEatingBananas_875 {
    public int minEatingSpeed(int[] piles, int h) {
        // Initialize the search range for eating speed
        int left = 1; // Minimum possible eating speed
        int right = getMaxPiles(piles); // Maximum possible eating speed

        while (left < right) {
            int mid = left + (right - left) / 2; // Calculate the middle eating speed

            if (canEatWithinHours(piles, h, mid)) {
                // If Koko can eat all the bananas within h hours at the current eating speed,
                // it means we can try with a smaller eating speed. Move the right pointer to mid.
                right = mid;
            } else {
                // If Koko cannot eat all the bananas within h hours at the current eating speed,
                // it means we need to increase the eating speed. Move the left pointer to mid + 1.
                left = mid + 1;
            }
        }

        return left; // Return the minimum eating speed
    }

    private int getMaxPiles(int[] piles) {
        int max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        return max;
    }

    private boolean canEatWithinHours(int[] piles, int h, int k) {
        int hours = 0;
        for (int pile : piles) {
            // Calculate the number of hours needed to eat the current pile
            hours += (int) Math.ceil((double) pile / k);

            // If the total hours exceed the given limit, return false
            if (hours > h) {
                return false;
            }
        }

        return true;
    }

}
