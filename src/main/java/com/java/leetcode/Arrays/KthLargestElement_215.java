package com.java.leetcode.Arrays;

import java.util.Arrays;

public class KthLargestElement_215 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int len = nums.length;
        return nums[len-(k)];
    }
}
