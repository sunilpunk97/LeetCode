package com.java.leetcode.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1;
        int p2 = n-1;
        int i = m+n-1;

        while(p2>=0){
            if(p1>=0 && nums1[p1] > nums2[p2]){
                nums1[i] = nums1[p1];
                i--;
                p1--;
            }else{
                nums1[i] = nums2[p2];
                i--;
                p2--;
            }
        }
    }
}

// Set three integer variables: p1 to m-1 (the index of the last valid element in nums1), p2 to n-1 (the index of the last element in nums2), and i to m+n-1 (the index of the last element in the merged array).
//
//  While p2 is greater than or equal to 0 (i.e., while there are still elements in nums2 to merge):
//
//  Check if p1 is greater than or equal to 0 and the value of the element at index p1 in nums1 is greater than the value of the element at index p2 in nums2.
//
// If the above condition is true, set the value of the element at index i in nums1 to the value of the element at index p1 in nums1, then decrement i and p1.
//
//If the above condition is false, set the value of the element at index i in nums1 to the value of the element at index p2 in nums2, then decrement i and p2.
//
//If all the elements in nums2 have been merged into nums1, the loop terminates.
//
// The resulting nums1 array will be a merged and sorted version of the original nums1 and nums2 arrays.

