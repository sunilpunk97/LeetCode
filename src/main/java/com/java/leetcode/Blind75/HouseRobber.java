package com.java.leetcode.Blind75;

public class HouseRobber {

//    The function starts by creating an integer array dp with nums.length + 1 elements. The first two elements of dp are initialized to 0 and nums[0], respectively.
//
//    The function then uses a for loop to iterate over the elements of nums. For each iteration of the loop, the next element of dp is determined by taking the maximum value of the current dp[i] and the sum of the previous dp[i-1] and the current nums[i].
//
//    Finally, the function returns the last element of dp, which represents the maximum amount of money that can be robbed from the given sequence of houses.
    public int rob(int[] nums) {
        int[] dp = new int[nums.length+1];
        dp[0] = 0;
        dp[1] = nums[0];
        for(int i=1;i< nums.length;i++){
            dp[i+1] = Math.max(dp[i],dp[i-1] + nums[i]);
        }
        return dp[nums.length];
    }
}
