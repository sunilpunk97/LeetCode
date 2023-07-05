package com.java.leetcode.Arrays;

import java.util.HashSet;
import java.util.Set;
//Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
//        Example 1:
//        Input: nums1 = [1,2,2,1], nums2 = [2,2]
//        Output: [2]
//        Example 2:
//        Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//        Output: [9,4]
//        Explanation: [4,9] is also accepted.
public class IntersectionOfArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> mySet = new HashSet<>();
        for(int i:nums1){
            mySet.add(i);
        }
        Set<Integer> intersection = new HashSet<>();
        for(int i:nums2){
            if(mySet.contains(i))
                intersection.add(i);
        }
        int[] result = new int[intersection.size()];
        int index = 0;
        for(int i:intersection){
            result[index++] = i;
        }

        return result;
    }
}

//    Create a HashSet called mySet and add all the elements of the first array nums1 to it.
//
//        Create another HashSet called intersection.
//
//        Iterate through the second array nums2, checking if the element exists in mySet using the contains method. If it does, add the element to intersection.
//
//        Create an integer array result of size intersection.size().
//
//        Iterate through the elements of intersection, adding each element to the result array.
//
//        Return the result array.

