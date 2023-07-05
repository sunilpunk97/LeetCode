package com.java.leetcode.GeneralDSA;

public class ConsecutiveOnesIII_1004 {
    public int longestOnes(int[] nums, int k) {   //Employs Sliding windows technique
        int zercount = 0,i=0;
        int result = 0;
        for(int j=0;j<nums.length;j++){
            if(nums[j] == 0)
                zercount++;
            while (zercount>k){
                if(nums[i] == 0) zercount--;
                i++;
            }
            result = Math.max(result,j-i+1);
        }
        return result;
    }
}

//    The algorithm uses the sliding window technique to find the maximum length of such a subarray. Here's how it works:
//
//        Initialize two pointers, i and j, both pointing to the first element of the array.
//
//        Keep a count of the number of zeros (zercount) encountered so far, initially set to 0.
//
//        Traverse the array from left to right using the pointer j, and increment the zercount if the current element is 0.
//
//        While the zercount is greater than 'k', move the left pointer i to the right and decrement the zercount if the element pointed by i is 0.
//
//        Keep track of the maximum length of the subarray of 1's encountered so far using the 'result' variable, which is updated as Math.max(result,j-i+1) at each iteration.
//
//        Finally, return the result, which is the length of the longest subarray of 1's with at most 'k' 0's.
