package com.java.leetcode.Arrays;

//Given an array of integers nums, calculate the pivot index of this array.
//
//        The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
//        If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
//        Return the leftmost pivot index. If no such index exists, return -1.
//        Example 1:
//
//        Input: nums = [1,7,3,6,5,6]
//        Output: 3
//        Explanation:
//        The pivot index is 3.
//        Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
//        Right sum = nums[4] + nums[5] = 5 + 6 = 11
//        Example 2:
//
//        Input: nums = [1,2,3]
//        Output: -1
//        Explanation:
//        There is no index that satisfies the conditions in the problem statement.

public class FindPivotIndex_724 {
    //calculate total sum of the full array
    //maintain left sum to sum up all the elements
    //since we should not include the pivot index value in left sum we start from index 1 and calculate total left sum by adding all the prev element
    //then in each loop check with the formula.
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for(int num:nums){
            totalSum += num;
        }
        int leftSum = 0;
        for(int i=0;i<nums.length;i++){
            if(i!=0)
                leftSum += nums[i-1];
            if(totalSum -leftSum-nums[i] == leftSum){
                return i;
            }
        }
        return -1;
    }
}

//    Initialize a variable totalSum to zero to store the sum of all elements in the array.
//        Traverse the array and add each element to totalSum.
//        Initialize a variable leftSum to zero to store the sum of elements to the left of the current index.
//        Traverse the array again and for each index:
//        a. If the current index is not the first element, add the element to the left of the current index to leftSum.
//        b. Check if the difference between the total sum of the array and the sum of elements to the left and right of the current index is equal to the sum of elements to the left of the current index. If it is, return the current index.
//        If no pivot element is found, return -1.
