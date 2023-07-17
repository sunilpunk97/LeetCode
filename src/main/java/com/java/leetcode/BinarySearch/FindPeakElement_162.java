package com.java.leetcode.BinarySearch;
/*A peak element is an element that is strictly greater than its neighbors.

Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.

You must write an algorithm that runs in O(log n) time.

Example 1:

Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.

Example 2:
Input: nums = [1,2,1,3,5,6,4]
Output: 5
Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.*/

public class FindPeakElement_162 {
    public int findPeakElement(int[] nums) {
        int left = 0; // Initialize the left pointer to the start of the array
        int right = nums.length - 1; // Initialize the right pointer to the end of the array

        while (left < right) { // Continue the loop as long as the left pointer is less than the right pointer
            int mid = left + (right - left) / 2; // Calculate the middle index

            if (nums[mid] < nums[mid + 1]) {
                // If the element at the middle index is less than the element at the next index,
                // it means that a peak element exists on the right side of the middle index.
                // Move the left pointer to mid + 1 to search in the right half of the array.
                left = mid + 1;
            } else {
                // If the element at the middle index is greater than or equal to the element at the next index,
                // it means that a peak element exists on the left side of the middle index or at the middle index itself.
                // Move the right pointer to mid to search in the left half of the array.
                right = mid;
            }
        }

        return left; // Return the index of a peak element
    }

}
