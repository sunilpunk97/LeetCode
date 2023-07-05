package com.java.leetcode.Arrays;
import java.util.*;

public class NumbersDisapperared_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i=0;i< nums.length;i++){
            int curr = Math.abs(nums[i]);
            nums[curr-1] = -(Math.abs(nums[curr-1]));
        }
        List<Integer> result = new ArrayList<>();
        for(int i=0;i< nums.length;i++){
            if(nums[i]>0)
                result.add(i+1);
        }
        return result;
    }
}

//Algo:
//        Iterate through each element of the input integer array nums.
//
//        For each element, calculate its absolute value and use that as an index to access the corresponding element of the array.
//
//        Negate the value of that element in the array by multiplying it by -1.
//
//        This marks the element as seen by making it negative, since all the elements in the array are initially positive.
//
//        Create an empty list called result to store the missing numbers.
//
//        Iterate through the input array nums again.
//
//        For each element, if the value is positive, add the corresponding index + 1 to the result list, since the corresponding number is missing.
//
//        After iterating through the array, return the result list containing all the missing numbers.
//
//        In essence, this code leverages the fact that all the numbers in the input array are in the range 1 to n, and uses negation to mark the elements that have been seen. By the end of the loop, the positive elements represent the indices of the missing numbers in the array.
















