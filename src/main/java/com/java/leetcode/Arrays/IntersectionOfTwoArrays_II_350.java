package com.java.leetcode.Arrays;

import java.util.Arrays;

public class IntersectionOfTwoArrays_II_350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        int i=0, j=0, k=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] result = new int[nums1.length * nums2.length];
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j])
                i++;
            else if (nums1[i] > nums2[j]) {
                j++;
            }else {
                result[k++] = nums1[i++];
                j++;

            }
        }
        return Arrays.copyOfRange(result,0,k);
    }
}
//    Sort both input arrays nums1 and nums2 in ascending order.
//
//        Initialize three variables i, j, and k to 0.
//
//        Create an array result with a length equal to the product of the lengths of nums1 and nums2.
//
//        While i is less than the length of nums1 and j is less than the length of nums2, do the following:
//
//        a. If the i-th element of nums1 is less than the j-th element of nums2, increment i.
//
//        b. If the i-th element of nums1 is greater than the j-th element of nums2, increment j.
//
//        c. If the i-th element of nums1 is equal to the j-th element of nums2, add the element to the k-th position of result, and increment both i and j.
//
//        Return a new array created from the first k elements of the result array using Arrays.copyOfRange(result, 0, k).
