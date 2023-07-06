package com.java.leetcode.Arrays;

public class IncreasingTripletSequence {
    public boolean increasingTriplet(int[] nums) {
        int val1 = Integer.MAX_VALUE;
        int val2 = Integer.MAX_VALUE;
        for(int i=0;i< nums.length;i++){
            if(nums[i] <= val1){
                val1 = nums[i];
            } else if (nums[i]<= val2) {
                val2 = nums[i];
            }
            else
                return true;
        }
        return false;
    }
}
