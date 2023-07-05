package com.java.leetcode.Arrays;

public class RemoveDuplicatesfromSortedArray_26 {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        for(int i=0;i< nums.length-1;i++){
            if(nums[i]!=nums[i+1])
                nums[index++] = nums[i+1];
        }
        return index;
    }
}


//Algo:
//        Initialize an integer variable called index to 1.
//
//        Iterate through each element of the input integer array nums, starting from the first element (index 0).
//
//        For each element, check if it is equal to the next element in the array. If the elements are not equal, update the value of the element at the index position to the value of the next element in the array, and increment the index by 1.
//
//        By doing so, we essentially keep only one copy of each unique element in the array, and skip over the duplicates.
//
//        After iterating through the array, return the value of index, which represents the length of the modified array.