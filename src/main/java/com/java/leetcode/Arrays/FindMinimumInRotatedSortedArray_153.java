package com.java.leetcode.Arrays;


//    Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:
//
//            [4,5,6,7,0,1,2] if it was rotated 4 times.
//[0,1,2,4,5,6,7] if it was rotated 7 times.
//    Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
//
//    Given the sorted rotated array nums of unique elements, return the minimum element of this array.


        public class FindMinimumInRotatedSortedArray_153 {
        public int findMin(int[] nums) {
            int left = 0, right = nums.length - 1;

            // If the array is already sorted and not rotated
            if (nums[left] < nums[right]) {
                return nums[left];
            }

            while (left < right) {
                int mid = left + (right - left) / 2;

                if (nums[mid] > nums[right]) {
                    // The minimum element must be in the right half
                    left = mid + 1;
                } else {
                    // The minimum element must be in the left half or at mid
                    right = mid;
                }
            }

            // At the end of the loop, left = right and points to the minimum element
            return nums[left];
        }}

